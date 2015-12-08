// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.common.AdFormat;
import com.mopub.common.LocationService;
import com.mopub.common.MoPub;
import com.mopub.common.Preconditions;
import com.mopub.common.event.MoPubEvents;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Json;
import com.mopub.common.util.ResponseHeader;
import com.mopub.mobileads.AdTypeTranslator;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mopub.network:
//            AdResponse, HeaderUtils, MoPubNetworkError

public class AdRequest extends Request
{

    private final Listener a;
    private final AdFormat b;
    private final String c;
    private final Context d;

    public AdRequest(String s, AdFormat adformat, String s1, Context context, Listener listener)
    {
        super(0, s, listener);
        Preconditions.checkNotNull(adformat);
        Preconditions.checkNotNull(listener);
        c = s1;
        a = listener;
        b = adformat;
        d = context.getApplicationContext();
        setRetryPolicy(new DefaultRetryPolicy(2500, 1, 1.0F));
        setShouldCache(false);
    }

    private void a(AdResponse adresponse, NetworkResponse networkresponse, Location location)
    {
        Object obj = null;
        Preconditions.checkNotNull(adresponse);
        Preconditions.checkNotNull(networkresponse);
        com.mopub.common.event.BaseEvent.Builder builder = (new com.mopub.common.event.Event.Builder(com.mopub.common.event.BaseEvent.Name.AD_REQUEST, com.mopub.common.event.BaseEvent.Category.REQUESTS, com.mopub.common.event.BaseEvent.SamplingRate.AD_REQUEST.getSamplingRate())).withAdUnitId(c).withAdCreativeId(adresponse.getDspCreativeId()).withAdType(adresponse.getAdType()).withAdNetworkType(adresponse.getNetworkType());
        Double double1;
        if (adresponse.getWidth() != null)
        {
            double1 = Double.valueOf(adresponse.getWidth().doubleValue());
        } else
        {
            double1 = null;
        }
        builder = builder.withAdWidthPx(double1);
        if (adresponse.getHeight() != null)
        {
            double1 = Double.valueOf(adresponse.getHeight().doubleValue());
        } else
        {
            double1 = null;
        }
        builder = builder.withAdHeightPx(double1);
        if (location != null)
        {
            double1 = Double.valueOf(location.getLatitude());
        } else
        {
            double1 = null;
        }
        builder = builder.withGeoLat(double1);
        if (location != null)
        {
            double1 = Double.valueOf(location.getLongitude());
        } else
        {
            double1 = null;
        }
        builder = builder.withGeoLon(double1);
        double1 = obj;
        if (location != null)
        {
            double1 = Double.valueOf(location.getAccuracy());
        }
        MoPubEvents.log(builder.withGeoAccuracy(double1).withPerformanceDurationMs(Double.valueOf(networkresponse.networkTimeMs)).withRequestId(adresponse.getRequestId()).withRequestStatusCode(Integer.valueOf(networkresponse.statusCode)).withRequestUri(getUrl()).build());
    }

    private static String b(NetworkResponse networkresponse)
    {
        String s;
        try
        {
            s = new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new String(networkresponse.data);
        }
        return s;
    }

    private static String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = Uri.parse(s);
        try
        {
            s = s.getQueryParameter("request_id");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MoPubLog.d("Unable to obtain request id from fail url.");
            return null;
        }
        return s;
    }

    protected final Response a(NetworkResponse networkresponse)
    {
        String s = null;
        Map map = networkresponse.headers;
        if (HeaderUtils.extractBooleanHeader(map, ResponseHeader.WARMUP, false))
        {
            return Response.error(new MoPubNetworkError("Ad Unit is warming up.", MoPubNetworkError.Reason.WARMING_UP));
        }
        Location location = LocationService.getLastKnownLocation(d, MoPub.getLocationPrecision(), MoPub.getLocationAwareness());
        AdResponse.Builder builder = new AdResponse.Builder();
        builder.setAdUnitId(c);
        String s1 = HeaderUtils.extractHeader(map, ResponseHeader.AD_TYPE);
        String s2 = HeaderUtils.extractHeader(map, ResponseHeader.FULL_AD_TYPE);
        builder.setAdType(s1);
        builder.setFullAdType(s2);
        Object obj = HeaderUtils.extractIntegerHeader(map, ResponseHeader.REFRESH_TIME);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(((Integer) (obj)).intValue() * 1000);
        }
        builder.setRefreshTimeMilliseconds(((Integer) (obj)));
        if ("clear".equals(s1))
        {
            a(builder.build(), networkresponse, location);
            return Response.error(new MoPubNetworkError("No ads found for ad unit.", MoPubNetworkError.Reason.NO_FILL, ((Integer) (obj))));
        }
        builder.setNetworkType(HeaderUtils.extractHeader(map, ResponseHeader.NETWORK_TYPE));
        String s3 = HeaderUtils.extractHeader(map, ResponseHeader.REDIRECT_URL);
        builder.setRedirectUrl(s3);
        String s4 = HeaderUtils.extractHeader(map, ResponseHeader.CLICK_TRACKING_URL);
        builder.setClickTrackingUrl(s4);
        builder.setImpressionTrackingUrl(HeaderUtils.extractHeader(map, ResponseHeader.IMPRESSION_URL));
        obj = HeaderUtils.extractHeader(map, ResponseHeader.FAIL_URL);
        builder.setFailoverUrl(((String) (obj)));
        builder.setRequestId(b(((String) (obj))));
        boolean flag1 = HeaderUtils.extractBooleanHeader(map, ResponseHeader.SCROLLABLE, false);
        builder.setScrollable(Boolean.valueOf(flag1));
        builder.setDimensions(HeaderUtils.extractIntegerHeader(map, ResponseHeader.WIDTH), HeaderUtils.extractIntegerHeader(map, ResponseHeader.HEIGHT));
        obj = HeaderUtils.extractIntegerHeader(map, ResponseHeader.AD_TIMEOUT);
        String s5;
        boolean flag;
        if (obj == null)
        {
            obj = s;
        } else
        {
            obj = Integer.valueOf(((Integer) (obj)).intValue() * 1000);
        }
        builder.setAdTimeoutDelayMilliseconds(((Integer) (obj)));
        s5 = b(networkresponse);
        builder.setResponseBody(s5);
        if ("json".equals(s1))
        {
            try
            {
                builder.setJsonBody(new JSONObject(s5));
            }
            // Misplaced declaration of an exception variable
            catch (NetworkResponse networkresponse)
            {
                return Response.error(new MoPubNetworkError("Failed to decode body JSON for native ad format", networkresponse, MoPubNetworkError.Reason.BAD_BODY));
            }
        }
        builder.setCustomEventClassName(AdTypeTranslator.getCustomEventName(b, s1, s2, map));
        s = HeaderUtils.extractHeader(map, ResponseHeader.CUSTOM_EVENT_DATA);
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = HeaderUtils.extractHeader(map, ResponseHeader.NATIVE_PARAMS);
        }
        try
        {
            builder.setServerExtras(Json.jsonStringToMap(((String) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            return Response.error(new MoPubNetworkError("Failed to decode server extras for custom event data.", networkresponse, MoPubNetworkError.Reason.BAD_HEADER_DATA));
        }
        if ("mraid".equals(s1) || "html".equals(s1) || "interstitial".equals(s1) && "vast".equals(s2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new TreeMap();
            ((Map) (obj)).put("Html-Response-Body", s5);
            ((Map) (obj)).put("Scrollable", Boolean.toString(flag1));
            ((Map) (obj)).put("com_mopub_orientation", HeaderUtils.extractHeader(map, ResponseHeader.ORIENTATION));
            if (s3 != null)
            {
                ((Map) (obj)).put("Redirect-Url", s3);
            }
            if (s4 != null)
            {
                ((Map) (obj)).put("Clickthrough-Url", s4);
            }
            builder.setServerExtras(((Map) (obj)));
        }
        a(builder.build(), networkresponse, location);
        return Response.success(builder.build(), HttpHeaderParser.parseCacheHeaders(networkresponse));
    }

    protected void deliverResponse(Object obj)
    {
        obj = (AdResponse)obj;
        a.onSuccess(((AdResponse) (obj)));
    }

    public Map getHeaders()
    {
        TreeMap treemap = new TreeMap();
        String s1 = Locale.getDefault().getLanguage();
        Locale locale = d.getResources().getConfiguration().locale;
        String s = s1;
        if (locale != null)
        {
            s = s1;
            if (!locale.getLanguage().trim().isEmpty())
            {
                s = locale.getLanguage().trim();
            }
        }
        if (!s.isEmpty())
        {
            treemap.put(ResponseHeader.ACCEPT_LANGUAGE.getKey(), s);
        }
        return treemap;
    }

    public Listener getListener()
    {
        return a;
    }

    private class Listener
        implements com.mopub.volley.Response.ErrorListener
    {

        public abstract void onSuccess(AdResponse adresponse);
    }

}

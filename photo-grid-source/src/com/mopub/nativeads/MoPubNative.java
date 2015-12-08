// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.AdFormat;
import com.mopub.common.GpsHelper;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.ManifestUtils;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.VolleyError;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.mopub.nativeads:
//            t, u, v, w, 
//            g, x, NativeErrorCode, ao, 
//            RequestParameters

public class MoPubNative
{

    static final MoPubNativeNetworkListener a = new t();
    static final MoPubNativeEventListener b = new u();
    private final WeakReference c;
    private final String d;
    private MoPubNativeNetworkListener e;
    private MoPubNativeEventListener f;
    private Map g;
    private final com.mopub.network.AdRequest.Listener h;
    private AdRequest i;

    public MoPubNative(Context context, String s, MoPubNativeListener mopubnativelistener)
    {
        this(context, s, ((MoPubNativeNetworkListener) (mopubnativelistener)));
        setNativeEventListener(mopubnativelistener);
    }

    public MoPubNative(Context context, String s, MoPubNativeNetworkListener mopubnativenetworklistener)
    {
        g = new TreeMap();
        Preconditions.checkNotNull(context, "Context may not be null.");
        Preconditions.checkNotNull(s, "AdUnitId may not be null.");
        Preconditions.checkNotNull(mopubnativenetworklistener, "MoPubNativeNetworkListener may not be null.");
        ManifestUtils.checkNativeActivitiesDeclared(context);
        c = new WeakReference(context);
        d = s;
        e = mopubnativenetworklistener;
        f = b;
        h = new v(this);
        GpsHelper.fetchAdvertisingInfoAsync(context, null);
    }

    static String a(MoPubNative mopubnative)
    {
        return mopubnative.d;
    }

    static void a(MoPubNative mopubnative, AdResponse adresponse)
    {
        Context context = mopubnative.a();
        if (context != null)
        {
            w w1 = new w(mopubnative, adresponse);
            com.mopub.nativeads.g.loadNativeAd(context, mopubnative.g, adresponse, w1);
        }
    }

    static MoPubNativeEventListener b(MoPubNative mopubnative)
    {
        return mopubnative.f;
    }

    static MoPubNativeNetworkListener c(MoPubNative mopubnative)
    {
        return mopubnative.e;
    }

    final Context a()
    {
        Context context = (Context)c.get();
        if (context == null)
        {
            destroy();
            MoPubLog.d("Weak reference to Activity Context in MoPubNative became null. This instance of MoPubNative is destroyed and No more requests will be processed.");
        }
        return context;
    }

    final void a(VolleyError volleyerror)
    {
        MoPubLog.d("Native ad request failed.", volleyerror);
        if (volleyerror instanceof MoPubNetworkError)
        {
            volleyerror = (MoPubNetworkError)volleyerror;
            switch (x.a[volleyerror.getReason().ordinal()])
            {
            default:
                e.onNativeFail(NativeErrorCode.UNSPECIFIED);
                return;

            case 1: // '\001'
                e.onNativeFail(NativeErrorCode.INVALID_JSON);
                return;

            case 2: // '\002'
                e.onNativeFail(NativeErrorCode.INVALID_JSON);
                return;

            case 3: // '\003'
                MoPubLog.c(MoPubErrorCode.WARMUP.toString());
                e.onNativeFail(NativeErrorCode.EMPTY_AD_RESPONSE);
                return;

            case 4: // '\004'
                e.onNativeFail(NativeErrorCode.EMPTY_AD_RESPONSE);
                break;
            }
            return;
        }
        volleyerror = volleyerror.networkResponse;
        if (volleyerror != null && ((NetworkResponse) (volleyerror)).statusCode >= 500 && ((NetworkResponse) (volleyerror)).statusCode < 600)
        {
            e.onNativeFail(NativeErrorCode.SERVER_ERROR_RESPONSE_CODE);
            return;
        }
        if (volleyerror == null && !DeviceUtils.isNetworkAvailable((Context)c.get()))
        {
            MoPubLog.c(String.valueOf(MoPubErrorCode.NO_CONNECTION.toString()));
            e.onNativeFail(NativeErrorCode.CONNECTION_ERROR);
            return;
        } else
        {
            e.onNativeFail(NativeErrorCode.UNSPECIFIED);
            return;
        }
    }

    final void a(String s)
    {
        Context context = a();
        if (context == null)
        {
            return;
        }
        if (s == null)
        {
            e.onNativeFail(NativeErrorCode.INVALID_REQUEST_URL);
            return;
        } else
        {
            i = new AdRequest(s, AdFormat.NATIVE, d, context, h);
            Networking.getRequestQueue(context).add(i);
            return;
        }
    }

    public void destroy()
    {
        c.clear();
        if (i != null)
        {
            i.cancel();
            i = null;
        }
        e = a;
        f = b;
    }

    public void makeRequest()
    {
        makeRequest(null);
    }

    public void makeRequest(RequestParameters requestparameters)
    {
        makeRequest(requestparameters, null);
    }

    public void makeRequest(RequestParameters requestparameters, Integer integer)
    {
        Context context = a();
        if (context != null)
        {
            if (!DeviceUtils.isNetworkAvailable(context))
            {
                e.onNativeFail(NativeErrorCode.CONNECTION_ERROR);
                return;
            }
            context = a();
            if (context != null)
            {
                requestparameters = (new ao(context)).withAdUnitId(d).a(requestparameters);
                if (integer != null)
                {
                    requestparameters.a(integer.intValue());
                }
                requestparameters = requestparameters.generateUrlString("ads.mopub.com");
                if (requestparameters != null)
                {
                    MoPubLog.d((new StringBuilder("Loading ad from: ")).append(requestparameters).toString());
                }
                a(requestparameters);
                return;
            }
        }
    }

    public void setLocalExtras(Map map)
    {
        if (map == null)
        {
            g = new TreeMap();
            return;
        } else
        {
            g = new TreeMap(map);
            return;
        }
    }

    public void setNativeEventListener(MoPubNativeEventListener mopubnativeeventlistener)
    {
        MoPubNativeEventListener mopubnativeeventlistener1 = mopubnativeeventlistener;
        if (mopubnativeeventlistener == null)
        {
            mopubnativeeventlistener1 = b;
        }
        f = mopubnativeeventlistener1;
    }


    private class MoPubNativeNetworkListener
    {

        public abstract void onNativeFail(NativeErrorCode nativeerrorcode);

        public abstract void onNativeLoad(NativeResponse nativeresponse);
    }

}

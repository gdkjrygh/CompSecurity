// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            ParseException

public abstract class VolleyWebClientRequest extends Request
{

    protected static final String COOKIE_KEY_HEADER = "Cookie";
    protected static final String ORIGINATING_URL_HEADER = "X-Originating-URL";
    protected static final String SET_COOKIE_KEY_HEADER = "Set-Cookie";
    private static final String TAG = "nf_volleyrequest";
    protected int mDefaultTrafficStatsTag;
    protected long mDurationTimeInMs;
    protected ErrorLogging mErrorLogger;
    protected final Map mHeaders = new HashMap(1);
    protected String mReqNetflixId;
    protected int mResponseSizeInBytes;
    protected String mUrl;
    protected UserCredentialRegistry mUserCredentialRegistry;

    protected VolleyWebClientRequest(int i)
    {
        super(i, null, null);
        setShouldCache(false);
        mDurationTimeInMs = SystemClock.elapsedRealtime();
    }

    public void changeHostUrl(String s)
    {
        mUrl = Request.buildNewUrlString(mUrl, s);
        mDefaultTrafficStatsTag = s.hashCode();
    }

    public void deliverError(VolleyError volleyerror)
    {
        int i;
        mDurationTimeInMs = SystemClock.elapsedRealtime() - mDurationTimeInMs;
        Log.w("nf_volleyrequest", (new StringBuilder()).append("VolleyError: ").append(volleyerror.getMessage()).toString());
        if (volleyerror.networkResponse != null)
        {
            Log.d("nf_volleyrequest", (new StringBuilder()).append("Error on response:").append(new String(volleyerror.networkResponse.data)).toString());
        }
        i = -2;
        if (!(volleyerror instanceof ParseException)) goto _L2; else goto _L1
_L1:
        i = -300;
_L4:
        onFailure(i);
        return;
_L2:
        if (volleyerror instanceof ServerError)
        {
            i = -62;
        } else
        if ((volleyerror instanceof TimeoutError) || (volleyerror instanceof NetworkError))
        {
            i = getStatusCodeFromVolleyNetworkError(volleyerror);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void deliverResponse(Object obj)
    {
        mDurationTimeInMs = SystemClock.elapsedRealtime() - mDurationTimeInMs;
        onSuccess(obj);
    }

    protected String getCurrentNetflixId()
    {
        if (mUserCredentialRegistry == null || StringUtils.isEmpty(mUserCredentialRegistry.getNetflixID()))
        {
            return null;
        } else
        {
            return mUserCredentialRegistry.getNetflixID();
        }
    }

    public Map getHeaders()
        throws AuthFailureError
    {
        String s = (new StringBuilder(mUserCredentialRegistry.getNetflixIdName())).append("=").append(mUserCredentialRegistry.getNetflixID()).append("; ").append(mUserCredentialRegistry.getSecureNetflixIdName()).append("=").append(mUserCredentialRegistry.getSecureNetflixID()).toString();
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("VolleyWebClientRequest with cookies: ").append(s).toString());
        }
        mHeaders.put("Cookie", s);
        return mHeaders;
    }

    protected abstract String getMethodType();

    protected String getOptionalParams()
    {
        return null;
    }

    public com.android.volley.Request.Priority getPriority()
    {
        return com.android.volley.Request.Priority.HIGH;
    }

    protected int getStatusCodeFromVolleyNetworkError(VolleyError volleyerror)
    {
        volleyerror = volleyerror.getMessage();
        byte byte0;
        if (volleyerror == null)
        {
            byte0 = -3;
        } else
        {
            volleyerror = volleyerror.toLowerCase(Locale.US);
            Log.d("nf_volleyrequest", (new StringBuilder()).append(".next call failed with error =").append(volleyerror).toString());
            byte0 = -3;
            if (volleyerror.contains("sslhandshakeexception"))
            {
                byte0 = -120;
                if (volleyerror.contains("current time") && volleyerror.contains("validation time"))
                {
                    return -121;
                }
                if (volleyerror.contains("no trusted certificate found"))
                {
                    return -122;
                }
            }
        }
        return byte0;
    }

    public int getTrafficStatsTag()
    {
        return mDefaultTrafficStatsTag;
    }

    public String getUrl()
    {
        return mUrl;
    }

    protected abstract String getUrl(String s);

    public void initUrl(String s)
    {
        if (mUrl != null)
        {
            throw new IllegalStateException("Can not change the URL of a VolleyWebCLientRequest.");
        }
        mUrl = getUrl(s);
        int i;
        if (TextUtils.isEmpty(mUrl))
        {
            i = 0;
        } else
        {
            i = Uri.parse(mUrl).getHost().hashCode();
        }
        mDefaultTrafficStatsTag = i;
        if (TextUtils.isEmpty(mUrl))
        {
            mDefaultTrafficStatsTag = 0;
            return;
        }
        s = Uri.parse(mUrl).getHost();
        if (s == null)
        {
            mDefaultTrafficStatsTag = 0;
            return;
        } else
        {
            mDefaultTrafficStatsTag = s.hashCode();
            return;
        }
    }

    protected boolean isResponseValid()
    {
        boolean flag = StringUtils.safeEquals(mReqNetflixId, getCurrentNetflixId());
        if (!flag)
        {
            Log.d("nf_volleyrequest", String.format("response not valid - reqNetflixId %s, currentNetflixId  %s", new Object[] {
                mReqNetflixId, getCurrentNetflixId()
            }));
        }
        return flag;
    }

    protected abstract void onFailure(int i);

    protected abstract void onSuccess(Object obj);

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        String s;
        String s1;
        String s2;
        String s3;
        int i;
        mDurationTimeInMs = SystemClock.elapsedRealtime() - mDurationTimeInMs;
        if (networkresponse != null && networkresponse.data != null)
        {
            mResponseSizeInBytes = networkresponse.data.length;
        }
        String as[];
        int j;
        boolean flag;
        if (shouldSkipProcessingOnInvalidUser())
        {
            flag = isResponseValid();
        } else
        {
            flag = true;
        }
        s2 = (String)networkresponse.headers.get("Set-Cookie");
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("Received Volley response with Set-Cookie = ").append(s2).toString());
        }
        s1 = null;
        s = null;
        as = s2.split(";");
        j = as.length;
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as1[] = as[i].split("=");
        s2 = s1;
        s3 = s;
        if (as1.length >= 2)
        {
            if (mUserCredentialRegistry.getNetflixIdName().equalsIgnoreCase(as1[0].trim()))
            {
                s2 = as1[1];
                s3 = s;
            } else
            {
                s2 = s1;
                s3 = s;
                if (mUserCredentialRegistry.getSecureNetflixIdName().equalsIgnoreCase(as1[0].trim()))
                {
                    s3 = as1[1];
                    s2 = s1;
                }
            }
        }
_L8:
        if (!StringUtils.isNotEmpty(s2) || !StringUtils.isNotEmpty(s3)) goto _L5; else goto _L4
_L4:
        Log.d("nf_volleyrequest", String.format("update cookies ? %b - currentNetflixId %s, newId %s", new Object[] {
            Boolean.valueOf(flag), getCurrentNetflixId(), s2
        }));
        if (flag)
        {
            mUserCredentialRegistry.updateUserCredentials(s2, s3);
        }
_L2:
        s = new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers));
        networkresponse = s;
_L7:
        if (!flag)
        {
            networkresponse = new String("wrong state ");
            Log.d("nf_volleyrequest", networkresponse);
            return Response.error(new ParseException(networkresponse));
        }
        break MISSING_BLOCK_LABEL_391;
_L5:
        i++;
        s1 = s2;
        s = s3;
          goto _L6
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        networkresponse = new String(networkresponse.data);
          goto _L7
        try
        {
            networkresponse = ((NetworkResponse) (parseResponse(networkresponse)));
        }
        // Misplaced declaration of an exception variable
        catch (NetworkResponse networkresponse)
        {
            if (networkresponse instanceof VolleyError)
            {
                return Response.error((VolleyError)networkresponse);
            } else
            {
                return Response.error(new VolleyError(networkresponse));
            }
        }
        if (networkresponse == null)
        {
            return Response.error(new ParseException("Parsing returned null."));
        }
        return Response.success(networkresponse, null);
          goto _L8
    }

    protected abstract Object parseResponse(String s)
        throws VolleyError;

    void setErrorLogger(ErrorLogging errorlogging)
    {
        mErrorLogger = errorlogging;
    }

    public void setUserCredentialRegistry(UserCredentialRegistry usercredentialregistry)
    {
        mUserCredentialRegistry = usercredentialregistry;
    }

    protected boolean shouldSkipProcessingOnInvalidUser()
    {
        return true;
    }

    protected void storeReqNetflixId(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            mReqNetflixId = new String(s);
        }
    }
}

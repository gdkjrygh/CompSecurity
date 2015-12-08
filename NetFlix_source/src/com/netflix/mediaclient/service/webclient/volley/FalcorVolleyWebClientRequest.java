// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import android.content.Context;
import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.DeepErrorElement;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.FalcorPathResult;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import com.netflix.mediaclient.service.logging.client.model.RootCause;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.UriUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            VolleyWebClientRequest, FalcorParseException, FalcorServerException, FalcorParseUtils

public abstract class FalcorVolleyWebClientRequest extends VolleyWebClientRequest
{

    public static final String ENDPOINT_REVISION = "X-Netflix.api-script-revision";
    public static final String NETFLIX_API_SCRIPT_EXECUTION_TIME_HEADER = "X-Netflix.api-script-execution-time";
    public static final String NETFLIX_SERVER_EXECUTION_TIME_HEADER = "X-Netflix.execution-time";
    private static final String TAG = "nf_volleyrequest";
    protected ApiEndpointRegistry mApiEndpointRegistry;
    protected long mApiScriptExecTimeInMs;
    protected com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface mConfig;
    protected Context mContext;
    protected String mEndpointRevision;
    protected long mParseTimeInMs;
    protected long mServerExecTimeInMs;
    protected UUID mUuid;

    protected FalcorVolleyWebClientRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        super(0);
        mServerExecTimeInMs = -1L;
        mUuid = UUID.randomUUID();
        mConfig = configurationagentinterface;
        mContext = context;
    }

    protected static RootCause getRootCauseFromVolleyNetworkError(VolleyError volleyerror)
    {
        volleyerror = volleyerror.getMessage();
        if (volleyerror == null)
        {
            volleyerror = RootCause.networkFailure;
        } else
        {
            String s = volleyerror.toLowerCase(Locale.US);
            if (Log.isLoggable("nf_volleyrequest", 3))
            {
                Log.d("nf_volleyrequest", (new StringBuilder()).append(".next call failed with error =").append(s).toString());
            }
            volleyerror = RootCause.networkFailure;
            if (s.contains("sslhandshakeexception"))
            {
                volleyerror = RootCause.sslHandshakeFailure;
                if (s.contains("current time") && s.contains("validation time"))
                {
                    return RootCause.sslExpiredCert;
                }
                if (s.contains("no trusted certificate found"))
                {
                    return RootCause.sslUntrustedCert;
                }
            }
        }
        return volleyerror;
    }

    protected static String urlEncodPQLParam(String s, String s1)
    {
        s1 = UriUtil.urlEncodeParam(s1);
        return (new StringBuilder("&")).append(s).append("=").append(s1).toString();
    }

    public void changeHostUrl(String s)
    {
        super.changeHostUrl(s);
        mApiEndpointRegistry.updateApiEndpointHost(s);
    }

    public void deliverError(VolleyError volleyerror)
    {
        mDurationTimeInMs = SystemClock.elapsedRealtime() - mDurationTimeInMs;
        Error error = new Error();
        if (Log.isLoggable("nf_volleyrequest", 5))
        {
            Log.w("nf_volleyrequest", (new StringBuilder()).append("VolleyError: ").append(volleyerror.getMessage()).toString());
        }
        if (volleyerror.networkResponse != null && Log.isLoggable("nf_volleyrequest", 3))
        {
            Log.d("nf_volleyrequest", (new StringBuilder()).append("Error on response:").append(new String(volleyerror.networkResponse.data)).toString());
        }
        int i = -2;
        if (volleyerror instanceof FalcorParseException)
        {
            i = FalcorParseException.getErrorCode(((FalcorParseException)volleyerror).getMessage());
            error.setRootCause(RootCause.serverResponseBad);
        } else
        if (volleyerror instanceof FalcorServerException)
        {
            i = FalcorServerException.getErrorCode(((FalcorServerException)volleyerror).getMessage(), mErrorLogger);
            error.setRootCause(RootCause.serverFailure);
        } else
        if (volleyerror instanceof ServerError)
        {
            i = -62;
            error.setRootCause(RootCause.serverFailure);
        } else
        if (volleyerror instanceof TimeoutError)
        {
            i = getStatusCodeFromVolleyNetworkError(volleyerror);
            error.setRootCause(RootCause.tcpConnectionTimeout);
        } else
        if (volleyerror instanceof NetworkError)
        {
            i = getStatusCodeFromVolleyNetworkError(volleyerror);
            error.setRootCause(getRootCauseFromVolleyNetworkError(volleyerror));
        }
        if (mContext != null)
        {
            Log.d("nf_volleyrequest", "Report data request failed");
            Object obj = new DeepErrorElement();
            Object obj1;
            int j;
            if (volleyerror != null && volleyerror.networkResponse != null)
            {
                ((DeepErrorElement) (obj)).setErrorCode((new StringBuilder()).append("").append(volleyerror.networkResponse.statusCode).toString());
            } else
            {
                Log.e("nf_volleyrequest", "Network response is not set!");
                ((DeepErrorElement) (obj)).setErrorCode("504");
            }
            ((DeepErrorElement) (obj)).setFatal(true);
            error.addDeepError(((DeepErrorElement) (obj)));
            volleyerror = new HttpResponse();
            volleyerror.setResponseTime(Integer.valueOf((int)mDurationTimeInMs));
            volleyerror.setMimeType("text/x-json");
            volleyerror.setContentLength(Integer.valueOf(mResponseSizeInBytes));
            obj1 = getPQLQueries();
            j = 0;
            if (obj1 != null)
            {
                j = ((List) (obj1)).size();
            }
            obj = new ArrayList(j);
            if (obj1 != null)
            {
                for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new FalcorPathResult((String)((Iterator) (obj1)).next(), false, null))) { }
            }
            LogUtils.reportDataRequestEnded(mContext, String.valueOf(mUuid), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, ((List) (obj)), error, volleyerror);
        }
        onFailure(i);
    }

    protected void deliverResponse(Object obj)
    {
        super.deliverResponse(obj);
        if (mContext != null)
        {
            Log.d("nf_volleyrequest", "Report data request sucess");
            obj = new HttpResponse();
            ((HttpResponse) (obj)).setResponseTime(Integer.valueOf((int)mDurationTimeInMs));
            ((HttpResponse) (obj)).setParseTime(Integer.valueOf((int)mParseTimeInMs));
            ((HttpResponse) (obj)).setMimeType("text/x-json");
            ((HttpResponse) (obj)).setServerExecutionTime(Integer.valueOf((int)mServerExecTimeInMs));
            ((HttpResponse) (obj)).setContentLength(Integer.valueOf(mResponseSizeInBytes));
            ((HttpResponse) (obj)).setApiScriptExecutionTime(Integer.valueOf((int)mApiScriptExecTimeInMs));
            ((HttpResponse) (obj)).setEndpointRevision(mEndpointRevision);
            Object obj1 = getPQLQueries();
            int i = 0;
            if (obj1 != null)
            {
                i = ((List) (obj1)).size();
            }
            ArrayList arraylist = new ArrayList(i);
            if (obj1 != null)
            {
                for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(new FalcorPathResult((String)((Iterator) (obj1)).next(), true, null))) { }
            }
            LogUtils.reportDataRequestEnded(mContext, String.valueOf(mUuid), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, arraylist, null, ((HttpResponse) (obj)));
        }
    }

    protected com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface getConfig()
    {
        return mConfig;
    }

    Context getContext()
    {
        return mContext;
    }

    public Map getHeaders()
        throws AuthFailureError
    {
        Map map = super.getHeaders();
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        ((Map) (obj)).put("X-Netflix.request.uuid", (new StringBuilder()).append("").append(mUuid).toString());
        return ((Map) (obj));
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameGet();
    }

    protected abstract List getPQLQueries();

    protected String getQueryPathName()
    {
        if (StringUtils.safeEquals(FalcorParseUtils.getMethodNameGet(), getMethodType()))
        {
            return FalcorParseUtils.getParamNamePath();
        } else
        {
            return FalcorParseUtils.getParamNameCallPath();
        }
    }

    protected String getRawPQLQuery()
    {
        Object obj = getPQLQueries();
        if (obj == null)
        {
            throw new IllegalArgumentException("List of queries is null!");
        }
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(urlEncodPQLParam(getQueryPathName(), s)))
        {
            s = (String)((Iterator) (obj)).next();
        }

        return stringbuilder.toString();
    }

    public String getRequestId()
    {
        return mUuid.toString();
    }

    protected String getUrl(String s)
    {
        String s1 = getRawPQLQuery();
        s = new StringBuilder(s);
        s.append(StringUtils.buildUnencodedUrlParam("method", getMethodType()));
        s.append(s1);
        s1 = getOptionalParams();
        if (StringUtils.isNotEmpty(s1))
        {
            s.append(s1);
        }
        storeReqNetflixId(getCurrentNetflixId());
        s = s.toString();
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("VolleyWebClientRequest URL = ").append(s).toString());
        }
        return s;
    }

    protected abstract Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException;

    protected Response parseNetworkResponse(NetworkResponse networkresponse)
    {
        if (networkresponse != null && networkresponse.headers != null)
        {
            String s = (String)networkresponse.headers.get("X-Netflix.api-script-execution-time");
            String s1 = (String)networkresponse.headers.get("X-Netflix.execution-time");
            mEndpointRevision = (String)networkresponse.headers.get("X-Netflix.api-script-revision");
            if (Log.isLoggable("nf_volleyrequest", 3))
            {
                Log.d("nf_volleyrequest", (new StringBuilder()).append("execTime: ").append(s).append(", total server time ").append(s1).append(", revision: ").append(mEndpointRevision).toString());
            }
            if (StringUtils.isNotEmpty(s1))
            {
                try
                {
                    mServerExecTimeInMs = Long.parseLong(s1);
                }
                catch (Throwable throwable1)
                {
                    Log.e("nf_volleyrequest", "Failed to parse server execution time!", throwable1);
                }
            }
            if (StringUtils.isNotEmpty(s))
            {
                try
                {
                    mApiScriptExecTimeInMs = Long.parseLong(s);
                }
                catch (Throwable throwable)
                {
                    Log.e("nf_volleyrequest", "Failed to parse api script execution time!", throwable);
                }
            }
        } else
        {
            Log.w("nf_volleyrequest", "execTime not found!");
        }
        return super.parseNetworkResponse(networkresponse);
    }

    protected Object parseResponse(String s)
        throws VolleyError
    {
        mParseTimeInMs = SystemClock.elapsedRealtime();
        try
        {
            s = ((String) (parseFalcorResponse(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (!(s instanceof FalcorParseException) && !(s instanceof FalcorServerException))
            {
                throw new VolleyError(s);
            } else
            {
                throw (VolleyError)s;
            }
        }
        mParseTimeInMs = SystemClock.elapsedRealtime() - mParseTimeInMs;
        if (Log.isLoggable("nf_volleyrequest", 2))
        {
            Log.v("nf_volleyrequest", (new StringBuilder()).append("parse time (ms): ").append(mParseTimeInMs).toString());
        }
        if (s == null)
        {
            throw new FalcorParseException("Parsing returned null.");
        } else
        {
            return s;
        }
    }

    void setApiEndpointRegistry(ApiEndpointRegistry apiendpointregistry)
    {
        mApiEndpointRegistry = apiendpointregistry;
    }
}

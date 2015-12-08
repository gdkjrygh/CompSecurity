// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api:
//            ApiResponse

public class BaseApiResponseHandler
    implements com.android.volley.Response.ErrorListener, com.android.volley.Response.HeaderListener, com.android.volley.Response.Listener
{

    protected String _baseUrl;
    private Handler _handler;
    protected String _method;
    protected Boolean _useJsonParser;

    public BaseApiResponseHandler()
    {
        _useJsonParser = Boolean.valueOf(true);
        _handler = new Handler(Looper.getMainLooper());
    }

    public String getBaseUrl()
    {
        return _baseUrl;
    }

    public String getMethod()
    {
        return _method;
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
        if (volleyerror != null && volleyerror.networkResponse != null && volleyerror.networkResponse.data != null)
        {
            onFailure(volleyerror, new String(volleyerror.networkResponse.data));
        } else
        {
            onFailure(volleyerror, new ApiResponse());
        }
        onFinish();
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
    }

    public void onFailure(Throwable throwable, PinterestJsonArray pinterestjsonarray)
    {
        try
        {
            onFailure(throwable, new ApiResponse(new PinterestJsonObject(String.format("{\"data\":\"%s\"}", new Object[] {
                pinterestjsonarray
            }))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonArray pinterestjsonarray)
        {
            onFailure(throwable, new ApiResponse());
        }
    }

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        pinterestjsonobject = new ApiResponse(pinterestjsonobject);
        CrashReporting.a(new ApiException(pinterestjsonobject, throwable, (byte)0));
        onFailure(throwable, ((ApiResponse) (pinterestjsonobject)));
    }

    public void onFailure(Throwable throwable, String s)
    {
        try
        {
            if (StringUtils.isEmpty(s))
            {
                onFailure(throwable, new ApiResponse());
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            onFailure(throwable, new ApiResponse());
            return;
        }
        if (s.startsWith("{"))
        {
            onFailure(throwable, new PinterestJsonObject(s));
            return;
        }
        if (s.startsWith("["))
        {
            onFailure(throwable, new PinterestJsonArray(s));
            return;
        }
        onFailure(throwable, new ApiResponse(new PinterestJsonObject(String.format("{\"data\":\"%s\"}", new Object[] {
            s
        }))));
        return;
    }

    public void onFinish()
    {
    }

    public void onHeaderReceived(Map map)
    {
    }

    public volatile void onResponse(Object obj)
    {
        onResponse((String)obj);
    }

    public void onResponse(String s)
    {
        if (!_useJsonParser.booleanValue())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (!s.startsWith("{")) goto _L2; else goto _L1
_L1:
        onSuccess(new PinterestJsonObject(s));
_L3:
        onFinish();
        return;
_L2:
        if (!s.startsWith("["))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        onSuccess(new PinterestJsonArray(s));
          goto _L3
        s;
        CrashReporting.a(s);
        onFinish();
        return;
        onSuccess(s);
          goto _L3
        s;
        onFinish();
        throw s;
        onSuccess(s);
          goto _L3
    }

    public void onStart()
    {
    }

    public void onSuccess(ApiResponse apiresponse)
    {
    }

    public void onSuccess(PinterestJsonArray pinterestjsonarray)
    {
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        pinterestjsonobject = new ApiResponse(pinterestjsonobject);
        _handler.post(new _cls1(pinterestjsonobject));
    }

    public void onSuccess(String s)
    {
    }

    public void setBaseUrl(String s)
    {
        _baseUrl = s;
    }

    public void setMethod(String s)
    {
        _method = s;
    }

    private class ApiException extends Exception
    {

        final BaseApiResponseHandler a;
        private ApiResponse b;
        private int c;
        private String d;

        public String getMessage()
        {
            ArrayList arraylist = new ArrayList();
            if (b != null)
            {
                arraylist.add(String.valueOf(c));
                arraylist.add(d);
                arraylist.add(String.valueOf(b.getCode()));
                arraylist.add(b.getMessage());
            }
            return StringUtils.join(arraylist, ": ");
        }

        private ApiException(ApiResponse apiresponse, Throwable throwable)
        {
            a = BaseApiResponseHandler.this;
            super(throwable);
            b = new ApiResponse();
            c = -1;
            d = "";
            b = apiresponse;
            if (throwable instanceof VolleyError)
            {
                c = ((VolleyError)throwable).networkResponse.statusCode;
                d = throwable.getLocalizedMessage();
            }
        }

        ApiException(ApiResponse apiresponse, Throwable throwable, byte byte0)
        {
            this(apiresponse, throwable);
        }
    }


    private class _cls1
        implements Runnable
    {

        final ApiResponse a;
        final BaseApiResponseHandler b;

        public void run()
        {
            b.onSuccess(a);
        }

        _cls1(ApiResponse apiresponse)
        {
            b = BaseApiResponseHandler.this;
            a = apiresponse;
            super();
        }
    }

}

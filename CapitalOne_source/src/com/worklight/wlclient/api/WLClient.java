// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.common.WLUtils;
import com.worklight.wlclient.WLCookieManager;
import com.worklight.wlclient.WLRequest;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.worklight.wlclient.api:
//            WLCookieExtractor, WLRequestOptions, InitRequestListener, WLProcedureInvocationData, 
//            InvokeProcedureRequestListener, LogActivityListener, WLAuthListener, WLResponseListener

public class WLClient
{

    private static final String INIT_REQUEST_PATH = "authentication";
    private static final String INVOKE_PROCEDURE_REQUEST_PATH = "query";
    public static final String KEY_INVOKE_PROCEDURE_INVOCATION_CONTEXT = "invokcationContext";
    public static final String KEY_LISTENER = "listener";
    public static final String KEY_TIME_OUT = "timeout";
    private static final String LOG_ACTIVITY_REQUEST_PATH = "logactivity";
    private WLAuthListener authListener;
    private WLConfig config;
    private Context context;
    private HttpContext httpContext;
    private boolean isInitialized;

    public WLClient(Context context1)
    {
        this(context1, null);
    }

    public WLClient(Context context1, WLAuthListener wlauthlistener)
    {
        config = new WLConfig(context1);
        authListener = wlauthlistener;
        httpContext = new BasicHttpContext();
        context = context1;
    }

    private void updateCookiesFromWebView()
    {
        WLCookieManager.setCookies(WLCookieExtractor.cookies, config.getAppURL().getHost());
        Object obj = WLCookieManager.getCookies();
        if (obj != null)
        {
            BasicCookieStore basiccookiestore = new BasicCookieStore();
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    httpContext.setAttribute("http.cookie-store", basiccookiestore);
                    return;
                }
                basiccookiestore.addCookie((Cookie)((Iterator) (obj)).next());
            } while (true);
        } else
        {
            WLUtils.debug((new StringBuilder("No Cookies found for url ")).append(config.getAppURL().getHost()).append(" in WebView.").toString());
            return;
        }
    }

    public void connect(WLResponseListener wlresponselistener)
    {
        WLCookieManager.clearCookies();
        if (WLCookieExtractor.cookies != null)
        {
            updateCookiesFromWebView();
        }
        WLRequestOptions wlrequestoptions = new WLRequestOptions();
        wlrequestoptions.addParameter("action", "test");
        wlrequestoptions.setResponseListener(wlresponselistener);
        (new WLRequest(new InitRequestListener(this), httpContext, wlrequestoptions, config, context)).makeRequest("authentication");
    }

    protected WLAuthListener getAuthListener()
    {
        return authListener;
    }

    public void init(WLResponseListener wlresponselistener)
    {
        connect(wlresponselistener);
    }

    public void invokeProcedure(WLProcedureInvocationData wlprocedureinvocationdata, WLResponseListener wlresponselistener)
    {
        invokeProcedure(wlprocedureinvocationdata, wlresponselistener, null);
    }

    public void invokeProcedure(WLProcedureInvocationData wlprocedureinvocationdata, WLResponseListener wlresponselistener, WLRequestOptions wlrequestoptions)
    {
        if (!isInitialized)
        {
            throw new RuntimeException("WLClient not initialized");
        }
        WLRequestOptions wlrequestoptions1 = wlrequestoptions;
        if (wlrequestoptions == null)
        {
            wlrequestoptions1 = new WLRequestOptions();
        }
        wlrequestoptions1.setResponseListener(wlresponselistener);
        wlrequestoptions1.addParameters(wlprocedureinvocationdata.getInvocationDataMap());
        wlprocedureinvocationdata = new WLRequest(new InvokeProcedureRequestListener(), httpContext, wlrequestoptions1, config, context);
        wlprocedureinvocationdata.setAuthListener(getAuthListener());
        wlprocedureinvocationdata.makeRequest("query");
    }

    public void logActivity(String s)
    {
        if (!isInitialized)
        {
            throw new RuntimeException("WLClient not initialized");
        }
        if (s == null)
        {
            throw new RuntimeException("ActivityType cannot be null");
        } else
        {
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("activity", s);
            s = new WLRequest(new LogActivityListener(), httpContext, wlrequestoptions, config, context);
            s.setAuthListener(getAuthListener());
            s.makeRequest("logactivity");
            return;
        }
    }

    protected void setInitialized(boolean flag)
    {
        isInitialized = flag;
    }
}

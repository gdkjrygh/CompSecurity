// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.common.WLUtils;
import com.worklight.wlclient.api.WLAuthListener;
import com.worklight.wlclient.api.WLRequestOptions;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.Header;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.worklight.wlclient:
//            AsynchronousRequestSender, WLRequestListener

public class WLRequest
{

    private static final ExecutorService pool = Executors.newFixedThreadPool(6);
    private WLAuthListener authListener;
    private WLConfig config;
    private Context context;
    private HttpContext httpContext;
    private HttpPost postRequest;
    private WLRequestListener requestListener;
    private WLRequestOptions requestOptions;

    public WLRequest(WLRequestListener wlrequestlistener, HttpContext httpcontext, WLRequestOptions wlrequestoptions, WLConfig wlconfig, Context context1)
    {
        requestListener = wlrequestlistener;
        httpContext = httpcontext;
        requestOptions = wlrequestoptions;
        config = wlconfig;
        context = context1;
    }

    private void addExtraHeaders(HttpPost httppost)
    {
        Object obj = requestOptions.getHeaders();
        if (obj != null)
        {
            obj = ((ArrayList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                httppost.addHeader((Header)((Iterator) (obj)).next());
            }
        }
    }

    private void addHeaders(WLConfig wlconfig, HttpPost httppost)
    {
        httppost.addHeader("X-Requested-With", "XMLHttpRequest");
        httppost.addHeader("x-wl-app-version", wlconfig.getApplicationVersion());
    }

    private void addParams(WLRequestOptions wlrequestoptions, HttpPost httppost)
    {
        ArrayList arraylist = new ArrayList();
        if (wlrequestoptions.getParameters() == null || wlrequestoptions.getParameters().isEmpty()) goto _L2; else goto _L1
_L1:
        Iterator iterator = wlrequestoptions.getParameters().keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        arraylist.add(new BasicNameValuePair("isAjaxRequest", "true"));
        String s;
        try
        {
            wlrequestoptions = new UrlEncodedFormEntity(arraylist, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (WLRequestOptions wlrequestoptions)
        {
            WLUtils.error(wlrequestoptions.getMessage(), wlrequestoptions);
            throw new RuntimeException(wlrequestoptions);
        }
        httppost.setEntity(wlrequestoptions);
        return;
_L3:
        s = (String)iterator.next();
        arraylist.add(new BasicNameValuePair(s, (String)wlrequestoptions.getParameters().get(s)));
        if (true) goto _L5; else goto _L4
_L4:
    }

    public WLAuthListener getAuthListener()
    {
        return authListener;
    }

    public WLConfig getConfig()
    {
        return config;
    }

    public Context getContext()
    {
        return context;
    }

    public HttpContext getHttpContext()
    {
        return httpContext;
    }

    public WLRequestOptions getOptions()
    {
        return requestOptions;
    }

    public HttpPost getPostRequest()
    {
        return postRequest;
    }

    public WLRequestListener getRequestListener()
    {
        return requestListener;
    }

    public void makeRequest(String s)
    {
        makeRequest(s, false);
    }

    public void makeRequest(String s, boolean flag)
    {
        if (!flag)
        {
            s = (new StringBuilder(String.valueOf(config.getAppURL().toExternalForm()))).append(s).toString();
        } else
        {
            s = (new StringBuilder(String.valueOf(config.getRootURL()))).append("/").append(s).toString();
        }
        postRequest = new HttpPost(s);
        addHeaders(config, postRequest);
        addExtraHeaders(postRequest);
        addParams(requestOptions, postRequest);
        pool.execute(new AsynchronousRequestSender(this));
    }

    public void setAuthListener(WLAuthListener wlauthlistener)
    {
        authListener = wlauthlistener;
    }

}

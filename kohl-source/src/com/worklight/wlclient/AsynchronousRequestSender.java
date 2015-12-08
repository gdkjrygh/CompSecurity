// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import com.worklight.common.WLTrusteer;
import com.worklight.wlclient.api.WLHttpResponseListener;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponseListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient:
//            HttpClientManager, CacheableInvokeRequestSender, CustomRequestSender, WLHybridRequestSender, 
//            WLRequest, WLRequestSender, WLResourceRequestSender, WLHybridHttpListener

public class AsynchronousRequestSender
{

    private static final ExecutorService pool = Executors.newFixedThreadPool(6);
    private static AsynchronousRequestSender sender = new AsynchronousRequestSender();
    private Map globalHeaders;

    private AsynchronousRequestSender()
    {
        globalHeaders = new HashMap();
    }

    public static AsynchronousRequestSender getInstance()
    {
        return sender;
    }

    public static void reset(Context context)
    {
        com/worklight/wlclient/AsynchronousRequestSender;
        JVM INSTR monitorenter ;
        sender.globalHeaders.clear();
        HttpClientManager.resetInstance(context);
        com/worklight/wlclient/AsynchronousRequestSender;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void addGlobalHeader(String s, String s1)
    {
        globalHeaders.put(s, s1);
    }

    public void addGlobalHeadersToRequest(HttpRequest httprequest)
    {
        Iterator iterator = globalHeaders.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Header header = httprequest.getFirstHeader((String)entry.getKey());
            if (header == null || !((String)entry.getValue()).equals(header.getValue()))
            {
                httprequest.addHeader((String)entry.getKey(), (String)entry.getValue());
            }
        } while (true);
        if (WLTrusteer.hasTrusteerSDK())
        {
            httprequest.addHeader("WL_TAS", WLTrusteer.getInstance().getRiskAssessment().toString());
        }
    }

    public String getGlobalHeader(String s)
    {
        return (String)globalHeaders.get(s);
    }

    public Map getGlobalHeaders()
    {
        return globalHeaders;
    }

    public void removeGlobalHeader(String s)
    {
        globalHeaders.remove(s);
    }

    public void sendCacheableInvokeRequestAsync(HttpRequestBase httprequestbase, WLRequestOptions wlrequestoptions)
    {
        pool.execute(new CacheableInvokeRequestSender(httprequestbase, wlrequestoptions));
    }

    public void sendCustomRequestAsync(HttpRequestBase httprequestbase, int i, WLResponseListener wlresponselistener)
    {
        addGlobalHeadersToRequest(httprequestbase);
        pool.execute(new CustomRequestSender(httprequestbase, i, wlresponselistener));
    }

    public void sendWLHybridRequestAsync(HttpRequestBase httprequestbase, int i, WLHybridHttpListener wlhybridhttplistener, boolean flag)
    {
        if (flag)
        {
            addGlobalHeadersToRequest(httprequestbase);
        }
        pool.execute(new WLHybridRequestSender(httprequestbase, i, wlhybridhttplistener));
    }

    public void sendWLRequestAsync(WLRequest wlrequest)
    {
        addGlobalHeadersToRequest(wlrequest.getURIRequest());
        pool.execute(new WLRequestSender(wlrequest));
    }

    public void sendWLResourceRequestAsync(HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener)
    {
        sendWLResourceRequestAsync(httpurirequest, wlhttpresponselistener, 1);
    }

    protected void sendWLResourceRequestAsync(HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener, int i)
    {
        pool.execute(new WLResourceRequestSender(httpurirequest, wlhttpresponselistener, i));
    }

}

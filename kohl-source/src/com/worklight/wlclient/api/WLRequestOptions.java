// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.worklight.wlclient.api:
//            WLResponseListener

public class WLRequestOptions
{

    private boolean fromChallenge;
    private ArrayList headers;
    private Object invocationContext;
    private Map parameters;
    private WLResponseListener responseListener;
    private int timeout;

    public WLRequestOptions()
    {
        parameters = new HashMap();
        timeout = 10000;
        headers = new ArrayList();
    }

    public void addHeader(String s, String s1)
    {
        addHeader(((Header) (new BasicHeader(s, s1))));
    }

    void addHeader(Header header)
    {
        if (header == null)
        {
            return;
        } else
        {
            headers.add(header);
            return;
        }
    }

    public void addParameter(String s, String s1)
    {
        parameters.put(s, s1);
    }

    void addParameters(Map map)
    {
        parameters.putAll(map);
    }

    public ArrayList getHeaders()
    {
        return headers;
    }

    public Object getInvocationContext()
    {
        return invocationContext;
    }

    String getParameter(String s)
    {
        if (parameters != null)
        {
            return (String)parameters.get(s);
        } else
        {
            return "";
        }
    }

    public Map getParameters()
    {
        return parameters;
    }

    public WLResponseListener getResponseListener()
    {
        return responseListener;
    }

    public int getTimeout()
    {
        return timeout;
    }

    public boolean isFromChallenge()
    {
        return fromChallenge;
    }

    public void setFromChallenge(boolean flag)
    {
        fromChallenge = flag;
    }

    void setHeaders(ArrayList arraylist)
    {
        headers = arraylist;
    }

    public void setInvocationContext(Object obj)
    {
        invocationContext = obj;
    }

    public void setResponseListener(WLResponseListener wlresponselistener)
    {
        responseListener = wlresponselistener;
    }

    public void setTimeout(int i)
    {
        timeout = i;
    }
}

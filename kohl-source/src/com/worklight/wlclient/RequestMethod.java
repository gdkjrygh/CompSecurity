// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;

public final class RequestMethod extends Enum
{

    private static final RequestMethod $VALUES[];
    public static final RequestMethod DELETE;
    public static final RequestMethod GET;
    public static final RequestMethod HEAD;
    public static final RequestMethod OPTIONS;
    public static final RequestMethod POST;
    public static final RequestMethod PUT;
    public static final RequestMethod TRACE;
    private String name;

    private RequestMethod(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static RequestMethod fromSring(String s)
    {
        RequestMethod arequestmethod[] = values();
        int j = arequestmethod.length;
        for (int i = 0; i < j; i++)
        {
            RequestMethod requestmethod = arequestmethod[i];
            if (s.equalsIgnoreCase(requestmethod.name))
            {
                return requestmethod;
            }
        }

        return null;
    }

    public static RequestMethod valueOf(String s)
    {
        return (RequestMethod)Enum.valueOf(com/worklight/wlclient/RequestMethod, s);
    }

    public static RequestMethod[] values()
    {
        return (RequestMethod[])$VALUES.clone();
    }

    public HttpRequestBase createHttpRequest()
    {
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$wlclient$RequestMethod[];

            static 
            {
                $SwitchMap$com$worklight$wlclient$RequestMethod = new int[RequestMethod.values().length];
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.GET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.POST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.PUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.DELETE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.TRACE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.OPTIONS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$RequestMethod[RequestMethod.HEAD.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.worklight.wlclient.RequestMethod[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new HttpGet();

        case 2: // '\002'
            return new HttpPost();

        case 3: // '\003'
            return new HttpPut();

        case 4: // '\004'
            return new HttpDelete();

        case 5: // '\005'
            return new HttpTrace();

        case 6: // '\006'
            return new HttpOptions();

        case 7: // '\007'
            return new HttpHead();
        }
    }

    public HttpRequestBase createHttpRequest(String s)
    {
        switch (_cls1..SwitchMap.com.worklight.wlclient.RequestMethod[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new HttpGet(s);

        case 2: // '\002'
            return new HttpPost(s);

        case 3: // '\003'
            return new HttpPut(s);

        case 4: // '\004'
            return new HttpDelete(s);

        case 5: // '\005'
            return new HttpTrace(s);

        case 6: // '\006'
            return new HttpOptions(s);

        case 7: // '\007'
            return new HttpHead(s);
        }
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        GET = new RequestMethod("GET", 0, "GET");
        POST = new RequestMethod("POST", 1, "POST");
        PUT = new RequestMethod("PUT", 2, "PUT");
        DELETE = new RequestMethod("DELETE", 3, "DELETE");
        HEAD = new RequestMethod("HEAD", 4, "HEAD");
        OPTIONS = new RequestMethod("OPTIONS", 5, "OPTIONS");
        TRACE = new RequestMethod("TRACE", 6, "TRACE");
        $VALUES = (new RequestMethod[] {
            GET, POST, PUT, DELETE, HEAD, OPTIONS, TRACE
        });
    }
}

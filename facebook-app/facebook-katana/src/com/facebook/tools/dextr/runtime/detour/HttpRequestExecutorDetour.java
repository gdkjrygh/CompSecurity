// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.fbtrace.utils.FbTraceId;
import com.facebook.http.engine.HttpRequestExecutor;
import com.facebook.http.interfaces.RequestState;
import com.facebook.http.observer.HttpFlowStatistics;
import com.facebook.loom.core.TraceControl;
import com.facebook.loom.logger.Logger;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class HttpRequestExecutorDetour
{

    private HttpRequestExecutorDetour()
    {
    }

    private static String a(String s, int i)
    {
        StringBuilder stringbuilder = new StringBuilder(24);
        stringbuilder.append(s);
        stringbuilder.append(FbTraceId.a(i));
        return stringbuilder.toString();
    }

    public static HttpResponse a(HttpRequestExecutor httprequestexecutor, HttpUriRequest httpurirequest, RequestState requeststate, HttpContext httpcontext, HttpFlowStatistics httpflowstatistics, int i)
    {
        int j = Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.NETWORK_OP_START, i);
        TraceControl tracecontrol = TraceControl.a();
        String s;
        if (tracecontrol != null)
        {
            s = tracecontrol.b();
        } else
        {
            s = "AAAAAAAAAAA";
        }
        if (j != -1 && httpurirequest != null && s != "AAAAAAAAAAA")
        {
            httpurirequest.setHeader("X-FBTrace-Meta", a(s, j));
            httpurirequest.setHeader("X-FBTrace-Sampled", "true");
        }
        requeststate = httprequestexecutor.a(httpurirequest, requeststate, httpcontext, httpflowstatistics);
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.NETWORK_OP_END, i, j);
        if (requeststate == null)
        {
            httprequestexecutor = null;
        } else
        {
            httprequestexecutor = requeststate.getEntity();
            if (httprequestexecutor != null)
            {
                long l = httprequestexecutor.getContentLength();
                Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.COUNTER, i, l);
            }
            httprequestexecutor = requeststate;
            if (requeststate.containsHeader("X-FBTrace-Backwards"))
            {
                httprequestexecutor = requeststate;
                if (requeststate.getFirstHeader("X-FBTrace-Backwards").getValue().equals("true"))
                {
                    httprequestexecutor = requeststate;
                    if (tracecontrol != null)
                    {
                        httprequestexecutor = requeststate;
                        if (tracecontrol.a(2, 4, httpurirequest))
                        {
                            tracecontrol.a(2, httpurirequest);
                            return requeststate;
                        }
                    }
                }
            }
        }
        return httprequestexecutor;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.publisher.protocol.message.ReportExceptions;
import java.util.List;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            IngestHttpRequest, HttpRequest

public class ReportExceptionsHttpRequest extends IngestHttpRequest
{
    public static class Factory extends IngestHttpRequest.Factory
    {

        com.vungle.publisher.protocol.message.ReportExceptions.Factory a;
        Provider d;

        public final ReportExceptionsHttpRequest a(List list)
            throws JSONException
        {
            ReportExceptionsHttpRequest reportexceptionshttprequest = (ReportExceptionsHttpRequest)d();
            ReportExceptions reportexceptions = (ReportExceptions)a.a.get();
            reportexceptions.a = list;
            reportexceptionshttprequest.d = reportexceptions.c();
            return reportexceptionshttprequest;
        }

        protected final String a()
        {
            return "api/v1/sdkErrors";
        }

        protected final HttpRequest b()
        {
            return (ReportExceptionsHttpRequest)d.get();
        }

        public Factory()
        {
        }
    }


    public ReportExceptionsHttpRequest()
    {
    }

    protected final HttpRequest.b a()
    {
        return HttpRequest.b.k;
    }
}

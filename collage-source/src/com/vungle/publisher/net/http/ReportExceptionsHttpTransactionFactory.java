// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import java.util.List;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            ReportExceptionsHttpResponseHandler, HttpTransaction

public class ReportExceptionsHttpTransactionFactory extends HttpTransaction.Factory
{

    ReportExceptionsHttpRequest.Factory a;
    ReportExceptionsHttpResponseHandler.Factory b;

    public ReportExceptionsHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(List list)
        throws JSONException
    {
        ReportExceptionsHttpRequest reportexceptionshttprequest = a.a(list);
        ReportExceptionsHttpResponseHandler reportexceptionshttpresponsehandler = (ReportExceptionsHttpResponseHandler)b.a.get();
        reportexceptionshttpresponsehandler.a = list;
        return super.a(reportexceptionshttprequest, reportexceptionshttpresponsehandler);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.db.model.LocalAdReport;
import com.vungle.publisher.db.model.StreamingAdReport;
import com.vungle.publisher.net.http.HttpTransaction;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            ReportLocalAdHttpResponseHandler, ReportStreamingAdHttpResponseHandler

public class ReportAdHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    ReportLocalAdHttpRequest.Factory a;
    ReportLocalAdHttpResponseHandler b;
    ReportStreamingAdHttpRequest.Factory d;
    ReportStreamingAdHttpResponseHandler e;

    public ReportAdHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(LocalAdReport localadreport)
        throws JSONException
    {
        return super.a(a.a(localadreport), b);
    }

    public final HttpTransaction a(StreamingAdReport streamingadreport)
        throws JSONException
    {
        return super.a(d.a(streamingadreport), e);
    }
}

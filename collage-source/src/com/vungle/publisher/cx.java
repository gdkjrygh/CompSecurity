// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.log.Logger;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import com.vungle.publisher.net.http.InfiniteRetryHttpResponseHandler;
import com.vungle.publisher.protocol.ReportAdHttpRequest;
import com.vungle.publisher.reporting.AdReportManager;
import dagger.Lazy;
import java.io.IOException;
import org.json.JSONException;

public abstract class cx extends InfiniteRetryHttpResponseHandler
{

    public Lazy a;

    public cx()
    {
    }

    public void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        httptransaction = (ReportAdHttpRequest)httptransaction.a;
        httpresponse = (AdReportManager)a.get();
        Integer integer = ((ReportAdHttpRequest) (httptransaction)).f;
        Logger.i("VungleReport", (new StringBuilder("deleting report ")).append(integer).toString());
        ((AdReportManager) (httpresponse)).c.a(new Integer[] {
            integer
        });
        ((ReportAdHttpRequest) (httptransaction)).e.q();
    }
}

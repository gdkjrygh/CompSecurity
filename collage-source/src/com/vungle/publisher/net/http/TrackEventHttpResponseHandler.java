// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.log.Logger;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.EventTrackingHttpLogEntry;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vungle.publisher.net.http:
//            MaxRetryAgeHttpResponseHandler, HttpTransaction, TrackEventHttpRequest, HttpResponse, 
//            HttpRequestChainElement

public class TrackEventHttpResponseHandler extends MaxRetryAgeHttpResponseHandler
{

    boolean a;
    com.vungle.publisher.db.model.EventTrackingHttpLogEntry.Factory b;

    TrackEventHttpResponseHandler()
    {
    }

    private void e(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        Ad ad;
        httptransaction = (TrackEventHttpRequest)httptransaction.a;
        Logger.d("VungleNetwork", (new StringBuilder("logging reqeust chain for ")).append(httptransaction).toString());
        ad = ((TrackEventHttpRequest) (httptransaction)).e;
        httpresponse = httpresponse.c;
        if (httpresponse == null)
        {
            HttpRequestChainElement httprequestchainelement;
            com.vungle.publisher.db.model.EventTracking.a a1;
            Object obj;
            try
            {
                Logger.d("VungleNetwork", (new StringBuilder("null request chain for ")).append(httptransaction).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (HttpTransaction httptransaction)
            {
                g.a("VungleNetwork", "error logging call-to-action response", httptransaction);
            }
            break MISSING_BLOCK_LABEL_197;
        }
        for (httpresponse = httpresponse.iterator(); httpresponse.hasNext(); ((EventTrackingHttpLogEntry) (obj)).r())
        {
            httprequestchainelement = (HttpRequestChainElement)httpresponse.next();
            obj = b;
            a1 = ((TrackEventHttpRequest) (httptransaction)).f;
            obj = ((com.vungle.publisher.db.model.EventTrackingHttpLogEntry.Factory) (obj)).b();
            obj.a = ad.d();
            obj.b = ad.h();
            obj.c = a1;
            obj.e = Integer.valueOf(httprequestchainelement.b);
            obj.f = Long.valueOf(httprequestchainelement.c.longValue());
            obj.g = httprequestchainelement.a;
        }

    }

    protected final void c(HttpTransaction httptransaction, HttpResponse httpresponse)
    {
        super.c(httptransaction, httpresponse);
        if (a)
        {
            e(httptransaction, httpresponse);
        }
        return;
        Exception exception;
        exception;
        if (a)
        {
            e(httptransaction, httpresponse);
        }
        throw exception;
    }
}

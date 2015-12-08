// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.vungle.log.Logger;
import com.vungle.publisher.ad.AdManager;
import com.vungle.publisher.ad.AdPreparer;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.cb;
import com.vungle.publisher.cv;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import com.vungle.publisher.net.http.InfiniteRetryHttpResponseHandler;
import com.vungle.publisher.protocol.message.RequestLocalAd;
import com.vungle.publisher.protocol.message.RequestLocalAdResponse;
import com.vungle.publisher.reporting.AdServiceReportingHandler;
import com.vungle.publisher.s;
import com.vungle.publisher.t;
import com.vungle.publisher.v;
import dagger.Lazy;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            RequestLocalAdHttpRequest, EventTrackingHttpLogEntryDeleteDelegate, ProtocolHttpGateway

public class RequestLocalAdHttpResponseHandler extends InfiniteRetryHttpResponseHandler
{

    AdServiceReportingHandler a;
    EventBus b;
    EventTrackingHttpLogEntryDeleteDelegate c;
    Lazy d;
    Lazy e;
    com.vungle.publisher.protocol.message.RequestLocalAdResponse.Factory k;
    ScheduledPriorityExecutor l;
    ProtocolHttpGateway m;

    public RequestLocalAdHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        RequestLocalAdResponse requestlocaladresponse;
        httpresponse = a(httpresponse.a);
        requestlocaladresponse = (RequestLocalAdResponse)k.a(httpresponse);
        AdServiceReportingHandler adservicereportinghandler;
        if (requestlocaladresponse.r == null)
        {
            httpresponse = null;
        } else
        {
            httpresponse = Integer.valueOf(requestlocaladresponse.r.intValue() * 1000);
        }
        adservicereportinghandler = a;
        adservicereportinghandler.b = SystemClock.elapsedRealtime() - adservicereportinghandler.a;
        c.a(((RequestLocalAdHttpRequest)httptransaction.a).e.g);
        if (httpresponse != null) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag;
        if (requestlocaladresponse.s.longValue() * 1000L < System.currentTimeMillis())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Logger.i("VungleNetwork", "received expired ad from server, tossing it and getting a new one");
            b.a(new v(httptransaction.b));
            return;
        }
        httptransaction = (AdManager)d.get();
        httpresponse = requestlocaladresponse.f();
        obj = (LocalAd)((AdManager) (httptransaction)).g.a(httpresponse);
        if (obj != null) goto _L4; else goto _L3
_L3:
        try
        {
            ((AdManager) (httptransaction)).g.i();
            obj = ((AdManager) (httptransaction)).g.a(requestlocaladresponse);
            Logger.i("VunglePrepare", (new StringBuilder("received new ")).append(((LocalAd) (obj)).y()).toString());
            ((LocalAd) (obj)).l();
            ((AdManager) (httptransaction)).a.a(httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.w("VunglePrepare", (new StringBuilder("error preparing ad ")).append(httpresponse).toString(), ((Throwable) (obj)));
            ((AdManager) (httptransaction)).d.a(new t());
        }
_L6:
        httptransaction = (SdkState)e.get();
        httpresponse = requestlocaladresponse.a();
        Object obj1;
        if (httpresponse == null)
        {
            Logger.v("VungleAd", "ignoring set null min ad delay seconds");
            return;
        } else
        {
            int i = httpresponse.intValue();
            Logger.d("VungleAd", (new StringBuilder("setting min ad delay seconds: ")).append(i).toString());
            ((SdkState) (httptransaction)).n.edit().putInt("VgAdDelayDuration", i).apply();
            return;
        }
_L4:
        try
        {
            ((AdManager) (httptransaction)).g.a(((LocalAd) (obj)), requestlocaladresponse);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Logger.w("VunglePrepare", (new StringBuilder("error updating ad ")).append(httpresponse).toString(), ((Throwable) (obj1)));
        }
        obj1 = ((LocalAd) (obj)).i();
        switch (com.vungle.publisher.ad.AdManager._cls3.a[((com.vungle.publisher.db.model.Ad.a) (obj1)).ordinal()])
        {
        default:
            Logger.w("VunglePrepare", (new StringBuilder("received ")).append(((LocalAd) (obj)).y()).append(" in status ").append(obj1).append(" - ignoring").toString());
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            Logger.i("VunglePrepare", (new StringBuilder("received ")).append(((LocalAd) (obj)).y()).append(" in status ").append(obj1).toString());
            ((AdManager) (httptransaction)).a.a(httpresponse);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l.a(new cv(httptransaction), httptransaction.c, httpresponse.intValue());
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse, Exception exception)
    {
        b.a(new s(httptransaction.b));
    }
}

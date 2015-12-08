// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.reporting;

import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.db.model.AdReport;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.LocalAdReport;
import com.vungle.publisher.env.SdkState;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.protocol.ProtocolHttpGateway;
import com.vungle.publisher.q;
import java.util.Iterator;
import java.util.List;

public class AdReportManager
{

    EventBus a;
    com.vungle.publisher.db.model.AdReport.Factory b;
    public com.vungle.publisher.db.model.LocalAdReport.Factory c;
    public ProtocolHttpGateway d;
    public SdkState e;
    com.vungle.publisher.db.model.StreamingAdReport.Factory f;
    com.vungle.publisher.db.model.LoggedException.Factory g;

    public AdReportManager()
    {
    }

    public final LocalAdReport a(LocalAd localad)
    {
        return (LocalAdReport)c.a(localad);
    }

    public final void a()
    {
        Object obj;
        obj = b.a();
        Logger.i("VungleReport", (new StringBuilder("sending ")).append(((List) (obj)).size()).append(" ad reports").toString());
        obj = ((List) (obj)).iterator();
_L1:
        AdReport adreport;
        String s;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        adreport = (AdReport)((Iterator) (obj)).next();
        s = adreport.y();
        Logger.d("VungleReport", (new StringBuilder("sending ")).append(s).toString());
        ProtocolHttpGateway protocolhttpgateway = d;
        protocolhttpgateway.e.a(new com.vungle.publisher.protocol.ProtocolHttpGateway._cls1(protocolhttpgateway, adreport), com.vungle.publisher.async.ScheduledPriorityExecutor.b.d);
          goto _L1
        Exception exception1;
        exception1;
        g.a("VungleReport", (new StringBuilder("error sending ")).append(s).toString(), exception1);
        adreport.a(com.vungle.publisher.db.model.AdReport.a.b);
        adreport.m();
          goto _L1
        Exception exception;
        exception;
        a.a(new q());
        throw exception;
        a.a(new q());
        return;
    }
}

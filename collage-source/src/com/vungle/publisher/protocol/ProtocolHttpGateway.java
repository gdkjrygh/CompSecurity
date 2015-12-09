// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.SafeBundleAdConfigFactory;
import com.vungle.publisher.ae;
import com.vungle.publisher.ai;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.by;
import com.vungle.publisher.cs;
import com.vungle.publisher.cw;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.r;
import com.vungle.publisher.reporting.AdServiceReportingHandler;
import com.vungle.publisher.t;
import dagger.Lazy;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.protocol:
//            ReportAdHttpTransactionFactory, RequestConfigHttpTransactionFactory, RequestLocalAdHttpTransactionFactory, RequestStreamingAdHttpTransactionFactory, 
//            SessionEndHttpTransactionFactory, SessionStartHttpTransactionFactory, UnfilledAdHttpTransactionFactory

public class ProtocolHttpGateway extends cs
{
    static class PrepareLocalAdEventListener extends by
    {

        Provider a;

        private void a(cw cw1)
        {
            ((ProtocolHttpGateway)a.get()).b(cw1);
        }

        public void onEvent(ae ae1)
        {
            a(ae1.a);
        }

        public void onEvent(ai ai)
        {
            a(null);
        }

        public void onEvent(t t)
        {
            a(null);
        }

        PrepareLocalAdEventListener()
        {
        }
    }


    EventBus a;
    PrepareLocalAdEventListener b;
    ReportAdHttpTransactionFactory f;
    RequestConfigHttpTransactionFactory g;
    RequestLocalAdHttpTransactionFactory h;
    RequestStreamingAdHttpTransactionFactory i;
    SafeBundleAdConfigFactory j;
    SessionEndHttpTransactionFactory k;
    SessionStartHttpTransactionFactory l;
    Lazy m;
    UnfilledAdHttpTransactionFactory n;
    AdServiceReportingHandler o;
    private final AtomicBoolean p = new AtomicBoolean();

    ProtocolHttpGateway()
    {
    }

    static com.vungle.publisher.db.model.LoggedException.Factory a(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory b(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static AtomicBoolean c(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.p;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory d(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory e(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory f(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory g(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory h(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory i(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    static com.vungle.publisher.db.model.LoggedException.Factory j(ProtocolHttpGateway protocolhttpgateway)
    {
        return protocolhttpgateway.d;
    }

    public final void a()
    {
        e.a(new _cls2(), com.vungle.publisher.async.ScheduledPriorityExecutor.b.j);
    }

    public final void a(cw cw1)
    {
        e.a(new _cls3(cw1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.f, cw1.a(2000));
    }

    final void b()
    {
        a.a(new r());
    }

    final void b(cw cw1)
    {
        p.set(false);
        b.unregister();
        if (cw1 != null)
        {
            a(cw1);
        }
    }

    public final void c()
    {
        e.a(new _cls8(), com.vungle.publisher.async.ScheduledPriorityExecutor.b.n);
    }

    public final void c(cw cw1)
    {
        e.a(new _cls7(cw1), com.vungle.publisher.async.ScheduledPriorityExecutor.b.e, cw1.a(5000));
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls7 {}

}

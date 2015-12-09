// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public final class fpq
    implements eda
{

    public static final long c;
    public fpp a;
    public edb b;
    public long d;
    public Handler e;
    public Runnable f;
    private fpr g;
    private Optional h;

    public fpq(fpp fpp1, fpr fpr1, edb edb1, boolean flag)
    {
        e = new Handler();
        f = new Runnable() {

            private fpq a;

            public final void run()
            {
                fpq.a(a).g();
                Context context = (Context)fpq.b(a).a.get();
                if (context != null)
                {
                    ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aJ);
                    dmz.a(fop);
                    fop.a(context, ViewUri.aP, clientevent);
                }
                fpq.c(a);
            }

            
            {
                a = fpq.this;
                super();
            }
        };
        h = Optional.e();
        a = fpp1;
        g = fpr1;
        b = edb1;
        if (flag)
        {
            fpp1 = (Context)a.a.get();
            if (fpp1 != null)
            {
                fpr1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R);
                dmz.a(fop);
                fop.a(fpp1, ViewUri.aP, fpr1);
            }
        }
    }

    static fpr a(fpq fpq1)
    {
        return fpq1.g;
    }

    static fpp b(fpq fpq1)
    {
        return fpq1.a;
    }

    static void c(fpq fpq1)
    {
        fpq1.c();
    }

    public final void a()
    {
        b.b();
        b.b(this);
    }

    public final void a(SessionState sessionstate)
    {
        if (!h.b())
        {
            h = Optional.b(sessionstate);
        } else
        if (!((SessionState)h.c()).m.equals(sessionstate.m) && "premium".equals(sessionstate.m))
        {
            c();
            long l = System.currentTimeMillis();
            long l1 = d;
            TimeUnit.MILLISECONDS.toSeconds(l - l1);
            return;
        }
    }

    public final void b()
    {
        e.removeCallbacksAndMessages(f);
    }

    public final void c()
    {
        b();
        a();
        g.f();
    }

    static 
    {
        c = TimeUnit.MINUTES.toMillis(2L);
    }
}

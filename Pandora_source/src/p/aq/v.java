// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.k;
import p.as.e;
import p.aw.a;

// Referenced classes of package p.aq:
//            b

class v
    implements Runnable
{

    final boolean a;
    final b b;

    v(b b1, boolean flag)
    {
        b = b1;
        a = flag;
        super();
    }

    public void run()
    {
        if (a && !p.aq.b.a(b))
        {
            p.aq.b.a(b, true);
            b.q(p.aq.b.b(b));
            b.a();
            b.q().a();
            b.u().a(3000);
        } else
        if (!a && p.aq.b.a(b))
        {
            p.aq.b.a(b, false);
            p.aq.b.b(b, b.af);
            if (Thread.getDefaultUncaughtExceptionHandler() != b.ag)
            {
                Thread.setDefaultUncaughtExceptionHandler(b.ag);
            }
            b.q().b();
            b.u().d();
            b.p().e();
            b.f.c();
            return;
        }
    }
}

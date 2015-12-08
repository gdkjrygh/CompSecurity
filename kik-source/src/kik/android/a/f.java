// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.a;

import com.kik.g.r;
import com.kik.n.a.d.a;
import java.util.UUID;
import kik.a.e.v;

// Referenced classes of package kik.android.a:
//            b, a

final class f extends r
{

    final b a;

    f(b b1)
    {
        a = b1;
        super();
    }

    public final void a()
    {
        a.b = false;
        super.a();
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        if (obj == null || ((a) (obj)).b() == null || ((a) (obj)).b().equals("")) goto _L2; else goto _L1
_L1:
        a.c = ((a) (obj)).b();
        b.b(a).c("enc_metrics_anon_id", ((a) (obj)).b());
        (new StringBuilder("AnonymousId was in xData. It is ")).append(a.c);
_L4:
        kik.android.a.b.a(a).c(a.c);
        return;
_L2:
        if (a.c == null)
        {
            a.c = UUID.randomUUID().toString().replace("-", "");
            (new StringBuilder("AnonymousId never existed in xData. Making it ")).append(a.c);
            a.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
    }
}

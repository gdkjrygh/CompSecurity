// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.g.i;
import kik.a.d.aa;
import kik.a.e.w;
import kik.a.x;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class h extends i
{

    final KikApplication a;

    h(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = KikApplication.s(a).b(KikApplication.r(a).d().c);
        if (obj != null)
        {
            KikApplication.a(a, KikApplication.q().getApplicationContext(), ((kik.a.a) (obj)));
        }
        KikApplication.t(a);
    }
}

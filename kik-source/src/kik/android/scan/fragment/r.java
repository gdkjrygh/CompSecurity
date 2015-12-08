// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import kik.a.d.n;
import kik.a.f.q;
import kik.android.chat.KikApplication;
import kik.android.scan.a.c;

// Referenced classes of package kik.android.scan.fragment:
//            q, ScanFragment

final class r extends com.kik.g.r
{

    final kik.android.scan.fragment.q a;

    r(kik.android.scan.fragment.q q1)
    {
        a = q1;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (n)obj;
        super.a(obj);
        ScanFragment.a(a.b, ((kik.a.d.k) (obj)), c.a(a.a));
    }

    public final void b(Throwable throwable)
    {
        if ((throwable instanceof q) && ((q)throwable).a() == 404)
        {
            ScanFragment.a(a.b, a.a, KikApplication.f(0x7f090211), KikApplication.f(0x7f0901da));
            return;
        } else
        {
            ScanFragment.b(a.b, a.a);
            return;
        }
    }
}

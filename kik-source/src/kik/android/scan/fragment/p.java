// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.r;
import com.kik.scan.KikCode;
import kik.a.d.k;
import kik.android.scan.a.a;
import kik.android.scan.a.c;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class p extends r
{

    final a a;
    final KikCode b;
    final ScanFragment c;

    p(ScanFragment scanfragment, a a1, KikCode kikcode)
    {
        c = scanfragment;
        a = a1;
        b = kikcode;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (k)obj;
        kik.android.scan.fragment.ScanFragment.a(c, ((k) (obj)), kik.android.scan.a.c.a(a));
    }

    public final void a(Throwable throwable)
    {
        ScanFragment.b(c, b);
    }
}

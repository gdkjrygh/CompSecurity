// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.r;
import com.kik.scan.KikCode;
import kik.android.scan.a.b;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class j extends r
{

    final KikCode a;
    final ScanFragment b;

    j(ScanFragment scanfragment, KikCode kikcode)
    {
        b = scanfragment;
        a = kikcode;
        super();
    }

    public final void a(Object obj)
    {
        obj = (b)obj;
        if (obj == null)
        {
            kik.android.scan.fragment.ScanFragment.b(b, a);
            return;
        } else
        {
            ScanFragment.a(b, ((b) (obj)));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        kik.android.scan.fragment.ScanFragment.b(b, a);
    }
}

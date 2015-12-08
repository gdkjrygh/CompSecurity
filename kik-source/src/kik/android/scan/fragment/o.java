// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.r;
import com.kik.scan.UsernameKikCode;
import kik.a.d.k;
import kik.a.f.q;
import kik.android.scan.a.c;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class o extends r
{

    final UsernameKikCode a;
    final ScanFragment b;

    o(ScanFragment scanfragment, UsernameKikCode usernamekikcode)
    {
        b = scanfragment;
        a = usernamekikcode;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (k)obj;
        ScanFragment.a(b, ((k) (obj)), c.a(a));
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            throwable = (q)throwable;
            if (throwable.a() == 202 || throwable.a() == 201)
            {
                ScanFragment.g(b);
                return;
            }
        }
        ScanFragment.g(b);
    }
}

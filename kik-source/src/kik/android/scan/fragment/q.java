// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import com.kik.g.p;
import com.kik.g.r;
import com.kik.g.s;
import com.kik.scan.GroupKikCode;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.f.f.i;
import kik.android.scan.a.c;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment, r

final class q extends r
{

    final GroupKikCode a;
    final ScanFragment b;

    q(ScanFragment scanfragment, GroupKikCode groupkikcode)
    {
        b = scanfragment;
        a = groupkikcode;
        super();
    }

    public final void a(Object obj)
    {
        obj = (i)obj;
        if (((i) (obj)).d() != null)
        {
            obj = b.e.a(((i) (obj)).d(), true);
            if (((n) (obj)).l() && !((n) (obj)).B())
            {
                obj = s.a(obj);
            } else
            {
                obj = ScanFragment.a(b, ((n) (obj)), c.a(a));
            }
            ScanFragment.a(b, ((p) (obj)));
            ((p) (obj)).a(new kik.android.scan.fragment.r(this));
            return;
        } else
        {
            ScanFragment.b(b, a);
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        ScanFragment.b(b, a);
    }
}

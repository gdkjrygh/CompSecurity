// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import com.kik.g.r;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.f.f.ag;
import kik.a.f.q;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment, lu

final class lt extends r
{

    final KikGroupMembersListFragment a;

    lt(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ag)obj;
        a.a(null);
        kik.android.chat.fragment.KikGroupMembersListFragment.n(a).post(new lu(this));
        obj = a.a.a(((ag) (obj)).e(), false);
        if (obj != null && ((k) (obj)).t())
        {
            a.e.b("Admin Promoted").a("Admin Count", ((n)obj).C()).b();
        }
    }

    public final void a(Throwable throwable)
    {
        a.a(null);
        if (throwable instanceof q)
        {
            a.a(a.P, a.Q);
        }
    }
}

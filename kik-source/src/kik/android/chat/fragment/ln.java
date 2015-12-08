// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import java.util.List;
import kik.a.d.n;
import kik.a.f.q;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class ln extends r
{

    final KikGroupMembersListFragment a;

    ln(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void a(Object obj)
    {
        a.w();
    }

    public final void a(Throwable throwable)
    {
        String s = null;
        a.w();
        int i;
        if (throwable instanceof q)
        {
            throwable = (q)throwable;
            i = throwable.a();
            throwable = ((Throwable) (throwable.b()));
        } else
        {
            i = 100;
            throwable = null;
        }
        switch (i)
        {
        default:
            a.d(i);
            return;

        case 202: 
            a.a(KikGroupMembersListFragment.b(0x7f0902ba), KikGroupMembersListFragment.b(0x7f090025));
            return;

        case 203: 
            a.a(KikGroupMembersListFragment.b(0x7f0902ba), KikGroupMembersListFragment.b(0x7f09011a));
            return;

        case 201: 
            s = (String)throwable;
            throwable = s;
            if (s == null)
            {
                throwable = KikGroupMembersListFragment.b(0x7f090202);
            }
            a.a(KikGroupMembersListFragment.b(0x7f0902ba), KikGroupMembersListFragment.a(0x7f0901a2, new Object[] {
                throwable
            }));
            return;

        case 104: // 'h'
            a.a(cq.a(), (String)throwable);
            return;

        case 4002: 
            break;
        }
        if (KikGroupMembersListFragment.a(a) != null)
        {
            s = KikGroupMembersListFragment.a(a).J();
        }
        if (s != null && throwable != null)
        {
            cq.a((List)throwable, a.a);
            a.a(KikGroupMembersListFragment.b(0x7f0902ba), KikGroupMembersListFragment.b(0x7f090119));
            return;
        } else
        {
            a.d(i);
            return;
        }
    }
}

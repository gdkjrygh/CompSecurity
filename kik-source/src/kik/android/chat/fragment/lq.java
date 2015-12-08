// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.app.FragmentActivity;
import com.kik.view.adapters.ba;
import com.kik.view.adapters.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class lq
    implements Runnable
{

    final KikGroupMembersListFragment a;

    lq(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void run()
    {
        KikGroupMembersListFragment.c(a);
        if (KikGroupMembersListFragment.d(a) != null)
        {
            KikGroupMembersListFragment.d(a).notifyDataSetChanged();
        } else
        {
            KikGroupMembersListFragment.a(a, new ba(a.getActivity().getApplicationContext(), KikGroupMembersListFragment.e(a), a.d, a.a, a.e));
        }
        if (KikGroupMembersListFragment.f(a) != null)
        {
            KikGroupMembersListFragment.f(a).notifyDataSetChanged();
        } else
        {
            KikGroupMembersListFragment.b(a, new ba(a.getActivity().getApplicationContext(), KikGroupMembersListFragment.g(a), a.d, a.a, a.e));
        }
        if (KikGroupMembersListFragment.h(a) != null)
        {
            KikGroupMembersListFragment.h(a).notifyDataSetChanged();
        } else
        {
            KikGroupMembersListFragment.c(a, new ba(a.getActivity().getApplicationContext(), KikGroupMembersListFragment.i(a), a.d, a.a, a.e));
        }
        kik.android.chat.fragment.KikGroupMembersListFragment.k(a).e(KikGroupMembersListFragment.j(a), KikGroupMembersListFragment.d(a));
        kik.android.chat.fragment.KikGroupMembersListFragment.k(a).e(KikGroupMembersListFragment.l(a), KikGroupMembersListFragment.f(a));
        kik.android.chat.fragment.KikGroupMembersListFragment.k(a).e(KikGroupMembersListFragment.m(a), KikGroupMembersListFragment.h(a));
        kik.android.chat.fragment.KikGroupMembersListFragment.k(a).notifyDataSetChanged();
    }
}

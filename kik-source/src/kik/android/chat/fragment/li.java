// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.d.n;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class li extends i
{

    final KikGroupMembersListFragment a;

    li(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if (obj != null && KikGroupMembersListFragment.a(a).b().equals(obj))
        {
            KikGroupMembersListFragment.b(a);
        }
    }
}

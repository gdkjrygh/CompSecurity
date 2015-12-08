// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import kik.a.d.j;
import kik.a.z;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class ll extends i
{

    final KikGroupMembersListFragment a;

    ll(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        obj1 = z.b(a.b);
        if (obj != null && ((String) (obj)).equals(((z) (obj1)).a().a()))
        {
            KikGroupMembersListFragment.b(a);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikGroupMembersListFragment

final class lj
    implements android.content.DialogInterface.OnClickListener
{

    final ProgressDialogFragment a;
    final k b;
    final KikGroupMembersListFragment c;

    lj(KikGroupMembersListFragment kikgroupmemberslistfragment, ProgressDialogFragment progressdialogfragment, k k1)
    {
        c = kikgroupmemberslistfragment;
        a = progressdialogfragment;
        b = k1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.setCancelable(false);
        a.e();
        c.a(a);
        c.c.a(b.b(), KikGroupMembersListFragment.a(c).b(), KikGroupMembersListFragment.o(c));
    }
}

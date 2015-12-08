// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.g.p;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikGroupMembersListFragment

final class lk
    implements android.content.DialogInterface.OnClickListener
{

    final ProgressDialogFragment a;
    final k b;
    final boolean c;
    final boolean d;
    final KikGroupMembersListFragment e;

    lk(KikGroupMembersListFragment kikgroupmemberslistfragment, ProgressDialogFragment progressdialogfragment, k k1, boolean flag, boolean flag1)
    {
        e = kikgroupmemberslistfragment;
        a = progressdialogfragment;
        b = k1;
        c = flag;
        d = flag1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.setCancelable(false);
        a.e();
        e.a(a);
        e.c.a(b.b(), KikGroupMembersListFragment.a(e).b(), c, d).a(kik.android.chat.fragment.KikGroupMembersListFragment.p(e));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;
import kik.android.util.cy;

// Referenced classes of package kik.android.chat.fragment:
//            KikContactsListFragment, KikPickUsersFragment

final class np extends r
{

    final KikPickUsersFragment a;

    np(KikPickUsersFragment kikpickusersfragment)
    {
        a = kikpickusersfragment;
        super();
    }

    public final void a()
    {
        a.a(null);
    }

    public final void a(Throwable throwable)
    {
        a.a(a.getString(0x7f0902db), cy.a(throwable));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import CU;
import Eh;
import Ei;
import java.util.HashSet;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment

final class a
    implements Eh
{

    private AddFriendsFragment a;

    public final void a(CU cu)
    {
        int i = Ei.a(cu);
        if (AddFriendsFragment.a(a).contains(Integer.valueOf(i)))
        {
            AddFriendsFragment.a(a).remove(Integer.valueOf(i));
            a.m();
            a.H();
        }
    }

    (AddFriendsFragment addfriendsfragment)
    {
        a = addfriendsfragment;
        super();
    }
}

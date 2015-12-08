// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import android.content.DialogInterface;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddNearbyFriendsFragment, FindNearbyFriendsWorker

final class a
    implements android.content.ener
{

    private AddNearbyFriendsFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        AddNearbyFriendsFragment.b(a);
        Bt.be();
        AddNearbyFriendsFragment.c(a).a();
    }

    (AddNearbyFriendsFragment addnearbyfriendsfragment)
    {
        a = addnearbyfriendsfragment;
        super();
    }
}

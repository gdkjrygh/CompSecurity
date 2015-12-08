// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Un;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import java.util.concurrent.LinkedBlockingDeque;
import mh;
import pi;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            NewUserContactBookFragment

final class a extends mh
{

    private LinkedBlockingDeque a;
    private NewUserContactBookFragment b;

    public final void a(Un un, pi pi)
    {
        super.a(un, pi);
        if (!a.isEmpty())
        {
            b.a(a);
        }
    }

    (NewUserContactBookFragment newusercontactbookfragment, Friend friend, FriendAction friendaction, LinkedBlockingDeque linkedblockingdeque)
    {
        b = newusercontactbookfragment;
        a = linkedblockingdeque;
        super(friend, friendaction);
    }
}

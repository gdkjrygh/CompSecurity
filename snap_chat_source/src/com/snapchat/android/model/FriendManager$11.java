// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.snapchat.android.model:
//            FriendManager, Friend

final class val.blockedFriendsSet
    implements sSet
{

    final FriendManager this$0;
    final ArrayList val$blockedFriends;
    final Set val$blockedFriendsSet;

    public final void a(Object obj)
    {
        obj = (Friend)obj;
        if (((Friend) (obj)).mIsBlocked)
        {
            val$blockedFriends.add(obj);
            val$blockedFriendsSet.add(obj);
        }
    }

    ()
    {
        this$0 = final_friendmanager;
        val$blockedFriends = arraylist;
        val$blockedFriendsSet = Set.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.contacts.a.c;
import com.facebook.user.ChatContext;
import com.facebook.user.User;
import java.util.Comparator;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarNearbyFriendsFragment

class ar
    implements Comparator
{

    final DivebarNearbyFriendsFragment a;

    ar(DivebarNearbyFriendsFragment divebarnearbyfriendsfragment)
    {
        a = divebarnearbyfriendsfragment;
        super();
    }

    public int a(User user, User user1)
    {
        return Float.valueOf(DivebarNearbyFriendsFragment.a(a).b(user.c()).getDistanceMeters()).compareTo(Float.valueOf(DivebarNearbyFriendsFragment.a(a).b(user1.c()).getDistanceMeters()));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((User)obj, (User)obj1);
    }
}

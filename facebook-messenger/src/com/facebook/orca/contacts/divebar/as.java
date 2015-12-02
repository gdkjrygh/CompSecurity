// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ag;
import com.facebook.contacts.picker.aq;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarNearbyFriendsFragment, bl

class as
    implements aq
{

    final DivebarNearbyFriendsFragment a;

    as(DivebarNearbyFriendsFragment divebarnearbyfriendsfragment)
    {
        a = divebarnearbyfriendsfragment;
        super();
    }

    public void a(ad ad, int i)
    {
        ad = (ag)ad;
        if (DivebarNearbyFriendsFragment.b(a) != null)
        {
            DivebarNearbyFriendsFragment.b(a).a(ad.a(), true, ad, "divebar_nearby_friends", i);
        }
    }
}

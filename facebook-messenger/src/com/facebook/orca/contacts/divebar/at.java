// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.support.v4.app.q;
import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            DivebarNearbyFriendsFragment

class at
    implements android.view.View.OnClickListener
{

    final DivebarNearbyFriendsFragment a;

    at(DivebarNearbyFriendsFragment divebarnearbyfriendsfragment)
    {
        a = divebarnearbyfriendsfragment;
        super();
    }

    public void onClick(View view)
    {
        a.p().d();
    }
}

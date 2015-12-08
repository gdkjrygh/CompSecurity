// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import android.database.DataSetObserver;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment

final class a extends DataSetObserver
{

    private AddFriendsFragment a;

    public final void onChanged()
    {
        super.onChanged();
        a.F();
    }

    (AddFriendsFragment addfriendsfragment)
    {
        a = addfriendsfragment;
        super();
    }
}

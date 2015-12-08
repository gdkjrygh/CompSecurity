// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Jo;
import android.view.View;
import wN;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsFragment

final class a
    implements android.view.tener
{

    private AddFriendsFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            Jo.h(a.getActivity());
            AddFriendsFragment.b(a);
            a.A.l = false;
        }
    }

    (AddFriendsFragment addfriendsfragment)
    {
        a = addfriendsfragment;
        super();
    }
}

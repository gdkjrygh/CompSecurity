// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import CU;
import CX;
import Eh;
import com.snapchat.android.model.SuggestedFriendAction;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddFriendsMenuFragment

final class a
    implements Eh
{

    private AddFriendsMenuFragment a;

    public final void a(CU cu)
    {
        if (cu instanceof CX)
        {
            cu = (CX)cu;
            if (((CX) (cu)).c && ((CX) (cu)).a == SuggestedFriendAction.HIDE)
            {
                AddFriendsMenuFragment.a(a, ((CX) (cu)).b);
            }
            AddFriendsMenuFragment.a(a);
        }
    }

    (AddFriendsMenuFragment addfriendsmenufragment)
    {
        a = addfriendsmenufragment;
        super();
    }
}

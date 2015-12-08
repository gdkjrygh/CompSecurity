// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import android.animation.Animator;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            AddNearbyFriendsFragment

final class a
    implements android.animation.NearbyFriendsFragment._cls6
{

    private AddNearbyFriendsFragment a;

    public final void onAnimationCancel(Animator animator)
    {
        AddNearbyFriendsFragment.a(a, false);
    }

    public final void onAnimationEnd(Animator animator)
    {
        AddNearbyFriendsFragment.a(a, false);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        if (AddNearbyFriendsFragment.d(a))
        {
            animator.cancel();
            return;
        } else
        {
            AddNearbyFriendsFragment.a(a, true);
            return;
        }
    }

    (AddNearbyFriendsFragment addnearbyfriendsfragment)
    {
        a = addnearbyfriendsfragment;
        super();
    }
}

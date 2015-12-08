// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

// Referenced classes of package com.google.android.gms.games.ui.common.players:
//            PlayerAvatarAdapter

public static interface 
{

    public abstract void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition);

    public abstract void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player);

    public abstract void onPlayerOverflowMenuClicked(Player player);

    public abstract void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition);

    public abstract void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player);
}

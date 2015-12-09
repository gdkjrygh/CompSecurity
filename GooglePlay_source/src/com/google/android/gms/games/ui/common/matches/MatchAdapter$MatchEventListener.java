// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            MatchAdapter

public static interface 
{

    public abstract void onMatchClicked(TurnBasedMatch turnbasedmatch);

    public abstract void onMatchDismissed(TurnBasedMatch turnbasedmatch);

    public abstract void onMatchMuteAppClicked(Game game);

    public abstract void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1);

    public abstract void onMatchRematch(TurnBasedMatch turnbasedmatch);
}

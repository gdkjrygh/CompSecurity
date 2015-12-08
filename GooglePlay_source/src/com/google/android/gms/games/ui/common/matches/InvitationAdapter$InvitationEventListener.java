// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InvitationAdapter

public static interface 
{

    public abstract void onInvitationAccepted(Invitation invitation);

    public abstract void onInvitationDeclined(Invitation invitation);

    public abstract void onInvitationDismissed(Invitation invitation);

    public abstract void onInvitationGameInfoClicked(Game game);

    public abstract void onInvitationMuteAppClicked(Game game);

    public abstract void onInvitationParticipantListClicked(Invitation invitation, String s, String s1);
}

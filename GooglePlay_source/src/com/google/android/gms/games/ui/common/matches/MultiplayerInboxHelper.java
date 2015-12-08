// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;


public abstract class MultiplayerInboxHelper
    implements InvitationAdapter.InvitationEventListener, InvitationClusterAdapter.InvitationClusterEventListener, MatchAdapter.MatchEventListener, com.google.android.gms.games.ui.util.UiUtils.IdentitySharingOnClickListener
{
    public static interface MultiplayerInboxHelperProvider
    {

        public abstract MultiplayerInboxHelper getMultiplayerInboxHelper();
    }


    public MultiplayerInboxHelper()
    {
    }
}

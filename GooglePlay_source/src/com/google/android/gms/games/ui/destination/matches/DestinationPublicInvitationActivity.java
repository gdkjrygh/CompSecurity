// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.matches;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.matches:
//            DestinationMultiplayerInboxHelper

public final class DestinationPublicInvitationActivity extends DestinationFragmentActivity
    implements com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider, com.google.android.gms.games.ui.common.matches.PublicInvitationFragment.InvitationClusterMetadataProvider, com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcherProvider
{

    private String mAccountName;
    private DestinationMultiplayerInboxHelper mInboxHelper;
    private ZInvitationCluster mInvitationCluster;
    private String mPlayerId;

    public DestinationPublicInvitationActivity()
    {
        super(0x7f040072, 0);
    }

    public final String getAccountName()
    {
        return mAccountName;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcher getInvitationAccountSwitcher()
    {
        return mInboxHelper;
    }

    public final ZInvitationCluster getInvitationCluster()
    {
        return mInvitationCluster;
    }

    public final MultiplayerInboxHelper getMultiplayerInboxHelper()
    {
        return mInboxHelper;
    }

    public final String getPlayerId()
    {
        return mPlayerId;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (isFinishing())
        {
            return;
        } else
        {
            mInvitationCluster = (ZInvitationCluster)getIntent().getParcelableExtra("com.google.android.gms.games.INVITATION_CLUSTER");
            mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
            mPlayerId = getIntent().getStringExtra("com.google.android.gms.games.PLAYER_ID");
            mInboxHelper = new DestinationMultiplayerInboxHelper(this);
            setTitle(0x7f10018b);
            setSubtitle(mInvitationCluster.getInviter().getDisplayName());
            return;
        }
    }
}

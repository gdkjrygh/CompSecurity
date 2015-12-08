// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            ClientMultiplayerInboxHelper

public final class ClientPublicInvitationActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper.MultiplayerInboxHelperProvider, com.google.android.gms.games.ui.common.matches.PublicInvitationFragment.InvitationClusterMetadataProvider
{

    private String mAccountName;
    private ClientMultiplayerInboxHelper mInboxHelper;
    private ZInvitationCluster mInvitationCluster;
    private String mPlayerId;

    public ClientPublicInvitationActivity()
    {
        super(0x7f0400c1);
    }

    public final String getAccountName()
    {
        return mAccountName;
    }

    public final ZInvitationCluster getInvitationCluster()
    {
        return mInvitationCluster;
    }

    protected final int getLogEventType()
    {
        return 13;
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
        mShowGameNameAsTitle = false;
        mInboxHelper = new ClientMultiplayerInboxHelper(this);
        mInvitationCluster = (ZInvitationCluster)getIntent().getParcelableExtra("com.google.android.gms.games.INVITATION_CLUSTER");
        mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        mPlayerId = getIntent().getStringExtra("com.google.android.gms.games.PLAYER_ID");
        setTitle(0x7f10018b);
        setSubtitle(mInvitationCluster.getInviter().getDisplayName());
    }
}

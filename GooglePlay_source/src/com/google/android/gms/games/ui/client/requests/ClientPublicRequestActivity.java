// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.requests;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;

// Referenced classes of package com.google.android.gms.games.ui.client.requests:
//            ClientRequestInboxHelper

public final class ClientPublicRequestActivity extends ClientFragmentActivity
    implements com.google.android.gms.games.ui.common.requests.PublicRequestFragment.GameRequestClusterMetadataProvider, com.google.android.gms.games.ui.common.requests.RequestInboxHelper.RequestInboxHelperProvider
{

    private String mAccountName;
    private GameRequestCluster mGameRequestCluster;
    private ClientRequestInboxHelper mInboxHelper;

    public ClientPublicRequestActivity()
    {
        super(0x7f0400c2);
    }

    public final String getAccountName()
    {
        return mAccountName;
    }

    public final GameRequestCluster getGameRequestCluster()
    {
        return mGameRequestCluster;
    }

    protected final int getLogEventType()
    {
        return 14;
    }

    public final RequestInboxHelper getRequestInboxHelper()
    {
        return mInboxHelper;
    }

    public final void onCreate(Bundle bundle)
    {
        int i;
        super.onCreate(bundle);
        mShowGameNameAsTitle = false;
        mInboxHelper = new ClientRequestInboxHelper(this);
        mGameRequestCluster = (GameRequestCluster)getIntent().getParcelableExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER");
        mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        i = mGameRequestCluster.getType();
        i;
        JVM INSTR tableswitch 1 2: default 84
    //                   1 108
    //                   2 131;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(i).toString());
_L2:
        setTitle(0x7f10024a);
_L5:
        setSubtitle(mGameRequestCluster.getSender().getDisplayName());
        return;
_L3:
        setTitle(0x7f10024d);
        if (true) goto _L5; else goto _L4
_L4:
    }
}

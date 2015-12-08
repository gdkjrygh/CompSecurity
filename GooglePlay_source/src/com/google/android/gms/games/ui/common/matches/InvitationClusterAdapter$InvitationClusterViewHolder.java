// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InvitationClusterAdapter

private static final class er extends com.google.android.gms.games.ui.card.iewHolder
{

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        InvitationClusterAdapter invitationclusteradapter = (InvitationClusterAdapter)mAdapter;
        ZInvitationCluster zinvitationcluster = (ZInvitationCluster)getData();
        if (menuitem.getItemId() == 0x7f0d0356)
        {
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(zinvitationcluster);
            InvitationClusterAdapter.access$300(invitationclusteradapter).onInvitationClusterDismissed(zinvitationcluster);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onPrimaryActionClicked()
    {
        InvitationClusterAdapter invitationclusteradapter = (InvitationClusterAdapter)mAdapter;
        ZInvitationCluster zinvitationcluster = (ZInvitationCluster)getData();
        InvitationClusterAdapter.access$300(invitationclusteradapter).onInvitationClusterSeeMoreClicked(zinvitationcluster, InvitationClusterAdapter.access$100(invitationclusteradapter), InvitationClusterAdapter.access$200(invitationclusteradapter));
    }

    public final void onRootViewClicked()
    {
        onPrimaryActionClicked();
    }

    public final void onSecondaryActionClicked()
    {
        InvitationClusterAdapter invitationclusteradapter = (InvitationClusterAdapter)mAdapter;
        ZInvitationCluster zinvitationcluster = (ZInvitationCluster)getData();
        ((ObjectExclusionFilterable)getDataBuffer()).filterOut(zinvitationcluster);
        InvitationClusterAdapter.access$300(invitationclusteradapter).onInvitationClusterDeclined(zinvitationcluster);
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (ZInvitationCluster)obj;
        super.iewHolder(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (InvitationClusterAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, InvitationClusterAdapter.access$000(gamesrecycleradapter), 1054, obj);
        gamesrecycleradapter = ((ZInvitationCluster) (obj)).getInviter();
        setImagePaddingEnabled(true);
        setImage(((ZInvitationCluster) (obj)).getInviter().getHiResImageUri(), 0x7f0200db);
        obj = getTitleViewBuffer();
        gamesrecycleradapter.getDisplayName(((android.database.CharArrayBuffer) (obj)));
        setTitle(((android.database.CharArrayBuffer) (obj)));
        obj = mContext.getString(0x7f1001a5);
        setSubtitle(((String) (obj)));
        setPrimaryAction(0x7f1001ad);
        setPrimaryActionContentDescription(0x7f1001ae);
        setSecondaryAction(0x7f1001a3);
        setSecondaryActionContentDescription(0x7f1001a4);
        setContextMenu(0x7f120007);
        setRootViewContentDescription(mContext.getString(0x7f1001a1, new Object[] {
            gamesrecycleradapter.getDisplayName(), obj
        }));
    }

    public er(View view)
    {
        super(view);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestClusterAdapter

private static final class er extends com.google.android.gms.games.ui.card.ViewHolder
{

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        RequestClusterAdapter requestclusteradapter = (RequestClusterAdapter)mAdapter;
        GameRequestCluster gamerequestcluster = (GameRequestCluster)getData();
        if (menuitem.getItemId() == 0x7f0d035a)
        {
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequestcluster);
            RequestClusterAdapter.access$200(requestclusteradapter).onRequestClusterDismissed(gamerequestcluster);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onPrimaryActionClicked()
    {
        RequestClusterAdapter requestclusteradapter = (RequestClusterAdapter)mAdapter;
        GameRequestCluster gamerequestcluster = (GameRequestCluster)getData();
        RequestClusterAdapter.access$200(requestclusteradapter).onRequestClusterSeeMoreClicked(gamerequestcluster, RequestClusterAdapter.access$100(requestclusteradapter));
    }

    public final void onRootViewClicked()
    {
        onPrimaryActionClicked();
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        String s;
        GameRequestCluster gamerequestcluster = (GameRequestCluster)obj;
        super.s(gamesrecycleradapter, i, gamerequestcluster);
        gamesrecycleradapter = (RequestClusterAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, RequestClusterAdapter.access$000(gamesrecycleradapter), 1052, gamerequestcluster);
        obj = gamerequestcluster.getSender();
        s = ((Player) (obj)).getDisplayName();
        setTitle(s);
        i = gamerequestcluster.getType();
        i;
        JVM INSTR tableswitch 1 2: default 88
    //                   1 112
    //                   2 194;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(i).toString());
_L2:
        gamesrecycleradapter = mContext.getString(0x7f1002bd);
_L5:
        setSubtitle(gamesrecycleradapter);
        setImagePaddingEnabled(true);
        setImageCircleCropEnabled(true);
        setImage(((Player) (obj)).getIconImageUri(), 0x7f0200db);
        setRootViewContentDescription(mContext.getString(0x7f1002bc, new Object[] {
            s, gamesrecycleradapter
        }));
        setPrimaryAction(0x7f100247);
        setPrimaryActionContentDescription(0x7f100254);
        setContextMenu(0x7f12000a);
        return;
_L3:
        gamesrecycleradapter = mContext.getString(0x7f1002be);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public er(View view)
    {
        super(view);
    }
}

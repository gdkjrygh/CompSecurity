// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import java.util.ArrayList;

public final class InvitationClusterAdapter extends OnyxCardAdapter
{
    public static interface InvitationClusterEventListener
    {

        public abstract void onInvitationClusterDeclined(ZInvitationCluster zinvitationcluster);

        public abstract void onInvitationClusterDismissed(ZInvitationCluster zinvitationcluster);

        public abstract void onInvitationClusterSeeMoreClicked(ZInvitationCluster zinvitationcluster, String s, String s1);
    }

    private static final class InvitationClusterViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            InvitationClusterAdapter invitationclusteradapter = (InvitationClusterAdapter)mAdapter;
            ZInvitationCluster zinvitationcluster = (ZInvitationCluster)getData();
            if (menuitem.getItemId() == 0x7f0d0356)
            {
                ((ObjectExclusionFilterable)getDataBuffer()).filterOut(zinvitationcluster);
                invitationclusteradapter.mListener.onInvitationClusterDismissed(zinvitationcluster);
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
            invitationclusteradapter.mListener.onInvitationClusterSeeMoreClicked(zinvitationcluster, invitationclusteradapter.mCurrentAccountName, invitationclusteradapter.mCurrentPlayerId);
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
            invitationclusteradapter.mListener.onInvitationClusterDeclined(zinvitationcluster);
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (ZInvitationCluster)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (InvitationClusterAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1054, obj);
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

        public InvitationClusterViewHolder(View view)
        {
            super(view);
        }
    }


    private String mCurrentAccountName;
    private String mCurrentPlayerId;
    private final InvitationClusterEventListener mListener;

    public InvitationClusterAdapter(GamesFragmentActivity gamesfragmentactivity, InvitationClusterEventListener invitationclustereventlistener)
    {
        this(gamesfragmentactivity, invitationclustereventlistener, 0);
    }

    public InvitationClusterAdapter(GamesFragmentActivity gamesfragmentactivity, InvitationClusterEventListener invitationclustereventlistener, int i)
    {
        super(gamesfragmentactivity);
        mListener = (InvitationClusterEventListener)Preconditions.checkNotNull(invitationclustereventlistener);
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d0037;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new InvitationClusterViewHolder(view);
    }

    public final void setCurrentPlayerInfo(String s, String s1)
    {
        mCurrentPlayerId = s;
        mCurrentAccountName = s1;
    }

    public final void setDataBuffer(DataBuffer databuffer)
    {
        boolean flag;
        if (databuffer == null || (databuffer instanceof ObjectExclusionFilterable))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        super.setDataBuffer(databuffer);
    }

    public final void updateInvitationCluster(ZInvitationCluster zinvitationcluster, boolean flag, ArrayList arraylist)
    {
        ZInvitationCluster zinvitationcluster1 = null;
        int i1 = -1;
        DataBuffer databuffer = super.mDataBuffer;
        int i = 0;
        int j1 = databuffer.getCount();
        int l;
label0:
        do
        {
label1:
            {
                l = i1;
                if (i < j1)
                {
                    zinvitationcluster1 = (ZInvitationCluster)databuffer.get(i);
                    if (!zinvitationcluster1.getInvitationId().equals(zinvitationcluster.getInvitationId()))
                    {
                        break label1;
                    }
                    l = i;
                }
                if (l != -1)
                {
                    return;
                }
                break label0;
            }
            i++;
        } while (true);
        if (flag)
        {
            ((ObjectExclusionFilterable)databuffer).filterOut(zinvitationcluster);
            return;
        }
        zinvitationcluster = zinvitationcluster1.getInvitationList();
        for (int j = zinvitationcluster.size() - 1; j >= 0; j--)
        {
            String s = ((Invitation)zinvitationcluster.get(j)).getInvitationId();
            if (arraylist.contains(s))
            {
                zinvitationcluster.remove(j);
                arraylist.remove(s);
            }
        }

        zinvitationcluster = FreezableUtils.freeze(zinvitationcluster);
        zinvitationcluster1.mInvitationList.clear();
        i1 = zinvitationcluster.size();
        for (int k = 0; k < i1; k++)
        {
            zinvitationcluster1.mInvitationList.add((InvitationEntity)zinvitationcluster.get(k));
        }

        zinvitationcluster1.verifyData();
        onDataRangeChanged(l, 1);
    }




}

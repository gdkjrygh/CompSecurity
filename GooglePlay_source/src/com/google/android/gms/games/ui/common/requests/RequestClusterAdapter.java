// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import java.util.ArrayList;

public final class RequestClusterAdapter extends OnyxCardAdapter
{
    public static interface RequestClusterEventListener
    {

        public abstract void onRequestClusterDismissed(GameRequestCluster gamerequestcluster);

        public abstract void onRequestClusterSeeMoreClicked(GameRequestCluster gamerequestcluster, String s);
    }

    private static final class RequestClusterViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            RequestClusterAdapter requestclusteradapter = (RequestClusterAdapter)mAdapter;
            GameRequestCluster gamerequestcluster = (GameRequestCluster)getData();
            if (menuitem.getItemId() == 0x7f0d035a)
            {
                ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequestcluster);
                requestclusteradapter.mListener.onRequestClusterDismissed(gamerequestcluster);
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
            requestclusteradapter.mListener.onRequestClusterSeeMoreClicked(gamerequestcluster, requestclusteradapter.mCurrentAccountName);
        }

        public final void onRootViewClicked()
        {
            onPrimaryActionClicked();
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            String s;
            GameRequestCluster gamerequestcluster = (GameRequestCluster)obj;
            super.populateViews(gamesrecycleradapter, i, gamerequestcluster);
            gamesrecycleradapter = (RequestClusterAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1052, gamerequestcluster);
            obj = gamerequestcluster.getSender();
            s = ((Player) (obj)).getDisplayName();
            setTitle(s);
            i = gamerequestcluster.getType();
            i;
            JVM INSTR tableswitch 1 2: default 88
        //                       1 112
        //                       2 194;
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

        public RequestClusterViewHolder(View view)
        {
            super(view);
        }
    }


    String mCurrentAccountName;
    private final RequestClusterEventListener mListener;

    public RequestClusterAdapter(GamesFragmentActivity gamesfragmentactivity, RequestClusterEventListener requestclustereventlistener)
    {
        this(gamesfragmentactivity, requestclustereventlistener, 0);
    }

    public RequestClusterAdapter(GamesFragmentActivity gamesfragmentactivity, RequestClusterEventListener requestclustereventlistener, int i)
    {
        super(gamesfragmentactivity);
        mListener = (RequestClusterEventListener)Preconditions.checkNotNull(requestclustereventlistener);
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d0040;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new RequestClusterViewHolder(view);
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

    public final void updateRequestCluster(GameRequestCluster gamerequestcluster, boolean flag, ArrayList arraylist)
    {
        GameRequestCluster gamerequestcluster1 = null;
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
                    gamerequestcluster1 = (GameRequestCluster)databuffer.get(i);
                    if (!gamerequestcluster1.getRequestId().equals(gamerequestcluster.getRequestId()))
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
            ((ObjectExclusionFilterable)databuffer).filterOut(gamerequestcluster);
            return;
        }
        gamerequestcluster = gamerequestcluster1.getRequestList();
        for (int j = gamerequestcluster.size() - 1; j >= 0; j--)
        {
            String s = ((GameRequest)gamerequestcluster.get(j)).getRequestId();
            if (arraylist.contains(s))
            {
                gamerequestcluster.remove(j);
                arraylist.remove(s);
            }
        }

        gamerequestcluster = FreezableUtils.freeze(gamerequestcluster);
        gamerequestcluster1.mRequestList.clear();
        i1 = gamerequestcluster.size();
        for (int k = 0; k < i1; k++)
        {
            gamerequestcluster1.mRequestList.add((GameRequestEntity)gamerequestcluster.get(k));
        }

        gamerequestcluster1.verifyData();
        notifyItemChanged(l);
    }



}

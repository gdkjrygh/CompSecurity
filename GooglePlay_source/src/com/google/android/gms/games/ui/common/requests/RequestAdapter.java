// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import java.util.ArrayList;

public final class RequestAdapter extends OnyxCardAdapter
{
    public static interface RequestEventListener
    {

        public abstract void onRequestDismissed(GameRequest gamerequest);

        public abstract void onRequestMuteAppClicked(Game game);

        public transient abstract void onRequestsClicked(GameRequest agamerequest[]);
    }

    private static final class RequestViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            RequestAdapter requestadapter = (RequestAdapter)mAdapter;
            GameRequest gamerequest = (GameRequest)getData();
            int i = menuitem.getItemId();
            if (i == 0x7f0d0358)
            {
                menuitem = gamerequest.getGame();
                requestadapter.mListener.onRequestMuteAppClicked(menuitem);
                return true;
            }
            if (i == 0x7f0d035a)
            {
                ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequest);
                requestadapter.mListener.onRequestDismissed(gamerequest);
                return true;
            } else
            {
                return false;
            }
        }

        public final void onPrimaryActionClicked()
        {
            ((RequestAdapter)mAdapter).mListener.onRequestsClicked(new GameRequest[] {
                (GameRequest)getData()
            });
        }

        public final void onSecondaryActionClicked()
        {
            RequestAdapter requestadapter = (RequestAdapter)mAdapter;
            GameRequest gamerequest = (GameRequest)getData();
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(gamerequest);
            requestadapter.mListener.onRequestDismissed(gamerequest);
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (GameRequest)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            RequestAdapter requestadapter = (RequestAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, requestadapter, requestadapter.getLogflowUiElementType(), 1052, obj);
            setRootViewFocusable(true);
            i = 0x7f100245;
            if (((GameRequest) (obj)).getType() == 2)
            {
                i = 0x7f100246;
            }
            setTitle(i);
            setImagePaddingEnabled(true);
            gamesrecycleradapter = ((GameRequest) (obj)).getSender();
            if (requestadapter.mIsClientUi)
            {
                setImageCircleCropEnabled(true);
                setImage(gamesrecycleradapter.getHiResImageUri(), 0x7f0200db);
                obj = getSubtitleViewBuffer();
                gamesrecycleradapter.getDisplayName(((android.database.CharArrayBuffer) (obj)));
                setSubtitle(((android.database.CharArrayBuffer) (obj)));
            } else
            {
                obj = ((GameRequest) (obj)).getGame();
                setImage(((Game) (obj)).getHiResImageUri(), 0x7f0200da);
                android.database.CharArrayBuffer chararraybuffer = getSubtitleViewBuffer();
                ((Game) (obj)).getDisplayName(chararraybuffer);
                setSubtitle(chararraybuffer);
                obj = new ArrayList(1);
                ((ArrayList) (obj)).add(gamesrecycleradapter.getIconImageUri());
                setAvatarRowData(((ArrayList) (obj)), 0x7f0200db);
            }
            setPrimaryAction(0x7f100242);
            setPrimaryActionContentDescription(0x7f100243);
            setSecondaryAction(0x7f100248);
            setSecondaryActionContentDescription(0x7f100249);
            setRootViewClickable(false);
            setContextMenu(0x7f12000b);
        }

        public RequestViewHolder(View view)
        {
            super(view);
        }
    }


    private final Context mContext;
    String mCurrentAccountName;
    private final boolean mIsClientUi;
    private final RequestEventListener mListener;

    public RequestAdapter(GamesFragmentActivity gamesfragmentactivity, RequestEventListener requesteventlistener)
    {
        this(gamesfragmentactivity, requesteventlistener, 0);
    }

    public RequestAdapter(GamesFragmentActivity gamesfragmentactivity, RequestEventListener requesteventlistener, int i)
    {
        super(gamesfragmentactivity);
        mContext = gamesfragmentactivity;
        mListener = (RequestEventListener)Preconditions.checkNotNull(requesteventlistener);
        mIsClientUi = gamesfragmentactivity.mConfiguration.isClientUi();
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d003f;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new RequestViewHolder(view);
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



}

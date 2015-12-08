// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;

public final class GameSmallCardAdapter extends OnyxCardAdapter
{
    public static interface GameSmallCardEventListener
    {

        public abstract void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view);

        public abstract void onPlayNowClicked(Game game, View view);

        public abstract void onShareGameClicked(String s, String s1, View view);

        public abstract void onViewInPlayStoreClicked(GameFirstParty gamefirstparty, View view);
    }

    private static final class GameSmallViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            GameFirstParty gamefirstparty;
            gamefirstparty = (GameFirstParty)getData();
            if (gamefirstparty == null)
            {
                return true;
            }
            menuitem.getItemId();
            JVM INSTR tableswitch 2131559259 2131559261: default 48
        //                       2131559259 100
        //                       2131559260 72
        //                       2131559261 50;
               goto _L1 _L2 _L3 _L4
_L1:
            return false;
_L4:
            ((GameSmallCardAdapter)mAdapter).mListener.onViewInPlayStoreClicked(gamefirstparty, itemView);
_L6:
            return true;
_L3:
            ((GameSmallCardAdapter)mAdapter).mListener.onPlayNowClicked(gamefirstparty.getGame(), itemView);
            continue; /* Loop/switch isn't completed */
_L2:
            menuitem = gamefirstparty.getGame();
            ((GameSmallCardAdapter)mAdapter).mListener.onShareGameClicked(menuitem.getDisplayName(), menuitem.getInstancePackageName(), itemView);
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void onRootViewClicked()
        {
            ((GameSmallCardAdapter)mAdapter).mListener.onGameClicked((GameFirstParty)getData(), getSharedElementTransition(), itemView);
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (GameFirstParty)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (GameSmallCardAdapter)mAdapter;
            android.database.CharArrayBuffer chararraybuffer;
            boolean flag;
            if (((GameSmallCardAdapter) (gamesrecycleradapter)).mType != 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setHasLabel(flag);
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1060, obj);
            setHeroTransitionNames(((GameFirstParty) (obj)).getGame().getApplicationId());
            setImage(((GameFirstParty) (obj)).getGame().getHiResImageUri(), 0x7f0200da);
            setImageAspectRatio(1.0F);
            chararraybuffer = getTitleViewBuffer();
            ((GameFirstParty) (obj)).getGame().getDisplayName(chararraybuffer);
            setTitle(chararraybuffer);
            chararraybuffer = getSubtitleViewBuffer();
            ((GameFirstParty) (obj)).getGame().getDeveloperName(chararraybuffer);
            setSubtitle(chararraybuffer);
            if (((GameSmallCardAdapter) (gamesrecycleradapter)).mType == 2)
            {
                gamesrecycleradapter = ((GameFirstParty) (obj)).getFormattedPrice();
                GameSmallCardAdapter gamesmallcardadapter;
                if (((GameFirstParty) (obj)).getGame().isInstanceInstalled())
                {
                    setPrimaryLabel(0x7f1001f5);
                } else
                if (((GameFirstParty) (obj)).isOwned())
                {
                    setPrimaryLabel(0x7f1001f6);
                } else
                if (gamesrecycleradapter != null)
                {
                    setPrimaryLabel(gamesrecycleradapter.toUpperCase(mContext.getResources().getConfiguration().locale));
                } else
                {
                    setPrimaryLabel("");
                }
                setContextMenu(0x7f120011);
            } else
            {
label0:
                {
                    if (((GameSmallCardAdapter) (gamesrecycleradapter)).mType == 3)
                    {
                        break label0;
                    }
                    if (((GameSmallCardAdapter) (gamesrecycleradapter)).mType == 1)
                    {
                        if (((GameFirstParty) (obj)).getGame().isInstanceInstalled())
                        {
                            break label0;
                        }
                        setPrimaryLabel(0x7f1000e2);
                        setContextMenu(0x7f120010);
                    }
                }
            }
_L4:
            gamesmallcardadapter = (GameSmallCardAdapter)mAdapter;
            gamesrecycleradapter = new StringBuilder();
            gamesrecycleradapter.append(mContext.getResources().getString(0x7f1001ef, new Object[] {
                ((GameFirstParty) (obj)).getGame().getDisplayName(), ((GameFirstParty) (obj)).getGame().getDeveloperName()
            }));
            gamesrecycleradapter.append("\n");
            gamesmallcardadapter.mType;
            JVM INSTR tableswitch 1 2: default 280
        //                       1 404
        //                       2 435;
               goto _L1 _L2 _L3
_L1:
            break; /* Loop/switch isn't completed */
_L3:
            break MISSING_BLOCK_LABEL_435;
_L5:
            setRootViewContentDescription(gamesrecycleradapter.toString());
            return;
            setContextMenu(0x7f12000f);
              goto _L4
_L2:
            if (!((GameFirstParty) (obj)).getGame().isInstanceInstalled())
            {
                gamesrecycleradapter.append(mContext.getString(0x7f1000e2));
            }
              goto _L5
            String s = ((GameFirstParty) (obj)).getFormattedPrice();
            if (((GameFirstParty) (obj)).getGame().isInstanceInstalled())
            {
                gamesrecycleradapter.append(mContext.getResources().getString(0x7f1001f5));
            } else
            if (((GameFirstParty) (obj)).isOwned())
            {
                gamesrecycleradapter.append(mContext.getResources().getString(0x7f1001f6));
            } else
            if (s != null)
            {
                gamesrecycleradapter.append(s);
            }
              goto _L5
        }

        public GameSmallViewHolder(View view)
        {
            super(view);
        }
    }


    protected final GameSmallCardEventListener mListener;
    protected final int mType;

    public GameSmallCardAdapter(GamesFragmentActivity gamesfragmentactivity, int i, int j, GameSmallCardEventListener gamesmallcardeventlistener)
    {
        this(gamesfragmentactivity, i, j, gamesmallcardeventlistener, (byte)0);
    }

    private GameSmallCardAdapter(GamesFragmentActivity gamesfragmentactivity, int i, int j, GameSmallCardEventListener gamesmallcardeventlistener, byte byte0)
    {
        super(gamesfragmentactivity);
        mListener = (GameSmallCardEventListener)Preconditions.checkNotNull(gamesmallcardeventlistener);
        mType = i;
        setMaxRows(j);
    }

    protected final int getCardType()
    {
        return 2;
    }

    protected final int getDataType()
    {
        return 0x7f0d003c;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new GameSmallViewHolder(view);
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class ContinuePlayingAdapter extends OnyxCardAdapter
{
    public static interface ContinuePlayerCompareEventListener
    {

        public abstract void onContinuePlayingCompareAchievementClicked(GameFirstParty gamefirstparty);
    }

    public static interface ContinuePlayingEventListener
    {

        public abstract void onContinuePlayingClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view);

        public abstract void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view);

        public abstract void onContinuePlayingShareIconClicked(String s, String s1, View view);
    }

    private static final class ContinuePlayingViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final void onImageOverlayIconClicked()
        {
            ((ContinuePlayingAdapter)mAdapter).mListener.onContinuePlayingPlayButtonClicked((GameFirstParty)getData(), itemView);
        }

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            GameFirstParty gamefirstparty = (GameFirstParty)getData();
            menuitem.getItemId();
            JVM INSTR tableswitch 2131559259 2131559260: default 36
        //                       2131559259 60
        //                       2131559260 38;
               goto _L1 _L2 _L3
_L1:
            return false;
_L3:
            ((ContinuePlayingAdapter)mAdapter).mListener.onContinuePlayingPlayButtonClicked(gamefirstparty, itemView);
_L5:
            return true;
_L2:
            menuitem = gamefirstparty.getGame();
            ((ContinuePlayingAdapter)mAdapter).mListener.onContinuePlayingShareIconClicked(menuitem.getDisplayName(), menuitem.getInstancePackageName(), itemView);
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void onPrimaryActionClicked()
        {
            ((ContinuePlayingAdapter)mAdapter).mCompareListener.onContinuePlayingCompareAchievementClicked((GameFirstParty)getData());
        }

        public final void onRootViewClicked()
        {
            if (getData() == null)
            {
                return;
            } else
            {
                ((ContinuePlayingAdapter)mAdapter).mListener.onContinuePlayingClicked((GameFirstParty)getData(), getSharedElementTransition(), itemView);
                return;
            }
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            Game game;
            GameFirstParty gamefirstparty = (GameFirstParty)obj;
            super.populateViews(gamesrecycleradapter, i, gamefirstparty);
            setHasLabel(true);
            ContinuePlayingAdapter continueplayingadapter = (ContinuePlayingAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, continueplayingadapter, continueplayingadapter.getLogflowUiElementType(), 1008, gamefirstparty);
            Resources resources = mContext.getResources();
            setHeroTransitionNames(gamefirstparty.getGame().getApplicationId());
            game = gamefirstparty.getGame();
            SnapshotMetadata snapshotmetadata = gamefirstparty.getSnapshot();
            int j = ((ContinuePlayingAdapter)gamesrecycleradapter).mCardType;
            int k;
            int l;
            int i1;
            if (j == 2 || j == 1)
            {
                setImage(game.getIconImageUri(), 0x7f0200da);
                setImageAspectRatio(1.0F);
            } else
            {
                if (snapshotmetadata != null)
                {
                    obj = snapshotmetadata.getCoverImageUri();
                    gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
                    if (obj == null)
                    {
                        gamesrecycleradapter = game.getFeaturedImageUri();
                    }
                    setImage(gamesrecycleradapter, 0x7f0201e0);
                } else
                {
                    gamesrecycleradapter = game.getFeaturedImageUri();
                    if (!PlatformVersion.checkVersion(11))
                    {
                        gamesrecycleradapter = null;
                    }
                    setImage(gamesrecycleradapter, 0x7f0201e0);
                }
                setImageAspectRatio(2.048F);
            }
            k = game.getAchievementTotalCount();
            l = gamefirstparty.getAchievementUnlockedCount();
            gamesrecycleradapter = gamefirstparty.getBadges();
            i1 = gamesrecycleradapter.size();
            i = 0;
_L7:
            if (i >= i1)
            {
                break MISSING_BLOCK_LABEL_581;
            }
            if (((GameBadge)gamesrecycleradapter.get(i)).getType() != 3) goto _L2; else goto _L1
_L1:
            i = 1;
_L8:
            if (l > 0 || k > 0 && i != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                setImageOverlayProgressBar(0x7f0200c3, resources.getColor(0x7f0b0257), l, k);
                setPrimaryLabel(mContext.getString(0x7f1000b9, new Object[] {
                    Integer.valueOf(l), Integer.valueOf(k)
                }));
                setPrimaryLabelColorResId(0x7f0b0257);
                setPrimaryLabelImage(0x7f0200ed);
                setPrimaryLabelContentDescription(resources.getString(0x7f1000b8, new Object[] {
                    Integer.valueOf(l), Integer.valueOf(k)
                }));
            }
            if (j != 5 && game.isInstanceInstalled())
            {
                setContextMenu(0x7f12000f);
            } else
            {
                setContextMenu(0x7f120010);
            }
            if (game.isInstanceInstalled())
            {
                j = resources.getColor(0x7f0b00cb);
                setImageOverlayIconBackground(UiUtils.constructButtonBackground(resources.getDrawable(0x7f02011e), j, 1));
                setImageOverlayIconClickable(true);
                setImageOverlayIconContentDescription(0x7f100213);
            }
            setIconImage(game.getIconImageUri(), 0x7f0200da);
            gamesrecycleradapter = getTitleViewBuffer();
            game.getDisplayName(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            if (snapshotmetadata != null)
            {
                setSubtitle(snapshotmetadata.getDescription());
            } else
            {
                gamesrecycleradapter = getSubtitleViewBuffer();
                game.getDeveloperName(gamesrecycleradapter);
                setSubtitle(gamesrecycleradapter);
            }
            if (continueplayingadapter.mCompareListener == null) goto _L4; else goto _L3
_L3:
            if (i == 0) goto _L6; else goto _L5
_L5:
            setPrimaryAction(0x7f10008c);
            setPrimaryActionContentDescription(0x7f10008c);
_L4:
            return;
_L2:
            i++;
              goto _L7
_L6:
            setPrimaryAction(0x7f10008d);
            setPrimaryActionContentDescription(0x7f10008d);
            setPrimaryActionClickable(false);
            return;
            i = 0;
              goto _L8
        }

        public ContinuePlayingViewHolder(View view)
        {
            super(view);
        }
    }


    final int mCardType;
    private final ContinuePlayerCompareEventListener mCompareListener;
    private final ContinuePlayingEventListener mListener;

    public ContinuePlayingAdapter(Context context, ContinuePlayingEventListener continueplayingeventlistener)
    {
        this(context, continueplayingeventlistener, null, 0, 5);
    }

    public ContinuePlayingAdapter(Context context, ContinuePlayingEventListener continueplayingeventlistener, ContinuePlayerCompareEventListener continueplayercompareeventlistener)
    {
        this(context, continueplayingeventlistener, continueplayercompareeventlistener, 0, 5);
    }

    public ContinuePlayingAdapter(Context context, ContinuePlayingEventListener continueplayingeventlistener, ContinuePlayerCompareEventListener continueplayercompareeventlistener, byte byte0)
    {
        this(context, continueplayingeventlistener, continueplayercompareeventlistener, 0x7f0e001a, 5);
    }

    public ContinuePlayingAdapter(Context context, ContinuePlayingEventListener continueplayingeventlistener, ContinuePlayerCompareEventListener continueplayercompareeventlistener, int i, int j)
    {
        super(context);
        Asserts.checkNotNull(continueplayingeventlistener);
        mListener = continueplayingeventlistener;
        mCompareListener = continueplayercompareeventlistener;
        mCardType = j;
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return mCardType;
    }

    protected final int getDataType()
    {
        return 0x7f0d0031;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new ContinuePlayingViewHolder(view);
    }



}

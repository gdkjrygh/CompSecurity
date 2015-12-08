// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.logging.LogflowViewLeafUiElementNode;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.GamesMenuItemClickListener;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.HashSet;

public final class PlayerAvatarAdapter extends DatabufferRecyclerAdapter
    implements com.google.android.gms.games.ui.AddToCirclesHelper.CirclesModifiedListener, com.google.android.gms.games.ui.AddToCirclesHelper.OneTouchCirclesListener
{
    public static interface PlayerAvatarEventListener
    {

        public abstract void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition);

        public abstract void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player);

        public abstract void onPlayerOverflowMenuClicked(Player player);

        public abstract void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition);

        public abstract void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player);
    }

    private static final class PlayerAvatarViewHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
        implements android.view.View.OnClickListener, com.google.android.gms.games.ui.util.GamesMenuItemClickListener.OnMenuItemClickListener
    {

        private final MetagameAvatarView mAvatarView;
        private final TextView mButtonView;
        private final LoadingImageView mIconImage;
        private Uri mIconUri;
        private final ImageView mOverflowMenu;
        private final View mOverlay;
        private final ProgressBar mProgressBarView;
        private final View mSubtitleOverlay;
        private final TextView mSubtitleView;
        private final TextView mTitleView;

        private static void attachUiNodeToView(View view, int i)
        {
            view.setTag(0x7f0d0061, new LogflowViewLeafUiElementNode(i));
        }

        public final void onClick(View view)
        {
            Object obj;
            int i;
            int j;
            obj = view.getTag();
            if (obj instanceof Integer)
            {
                i = ((Integer)obj).intValue();
            } else
            {
                i = -1;
            }
            obj = (PlayerAvatarAdapter)mAdapter;
            ((PlayerAvatarViewHolder) (obj)).mIconImage.logClick(view);
            j = view.getId();
            if (j != 0x7f0d0069) goto _L2; else goto _L1
_L1:
            if (((PlayerAvatarAdapter) (obj)).mListener != null)
            {
                view = SharedElementTransition.createAvatarTransition();
                mAvatarView.addSharedViews(view);
                ((PlayerAvatarAdapter) (obj)).mListener.onPlayerAvatarClicked((Player)getData(), view);
            }
_L4:
            return;
_L2:
            if (j != 0x7f0d0231)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((PlayerAvatarAdapter) (obj)).mListener != null)
            {
                view = SharedElementTransition.createHeroIconTransition();
                view.addSharedLoadingImageView(mIconImage, "icon", mIconUri, 0x7f0200da);
                ((PlayerAvatarAdapter) (obj)).mListener.onPlayerSubtitleClicked((Player)getData(), view);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (j == 0x7f0d0072 && i >= 0)
            {
                view = (Player)getData();
                if (((PlayerAvatarAdapter) (obj)).mAddedPlayerIdMap.containsKey(view.getPlayerId()))
                {
                    ((PlayerAvatarAdapter) (obj)).mListener.onPlayerUnfollowClicked(((PlayerAvatarAdapter) (obj)), view);
                    return;
                } else
                {
                    ((PlayerAvatarAdapter) (obj)).mListener.onPlayerFollowClicked(((PlayerAvatarAdapter) (obj)), view);
                    return;
                }
            }
            if (j == 0x7f0d01f4)
            {
                PopupMenu popupmenu = new PopupMenu(view.getContext(), view);
                popupmenu.inflate(((PlayerAvatarAdapter) (obj)).mMenuItemResId);
                popupmenu.mMenuItemClickListener = new GamesMenuItemClickListener(this, view);
                view = mOverflowMenu;
                Asserts.checkState(view instanceof ImageView);
                view = (ImageView)view;
                view.setImageResource(0x7f020119);
                popupmenu.mDismissListener = new com.google.android.gms.games.ui.util.UiUtils._cls2(view);
                popupmenu.mPopup.show();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final boolean onMenuItemClick(MenuItem menuitem, View view)
        {
            menuitem = (PlayerAvatarAdapter)mAdapter;
            if (((PlayerAvatarAdapter) (menuitem)).mListener != null)
            {
                ((PlayerAvatarAdapter) (menuitem)).mListener.onPlayerOverflowMenuClicked((Player)getData());
            }
            return true;
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (Player)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            Object obj1 = (PlayerAvatarAdapter)mAdapter;
            mAvatarView.setData(((Player) (obj)));
            LogflowUiUtils.attachDocumentId(mAvatarView, obj);
            ((PlayerAvatarViewHolder) (obj1)).mIconImage.logImpression(mAvatarView, ((GamesRecyclerAdapter) (obj1)).mIsFlinging);
            boolean flag;
            boolean flag1;
            if (((Player) (obj)).getPlayerId().equals(((PlayerAvatarAdapter) (obj1)).mCurrentPlayerId))
            {
                gamesrecycleradapter = mContext.getResources().getString(0x7f10021c);
            } else
            {
                gamesrecycleradapter = ((Player) (obj)).getDisplayName();
            }
            mTitleView.setText(gamesrecycleradapter);
            mAvatarView.setContentDescription(gamesrecycleradapter);
            if (((PlayerAvatarAdapter) (obj1)).mHasOverflow)
            {
                mOverflowMenu.setVisibility(0);
                mOverflowMenu.setOnClickListener(this);
                mOverflowMenu.setTag(obj);
                int j = mOverflowMenu.getDrawable().getIntrinsicWidth();
                mTitleView.setPadding(j, mTitleView.getPaddingTop(), j, mTitleView.getPaddingBottom());
            }
            gamesrecycleradapter = ((Player) (obj)).getPlayerId();
            if (PlatformVersion.checkVersion(21))
            {
                mAvatarView.getImageView().setTransitionName((new StringBuilder("avatar")).append(gamesrecycleradapter).toString());
                mAvatarView.getLevelView().setTransitionName((new StringBuilder("level")).append(gamesrecycleradapter).toString());
            }
            gamesrecycleradapter = (PlayerAvatarAdapter)mAdapter;
            if (((PlayerAvatarAdapter) (gamesrecycleradapter)).mMode != 0)
            {
                obj1 = ((Player) (obj)).getMostRecentGameInfo();
                if (obj1 != null)
                {
                    mIconUri = ((MostRecentGameInfo) (obj1)).getGameIconImageUri();
                    loadImage(mIconImage, mIconUri, 0x7f0200da);
                    mIconImage.setVisibility(0);
                    mIconImage.setContentDescription(mContext.getString(0x7f100215, new Object[] {
                        ((MostRecentGameInfo) (obj1)).getGameName()
                    }));
                    mSubtitleView.setText(((MostRecentGameInfo) (obj1)).getGameName());
                    mSubtitleView.setVisibility(0);
                    mSubtitleOverlay.setVisibility(0);
                    mSubtitleOverlay.setContentDescription(((MostRecentGameInfo) (obj1)).getGameName());
                } else
                {
                    mIconImage.setVisibility(8);
                    mSubtitleView.setVisibility(4);
                    mSubtitleOverlay.setVisibility(8);
                }
            } else
            {
                mIconImage.setVisibility(8);
                mSubtitleView.setVisibility(8);
                mSubtitleOverlay.setVisibility(8);
            }
            obj1 = ((Player) (obj)).getPlayerId();
            if (((Player) (obj)).isInCircles() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = ((PlayerAvatarAdapter) (gamesrecycleradapter)).mAddedPlayerIdMap.containsKey(obj1);
            obj = mContext.getResources();
            if (((PlayerAvatarAdapter) (gamesrecycleradapter)).mCircleOpInProgressSet.contains(obj1))
            {
                mButtonView.setVisibility(4);
                mButtonView.setClickable(false);
                mOverlay.setVisibility(4);
                mOverlay.setClickable(false);
                mProgressBarView.setVisibility(0);
                return;
            }
            if (flag1)
            {
                mButtonView.setVisibility(0);
                mButtonView.setText((CharSequence)((PlayerAvatarAdapter) (gamesrecycleradapter)).mAddedPlayerIdMap.get(obj1));
                mButtonView.setContentDescription((CharSequence)((PlayerAvatarAdapter) (gamesrecycleradapter)).mAddedPlayerIdMap.get(obj1));
                mButtonView.setTextColor(-1);
                mButtonView.setBackgroundResource(0x7f02016d);
                if (!((Boolean)G.oneTouchAddToCircles.get()).booleanValue())
                {
                    mOverlay.setVisibility(8);
                    mOverlay.setOnClickListener(null);
                }
                mProgressBarView.setVisibility(8);
                return;
            }
            if (flag)
            {
                mButtonView.setVisibility(8);
                return;
            } else
            {
                mButtonView.setVisibility(0);
                mButtonView.setClickable(false);
                mButtonView.setFocusable(false);
                mButtonView.setText(0x7f10011d);
                mButtonView.setTextColor(((Resources) (obj)).getColor(0x7f0b0257));
                mButtonView.setBackgroundResource(0x7f02016c);
                mOverlay.setTag(Integer.valueOf(i));
                mOverlay.setVisibility(0);
                mOverlay.setOnClickListener(this);
                mOverlay.setContentDescription(((Resources) (obj)).getString(0x7f10011e));
                mProgressBarView.setVisibility(8);
                return;
            }
        }

        public PlayerAvatarViewHolder(View view)
        {
            super(view);
            mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d0069);
            mAvatarView.setOutlineStrokeWidthResId(0x7f0c0182);
            mAvatarView.setShadowStrokeWidthResId(0x7f0c0181);
            mAvatarView.setAvatarElevationResId(0x7f0c0180);
            mTitleView = (TextView)view.findViewById(0x7f0d0075);
            mSubtitleView = (TextView)view.findViewById(0x7f0d0074);
            mSubtitleOverlay = view.findViewById(0x7f0d0231);
            mSubtitleOverlay.setOnClickListener(this);
            mIconImage = (LoadingImageView)view.findViewById(0x7f0d006b);
            mButtonView = (TextView)view.findViewById(0x7f0d011b);
            mButtonView.setOnClickListener(this);
            attachUiNodeToView(mButtonView, 251);
            mProgressBarView = (ProgressBar)view.findViewById(0x7f0d00e4);
            mAvatarView.setOnClickListener(this);
            attachUiNodeToView(mAvatarView, 250);
            mOverlay = view.findViewById(0x7f0d0072);
            mOverflowMenu = (ImageView)view.findViewById(0x7f0d01f4);
        }
    }


    private ArrayMap mAddedPlayerIdMap;
    private HashSet mCircleOpInProgressSet;
    String mCurrentPlayerId;
    private boolean mHasOverflow;
    private final PlayerAvatarEventListener mListener;
    private final int mMenuItemResId;
    private final int mMode;

    public PlayerAvatarAdapter(Context context, PlayerAvatarEventListener playeravatareventlistener, int i)
    {
        this(context, playeravatareventlistener, false, 0, 1, i);
    }

    public PlayerAvatarAdapter(Context context, PlayerAvatarEventListener playeravatareventlistener, boolean flag, int i, int j, int k)
    {
        super(context);
        mCircleOpInProgressSet = new HashSet();
        mAddedPlayerIdMap = new ArrayMap();
        mListener = (PlayerAvatarEventListener)Preconditions.checkNotNull(playeravatareventlistener, "PlayerAvatarEventListener cannot be null");
        mHasOverflow = flag;
        mMenuItemResId = i;
        mMode = j;
        setMaxRows(k);
    }

    private void updateEntryForPlayer(String s)
    {
        DataBuffer databuffer = super.mDataBuffer;
        if (databuffer != null)
        {
            for (int i = 0; i < databuffer.getCount(); i++)
            {
                if (((Player)databuffer.get(i)).getPlayerId().equals(s))
                {
                    onDataRangeChanged(i, 1);
                }
            }

        }
    }

    protected final int getCardItemViewType$134621()
    {
        return 0x7f0d003d;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e0021);
    }

    public final int getTopPaddingResId()
    {
        return 0x7f0c0185;
    }

    protected final volatile com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        return new PlayerAvatarViewHolder(mInflater.inflate(0x7f0400b7, viewgroup, false));
    }

    public final void onOneTouchCircleAddFailed(String s)
    {
        mCircleOpInProgressSet.remove(s);
        updateEntryForPlayer(s);
    }

    public final void onOneTouchCircleAddSucceeded(String s, String s1)
    {
        mCircleOpInProgressSet.remove(s);
        mAddedPlayerIdMap.put(s, mContext.getResources().getString(0x7f1000a8));
        updateEntryForPlayer(s);
    }

    public final void onOneTouchCircleLoadFailed(String s)
    {
        mCircleOpInProgressSet.remove(s);
        updateEntryForPlayer(s);
    }

    public final void onOneTouchCircleRemoveFailed(String s)
    {
        mCircleOpInProgressSet.remove(s);
        updateEntryForPlayer(s);
    }

    public final void onOneTouchCircleRemoveSucceeded$16da05f7(String s)
    {
        mCircleOpInProgressSet.remove(s);
        mAddedPlayerIdMap.remove(s);
        updateEntryForPlayer(s);
    }

    public final void onPlayerAddedToCircleByCirclePicker(String s, String s1)
    {
        mCircleOpInProgressSet.remove(s);
        mAddedPlayerIdMap.put(s, s1);
        updateEntryForPlayer(s);
    }

    public final void onPlayerCircleModificationInProgress(String s)
    {
        mCircleOpInProgressSet.add(s);
        updateEntryForPlayer(s);
    }

    public final void onPlayerCirclePickerModificationFailed(String s)
    {
        mCircleOpInProgressSet.remove(s);
        updateEntryForPlayer(s);
    }

    public final void onPlayerRemovedFromCircleByCirclePicker(String s, String s1)
    {
        mCircleOpInProgressSet.remove(s);
        mAddedPlayerIdMap.remove(s);
        updateEntryForPlayer(s);
    }









}

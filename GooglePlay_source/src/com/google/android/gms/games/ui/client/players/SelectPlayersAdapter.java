// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.data.PositionFilteredDataBuffer;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesBaseAdapter;
import com.google.android.gms.games.ui.GamesViewHolder;
import com.google.android.gms.games.ui.MultiColumnMergedDataBufferAdapter;
import com.google.android.gms.games.ui.util.SelectionSet;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersFragment

public final class SelectPlayersAdapter extends MultiColumnMergedDataBufferAdapter
{
    public final class SelectPlayerViewHolder extends GamesViewHolder
    {

        final int mAutopickEntryPosition;
        final int mNearbyEntryPosition;
        final ImageView mNearbyImage;
        final TextView mNumAutopick;
        final ImageView mOverflowMenu;
        final View mOverlay;
        final LoadingImageView mPlayerImage;
        final TextView mPlayerName;
        final CharArrayBuffer mPlayerNameBuffer = new CharArrayBuffer(64);
        final Resources mRes;
        final ImageView mSelectedImage;
        final SelectPlayersAdapter this$0;

        public SelectPlayerViewHolder(GamesBaseAdapter gamesbaseadapter, View view)
        {
            this$0 = SelectPlayersAdapter.this;
            super(gamesbaseadapter);
            mPlayerImage = (LoadingImageView)view.findViewById(0x7f0d01d4);
            mPlayerName = (TextView)view.findViewById(0x7f0d01d5);
            mNearbyImage = (ImageView)view.findViewById(0x7f0d02bf);
            mSelectedImage = (ImageView)view.findViewById(0x7f0d02c0);
            mOverflowMenu = (ImageView)view.findViewById(0x7f0d01f4);
            mOverflowMenu.setOnClickListener(mOnClickListener);
            mNumAutopick = (TextView)view.findViewById(0x7f0d02c1);
            mOverlay = view.findViewById(0x7f0d0072);
            mOverlay.setOnClickListener(mOnClickListener);
            mRes = view.getResources();
            int i = 0;
            if (mAllowAutoPick)
            {
                i = 0 + 1;
                mAutopickEntryPosition = 0;
            } else
            {
                mAutopickEntryPosition = -1;
            }
            if (mAllowNearbyPlayers)
            {
                mNearbyEntryPosition = i;
                return;
            } else
            {
                mNearbyEntryPosition = -1;
                return;
            }
        }
    }


    boolean mAllowAutoPick;
    boolean mAllowNearbyPlayers;
    private PositionFilteredDataBuffer mAutoPickDataBuffer;
    boolean mAutoPickItemAddEnabled;
    boolean mAutoPickItemRemoveEnabled;
    private String mCurrentPlayerId;
    private boolean mEnableUnselectedPlayers;
    String mFocusLockedViewPlayerId;
    private final SelectPlayersFragment mFragment;
    private final LayoutInflater mInflater;
    final HashMap mIsInCircles = new HashMap();
    private PositionFilteredDataBuffer mNearbyDataBuffer;
    boolean mNearbyPlayersEnabled;
    private final android.view.View.OnClickListener mOnClickListener;
    private final int mPlayerNameColorDisabled;
    private final int mPlayerNameColorEnabled;
    private final int mPlayerSource;

    public SelectPlayersAdapter(Context context, SelectPlayersFragment selectplayersfragment, android.view.View.OnClickListener onclicklistener, int i)
    {
        super(context);
        mEnableUnselectedPlayers = true;
        mFocusLockedViewPlayerId = null;
        mFragment = selectplayersfragment;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mOnClickListener = onclicklistener;
        context = context.getResources();
        mPlayerNameColorEnabled = context.getColor(0x7f0b00c5);
        mPlayerNameColorDisabled = context.getColor(0x7f0b00c6);
        mPlayerSource = i;
    }

    public final volatile void bindTileView$4098fe8c(View view, int i, Object obj)
    {
        obj = (Player)obj;
        Asserts.checkNotNull(view);
        view = (SelectPlayerViewHolder)view.getTag();
        if (i == ((SelectPlayerViewHolder) (view)).mAutopickEntryPosition && obj == null)
        {
            if (((SelectPlayerViewHolder) (view))._fld0.mAutoPickItemAddEnabled || ((SelectPlayerViewHolder) (view))._fld0.mAutoPickItemRemoveEnabled)
            {
                view.loadImage(((SelectPlayerViewHolder) (view)).mPlayerImage, null, 0x7f0200d7);
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTextColor(((SelectPlayerViewHolder) (view))._fld0.mPlayerNameColorEnabled);
            } else
            {
                view.loadImage(((SelectPlayerViewHolder) (view)).mPlayerImage, null, 0x7f0200d6);
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTextColor(((SelectPlayerViewHolder) (view))._fld0.mPlayerNameColorDisabled);
            }
            ((SelectPlayerViewHolder) (view)).mPlayerImage.setVisibility(0);
            ((SelectPlayerViewHolder) (view)).mNearbyImage.setVisibility(4);
            ((SelectPlayerViewHolder) (view)).mSelectedImage.setVisibility(4);
            if (((SelectPlayerViewHolder) (view))._fld0.mFragment.mNumAutoMatchPlayers > 0)
            {
                ((SelectPlayerViewHolder) (view)).mNumAutopick.setVisibility(0);
                ((SelectPlayerViewHolder) (view)).mNumAutopick.setText(String.valueOf(((SelectPlayerViewHolder) (view))._fld0.mFragment.mNumAutoMatchPlayers));
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTypeface(((SelectPlayerViewHolder) (view)).mPlayerName.getTypeface(), 1);
                obj = ((SelectPlayerViewHolder) (view)).mOverflowMenu;
                if (((SelectPlayerViewHolder) (view))._fld0.mFragment.getNumPlayerSlotsLeft() == 0)
                {
                    i = 0;
                } else
                {
                    i = 4;
                }
                ((ImageView) (obj)).setVisibility(i);
                ((SelectPlayerViewHolder) (view)).mOverflowMenu.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f10020f));
                ((SelectPlayerViewHolder) (view)).mPlayerImage.setTintColorId(0x7f0b009c);
            } else
            {
                ((SelectPlayerViewHolder) (view)).mOverflowMenu.setVisibility(4);
                ((SelectPlayerViewHolder) (view)).mNumAutopick.setVisibility(4);
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTypeface(((SelectPlayerViewHolder) (view)).mPlayerName.getTypeface(), 0);
                ((SelectPlayerViewHolder) (view)).mPlayerImage.setTintColorId(0);
            }
            if (((SelectPlayerViewHolder) (view))._fld0.mAutoPickItemAddEnabled)
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setText(0x7f100260);
                ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(true);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag("auto_pick_item_add_tag");
                ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f100260));
            } else
            if (((SelectPlayerViewHolder) (view))._fld0.mAutoPickItemRemoveEnabled)
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setText(0x7f100266);
                ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(true);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag("auto_pick_item_remove_tag");
                ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f100266));
            } else
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setText(0x7f100264);
                ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(false);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag(null);
                ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f100264));
            }
        } else
        if (i == ((SelectPlayerViewHolder) (view)).mNearbyEntryPosition && obj == null)
        {
            ((SelectPlayerViewHolder) (view)).mPlayerName.setTypeface(((SelectPlayerViewHolder) (view)).mPlayerName.getTypeface(), 0);
            ((SelectPlayerViewHolder) (view)).mPlayerImage.setVisibility(4);
            ((SelectPlayerViewHolder) (view)).mNearbyImage.setVisibility(0);
            ((SelectPlayerViewHolder) (view)).mNumAutopick.setVisibility(8);
            ((SelectPlayerViewHolder) (view)).mSelectedImage.setVisibility(4);
            if (((SelectPlayerViewHolder) (view))._fld0.mNearbyPlayersEnabled)
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setText(0x7f1001fe);
                ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f1001fe));
                obj = (AnimationDrawable)((SelectPlayerViewHolder) (view)).mNearbyImage.getResources().getDrawable(0x7f0200d4);
                if (PlatformVersion.checkVersion(16))
                {
                    ((SelectPlayerViewHolder) (view)).mNearbyImage.setBackground(((android.graphics.drawable.Drawable) (obj)));
                } else
                {
                    ((SelectPlayerViewHolder) (view)).mNearbyImage.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                }
                ((AnimationDrawable) (obj)).start();
            } else
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setText(0x7f1001fd);
                ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((SelectPlayerViewHolder) (view)).mRes.getString(0x7f1001fd));
                ((SelectPlayerViewHolder) (view)).mNearbyImage.setBackgroundResource(0x7f0200d1);
            }
            ((SelectPlayerViewHolder) (view)).mOverflowMenu.setVisibility(4);
            ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(true);
            ((SelectPlayerViewHolder) (view)).mOverlay.setTag("nearby_players_tag");
        } else
        if (obj != null)
        {
            ((SelectPlayerViewHolder) (view)).mPlayerImage.setVisibility(0);
            ((SelectPlayerViewHolder) (view)).mNearbyImage.setVisibility(4);
            ((SelectPlayerViewHolder) (view)).mNumAutopick.setVisibility(8);
            boolean flag = ((SelectPlayerViewHolder) (view))._fld0.mFragment.mSelectedPlayerIds.isSelected(((Player) (obj)).getPlayerId());
            TextView textview;
            android.graphics.Typeface typeface;
            int j;
            if (!flag && !((SelectPlayerViewHolder) (view))._fld0.mEnableUnselectedPlayers || ((Player) (obj)).getPlayerId().equals(((SelectPlayerViewHolder) (view))._fld0.mCurrentPlayerId))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                ((SelectPlayerViewHolder) (view)).mPlayerImage.setTintColorId(0x7f0b00c8);
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTextColor(((SelectPlayerViewHolder) (view))._fld0.mPlayerNameColorDisabled);
                ((SelectPlayerViewHolder) (view)).mSelectedImage.setVisibility(4);
            } else
            {
                ((SelectPlayerViewHolder) (view)).mPlayerName.setTextColor(((SelectPlayerViewHolder) (view))._fld0.mPlayerNameColorEnabled);
                if (flag)
                {
                    ((SelectPlayerViewHolder) (view)).mPlayerImage.setTintColorId(0x7f0b009c);
                    ((SelectPlayerViewHolder) (view)).mSelectedImage.setVisibility(0);
                } else
                {
                    ((SelectPlayerViewHolder) (view)).mPlayerImage.setTintColorId(0);
                    ((SelectPlayerViewHolder) (view)).mSelectedImage.setVisibility(4);
                }
            }
            view.loadImage(((SelectPlayerViewHolder) (view)).mPlayerImage, ((Player) (obj)).getHiResImageUri(), 0x7f0200db);
            ((Player) (obj)).getDisplayName(((SelectPlayerViewHolder) (view)).mPlayerNameBuffer);
            ((SelectPlayerViewHolder) (view)).mPlayerName.setText(((SelectPlayerViewHolder) (view)).mPlayerNameBuffer.data, 0, ((SelectPlayerViewHolder) (view)).mPlayerNameBuffer.sizeCopied);
            ((SelectPlayerViewHolder) (view)).mOverflowMenu.setVisibility(8);
            textview = ((SelectPlayerViewHolder) (view)).mPlayerName;
            typeface = ((SelectPlayerViewHolder) (view)).mPlayerName.getTypeface();
            if (flag)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            textview.setTypeface(typeface, j);
            ((SelectPlayerViewHolder) (view)).mOverlay.setContentDescription(((Player) (obj)).getDisplayName());
            if (i != 0)
            {
                ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(false);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag(null);
            } else
            {
                ((SelectPlayerViewHolder) (view)).mOverlay.setEnabled(true);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag(obj);
                ((SelectPlayerViewHolder) (view)).mOverlay.setTag(0x7f0d0060, Integer.valueOf(((SelectPlayerViewHolder) (view))._fld0.mPlayerSource));
            }
        } else
        {
            GamesLog.e("SelectPlayersAdapter", (new StringBuilder("Unhandled tile entryPosition ")).append(i).toString());
        }
_L5:
        view = ((SelectPlayerViewHolder) (view)).mOverlay;
        if (mFocusLockedViewPlayerId != null && view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!((obj = UiUtils.getValidTag(view)) instanceof Player) || !mFocusLockedViewPlayerId.equals(obj = ((Player)obj).getPlayerId())) goto _L1; else goto _L3
_L3:
        view.requestFocus();
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final View newTileView$70777715()
    {
        View view = mInflater.inflate(0x7f0400e9, null);
        view.setTag(new SelectPlayerViewHolder(this, view));
        return view;
    }

    public final void setCurrentPlayerId(String s)
    {
        mCurrentPlayerId = (String)Preconditions.checkNotNull(s);
    }

    public final void setDataBuffer(DataBuffer databuffer)
    {
        if (databuffer == null || !mAllowAutoPick && !mAllowNearbyPlayers)
        {
            super.setDataBuffers(new DataBuffer[] {
                databuffer
            });
        } else
        {
            if (mAllowAutoPick)
            {
                mAutoPickDataBuffer = new PositionFilteredDataBuffer(new ObjectDataBuffer(new Player[1]));
            }
            if (mAllowNearbyPlayers)
            {
                mNearbyDataBuffer = new PositionFilteredDataBuffer(new ObjectDataBuffer(new Player[1]));
            }
            if (mAllowAutoPick && !mAllowNearbyPlayers)
            {
                super.setDataBuffers(new DataBuffer[] {
                    mAutoPickDataBuffer, databuffer
                });
            } else
            if (mAllowNearbyPlayers && !mAllowAutoPick)
            {
                super.setDataBuffers(new DataBuffer[] {
                    mNearbyDataBuffer, databuffer
                });
            } else
            {
                super.setDataBuffers(new DataBuffer[] {
                    mAutoPickDataBuffer, mNearbyDataBuffer, databuffer
                });
            }
        }
        mIsInCircles.clear();
        if (databuffer != null)
        {
            int i = 0;
            for (int j = databuffer.getCount(); i < j; i++)
            {
                Player player = (Player)databuffer.get(i);
                mIsInCircles.put(player.getPlayerId(), Integer.valueOf(player.isInCircles()));
            }

        }
        notifyDataSetChanged();
    }

    public final transient void setDataBuffers(DataBuffer adatabuffer[])
    {
        throw new UnsupportedOperationException("Use setDataBuffer instead");
    }

    public final void setNearbyItemState(boolean flag)
    {
        if (mAllowNearbyPlayers)
        {
            mNearbyPlayersEnabled = flag;
            notifyDataSetChanged();
        }
    }

    public final void setShowAutoPick(boolean flag)
    {
        if (mAutoPickDataBuffer != null)
        {
            if (!flag)
            {
                PositionFilteredDataBuffer positionfiltereddatabuffer = mAutoPickDataBuffer;
                if (positionfiltereddatabuffer.mDataBuffer.getCount() >= 0)
                {
                    positionfiltereddatabuffer.mExcludedPositionSet.add(Integer.valueOf(0));
                    positionfiltereddatabuffer.filterEntities();
                }
            } else
            {
                PositionFilteredDataBuffer positionfiltereddatabuffer1 = mAutoPickDataBuffer;
                positionfiltereddatabuffer1.mExcludedPositionSet.remove(Integer.valueOf(0));
                positionfiltereddatabuffer1.filterEntities();
            }
            notifyDataSetChanged();
        }
    }

    public final void setUnselectedPlayersEnabled(boolean flag)
    {
        mEnableUnselectedPlayers = flag;
        notifyDataSetChanged();
    }



}

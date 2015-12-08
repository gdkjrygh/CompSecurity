// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ExclusionFilteredDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class MatchAdapter extends OnyxCardAdapter
{
    public static interface MatchEventListener
    {

        public abstract void onMatchClicked(TurnBasedMatch turnbasedmatch);

        public abstract void onMatchDismissed(TurnBasedMatch turnbasedmatch);

        public abstract void onMatchMuteAppClicked(Game game);

        public abstract void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1);

        public abstract void onMatchRematch(TurnBasedMatch turnbasedmatch);
    }

    private static final class MatchViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        private void viewPlayerList()
        {
            MatchAdapter matchadapter = (MatchAdapter)mAdapter;
            matchadapter.mListener.onMatchParticipantListClicked((TurnBasedMatch)getData(), matchadapter.mCurrentAccountName, matchadapter.mCurrentPlayerId);
        }

        public final void onAvatarOthersViewClicked()
        {
            viewPlayerList();
        }

        public final void onAvatarViewClicked(int i)
        {
            viewPlayerList();
        }

        public final void onImageViewClicked()
        {
            MatchAdapter matchadapter = (MatchAdapter)mAdapter;
            matchadapter.mListener.onMatchParticipantListClicked((TurnBasedMatch)getData(), matchadapter.mCurrentAccountName, matchadapter.mCurrentPlayerId);
        }

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            MatchAdapter matchadapter = (MatchAdapter)mAdapter;
            TurnBasedMatch turnbasedmatch = (TurnBasedMatch)getData();
            int i = menuitem.getItemId();
            if (i == 0x7f0d0359)
            {
                ((ExclusionFilteredDataBuffer)getDataBuffer()).filterOut(turnbasedmatch.getMatchId());
                matchadapter.mListener.onMatchDismissed(turnbasedmatch);
                return true;
            }
            if (i == 0x7f0d0357)
            {
                matchadapter.mListener.onMatchParticipantListClicked(turnbasedmatch, matchadapter.mCurrentAccountName, matchadapter.mCurrentPlayerId);
                return true;
            }
            if (i == 0x7f0d0358)
            {
                matchadapter.mListener.onMatchMuteAppClicked(turnbasedmatch.getGame());
                return true;
            } else
            {
                return false;
            }
        }

        public final void onPrimaryActionClicked()
        {
            ((MatchAdapter)mAdapter).mListener.onMatchRematch((TurnBasedMatch)getData());
        }

        public final void onRootViewClicked()
        {
            MatchAdapter matchadapter = (MatchAdapter)mAdapter;
            TurnBasedMatch turnbasedmatch = (TurnBasedMatch)getData();
            if (turnbasedmatch.isLocallyModified())
            {
                Toast.makeText(mContext, 0x7f1001dc, 1).show();
                return;
            } else
            {
                matchadapter.mListener.onMatchClicked(turnbasedmatch);
                return;
            }
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            TurnBasedMatch turnbasedmatch;
            Game game;
            ArrayList arraylist;
            int l;
            turnbasedmatch = (TurnBasedMatch)obj;
            super.populateViews(gamesrecycleradapter, i, turnbasedmatch);
            Object obj1 = (MatchAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, ((GamesRecyclerAdapter) (obj1)), ((MatchAdapter) (obj1)).getLogflowUiElementType(), 1053, turnbasedmatch);
            game = turnbasedmatch.getGame();
            obj = UiUtils.getDisplayOrderedParticipants(turnbasedmatch.getParticipants());
            String s = turnbasedmatch.getParticipantId(((MatchAdapter) (obj1)).mCurrentPlayerId);
            gamesrecycleradapter = turnbasedmatch.getDescriptionParticipant();
            Object obj2;
            int j;
            int i1;
            boolean flag1;
            if (((MatchAdapter) (obj1)).mIsClientUi && gamesrecycleradapter != null)
            {
                gamesrecycleradapter = gamesrecycleradapter.getHiResImageUri();
                i = 0x7f0200db;
            } else
            {
                gamesrecycleradapter = game.getHiResImageUri();
                i = 0x7f0200da;
            }
            setImagePaddingEnabled(true);
            setImage(gamesrecycleradapter, i);
            if (!((MatchAdapter) (obj1)).mIsClientUi)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            setImageClickable(flag1);
            setImageContentDescription(game.getDisplayName());
            gamesrecycleradapter = mContext.getString(0x7f10031f);
            obj1 = turnbasedmatch.getDescriptionParticipantId();
            l = turnbasedmatch.getAvailableAutoMatchSlots();
            obj2 = (MatchAdapter)mAdapter;
            arraylist = new ArrayList();
            if (obj1 == null || ((MatchAdapter) (obj2)).mIsClientUi) goto _L2; else goto _L1
_L1:
            j = ((ArrayList) (obj)).size();
            i = 0;
_L7:
            if (i >= j) goto _L2; else goto _L3
_L3:
            obj2 = (Participant)((ArrayList) (obj)).get(i);
            if (!((Participant) (obj2)).getParticipantId().equals(obj1)) goto _L5; else goto _L4
_L4:
            arraylist.add(((Participant) (obj2)).getHiResImageUri());
_L2:
            i1 = ((ArrayList) (obj)).size();
            i = 0;
            while (i < i1) 
            {
                obj2 = (Participant)((ArrayList) (obj)).get(i);
                flag1 = ((Participant) (obj2)).getParticipantId().equals(s);
                boolean flag;
                if (obj1 != null && ((Participant) (obj2)).getParticipantId().equals(obj1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag1 && !flag)
                {
                    arraylist.add(((Participant) (obj2)).getHiResImageUri());
                }
                i++;
            }
            break; /* Loop/switch isn't completed */
_L5:
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            for (i = 0; i < l; i++)
            {
                arraylist.add(null);
            }

            setAvatarRowData(arraylist, 0x7f0200db);
            setAvatarRowClickable(true);
            setAvatarRowDescription(gamesrecycleradapter);
            int k;
            if (turnbasedmatch.isLocallyModified())
            {
                obj = mContext.getString(0x7f10031e);
            } else
            {
                obj = turnbasedmatch.getDescription();
            }
            i = turnbasedmatch.getTurnStatus();
            k = turnbasedmatch.getStatus();
            if (i == 3 && k == 2 && turnbasedmatch.canRematch())
            {
                setPrimaryAction(0x7f1002a2);
                setPrimaryActionContentDescription(0x7f1002a3);
            }
            i;
            JVM INSTR tableswitch 1 3: default 516
        //                       1 537
        //                       2 654
        //                       3 672;
               goto _L8 _L9 _L10 _L11
_L8:
            throw new IllegalStateException("Match is in an undefined state.");
_L9:
            gamesrecycleradapter = UiUtils.getMatchElapsedTimeString(mContext, turnbasedmatch.getLastUpdatedTimestamp());
_L13:
            setPrimaryLabel(gamesrecycleradapter);
            setPrimaryLabelColorResId(0x7f0b024d);
            setTitle(((String) (obj)));
            android.database.CharArrayBuffer chararraybuffer = getSubtitleViewBuffer();
            game.getDisplayName(chararraybuffer);
            setSubtitle(chararraybuffer);
            setRootViewContentDescription(mContext.getResources().getString(0x7f1002a1, new Object[] {
                game.getDisplayName(), obj, gamesrecycleradapter
            }));
            if (turnbasedmatch.isLocallyModified())
            {
                setRootViewAlpha(0.5F);
            }
            setContextMenu(0x7f120009);
            return;
_L10:
            gamesrecycleradapter = UiUtils.getMatchElapsedTimeString(mContext, turnbasedmatch.getLastUpdatedTimestamp());
            continue; /* Loop/switch isn't completed */
_L11:
            gamesrecycleradapter = UiUtils.getActualDateTimeString(mContext, turnbasedmatch.getLastUpdatedTimestamp());
            if (true) goto _L13; else goto _L12
_L12:
        }

        public MatchViewHolder(View view)
        {
            super(view);
        }
    }


    private String mCurrentAccountName;
    private String mCurrentPlayerId;
    private final boolean mIsClientUi;
    private final MatchEventListener mListener;

    public MatchAdapter(GamesFragmentActivity gamesfragmentactivity, MatchEventListener matcheventlistener)
    {
        this(gamesfragmentactivity, matcheventlistener, 0);
    }

    public MatchAdapter(GamesFragmentActivity gamesfragmentactivity, MatchEventListener matcheventlistener, int i)
    {
        super(gamesfragmentactivity);
        mListener = matcheventlistener;
        mIsClientUi = gamesfragmentactivity.mConfiguration.isClientUi();
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d003b;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new MatchViewHolder(view);
    }

    public final void setCurrentPlayerInfo(String s, String s1)
    {
        mCurrentPlayerId = s;
        mCurrentAccountName = s1;
    }

    public final void setDataBuffer(DataBuffer databuffer)
    {
        if (databuffer == null)
        {
            super.setDataBuffer(null);
            return;
        } else
        {
            Asserts.checkState(databuffer instanceof AbstractDataBuffer, "dataBuffer should be AbstractDataBuffer.");
            super.setDataBuffer(new ExclusionFilteredDataBuffer((AbstractDataBuffer)databuffer, "external_match_id"));
            return;
        }
    }





}

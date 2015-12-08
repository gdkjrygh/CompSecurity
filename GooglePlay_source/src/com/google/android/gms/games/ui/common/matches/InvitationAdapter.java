// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

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
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class InvitationAdapter extends OnyxCardAdapter
{
    public static interface InvitationEventListener
    {

        public abstract void onInvitationAccepted(Invitation invitation);

        public abstract void onInvitationDeclined(Invitation invitation);

        public abstract void onInvitationDismissed(Invitation invitation);

        public abstract void onInvitationGameInfoClicked(Game game);

        public abstract void onInvitationMuteAppClicked(Game game);

        public abstract void onInvitationParticipantListClicked(Invitation invitation, String s, String s1);
    }

    private static final class InvitationViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        private void viewPlayerList()
        {
            InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
            invitationadapter.mListener.onInvitationParticipantListClicked((Invitation)getData(), invitationadapter.mCurrentAccountName, invitationadapter.mCurrentPlayerId);
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
            InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
            invitationadapter.mListener.onInvitationParticipantListClicked((Invitation)getData(), invitationadapter.mCurrentAccountName, invitationadapter.mCurrentPlayerId);
        }

        public final boolean onMenuItemClick(MenuItem menuitem)
        {
            InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
            Invitation invitation = (Invitation)getData();
            int i = menuitem.getItemId();
            if (i == 0x7f0d0358)
            {
                menuitem = invitation.getGame();
                invitationadapter.mListener.onInvitationMuteAppClicked(menuitem);
                return true;
            }
            if (i == 0x7f0d0356)
            {
                ((ObjectExclusionFilterable)getDataBuffer()).filterOut(invitation);
                invitationadapter.mListener.onInvitationDismissed(invitation);
                return true;
            }
            if (i == 0x7f0d0357)
            {
                invitationadapter.mListener.onInvitationParticipantListClicked(invitation, invitationadapter.mCurrentAccountName, invitationadapter.mCurrentPlayerId);
                return true;
            } else
            {
                return false;
            }
        }

        public final void onPrimaryActionClicked()
        {
            InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
            Invitation invitation = (Invitation)getData();
            Game game = invitation.getGame();
            if (game.isInstanceInstalled())
            {
                invitationadapter.mListener.onInvitationAccepted(invitation);
                return;
            } else
            {
                invitationadapter.mListener.onInvitationGameInfoClicked(game);
                return;
            }
        }

        public final void onSecondaryActionClicked()
        {
            InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
            Invitation invitation = (Invitation)getData();
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(invitation);
            invitationadapter.mListener.onInvitationDeclined(invitation);
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            Game game;
            Participant participant;
            InvitationAdapter invitationadapter;
            ArrayList arraylist;
            String s;
            Object obj1;
            int j;
            obj1 = (Invitation)obj;
            super.populateViews(gamesrecycleradapter, i, obj1);
            invitationadapter = (InvitationAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, invitationadapter, invitationadapter.getLogflowUiElementType(), 1054, obj1);
            game = ((Invitation) (obj1)).getGame();
            arraylist = UiUtils.getDisplayOrderedParticipants(((Invitation) (obj1)).getParticipants());
            participant = ((Invitation) (obj1)).getInviter();
            s = participant.getParticipantId();
            gamesrecycleradapter = invitationadapter.mCurrentPlayerId;
            j = arraylist.size();
            i = 0;
_L5:
            Object obj2;
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_269;
            }
            obj = (Participant)arraylist.get(i);
            obj2 = ((Participant) (obj)).getPlayer();
            if (obj2 == null || !((Player) (obj2)).getPlayerId().equals(gamesrecycleradapter)) goto _L2; else goto _L1
_L1:
            gamesrecycleradapter = ((Participant) (obj)).getParticipantId();
_L3:
            int j1;
            obj2 = new ArrayList();
            int k1;
            if (invitationadapter.mIsClientUi)
            {
                obj = participant.getHiResImageUri();
                i = 0x7f0200db;
            } else
            {
                obj = ((Invitation) (obj1)).getGame().getHiResImageUri();
                ((ArrayList) (obj2)).add(participant.getIconImageUri());
                i = 0x7f0200da;
            }
            k1 = arraylist.size();
            j1 = ((Invitation) (obj1)).getAvailableAutoMatchSlots();
            for (int k = 0; k < k1; k++)
            {
                obj1 = (Participant)arraylist.get(k);
                String s1 = ((Participant) (obj1)).getParticipantId();
                if (!s1.equals(gamesrecycleradapter) && !s1.equals(s))
                {
                    ((ArrayList) (obj2)).add(((Participant) (obj1)).getIconImageUri());
                }
            }

            break MISSING_BLOCK_LABEL_306;
_L2:
            i++;
            continue; /* Loop/switch isn't completed */
            gamesrecycleradapter = null;
              goto _L3
            for (int l = 0; l < j1; l++)
            {
                ((ArrayList) (obj2)).add(null);
            }

            setImagePaddingEnabled(true);
            setImage(((android.net.Uri) (obj)), i);
            int i1;
            boolean flag;
            if (!invitationadapter.mIsClientUi)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setImageClickable(flag);
            gamesrecycleradapter = mContext.getString(0x7f10031f);
            setImageContentDescription(gamesrecycleradapter);
            setAvatarRowClickable(true);
            setAvatarRowData(((ArrayList) (obj2)), 0x7f0200db);
            setAvatarRowDescription(gamesrecycleradapter);
            gamesrecycleradapter = getTitleViewBuffer();
            participant.getDisplayName(gamesrecycleradapter);
            setTitle(gamesrecycleradapter);
            if (invitationadapter.mIsClientUi)
            {
                gamesrecycleradapter = mContext.getString(0x7f1001a7);
            } else
            {
                gamesrecycleradapter = mContext.getString(0x7f1001a6, new Object[] {
                    game.getDisplayName()
                });
            }
            setSubtitle(gamesrecycleradapter);
            if (game.isInstanceInstalled())
            {
                i1 = 0x7f10019f;
                i = 0x7f1001a0;
            } else
            {
                i1 = 0x7f1001a8;
                i = 0x7f1001a9;
            }
            setPrimaryAction(i1);
            setPrimaryActionContentDescription(i);
            setSecondaryAction(0x7f1001a3);
            setSecondaryActionContentDescription(0x7f1001a4);
            setContextMenu(0x7f120008);
            setRootViewContentDescription(mContext.getString(0x7f1001a2, new Object[] {
                participant.getDisplayName(), gamesrecycleradapter
            }));
            return;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public InvitationViewHolder(View view)
        {
            super(view);
        }
    }


    private String mCurrentAccountName;
    private String mCurrentPlayerId;
    private final boolean mIsClientUi;
    private final InvitationEventListener mListener;

    public InvitationAdapter(GamesFragmentActivity gamesfragmentactivity, InvitationEventListener invitationeventlistener)
    {
        this(gamesfragmentactivity, invitationeventlistener, 0);
    }

    public InvitationAdapter(GamesFragmentActivity gamesfragmentactivity, InvitationEventListener invitationeventlistener, int i)
    {
        super(gamesfragmentactivity);
        mListener = (InvitationEventListener)Preconditions.checkNotNull(invitationeventlistener);
        mIsClientUi = gamesfragmentactivity.mConfiguration.isClientUi();
        setMaxRows(i);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d0036;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new InvitationViewHolder(view);
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





}

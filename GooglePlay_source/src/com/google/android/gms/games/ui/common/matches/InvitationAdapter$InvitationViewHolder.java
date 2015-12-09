// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.data.ObjectExclusionFilterable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InvitationAdapter

private static final class er extends com.google.android.gms.games.ui.card.iewHolder
{

    private void viewPlayerList()
    {
        InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
        InvitationAdapter.access$400(invitationadapter).onInvitationParticipantListClicked((Invitation)getData(), InvitationAdapter.access$300(invitationadapter), InvitationAdapter.access$100(invitationadapter));
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
        InvitationAdapter.access$400(invitationadapter).onInvitationParticipantListClicked((Invitation)getData(), InvitationAdapter.access$300(invitationadapter), InvitationAdapter.access$100(invitationadapter));
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
        Invitation invitation = (Invitation)getData();
        int i = menuitem.getItemId();
        if (i == 0x7f0d0358)
        {
            menuitem = invitation.getGame();
            InvitationAdapter.access$400(invitationadapter).onInvitationMuteAppClicked(menuitem);
            return true;
        }
        if (i == 0x7f0d0356)
        {
            ((ObjectExclusionFilterable)getDataBuffer()).filterOut(invitation);
            InvitationAdapter.access$400(invitationadapter).onInvitationDismissed(invitation);
            return true;
        }
        if (i == 0x7f0d0357)
        {
            InvitationAdapter.access$400(invitationadapter).onInvitationParticipantListClicked(invitation, InvitationAdapter.access$300(invitationadapter), InvitationAdapter.access$100(invitationadapter));
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
            InvitationAdapter.access$400(invitationadapter).onInvitationAccepted(invitation);
            return;
        } else
        {
            InvitationAdapter.access$400(invitationadapter).onInvitationGameInfoClicked(game);
            return;
        }
    }

    public final void onSecondaryActionClicked()
    {
        InvitationAdapter invitationadapter = (InvitationAdapter)mAdapter;
        Invitation invitation = (Invitation)getData();
        ((ObjectExclusionFilterable)getDataBuffer()).filterOut(invitation);
        InvitationAdapter.access$400(invitationadapter).onInvitationDeclined(invitation);
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
        super.lateViews(gamesrecycleradapter, i, obj1);
        invitationadapter = (InvitationAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, invitationadapter, InvitationAdapter.access$000(invitationadapter), 1054, obj1);
        game = ((Invitation) (obj1)).getGame();
        arraylist = UiUtils.getDisplayOrderedParticipants(((Invitation) (obj1)).getParticipants());
        participant = ((Invitation) (obj1)).getInviter();
        s = participant.getParticipantId();
        gamesrecycleradapter = InvitationAdapter.access$100(invitationadapter);
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
        if (InvitationAdapter.access$200(invitationadapter))
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
        if (!InvitationAdapter.access$200(invitationadapter))
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
        if (InvitationAdapter.access$200(invitationadapter))
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

    public er(View view)
    {
        super(view);
    }
}

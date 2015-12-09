// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.common.data.ExclusionFilteredDataBuffer;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            MatchAdapter

private static final class t> extends com.google.android.gms.games.ui.card.older
{

    private void viewPlayerList()
    {
        MatchAdapter matchadapter = (MatchAdapter)mAdapter;
        MatchAdapter.access$400(matchadapter).onMatchParticipantListClicked((TurnBasedMatch)getData(), MatchAdapter.access$300(matchadapter), MatchAdapter.access$100(matchadapter));
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
        MatchAdapter.access$400(matchadapter).onMatchParticipantListClicked((TurnBasedMatch)getData(), MatchAdapter.access$300(matchadapter), MatchAdapter.access$100(matchadapter));
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        MatchAdapter matchadapter = (MatchAdapter)mAdapter;
        TurnBasedMatch turnbasedmatch = (TurnBasedMatch)getData();
        int i = menuitem.getItemId();
        if (i == 0x7f0d0359)
        {
            ((ExclusionFilteredDataBuffer)getDataBuffer()).filterOut(turnbasedmatch.getMatchId());
            MatchAdapter.access$400(matchadapter).onMatchDismissed(turnbasedmatch);
            return true;
        }
        if (i == 0x7f0d0357)
        {
            MatchAdapter.access$400(matchadapter).onMatchParticipantListClicked(turnbasedmatch, MatchAdapter.access$300(matchadapter), MatchAdapter.access$100(matchadapter));
            return true;
        }
        if (i == 0x7f0d0358)
        {
            MatchAdapter.access$400(matchadapter).onMatchMuteAppClicked(turnbasedmatch.getGame());
            return true;
        } else
        {
            return false;
        }
    }

    public final void onPrimaryActionClicked()
    {
        MatchAdapter.access$400((MatchAdapter)mAdapter).onMatchRematch((TurnBasedMatch)getData());
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
            MatchAdapter.access$400(matchadapter).onMatchClicked(turnbasedmatch);
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
        LogflowUiUtils.setupLogflowAndImpressView(itemView, ((GamesRecyclerAdapter) (obj1)), MatchAdapter.access$000(((MatchAdapter) (obj1))), 1053, turnbasedmatch);
        game = turnbasedmatch.getGame();
        obj = UiUtils.getDisplayOrderedParticipants(turnbasedmatch.getParticipants());
        String s = turnbasedmatch.getParticipantId(MatchAdapter.access$100(((MatchAdapter) (obj1))));
        gamesrecycleradapter = turnbasedmatch.getDescriptionParticipant();
        Object obj2;
        int j;
        int i1;
        boolean flag1;
        if (MatchAdapter.access$200(((MatchAdapter) (obj1))) && gamesrecycleradapter != null)
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
        if (!MatchAdapter.access$200(((MatchAdapter) (obj1))))
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
        if (obj1 == null || MatchAdapter.access$200(((MatchAdapter) (obj2)))) goto _L2; else goto _L1
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
    //                   1 537
    //                   2 654
    //                   3 672;
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

    public er(View view)
    {
        super(view);
    }
}

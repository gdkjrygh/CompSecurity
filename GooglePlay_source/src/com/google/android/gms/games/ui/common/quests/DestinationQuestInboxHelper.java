// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestInboxHelper

public final class DestinationQuestInboxHelper extends QuestInboxHelper
    implements com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcher
{

    private final GamesFragmentActivity mActivity;

    public DestinationQuestInboxHelper(GamesFragmentActivity gamesfragmentactivity)
    {
        Asserts.checkNotNull(gamesfragmentactivity);
        mActivity = gamesfragmentactivity;
    }

    private void launchGameForQuest(Quest quest)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestQuestHelper", "launchGameForQuest: not connected; ignoring...");
            return;
        } else
        {
            obj = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
            UiUtils.launchGameForQuest(mActivity, ((String) (obj)), quest.getGame(), quest);
            return;
        }
    }

    public final void onPlayQuestClicked(Quest quest)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestQuestHelper", "onPlayQuestClicked: not connected; ignoring...");
            return;
        }
        String s = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
        quest = (Quest)quest.freeze();
        obj = Games.getSelectedAccountForGameRestricted(((GoogleApiClient) (obj)), quest.getGame().getInstancePackageName());
        if (obj == null)
        {
            switchAccountForQuest(quest);
            return;
        }
        if (!((String) (obj)).equals(s))
        {
            QuestChangeAccountDialogFragment questchangeaccountdialogfragment = new QuestChangeAccountDialogFragment();
            questchangeaccountdialogfragment.setArguments(QuestChangeAccountDialogFragment.createArgs(((String) (obj)), s, quest));
            DialogFragmentUtil.show(mActivity, questchangeaccountdialogfragment, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
            return;
        } else
        {
            launchGameForQuest(quest);
            return;
        }
    }

    public final void switchAccountForQuest(Quest quest)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestQuestHelper", "switchAccountForQuest: not connected; ignoring...");
            return;
        } else
        {
            String s = Games.getCurrentAccountName(googleapiclient);
            quest = (Quest)quest.freeze();
            Games.updateSelectedAccountForGameRestricted(googleapiclient, quest.getGame().getInstancePackageName(), s);
            launchGameForQuest(quest);
            return;
        }
    }
}

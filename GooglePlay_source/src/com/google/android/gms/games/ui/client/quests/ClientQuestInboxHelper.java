// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.quests;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

public final class ClientQuestInboxHelper extends QuestInboxHelper
{

    final ClientFragmentActivity mActivity;

    public ClientQuestInboxHelper(ClientFragmentActivity clientfragmentactivity)
    {
        Asserts.checkNotNull(clientfragmentactivity);
        mActivity = clientfragmentactivity;
    }

    final void finishWithQuest(Quest quest)
    {
        Intent intent = new Intent();
        intent.putExtra("quest", (Parcelable)quest.freeze());
        mActivity.setResult(-1, intent);
        mActivity.finish();
    }

    public final void onPlayQuestClicked(Quest quest)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientQuestHelper", "onPlayQuestClicked: not connected; ignoring...");
        } else
        {
            int i = quest.getState();
            switch (i)
            {
            case 3: // '\003'
            default:
                GamesLog.w("ClientQuestHelper", (new StringBuilder("onPlayQuestClicked: unexpected quest state: ")).append(i).toString());
                return;

            case 2: // '\002'
                com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f10022e);
                DialogFragmentUtil.show(mActivity, gamesdialogfragment, "com.google.android.gms.games.ui.dialog.progressDialogAcceptingQuest");
                Games.Quests.accept(googleapiclient, quest.getQuestId()).setResultCallback(new ResultCallback() {

                    final ClientQuestInboxHelper this$0;

                    public final volatile void onResult(Result result)
                    {
                        Object obj = (com.google.android.gms.games.quest.Quests.AcceptQuestResult)result;
                        result = ClientQuestInboxHelper.this;
                        int j = ((com.google.android.gms.games.quest.Quests.AcceptQuestResult) (obj)).getStatus().mStatusCode;
                        obj = ((com.google.android.gms.games.quest.Quests.AcceptQuestResult) (obj)).getQuest();
                        DialogFragmentUtil.dismiss(((ClientQuestInboxHelper) (result)).mActivity, "com.google.android.gms.games.ui.dialog.progressDialogAcceptingQuest");
                        if (UiUtils.isNetworkError(j))
                        {
                            obj = PrebuiltDialogs.newNetworkErrorDialog(0x7f10023a);
                            DialogFragmentUtil.show(((ClientQuestInboxHelper) (result)).mActivity, ((android.support.v4.app.DialogFragment) (obj)), "com.google.android.gms.games.ui.dialog.alertDialogNetworkError");
                            return;
                        }
                        if (obj == null)
                        {
                            GamesLog.e("ClientQuestHelper", (new StringBuilder("Quest not received after accepting: ")).append(j).toString());
                            return;
                        } else
                        {
                            result.finishWithQuest(((Quest) (obj)));
                            return;
                        }
                    }

            
            {
                this$0 = ClientQuestInboxHelper.this;
                super();
            }
                });
                return;

            case 4: // '\004'
                break;
            }
            if (3 == quest.getCurrentMilestone().getState())
            {
                finishWithQuest(quest);
                return;
            }
        }
    }
}

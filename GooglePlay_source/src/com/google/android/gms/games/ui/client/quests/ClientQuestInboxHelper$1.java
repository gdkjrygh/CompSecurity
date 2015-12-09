// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.quests;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.quests:
//            ClientQuestInboxHelper

final class this._cls0
    implements ResultCallback
{

    final ClientQuestInboxHelper this$0;

    public final volatile void onResult(Result result)
    {
        Object obj = (com.google.android.gms.games.quest.oxHelper._cls1)result;
        result = ClientQuestInboxHelper.this;
        int i = ((com.google.android.gms.games.quest.oxHelper) (obj)).getStatus().mStatusCode;
        obj = ((com.google.android.gms.games.quest.getStatus) (obj)).getQuest();
        DialogFragmentUtil.dismiss(((ClientQuestInboxHelper) (result)).mActivity, "com.google.android.gms.games.ui.dialog.progressDialogAcceptingQuest");
        if (UiUtils.isNetworkError(i))
        {
            obj = PrebuiltDialogs.newNetworkErrorDialog(0x7f10023a);
            DialogFragmentUtil.show(((ClientQuestInboxHelper) (result)).mActivity, ((android.support.v4.app.DialogFragment) (obj)), "com.google.android.gms.games.ui.dialog.alertDialogNetworkError");
            return;
        }
        if (obj == null)
        {
            GamesLog.e("ClientQuestHelper", (new StringBuilder("Quest not received after accepting: ")).append(i).toString());
            return;
        } else
        {
            result.finishWithQuest(((com.google.android.gms.games.quest.Quest) (obj)));
            return;
        }
    }

    ()
    {
        this$0 = ClientQuestInboxHelper.this;
        super();
    }
}

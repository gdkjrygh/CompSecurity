// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.notifications;

import android.support.v4.util.ArrayMap;
import android.widget.Toast;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

public final class ClientMuteGameHelper
    implements ResultCallback
{

    private final ClientFragmentActivity mActivity;
    private ArrayMap mMutedGamesMap;

    public ClientMuteGameHelper(ClientFragmentActivity clientfragmentactivity)
    {
        mMutedGamesMap = new ArrayMap();
        Asserts.checkNotNull(clientfragmentactivity);
        mActivity = clientfragmentactivity;
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogMutingApp");
    }

    public final void muteGame(Game game)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMuteGameHelper", "muteGame: not connected; ignoring...");
            return;
        } else
        {
            mMutedGamesMap.put(game.getApplicationId(), game.getDisplayName());
            com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f10022f);
            DialogFragmentUtil.show(mActivity, gamesdialogfragment, "com.google.android.gms.games.ui.dialog.progressDialogMutingApp");
            Games.Notifications.muteGameInternal(googleapiclient, game.getApplicationId()).setResultCallback(this);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        Object obj = (com.google.android.gms.games.Notifications.GameMuteStatusChangeResult)result;
        int i = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).getStatus().mStatusCode;
        result = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).getExternalGameId();
        boolean flag = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).isMuted();
        obj = (String)mMutedGamesMap.get(result);
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogMutingApp");
        if (!mActivity.canContinueWithStatus(i))
        {
            GamesLog.e("ClientMuteGameHelper", (new StringBuilder("Status code was not SUCCESS! (status: ")).append(i).append(", externalGameId: ").append(result).toString());
            return;
        }
        if (!flag)
        {
            GamesLog.e("ClientMuteGameHelper", (new StringBuilder("Application was not muted as it should have been. (status: ")).append(i).append(", externalGameId: ").append(result).toString());
            return;
        }
        if (obj != null)
        {
            result = mActivity.getString(0x7f1002c3, new Object[] {
                obj
            });
            Toast.makeText(mActivity.getApplicationContext(), result, 0).show();
            return;
        } else
        {
            GamesLog.w("ClientMuteGameHelper", (new StringBuilder("Display name of muted game with externalGameId: ")).append(result).append(" was not found!").toString());
            return;
        }
    }
}

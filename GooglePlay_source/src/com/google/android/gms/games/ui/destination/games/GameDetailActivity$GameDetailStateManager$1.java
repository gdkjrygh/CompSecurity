// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

final class this._cls1
    implements ResultCallback
{

    final keNextRequest this$1;

    public final volatile void onResult(Result result)
    {
        Object obj;
        int i;
        obj = (com.google.android.gms.games.client.games.nager._cls1)result;
        result = this._cls1.this;
        i = ((com.google.android.gms.games.client.games.nager) (obj)).nager().mStatusCode;
        obj = ((com.google.android.gms.games.client.games.nager) (obj)).nager();
        boolean flag = ((this._cls1) (result))._fld0.isFinishing();
        if (flag)
        {
            ((GameFirstPartyBuffer) (obj)).release();
            return;
        }
        result.urrentExtendedGame = null;
        if (((GameFirstPartyBuffer) (obj)).getCount() > 0)
        {
            result.urrentExtendedGame = (GameFirstParty)((GameFirstParty)((GameFirstPartyBuffer) (obj)).get(0)).freeze();
            GameDetailActivity.access$3202(((urrentExtendedGame) (result))._fld0, ((is._cls0) (result)).urrentExtendedGame.getGame());
        }
        ((GameFirstPartyBuffer) (obj)).release();
        if (((urrentExtendedGame) (result)).urrentExtendedGame == null)
        {
            if (GameDetailActivity.access$3200(((urrentExtendedGame) (result))._fld0) != null)
            {
                GamesLog.w(GameDetailActivity.access$3100(), (new StringBuilder("onDataBufferLoaded: couldn't load gameId ")).append(GameDetailActivity.access$3200(((is._cls0) (result))._fld0).getApplicationId()).toString());
            }
            obj = GameDetailActivity.access$3600(((is._cls0) (result))._fld0);
            if (UiUtils.isNetworkError(i))
            {
                i = 5;
            } else
            {
                i = 6;
            }
            ((LoadingDataViewManager) (obj)).setViewState(i);
            GameDetailActivity.access$3800(((is._cls0) (result))._fld0).logEvents(new int[] {
                7
            });
            return;
        } else
        {
            GameDetailActivity.access$3202(((is._cls0) (result))._fld0, ((is._cls0) (result)).urrentExtendedGame.getGame());
            result.sInstalled = GameDetailActivity.access$3200(((sInstalled) (result))._fld0).isInstanceInstalled();
            GameDetailActivity.access$3902$1b0751c8(((is._cls0) (result))._fld0);
            ((is._cls0) (result))._fld0.updateTaskDescription(GameDetailActivity.access$3200(((is._cls0) (result))._fld0).getDisplayName());
            GameDetailActivity.access$3302(((is._cls0) (result))._fld0, GameDetailActivity.access$3200(((is._cls0) (result))._fld0).isMuted());
            result.keNextRequest();
            return;
        }
        result;
        ((GameFirstPartyBuffer) (obj)).release();
        throw result;
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

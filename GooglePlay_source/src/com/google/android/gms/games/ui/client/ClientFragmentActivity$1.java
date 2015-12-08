// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.client:
//            ClientFragmentActivity

final class this._cls0
    implements ResultCallback
{

    final ClientFragmentActivity this$0;

    public final volatile void onResult(Result result)
    {
        Object obj;
        ClientFragmentActivity clientfragmentactivity;
        GameBuffer gamebuffer;
        int i;
        obj = null;
        result = (com.google.android.gms.games.sult)result;
        clientfragmentactivity = ClientFragmentActivity.this;
        i = result.getStatus().mStatusCode;
        gamebuffer = result.getGames();
        boolean flag = clientfragmentactivity.canContinueWithStatus(i);
        if (!flag)
        {
            gamebuffer.release();
            return;
        }
        clientfragmentactivity.mClientGame = null;
        result = obj;
        if (gamebuffer.getCount() > 0)
        {
            result = (Game)gamebuffer.get(0).freeze();
        }
        if (result != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        GamesLog.w("ClientUiFragAct", "onGamesLoaded: couldn't load gameId ");
        gamebuffer.release();
        return;
        clientfragmentactivity.setClientGame(result);
        gamebuffer.release();
        return;
        result;
        gamebuffer.release();
        throw result;
    }

    ()
    {
        this$0 = ClientFragmentActivity.this;
        super();
    }
}

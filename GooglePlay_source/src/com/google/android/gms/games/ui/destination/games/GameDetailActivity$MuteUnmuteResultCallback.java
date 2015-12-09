// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.widget.Toast;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

private final class mMute
    implements ResultCallback
{

    private final boolean mMute;
    final GameDetailActivity this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.UnmuteResultCallback)result;
        int i = result.Status().mStatusCode;
        boolean flag = result.uted();
        if (mMute != flag)
        {
            GamesLog.e(GameDetailActivity.access$3100(), (new StringBuilder("The mute status was not changed as it should have been. (")).append(i).append(")").toString());
            return;
        }
        if (GameDetailActivity.access$3200(GameDetailActivity.this) != null)
        {
            result = GameDetailActivity.access$3200(GameDetailActivity.this).getDisplayName();
            GameDetailActivity gamedetailactivity = GameDetailActivity.this;
            int j;
            if (mMute)
            {
                j = 0x7f1002c3;
            } else
            {
                j = 0x7f1002c5;
            }
            result = gamedetailactivity.getString(j, new Object[] {
                result
            });
        } else
        {
            result = GameDetailActivity.this;
            int k;
            if (mMute)
            {
                k = 0x7f1002c4;
            } else
            {
                k = 0x7f1002c6;
            }
            result = result.getString(k);
        }
        Toast.makeText(GameDetailActivity.this, result, 0).show();
        result = GameDetailActivity.this;
        if (!GameDetailActivity.access$3300(GameDetailActivity.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        GameDetailActivity.access$3302(result, flag);
        GameDetailActivity.access$3400(GameDetailActivity.this);
    }

    (boolean flag)
    {
        this$0 = GameDetailActivity.this;
        super();
        mMute = flag;
    }
}

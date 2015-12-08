// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.base.Constants;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            MyUser, Pin, Board, ModelHelper

final class ask extends BackgroundTask
{

    final com.pinterest.api.remote.ilParams val$params;
    final Pin val$pin;

    public final void run()
    {
        MyUser.addLastUsedBoard(val$params.b);
        Board board = val$pin.getBoard();
        if (board != null && !Constants.isTrue(board.getSecret()))
        {
            val$pin.setRepinCount(Integer.valueOf(val$pin.getRepinCountDisplay() + 1));
        }
        ModelHelper.setPin(val$pin);
    }

    ailParams()
    {
        val$params = ilparams;
        val$pin = pin1;
        super();
    }
}

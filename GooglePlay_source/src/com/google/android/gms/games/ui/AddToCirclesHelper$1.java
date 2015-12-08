// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.people.model.Circle;
import com.google.android.gms.people.model.CircleBuffer;

// Referenced classes of package com.google.android.gms.games.ui:
//            AddToCirclesHelper

final class this._cls0
    implements ResultCallback
{

    final AddToCirclesHelper this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.people.lt)result;
        if (!result.getStatus().isSuccess()) goto _L2; else goto _L1
_L1:
        CircleBuffer circlebuffer;
        int j;
        circlebuffer = result.getCircles();
        j = circlebuffer.getCount();
        int i = 0;
_L8:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (mFollowingCircleId != null) goto _L4; else goto _L5
_L5:
        Circle circle = circlebuffer.get(i);
        if (mFollowingCircleName.equals(circle.getCircleName()))
        {
            mFollowingCircleId = circle.getCircleId();
        }
          goto _L6
_L2:
        GamesLog.w("AddToCirclesHelper", "Failed to load circles.");
_L4:
        result.release();
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    ()
    {
        this$0 = AddToCirclesHelper.this;
        super();
    }
}

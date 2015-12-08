// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui:
//            AddToCirclesHelper

final class val.playerId
    implements ResultCallback
{

    final AddToCirclesHelper this$0;
    final String val$playerId;

    public final volatile void onResult(Result result)
    {
        String s;
        Object obj;
        if (!((com.google.android.gms.people.sonCircleResult)result).getStatus().isSuccess())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        obj = AddToCirclesHelper.this;
        s = val$playerId;
        result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
        result;
        JVM INSTR monitorenter ;
        for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((eTouchCirclesListener)((Iterator) (obj)).next())._mth16da05f7(s)) { }
        break MISSING_BLOCK_LABEL_74;
        Exception exception;
        exception;
        result;
        JVM INSTR monitorexit ;
        throw exception;
        result;
        JVM INSTR monitorexit ;
        return;
        GamesLog.w("AddToCirclesHelper", "Failed to remove player from circle.");
        obj = AddToCirclesHelper.this;
        exception = val$playerId;
        result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
        result;
        JVM INSTR monitorenter ;
        for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((eTouchCirclesListener)((Iterator) (obj)).next()).onOneTouchCircleRemoveFailed(exception)) { }
        break MISSING_BLOCK_LABEL_143;
        exception;
        result;
        JVM INSTR monitorexit ;
        throw exception;
        result;
        JVM INSTR monitorexit ;
    }

    eTouchCirclesListener()
    {
        this$0 = final_addtocircleshelper;
        val$playerId = String.this;
        super();
    }
}

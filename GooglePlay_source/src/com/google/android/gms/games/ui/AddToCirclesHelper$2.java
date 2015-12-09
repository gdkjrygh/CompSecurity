// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui:
//            AddToCirclesHelper

final class val.playerId
    implements ResultCallback
{

    final AddToCirclesHelper this$0;
    final int val$logActionSource;
    final String val$playerId;

    public final volatile void onResult(Result result)
    {
        String s;
        Object obj;
        Object obj1;
        if (!((com.google.android.gms.people.ToCircleResult)result).getStatus().isSuccess())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        GamesPlayLogger.logAddToCirclesAction(mContext, "", mCurrentAccountName, val$logActionSource, true);
        obj1 = AddToCirclesHelper.this;
        s = val$playerId;
        obj = mFollowingCircleName;
        result = ((Result) (((AddToCirclesHelper) (obj1)).mListenerLock));
        result;
        JVM INSTR monitorenter ;
        for (obj1 = ((AddToCirclesHelper) (obj1)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj1)).hasNext(); ((eTouchCirclesListener)((Iterator) (obj1)).next()).onOneTouchCircleAddSucceeded(s, ((String) (obj)))) { }
        break MISSING_BLOCK_LABEL_113;
        Exception exception;
        exception;
        result;
        JVM INSTR monitorexit ;
        throw exception;
        result;
        JVM INSTR monitorexit ;
        return;
        GamesLog.w("AddToCirclesHelper", "Failed to add player to circle.");
        obj = AddToCirclesHelper.this;
        exception = val$playerId;
        result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
        result;
        JVM INSTR monitorenter ;
        for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((eTouchCirclesListener)((Iterator) (obj)).next()).onOneTouchCircleAddFailed(exception)) { }
        break MISSING_BLOCK_LABEL_182;
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
        val$logActionSource = i;
        val$playerId = String.this;
        super();
    }
}

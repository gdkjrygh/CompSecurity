// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            BasePendingResult

public static final class <init> extends Handler
{

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("BasePendingResult", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (ResultCallback)((Pair) (obj)).first;
            obj = (Result)((Pair) (obj)).second;
            try
            {
                message.onResult(((Result) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                BasePendingResult.maybeReleaseResult(((Result) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((BasePendingResult)message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            return;
        }
    }

    public final void sendResultCallback(ResultCallback resultcallback, Result result)
    {
        sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
    }

    public ()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}

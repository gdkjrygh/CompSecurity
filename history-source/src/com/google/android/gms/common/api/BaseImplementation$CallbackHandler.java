// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.common.api:
//            BaseImplementation, ResultCallback, Result

public static class <init> extends Handler
{

    public static final int CALLBACK_ON_COMPLETE = 1;
    public static final int CALLBACK_ON_TIMEOUT = 2;

    protected void deliverResultCallback(ResultCallback resultcallback, Result result)
    {
        try
        {
            resultcallback.onResult(result);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ResultCallback resultcallback)
        {
            BaseImplementation.a(result);
        }
        throw resultcallback;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("GoogleApi", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            message = (Pair)message.obj;
            deliverResultCallback((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
            return;

        case 2: // '\002'
            esult.a((esult)message.obj);
            break;
        }
    }

    public void removeTimeoutMessages()
    {
        removeMessages(2);
    }

    public void sendResultCallback(ResultCallback resultcallback, Result result)
    {
        sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
    }

    public void sendTimeoutResultCallback(esult esult, long l)
    {
        sendMessageDelayed(obtainMessage(2, esult), l);
    }

    public esult()
    {
        this(Looper.getMainLooper());
    }

    public <init>(Looper looper)
    {
        super(looper);
    }
}

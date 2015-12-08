// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.fabric.sdk.android.services.concurrency.AsyncTask;

public final class gzo extends Handler
{

    public gzo()
    {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message)
    {
        gzn gzn1 = (gzn)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            AsyncTask.b(gzn1.a);
            return;

        case 2: // '\002'
            AsyncTask.Z_();
            break;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ModernAsyncTask;

public final class di extends Handler
{

    public di()
    {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message)
    {
        dh dh1 = (dh)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ModernAsyncTask.c(dh1.a, dh1.b[0]);
            return;

        case 2: // '\002'
            ModernAsyncTask.b();
            break;
        }
    }
}

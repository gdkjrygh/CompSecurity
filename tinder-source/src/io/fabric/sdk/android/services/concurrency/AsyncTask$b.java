// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

private static final class  extends Handler
{

    public final void handleMessage(Message message)
    {
          = ()message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            AsyncTask.b(.a);
            return;

        case 2: // '\002'
            AsyncTask.D_();
            break;
        }
    }

    public ()
    {
        super(Looper.getMainLooper());
    }
}

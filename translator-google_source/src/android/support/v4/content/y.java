// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package android.support.v4.content:
//            x, ModernAsyncTask

final class y extends Handler
{

    public y()
    {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message)
    {
        x x1 = (x)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ModernAsyncTask.c(x1.a, x1.b[0]);
            return;

        case 2: // '\002'
            ModernAsyncTask.b();
            break;
        }
    }
}

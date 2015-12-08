// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

private static class  extends Handler
{

    public void handleMessage(Message message)
    {
          = ()message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ModernAsyncTask.access$400(.mTask, .mData[0]);
            return;

        case 2: // '\002'
            .mTask.onProgressUpdate(.mData);
            break;
        }
    }

    public ()
    {
        super(Looper.getMainLooper());
    }
}

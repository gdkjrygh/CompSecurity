// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;

public final class nxn extends HandlerThread
    implements android.os.Handler.Callback
{

    Handler a;

    public nxn()
    {
        super("ImageLoader");
    }

    public final boolean handleMessage(Message message)
    {
        message = (nxb)message.obj;
        if (((nxb) (message)).i == 2 || ((nxb) (message)).i == 4 || ((nxb) (message)).i == 6)
        {
            message.c();
        }
        return true;
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    public final void start()
    {
        this;
        JVM INSTR monitorenter ;
        super.start();
        a = new Handler(getLooper(), this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}

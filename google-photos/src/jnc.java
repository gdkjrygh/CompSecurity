// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

final class jnc extends Handler
    implements Runnable
{

    final jnd a;
    volatile Thread b;
    private final jnb c;
    private jna d;

    public jnc(jna jna1, Looper looper, jnd jnd1, jnb jnb1)
    {
        d = jna1;
        super(looper);
        a = jnd1;
        c = jnb1;
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 2)
        {
            throw (Error)message.obj;
        }
        d.c = false;
        d.b = null;
        if (a.b())
        {
            c.i();
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            c.h();
            return;

        case 1: // '\001'
            c.a((IOException)message.obj);
            break;
        }
    }

    public final void run()
    {
        try
        {
            b = Thread.currentThread();
            if (!a.b())
            {
                p.a(String.valueOf(a.getClass().getSimpleName()).concat(".load()"));
                a.c();
                p.b();
            }
            sendEmptyMessage(0);
            return;
        }
        catch (IOException ioexception)
        {
            obtainMessage(1, ioexception).sendToTarget();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            c.b(a.b());
            sendEmptyMessage(0);
            return;
        }
        catch (Exception exception)
        {
            Log.e("LoadTask", "Unexpected exception loading stream", exception);
            obtainMessage(1, new avz(exception)).sendToTarget();
            return;
        }
        catch (Error error)
        {
            Log.e("LoadTask", "Unexpected error loading stream", error);
            obtainMessage(2, error).sendToTarget();
            throw error;
        }
    }
}

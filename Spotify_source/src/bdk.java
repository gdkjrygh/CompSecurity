// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer.upstream.Loader;
import java.io.IOException;

public final class bdk extends Handler
    implements Runnable
{

    public final bdl a;
    public volatile Thread b;
    private final bdj c;
    private Loader d;

    public bdk(Loader loader, Looper looper, bdl bdl1, bdj bdj1)
    {
        d = loader;
        super(looper);
        a = bdl1;
        c = bdj1;
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 2)
        {
            throw (Error)message.obj;
        }
        d.b = false;
        d.a = null;
        if (a.e())
        {
            c.i();
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            c.a(a);
            return;

        case 1: // '\001'
            c.a(a, (IOException)message.obj);
            break;
        }
    }

    public final void run()
    {
        try
        {
            b = Thread.currentThread();
            if (!a.e())
            {
                beh.a((new StringBuilder()).append(a.getClass().getSimpleName()).append(".load()").toString());
                a.f();
                beh.a();
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
            bds.b(a.e());
            sendEmptyMessage(0);
            return;
        }
        catch (Exception exception)
        {
            Log.e("LoadTask", "Unexpected exception loading stream", exception);
            obtainMessage(1, new com.google.android.exoplayer.upstream.Loader.UnexpectedLoaderException(exception)).sendToTarget();
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

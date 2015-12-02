// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.TraceUtil;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            Loader

final class c extends Handler
    implements Runnable
{

    final Loader a;
    private final obtainMessage b;
    private final obtainMessage c;
    private volatile Thread d;

    private void b()
    {
        Loader.a(a, false);
        Loader.a(a, null);
    }

    public final void a()
    {
        b.f();
        if (d != null)
        {
            d.interrupt();
        }
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 2)
        {
            throw (Error)message.obj;
        }
        b();
        if (b.g())
        {
            c.f();
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            c.a(b);
            return;

        case 1: // '\001'
            c.a(b, (IOException)message.obj);
            break;
        }
    }

    public final void run()
    {
        try
        {
            d = Thread.currentThread();
            if (!b.g())
            {
                TraceUtil.a((new StringBuilder()).append(b.getClass().getSimpleName()).append(".load()").toString());
                b.h();
                TraceUtil.a();
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
            Assertions.b(b.g());
            sendEmptyMessage(0);
            return;
        }
        catch (Exception exception)
        {
            Log.e("LoadTask", "Unexpected exception loading stream", exception);
            obtainMessage(1, new dLoaderException(exception)).sendToTarget();
            return;
        }
        catch (Error error)
        {
            Log.e("LoadTask", "Unexpected error loading stream", error);
            obtainMessage(2, error).sendToTarget();
            throw error;
        }
    }

    public dLoaderException(Loader loader, Looper looper, dLoaderException dloaderexception, dLoaderException dloaderexception1)
    {
        a = loader;
        super(looper);
        b = dloaderexception;
        c = dloaderexception1;
    }
}

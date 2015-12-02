// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Looper;
import com.facebook.tools.dextr.runtime.detour.ExecutorDetour;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.concurrent.ExecutorService;

public final class Loader
{

    private final ExecutorService a;
    private LoadTask b;
    private boolean c;

    public Loader(String s)
    {
        a = Util.a(s);
    }

    static LoadTask a(Loader loader, LoadTask loadtask)
    {
        loader.b = loadtask;
        return loadtask;
    }

    static boolean a(Loader loader, boolean flag)
    {
        loader.c = flag;
        return flag;
    }

    public final void a(Looper looper, Loadable loadable, Callback callback)
    {
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        c = true;
        b = new LoadTask(looper, loadable, callback);
        ExecutorDetour.a(a, b, 0xd4895535);
    }

    public final void a(Loadable loadable, Callback callback)
    {
        Looper looper = Looper.myLooper();
        boolean flag;
        if (looper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
        a(looper, loadable, callback);
    }

    public final boolean a()
    {
        return c;
    }

    public final void b()
    {
        Assertions.b(c);
        b.a();
    }

    public final void c()
    {
        if (c)
        {
            b();
        }
        a.shutdown();
    }

    private class LoadTask extends Handler
        implements Runnable
    {

        final Loader a;
        private final Loadable b;
        private final Callback c;
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
                obtainMessage(1, new UnexpectedLoaderException(exception)).sendToTarget();
                return;
            }
            catch (Error error)
            {
                Log.e("LoadTask", "Unexpected error loading stream", error);
                obtainMessage(2, error).sendToTarget();
                throw error;
            }
        }

        public LoadTask(Looper looper, Loadable loadable, Callback callback)
        {
            a = Loader.this;
            super(looper);
            b = loadable;
            c = callback;
        }

        private class Loadable
        {

            public abstract void f();

            public abstract boolean g();

            public abstract void h();
        }


        private class Callback
        {

            public abstract void a(Loadable loadable);

            public abstract void a(Loadable loadable, IOException ioexception);

            public abstract void f();
        }


        private class UnexpectedLoaderException extends IOException
        {

            public UnexpectedLoaderException(Exception exception)
            {
                super((new StringBuilder("Unexpected ")).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString(), exception);
            }
        }

    }

}

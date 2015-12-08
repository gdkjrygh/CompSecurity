// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.os.AsyncTask;
import android.os.Process;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class e
{
    public static interface a
    {

        public abstract Object a();
    }

    public static interface b
    {

        public abstract void a();
    }

    public static interface c
    {

        public abstract void a(Object obj);
    }


    private static ExecutorService b = Executors.newSingleThreadExecutor();
    public c a;
    private a c;
    private b d;

    private e(a a1)
    {
        c = a1;
    }

    private e(b b1)
    {
        d = b1;
    }

    static a a(e e1)
    {
        return e1.c;
    }

    public static e a(a a1)
    {
        return new e(a1);
    }

    public static e a(b b1)
    {
        return new e(b1);
    }

    static c b(e e1)
    {
        return e1.a;
    }

    static b c(e e1)
    {
        return e1.d;
    }

    public final void a(boolean flag)
    {
        if (d == null && (c == null || a == null))
        {
            throw new IllegalStateException("You must specify either AsyncBgOnly OR both AsyncBg AND AsyncUi.");
        }
        if (d == null)
        {
            AsyncTask asynctask = new AsyncTask() {

                final e a;

                protected final Object doInBackground(Object aobj[])
                {
                    return e.a(a).a();
                }

                protected final void onPostExecute(Object obj)
                {
                    e.b(a).a(obj);
                }

            
            {
                a = e.this;
                super();
            }
            };
            if (flag && android.os.Build.VERSION.SDK_INT >= 11)
            {
                asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null);
                return;
            } else
            {
                asynctask.execute(null);
                return;
            }
        } else
        {
            b.submit(new Runnable() {

                final e a;

                public final void run()
                {
                    Process.setThreadPriority(10);
                    e.c(a).a();
                }

            
            {
                a = e.this;
                super();
            }
            });
            return;
        }
    }

}

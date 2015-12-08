// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils.os;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

public abstract class a extends AsyncTask
{

    private static final Handler a = new Handler(Looper.getMainLooper());

    public a()
    {
    }

    private boolean b()
    {
        return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    protected abstract void a();

    protected abstract void a(Object obj);

    protected transient void a(Object aobj[])
    {
    }

    protected final void onPostExecute(Object obj)
    {
        if (b())
        {
            a(obj);
            return;
        } else
        {
            a.post(new AviaryAsyncTask._cls2(obj));
            return;
        }
    }

    protected void onPreExecute()
    {
        if (b())
        {
            a();
            return;
        } else
        {
            a.post(new AviaryAsyncTask._cls1());
            return;
        }
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
        if (b())
        {
            a(aobj);
            return;
        } else
        {
            a.post(new AviaryAsyncTask._cls3(aobj));
            return;
        }
    }


    // Unreferenced inner class com/aviary/android/feather/common/utils/os/AviaryAsyncTask$1

/* anonymous class */
    class AviaryAsyncTask._cls1
        implements Runnable
    {

        final a a;

        public void run()
        {
            a.a();
        }

            
            {
                a = a.this;
                super();
            }
    }


    // Unreferenced inner class com/aviary/android/feather/common/utils/os/AviaryAsyncTask$2

/* anonymous class */
    class AviaryAsyncTask._cls2
        implements Runnable
    {

        final Object a;
        final a b;

        public void run()
        {
            b.a(a);
        }

            
            {
                b = a.this;
                a = obj;
                super();
            }
    }


    // Unreferenced inner class com/aviary/android/feather/common/utils/os/AviaryAsyncTask$3

/* anonymous class */
    class AviaryAsyncTask._cls3
        implements Runnable
    {

        final Object a[];
        final a b;

        public void run()
        {
            b.a(a);
        }

            
            {
                b = a.this;
                a = aobj;
                super();
            }
    }

}

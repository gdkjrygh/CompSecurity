// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package p.ch:
//            a

class bject
    implements Runnable
{

    final a a;

    public void run()
    {
        p.ch.a.d(a.a);
    }

    AsyncTask(AsyncTask asynctask)
    {
        a = asynctask;
        super();
    }

    // Unreferenced inner class p/ch/a$3

/* anonymous class */
    class a._cls3 extends AsyncTask
    {

        final a a;

        protected transient Void a(Void avoid[])
        {
            if (a.k != null)
            {
                a.k.removeCallbacks(a.j);
            }
            a.k = new Handler(Looper.getMainLooper());
            a.j = new a._cls3._cls1(this);
            a.k.postDelayed(a.j, a.m());
            return null;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

            
            {
                a = a1;
                super();
            }
    }

}

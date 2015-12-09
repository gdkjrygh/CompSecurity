// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ch;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package p.ch:
//            a

class s.AsyncTask extends AsyncTask
{

    final a a;

    protected transient Void a(Void avoid[])
    {
        if (a.k != null)
        {
            a.k.removeCallbacks(a.j);
        }
        a.k = new Handler(Looper.getMainLooper());
        a.j = new Runnable() {

            final a._cls3 a;

            public void run()
            {
                p.ch.a.d(a.a);
            }

            
            {
                a = a._cls3.this;
                super();
            }
        };
        a.k.postDelayed(a.j, a.m());
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    .Object(a a1)
    {
        a = a1;
        super();
    }
}

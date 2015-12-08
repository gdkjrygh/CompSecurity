// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.os.AsyncTask;

// Referenced classes of package bo.app:
//            cw, em

final class en extends AsyncTask
{

    final em a;

    private en(em em1)
    {
        a = em1;
        super();
    }

    en(em em1, byte byte0)
    {
        this(em1);
    }

    private transient Void a()
    {
        cw cw1 = new cw();
        cw1.c = a.g();
        cw1.b = a.f();
        cw1.d = a.h();
        cw1.a = a.e();
        cw1.f = a.b();
        cw1.e = a.a();
        cw1.g = a.c();
        cw1.h = a.d();
        synchronized (em.a(a))
        {
            em.a(a, cw1);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}

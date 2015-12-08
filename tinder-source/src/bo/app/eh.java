// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.os.AsyncTask;

// Referenced classes of package bo.app:
//            cq, eg

final class eh extends AsyncTask
{

    final eg a;

    private eh(eg eg1)
    {
        a = eg1;
        super();
    }

    eh(eg eg1, byte byte0)
    {
        this(eg1);
    }

    private transient Void a()
    {
        cq cq1 = new cq();
        cq1.c = a.g();
        cq1.b = a.f();
        cq1.d = a.h();
        cq1.a = a.e();
        cq1.f = a.b();
        cq1.e = a.a();
        cq1.g = a.c();
        cq1.h = a.d();
        synchronized (eg.a(a))
        {
            eg.a(a, cq1);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}

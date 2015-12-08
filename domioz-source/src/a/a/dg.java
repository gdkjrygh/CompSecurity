// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.os.AsyncTask;

// Referenced classes of package a.a:
//            br, df

final class dg extends AsyncTask
{

    final df a;

    private dg(df df1)
    {
        a = df1;
        super();
    }

    dg(df df1, byte byte0)
    {
        this(df1);
    }

    private transient Void a()
    {
        br br1 = new br();
        br1.c = a.g();
        br1.b = a.f();
        br1.d = a.h();
        br1.a = a.e();
        br1.f = a.b();
        br1.e = a.a();
        br1.g = a.c();
        br1.h = a.d();
        synchronized (df.a(a))
        {
            df.a(a, br1);
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}

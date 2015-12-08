// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class ekj
{

    final Handler a;
    long b;
    double c;
    ekk d;
    boolean e;
    Runnable f;
    long g;

    public ekj(Handler handler)
    {
        f = new Runnable() {

            private ekj a;

            public final void run()
            {
                if (!a.e)
                {
                    return;
                }
                long l = (long)((double)a.b + 1000D * a.c);
                if (l != a.b)
                {
                    a.b = l;
                    if (a.d != null)
                    {
                        a.d.a(a.b, a.g);
                    }
                }
                a.a();
            }

            
            {
                a = ekj.this;
                super();
            }
        };
        a = handler;
    }

    public final void a()
    {
        a.postDelayed(f, 1000L);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cl;

import android.os.Handler;

// Referenced classes of package p.cl:
//            a

private class a
    implements Runnable
{

    final a a;
    private long b;

    public void a()
    {
        b = p.cl.a.a(a);
    }

    public void run()
    {
        if (a.e() <= 0L)
        {
            if (p.cl.a.b(a) != null)
            {
                p.cl.a.b(a).a();
            }
            return;
        }
        if (b <= 2L)
        {
            b = 1L;
        } else
        {
            b = b / 2L;
        }
        p.cl.a.c(a).postDelayed(this, b);
    }

    public (a a1)
    {
        a = a1;
        super();
        a();
    }
}

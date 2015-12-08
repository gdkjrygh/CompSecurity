// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.b;

import com.kik.g.p;

// Referenced classes of package kik.android.gifs.b:
//            b

public abstract class c
    implements Runnable
{

    protected String a;
    protected int b;
    private p c;
    private boolean d;

    protected c(String s, int i)
    {
        c = new p();
        d = false;
        a = s;
        b = i;
    }

    public final p a()
    {
        return c;
    }

    public final void b()
    {
        d = true;
        c.e();
    }

    protected final boolean c()
    {
        return d;
    }

    protected abstract b d();

    public void run()
    {
        if (d)
        {
            return;
        }
        b b1 = d();
        if (b1 == null)
        {
            c.a(new Throwable("Failed to decode"));
            return;
        } else
        {
            c.a(b1);
            return;
        }
    }
}

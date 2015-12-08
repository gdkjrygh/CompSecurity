// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Collection;

// Referenced classes of package b.a:
//            ow, ji, ju

public abstract class kk
{

    final ji a;
    final int b;
    int c;
    private final String d;
    private boolean e;

    public kk(String s, ji ji, int i)
    {
        if (ji == null)
        {
            throw new NullPointerException("file == null");
        } else
        {
            a(i);
            d = s;
            a = ji;
            b = i;
            c = -1;
            e = false;
            return;
        }
    }

    public static void a(int i)
    {
        if (i <= 0 || (i - 1 & i) != 0)
        {
            throw new IllegalArgumentException("invalid alignment");
        } else
        {
            return;
        }
    }

    public abstract int a(ju ju);

    public abstract Collection a();

    protected abstract void a_(ow ow1);

    public final int b(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("relative < 0");
        }
        if (c < 0)
        {
            throw new RuntimeException("fileOffset not yet set");
        } else
        {
            return c + i;
        }
    }

    protected abstract void c();

    public final void c(ow ow1)
    {
        g();
        ow1.h(b);
        int i = ow1.f();
        if (c < 0)
        {
            c = i;
        } else
        if (c != i)
        {
            throw new RuntimeException((new StringBuilder("alignment mismatch: for ")).append(this).append(", at ").append(i).append(", but expected ").append(c).toString());
        }
        if (ow1.a())
        {
            if (d != null)
            {
                ow1.a(0, (new StringBuilder("\n")).append(d).append(":").toString());
            } else
            if (i != 0)
            {
                ow1.a(0, "\n");
            }
        }
        a_(ow1);
    }

    public final int e()
    {
        if (c < 0)
        {
            throw new RuntimeException("fileOffset not set");
        } else
        {
            return c;
        }
    }

    public final void f()
    {
        h();
        c();
        e = true;
    }

    protected final void g()
    {
        if (!e)
        {
            throw new RuntimeException("not prepared");
        } else
        {
            return;
        }
    }

    protected final void h()
    {
        if (e)
        {
            throw new RuntimeException("already prepared");
        } else
        {
            return;
        }
    }

    public abstract int j_();
}

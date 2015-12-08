// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public abstract class adr
{

    private boolean a;
    final acU b;
    final int c;
    int d;

    public adr(acU acu, int i)
    {
        if (acu == null)
        {
            throw new NullPointerException("file == null");
        } else
        {
            a(i);
            b = acu;
            c = i;
            d = -1;
            a = false;
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

    public abstract int a(adg adg);

    public abstract Collection a();

    protected abstract void a_(aeG aeg);

    public abstract int ai_();

    public final int b(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("relative < 0");
        }
        if (d < 0)
        {
            throw new RuntimeException("fileOffset not yet set");
        } else
        {
            return d + i;
        }
    }

    protected abstract void c();

    public final void c(aeG aeg)
    {
        g();
        aeg.h(c);
        int i = aeg.b();
        if (d < 0)
        {
            d = i;
        } else
        if (d != i)
        {
            throw new RuntimeException((new StringBuilder("alignment mismatch: for ")).append(this).append(", at ").append(i).append(", but expected ").append(d).toString());
        }
        a_(aeg);
    }

    public final int e()
    {
        if (d < 0)
        {
            throw new RuntimeException("fileOffset not set");
        } else
        {
            return d;
        }
    }

    public final void f()
    {
        h();
        c();
        a = true;
    }

    protected final void g()
    {
        if (!a)
        {
            throw new RuntimeException("not prepared");
        } else
        {
            return;
        }
    }

    protected final void h()
    {
        if (a)
        {
            throw new RuntimeException("already prepared");
        } else
        {
            return;
        }
    }
}

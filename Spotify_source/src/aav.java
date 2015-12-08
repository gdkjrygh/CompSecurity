// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;

public abstract class aav
{

    public final aaw a = new aaw();
    public boolean b;

    public aav()
    {
        b = false;
    }

    public int a(int i)
    {
        return 0;
    }

    public abstract abo a(ViewGroup viewgroup, int i);

    public final void a()
    {
        if (a.a())
        {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else
        {
            b = true;
            return;
        }
    }

    public final void a(int i, int j)
    {
        a.a(i, j);
    }

    public void a(abo abo)
    {
    }

    public abstract void a(abo abo, int i);

    public abstract int b();

    public long b(int i)
    {
        return -1L;
    }

    public final void b(int i, int j)
    {
        a.b(i, j);
    }

    public void b(abo abo)
    {
    }

    public final void c()
    {
        a.b();
    }

    public final void c(int i)
    {
        a.a(i, 1);
    }

    public final void c(int i, int j)
    {
        a.c(i, j);
    }

    public void c(abo abo)
    {
    }

    public final void d(int i)
    {
        a.b(i, 1);
    }

    public final void e(int i)
    {
        a.c(i, 1);
    }
}

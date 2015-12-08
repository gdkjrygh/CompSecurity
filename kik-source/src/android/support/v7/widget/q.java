// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            r, s

public abstract class q
{

    protected final RecyclerView.i a;
    private int b;

    private q(RecyclerView.i i)
    {
        b = 0x80000000;
        a = i;
    }

    q(RecyclerView.i i, byte byte0)
    {
        this(i);
    }

    public static q a(RecyclerView.i i, int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return new r(i);

        case 1: // '\001'
            return new s(i);
        }
    }

    public abstract int a(View view);

    public final void a()
    {
        b = f();
    }

    public abstract void a(int i);

    public final int b()
    {
        if (0x80000000 == b)
        {
            return 0;
        } else
        {
            return f() - b;
        }
    }

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();
}

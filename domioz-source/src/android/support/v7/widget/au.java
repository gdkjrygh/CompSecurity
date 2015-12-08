// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            av, aw, bj

public abstract class au
{

    protected final bj a;
    private int b;

    private au(bj bj)
    {
        b = 0x80000000;
        a = bj;
    }

    au(bj bj, byte byte0)
    {
        this(bj);
    }

    public static au a(bj bj, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("invalid orientation");

        case 0: // '\0'
            return new av(bj);

        case 1: // '\001'
            return new aw(bj);
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

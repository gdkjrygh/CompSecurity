// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class e
{

    public int a;
    private int b;
    private int c;
    private int d;
    private Interpolator e;
    private boolean f;
    private int g;

    static void a(e e1, RecyclerView recyclerview)
    {
        if (e1.a >= 0)
        {
            int i = e1.a;
            e1.a = -1;
            RecyclerView.c(recyclerview, i);
            e1.f = false;
            return;
        }
        if (e1.f)
        {
            if (e1.e != null && e1.d <= 0)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (e1.d <= 0)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (e1.e == null)
            {
                if (e1.d == 0x80000000)
                {
                    RecyclerView.w(recyclerview).d(e1.b, e1.c);
                } else
                {
                    RecyclerView.w(recyclerview).c(e1.b, e1.c, e1.d);
                }
            } else
            {
                RecyclerView.w(recyclerview).d(e1.b, e1.c, e1.d, e1.e);
            }
            e1.g = e1.g + 1;
            e1.f = false;
            return;
        } else
        {
            e1.g = 0;
            return;
        }
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        b = i;
        c = j;
        d = k;
        e = interpolator;
        f = true;
    }

    public ()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
        a = -1;
        f = false;
        g = 0;
        b = 0;
        c = 0;
        d = 0x80000000;
        e = null;
    }
}

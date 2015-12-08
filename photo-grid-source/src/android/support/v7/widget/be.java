// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, bh

public final class be
{

    private int a;
    private int b;
    private int c;
    private Interpolator d;
    private boolean e;
    private int f;

    public be()
    {
        this((byte)0);
    }

    private be(byte byte0)
    {
        e = false;
        f = 0;
        a = 0;
        b = 0;
        c = 0x80000000;
        d = null;
    }

    static void a(be be1, RecyclerView recyclerview)
    {
        if (be1.e)
        {
            if (be1.d != null && be1.c <= 0)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (be1.c <= 0)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (be1.d == null)
            {
                if (be1.c == 0x80000000)
                {
                    RecyclerView.w(recyclerview).b(be1.a, be1.b);
                } else
                {
                    RecyclerView.w(recyclerview).a(be1.a, be1.b, be1.c);
                }
            } else
            {
                RecyclerView.w(recyclerview).a(be1.a, be1.b, be1.c, be1.d);
            }
            be1.f = be1.f + 1;
            if (be1.f > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            be1.e = false;
            return;
        } else
        {
            be1.f = 0;
            return;
        }
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        a = i;
        b = j;
        c = k;
        d = interpolator;
        e = true;
    }
}

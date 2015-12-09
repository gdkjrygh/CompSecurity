// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

public final class abl
{

    int a;
    private int b;
    private int c;
    private int d;
    private Interpolator e;
    private boolean f;
    private int g;

    public abl()
    {
        this((byte)0);
    }

    private abl(byte byte0)
    {
        a = -1;
        f = false;
        g = 0;
        b = 0;
        c = 0;
        d = 0x80000000;
        e = null;
    }

    static void a(abl abl1, RecyclerView recyclerview)
    {
        if (abl1.a >= 0)
        {
            int i = abl1.a;
            abl1.a = -1;
            RecyclerView.c(recyclerview, i);
            abl1.f = false;
            return;
        }
        if (abl1.f)
        {
            if (abl1.e != null && abl1.d <= 0)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (abl1.d <= 0)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (abl1.e == null)
            {
                if (abl1.d == 0x80000000)
                {
                    RecyclerView.u(recyclerview).a(abl1.b, abl1.c);
                } else
                {
                    RecyclerView.u(recyclerview).a(abl1.b, abl1.c, abl1.d);
                }
            } else
            {
                RecyclerView.u(recyclerview).a(abl1.b, abl1.c, abl1.d, abl1.e);
            }
            abl1.g = abl1.g + 1;
            if (abl1.g > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            abl1.f = false;
            return;
        } else
        {
            abl1.g = 0;
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
}

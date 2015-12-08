// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class e
{

    private int a;
    private int b;
    private int c;
    private int d;
    private Interpolator e;
    private boolean f;
    private int g;

    static void a(e e1, RecyclerView recyclerview)
    {
        if (e1.d >= 0)
        {
            int i = e1.d;
            e1.d = -1;
            RecyclerView.access$5200(recyclerview, i);
            e1.f = false;
            return;
        }
        if (e1.f)
        {
            if (e1.e != null && e1.c <= 0)
            {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (e1.c <= 0)
            {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            if (e1.e == null)
            {
                if (e1.c == 0x80000000)
                {
                    RecyclerView.access$4900(recyclerview)._mth4900(e1.a, e1.b);
                } else
                {
                    RecyclerView.access$4900(recyclerview)._mth4900(e1.a, e1.b, e1.c);
                }
            } else
            {
                RecyclerView.access$4900(recyclerview)._mth4900(e1.a, e1.b, e1.c, e1.e);
            }
            e1.g = e1.g + 1;
            if (e1.g > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            e1.f = false;
            return;
        } else
        {
            e1.g = 0;
            return;
        }
    }

    public final void a(int i)
    {
        d = i;
    }

    public final void a(int i, int j, int k, Interpolator interpolator)
    {
        a = i;
        b = j;
        c = k;
        e = interpolator;
        f = true;
    }

    final boolean a()
    {
        return d >= 0;
    }

    public ()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
        d = -1;
        f = false;
        g = 0;
        a = 0;
        b = 0;
        c = 0x80000000;
        e = null;
    }
}

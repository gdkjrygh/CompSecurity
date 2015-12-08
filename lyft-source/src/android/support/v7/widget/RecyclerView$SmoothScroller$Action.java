// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class e
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
        e1.a(recyclerview);
    }

    private void a(RecyclerView recyclerview)
    {
        if (d >= 0)
        {
            int i = d;
            d = -1;
            RecyclerView.access$5200(recyclerview, i);
            f = false;
            return;
        }
        if (f)
        {
            b();
            if (e == null)
            {
                if (c == 0x80000000)
                {
                    RecyclerView.access$4900(recyclerview).c(a, b);
                } else
                {
                    RecyclerView.access$4900(recyclerview).b(a, b, c);
                }
            } else
            {
                RecyclerView.access$4900(recyclerview).c(a, b, c, e);
            }
            g = g + 1;
            if (g > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            f = false;
            return;
        } else
        {
            g = 0;
            return;
        }
    }

    private void b()
    {
        if (e != null && c < 1)
        {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (c < 1)
        {
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else
        {
            return;
        }
    }

    public void a(int i)
    {
        d = i;
    }

    public void a(int i, int j, int k, Interpolator interpolator)
    {
        a = i;
        b = j;
        c = k;
        e = interpolator;
        f = true;
    }

    boolean a()
    {
        return d >= 0;
    }

    public (int i, int j)
    {
        this(i, j, 0x80000000, null);
    }

    public <init>(int i, int j, int k, Interpolator interpolator)
    {
        d = -1;
        f = false;
        g = 0;
        a = i;
        b = j;
        c = k;
        e = interpolator;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, br, bs, bj

public abstract class bq
{

    private int a;
    private RecyclerView b;
    private bj c;
    private boolean d;
    private boolean e;
    private View f;
    private final br g;

    static void a(bq bq1)
    {
        if (!bq1.e || bq1.a == -1)
        {
            bq1.a();
        }
        bq1.d = false;
        if (bq1.f != null)
        {
            if (RecyclerView.c(bq1.f) == bq1.a)
            {
                bs bs1 = bq1.b.e;
                br.a(bq1.g, bq1.b);
                bq1.a();
            } else
            {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                bq1.f = null;
            }
        }
        if (bq1.e)
        {
            bs bs2 = bq1.b.e;
            br.a(bq1.g, bq1.b);
        }
    }

    protected final void a()
    {
        if (!e)
        {
            return;
        } else
        {
            bs.f(b.e);
            f = null;
            a = -1;
            d = false;
            e = false;
            bj.a(c, this);
            c = null;
            b = null;
            return;
        }
    }

    public final void a(int i)
    {
        a = i;
    }

    protected final void a(View view)
    {
        if (RecyclerView.c(view) == a)
        {
            f = view;
        }
    }

    public final boolean b()
    {
        return d;
    }

    public final boolean c()
    {
        return e;
    }

    public final int d()
    {
        return a;
    }
}

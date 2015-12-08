// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;

public final class dbd
{

    private static final String m = dbd.getSimpleName();
    public final boolean a;
    public final int b;
    public final SparseArray c = new SparseArray();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final boolean f = false;
    public dbb g;
    public Adapter h;
    public int i;
    public boolean j;
    public boolean k;
    Animator l;
    private int n;

    public dbd(boolean flag, int i1, boolean flag1)
    {
        a = flag;
        b = i1;
        j = true;
        k = true;
    }

    static String c()
    {
        return m;
    }

    public final int a(View view)
    {
        if (a)
        {
            return view.getLeft();
        } else
        {
            return view.getTop();
        }
    }

    public final dba a(long l1)
    {
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            dba dba1 = (dba)c.valueAt(i1);
            if (dba1.b == l1)
            {
                return dba1;
            }
        }

        return null;
    }

    public final void a(Animator animator, int i1)
    {
        a(i1);
        if (f)
        {
            (new StringBuilder(41)).append("Playing animation. Priority = ").append(i1);
        }
        b();
        l = animator;
        n = i1;
        animator.start();
    }

    public final boolean a()
    {
        return l != null && l.isStarted();
    }

    public final boolean a(int i1)
    {
        int j1;
        if (a())
        {
            j1 = n;
        } else
        {
            j1 = 0x80000000;
        }
        return i1 >= j1;
    }

    public final int b(View view)
    {
        if (a)
        {
            return view.getMeasuredWidth();
        } else
        {
            return view.getMeasuredHeight();
        }
    }

    public final void b()
    {
        if (a())
        {
            l.end();
        }
        l = null;
    }

    public final int c(View view)
    {
        if (a)
        {
            return view.getMeasuredHeight();
        } else
        {
            return view.getMeasuredWidth();
        }
    }

    public final int d(View view)
    {
        b.a(view, "view", null);
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (view == ((dba)c.valueAt(i1)).a)
            {
                return c.keyAt(i1);
            }
        }

        return -1;
    }

}

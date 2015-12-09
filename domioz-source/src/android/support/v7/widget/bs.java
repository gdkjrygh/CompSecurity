// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.e.a;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bv

public final class bs
{

    a a;
    a b;
    a c;
    final List d = new ArrayList();
    int e;
    private int f;
    private SparseArray g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public bs()
    {
        f = -1;
        a = new a();
        b = new a();
        c = new a();
        e = 0;
        h = 0;
        i = 0;
        j = false;
        k = false;
        l = false;
        m = false;
    }

    static int a(bs bs1, int i1)
    {
        i1 = bs1.i + i1;
        bs1.i = i1;
        return i1;
    }

    static boolean a(bs bs1)
    {
        return bs1.m;
    }

    static boolean a(bs bs1, boolean flag)
    {
        bs1.j = flag;
        return flag;
    }

    static int b(bs bs1, int i1)
    {
        bs1.h = i1;
        return i1;
    }

    static boolean b(bs bs1)
    {
        return bs1.l;
    }

    static boolean b(bs bs1, boolean flag)
    {
        bs1.k = flag;
        return flag;
    }

    static boolean c(bs bs1)
    {
        return bs1.j;
    }

    static boolean c(bs bs1, boolean flag)
    {
        bs1.l = flag;
        return flag;
    }

    static int d(bs bs1)
    {
        bs1.i = 0;
        return 0;
    }

    static boolean d(bs bs1, boolean flag)
    {
        bs1.m = flag;
        return flag;
    }

    static boolean e(bs bs1)
    {
        return bs1.k;
    }

    static int f(bs bs1)
    {
        bs1.f = -1;
        return -1;
    }

    final void a(bv bv1)
    {
        a.remove(bv1);
        b.remove(bv1);
        if (c == null) goto _L2; else goto _L1
_L1:
        a a1;
        int i1;
        a1 = c;
        i1 = a1.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (bv1 != a1.c(i1)) goto _L5; else goto _L4
_L4:
        a1.d(i1);
_L2:
        d.remove(bv1.itemView);
        return;
_L5:
        i1--;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final void a(View view)
    {
        d.remove(view);
    }

    public final boolean a()
    {
        return k;
    }

    final void b(View view)
    {
        if (!d.contains(view))
        {
            d.add(view);
        }
    }

    public final boolean b()
    {
        return m;
    }

    public final int c()
    {
        return f;
    }

    public final boolean d()
    {
        return f != -1;
    }

    public final int e()
    {
        if (k)
        {
            return h - i;
        } else
        {
            return e;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("State{mTargetPosition=")).append(f).append(", mPreLayoutHolderMap=").append(a).append(", mPostLayoutHolderMap=").append(b).append(", mData=").append(g).append(", mItemCount=").append(e).append(", mPreviousLayoutItemCount=").append(h).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(i).append(", mStructureChanged=").append(j).append(", mInPreLayout=").append(k).append(", mRunSimpleAnimations=").append(l).append(", mRunPredictiveAnimations=").append(m).append('}').toString();
    }
}

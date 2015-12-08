// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class m
{

    ArrayMap a;
    ArrayMap b;
    ArrayMap c;
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

    static int a(m m1, int i1)
    {
        i1 = m1.i + i1;
        m1.i = i1;
        return i1;
    }

    static boolean a(i i1)
    {
        return i1.m;
    }

    static boolean a(m m1, boolean flag)
    {
        m1.j = flag;
        return flag;
    }

    static int b(j j1, int i1)
    {
        j1.h = i1;
        return i1;
    }

    static boolean b(h h1)
    {
        return h1.l;
    }

    static boolean b(l l1, boolean flag)
    {
        l1.k = flag;
        return flag;
    }

    static int c(k k1, int i1)
    {
        k1.f = i1;
        return i1;
    }

    static boolean c(f f1)
    {
        return f1.j;
    }

    static boolean c(j j1, boolean flag)
    {
        j1.l = flag;
        return flag;
    }

    static int d(l l1)
    {
        l1.i = 0;
        return 0;
    }

    static boolean d(i i1, boolean flag)
    {
        i1.m = flag;
        return flag;
    }

    static boolean e(m m1)
    {
        return m1.k;
    }

    final void a(k k1)
    {
        a.remove(k1);
        b.remove(k1);
        if (c == null) goto _L2; else goto _L1
_L1:
        ArrayMap arraymap;
        int i1;
        arraymap = c;
        i1 = arraymap.size() - 1;
_L7:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        if (k1 != arraymap.valueAt(i1)) goto _L5; else goto _L4
_L4:
        arraymap.removeAt(i1);
_L2:
        d.remove(k1.a);
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

    public ()
    {
        f = -1;
        a = new ArrayMap();
        b = new ArrayMap();
        c = new ArrayMap();
        e = 0;
        h = 0;
        i = 0;
        j = false;
        k = false;
        l = false;
        m = false;
    }
}

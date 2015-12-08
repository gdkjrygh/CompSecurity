// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class m
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

    private void a(ArrayMap arraymap, lder lder)
    {
        int i1 = arraymap.size() - 1;
        do
        {
label0:
            {
                if (i1 >= 0)
                {
                    if (lder != arraymap.c(i1))
                    {
                        break label0;
                    }
                    arraymap.d(i1);
                }
                return;
            }
            i1--;
        } while (true);
    }

    static boolean a(lder lder)
    {
        return lder.m;
    }

    static boolean a(m m1, boolean flag)
    {
        m1.j = flag;
        return flag;
    }

    static int b(j j1, int i1)
    {
        j1.i = i1;
        return i1;
    }

    static boolean b(i i1)
    {
        return i1.l;
    }

    static boolean b(l l1, boolean flag)
    {
        l1.k = flag;
        return flag;
    }

    static int c(k k1, int i1)
    {
        k1.h = i1;
        return i1;
    }

    static boolean c(h h1)
    {
        return h1.j;
    }

    static boolean c(j j1, boolean flag)
    {
        j1.l = flag;
        return flag;
    }

    static int d(l l1, int i1)
    {
        l1.f = i1;
        return i1;
    }

    static boolean d(f f1)
    {
        return f1.k;
    }

    static boolean d(k k1, boolean flag)
    {
        k1.m = flag;
        return flag;
    }

    void a(lder lder)
    {
        a.remove(lder);
        b.remove(lder);
        if (c != null)
        {
            a(c, lder);
        }
        d.remove(lder.itemView);
    }

    void a(View view)
    {
        d.remove(view);
    }

    public boolean a()
    {
        return k;
    }

    void b(View view)
    {
        if (!d.contains(view))
        {
            d.add(view);
        }
    }

    public boolean b()
    {
        return m;
    }

    public int c()
    {
        return f;
    }

    public boolean d()
    {
        return f != -1;
    }

    public int e()
    {
        if (k)
        {
            return h - i;
        } else
        {
            return e;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("State{mTargetPosition=").append(f).append(", mPreLayoutHolderMap=").append(a).append(", mPostLayoutHolderMap=").append(b).append(", mData=").append(g).append(", mItemCount=").append(e).append(", mPreviousLayoutItemCount=").append(h).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(i).append(", mStructureChanged=").append(j).append(", mInPreLayout=").append(k).append(", mRunSimpleAnimations=").append(l).append(", mRunPredictiveAnimations=").append(m).append('}').toString();
    }

    public lder()
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

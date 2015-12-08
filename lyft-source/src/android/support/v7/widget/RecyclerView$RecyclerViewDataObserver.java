// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

class <init> extends <init>
{

    final RecyclerView a;

    public void a()
    {
        a.assertNotInLayoutOrScroll(null);
        if (RecyclerView.access$2400(a).a())
        {
            a(a.mState, true);
            RecyclerView.access$3300(a);
        } else
        {
            a(a.mState, true);
            RecyclerView.access$3300(a);
        }
        if (!a.mAdapterHelper.d())
        {
            a.requestLayout();
        }
    }

    public void a(int i, int j, int k)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.a(i, j, k))
        {
            b();
        }
    }

    public void a(int i, int j, Object obj)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.a(i, j, obj))
        {
            b();
        }
    }

    void b()
    {
        if (RecyclerView.access$3400(a) && RecyclerView.access$3500(a) && RecyclerView.access$3600(a))
        {
            ViewCompat.a(a, RecyclerView.access$3700(a));
            return;
        } else
        {
            RecyclerView.access$3802(a, true);
            a.requestLayout();
            return;
        }
    }

    public void b(int i, int j)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.b(i, j))
        {
            b();
        }
    }

    public void c(int i, int j)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.c(i, j))
        {
            b();
        }
    }

    private (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    >(RecyclerView recyclerview, > >)
    {
        this(recyclerview);
    }
}

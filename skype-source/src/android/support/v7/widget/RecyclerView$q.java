// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.x;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, a

private final class <init> extends <init>
{

    final RecyclerView a;

    private void a()
    {
        if (RecyclerView.access$3400(a) && RecyclerView.access$3500(a) && RecyclerView.access$3600(a))
        {
            x.a(a, RecyclerView.access$3700(a));
            return;
        } else
        {
            RecyclerView.access$3802(a, true);
            a.requestLayout();
            return;
        }
    }

    public final void onChanged()
    {
        a.assertNotInLayoutOrScroll(null);
        if (RecyclerView.access$2400(a).hasStableIds())
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

    public final void onItemRangeChanged(int i, int j, Object obj)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.a(i, j, obj))
        {
            a();
        }
    }

    public final void onItemRangeInserted(int i, int j)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.b(i, j))
        {
            a();
        }
    }

    public final void onItemRangeMoved(int i, int j, int k)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.a(i, j, k))
        {
            a();
        }
    }

    public final void onItemRangeRemoved(int i, int j)
    {
        a.assertNotInLayoutOrScroll(null);
        if (a.mAdapterHelper.c(i, j))
        {
            a();
        }
    }

    private (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    <init>(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView

public static class it> extends it>
{

    public final void a(int i)
    {
        int j = i;
        if (i <= 0)
        {
            j = 1;
        }
        super.it>(j);
    }

    public final void a(android.support.v7.widget.Manager manager)
    {
        throw new UnsupportedOperationException("TwoWayLayoutManager has its own built-in SpanSizeLookup");
    }

    protected final int b(int i)
    {
        return Math.min(i, ((getItemCount() + b()) - 1) / b());
    }

    public final boolean c()
    {
        return true;
    }

    public boolean canScrollHorizontally()
    {
        return false;
    }

    public boolean canScrollVertically()
    {
        return false;
    }

    public View getFocusedChild()
    {
        return null;
    }

    public boolean hasFocus()
    {
        return false;
    }

    public boolean isFocused()
    {
        return false;
    }

    public void offsetChildrenHorizontal(int i)
    {
    }

    public void offsetChildrenVertical(int i)
    {
    }

    public void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        super.ItemsAdded(recyclerview, i, j);
        if (getItemCount() > 0)
        {
            scrollToPosition(0);
        }
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        super.ItemsChanged(recyclerview);
        if (getItemCount() > 0)
        {
            scrollToPosition(0);
        }
    }

    public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        super.ItemsMoved(recyclerview, i, j, k);
        if (getItemCount() > 0)
        {
            scrollToPosition(0);
        }
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        super.ItemsRemoved(recyclerview, i, j);
        if (getItemCount() > 0)
        {
            scrollToPosition(0);
            return;
        } else
        {
            requestLayout();
            return;
        }
    }

    public (Context context, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        super(context, i, j, k, l, i1, j1, k1, l1);
        super.nit>(new it>());
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.skype.android.widget.recycler.OnAnyChangeObserver;
import com.skype.android.widget.recycler.RecyclerViewUtils;

public class NonScrollingListLayout extends LinearLayout
    implements android.view.View.OnClickListener
{

    private android.support.v7.widget.RecyclerView.c a;
    private android.support.v7.widget.RecyclerView.a b;
    private android.widget.AdapterView.OnItemClickListener c;
    private View d;
    private boolean e;

    public NonScrollingListLayout(Context context)
    {
        super(context);
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        a();
    }

    public NonScrollingListLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        a();
    }

    public NonScrollingListLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        a();
    }

    private void a()
    {
        a = new OnAnyChangeObserver() {

            final NonScrollingListLayout a;

            public final void onChanged()
            {
                NonScrollingListLayout.a(a);
            }

            
            {
                a = NonScrollingListLayout.this;
                super();
            }
        };
    }

    static void a(NonScrollingListLayout nonscrollinglistlayout)
    {
        nonscrollinglistlayout.b();
    }

    private void b()
    {
        int k = getChildCount();
        if (b.getItemCount() != 0) goto _L2; else goto _L1
_L1:
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view != d)
            {
                removeView(view);
            }
        }

        if (d != null && !e)
        {
            e = true;
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)d.getLayoutParams();
            addView(d, layoutparams);
        }
_L4:
        return;
_L2:
        int j = k;
        if (e)
        {
            removeView(d);
            j = getChildCount();
            e = false;
        }
        int l = b.getItemCount();
        k = 0;
        while (k < l) 
        {
            View view1;
            if (k < j)
            {
                view1 = getChildAt(k);
            } else
            {
                view1 = RecyclerViewUtils.a(b, k, this);
            }
            view1.setId(k);
            if (c != null)
            {
                view1.setOnClickListener(this);
                view1.setClickable(true);
            } else
            {
                view1.setClickable(false);
            }
            if (k >= j)
            {
                addView(view1);
            }
            k++;
        }
        if (j > l)
        {
            j--;
            while (j >= l) 
            {
                removeViewAt(j);
                j--;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (b != null && c != null && b.getItemCount() > view.getId())
        {
            c.onItemClick(null, view, view.getId(), view.getId());
        }
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.a a1)
    {
        if (b != null)
        {
            b.unregisterAdapterDataObserver(a);
        }
        b = a1;
        b.registerAdapterDataObserver(a);
        b();
    }

    public void setEmptyView(View view)
    {
        d = view;
    }

    public void setItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        c = onitemclicklistener;
        if (b != null)
        {
            b();
        }
    }
}

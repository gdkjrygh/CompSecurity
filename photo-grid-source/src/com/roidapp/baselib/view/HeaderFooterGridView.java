// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.baselib.view:
//            p, n, o

public class HeaderFooterGridView extends GridView
{

    private ArrayList a;
    private ArrayList b;
    private int c;

    public HeaderFooterGridView(Context context)
    {
        super(context);
        a = new ArrayList();
        b = new ArrayList();
    }

    public HeaderFooterGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = new ArrayList();
    }

    public HeaderFooterGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
        b = new ArrayList();
    }

    public final int a()
    {
        return a.size();
    }

    public final void a(View view)
    {
        ListAdapter listadapter = getAdapter();
        if (listadapter != null && !(listadapter instanceof p))
        {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        n n1 = new n((byte)0);
        o o1 = new o(this, getContext());
        o1.addView(view);
        n1.a = view;
        n1.b = o1;
        n1.c = null;
        n1.d = true;
        a.add(n1);
        if (listadapter != null)
        {
            ((p)listadapter).a();
        }
    }

    public int getNumColumns()
    {
        return c;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (a.size() > 0 || b.size() > 0)
        {
            listadapter = new p(a, b, listadapter);
            int i = getNumColumns();
            if (i > 1)
            {
                listadapter.a(i);
            }
            super.setAdapter(listadapter);
            return;
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setNumColumns(int i)
    {
        super.setNumColumns(i);
        c = i;
    }
}

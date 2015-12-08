// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

// Referenced classes of package com.roidapp.photogrid.video:
//            d

public class HorizontalViewEx extends LinearLayout
    implements android.view.View.OnClickListener, d
{

    private BaseAdapter a;
    private android.widget.AdapterView.OnItemClickListener b;
    private SparseArray c;

    public HorizontalViewEx(Context context)
    {
        super(context);
        a = null;
        b = null;
        c = null;
    }

    public HorizontalViewEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = null;
    }

    public HorizontalViewEx(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        b = null;
        c = null;
    }

    public final void a()
    {
        removeAllViews();
        if (c != null)
        {
            c.clear();
            c = null;
        }
    }

    public final void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        b = onitemclicklistener;
    }

    public final void a(BaseAdapter baseadapter)
    {
        a = baseadapter;
        removeAllViews();
        if (c != null)
        {
            c.clear();
            c = null;
        }
        c = new SparseArray();
        if (a != null)
        {
            int i = 0;
            int j;
            int k;
            for (j = 0; i < a.getCount(); j = k)
            {
                baseadapter = a.getView(i, null, null);
                k = j;
                if (baseadapter != null)
                {
                    baseadapter.setOnClickListener(this);
                    c.put(i, baseadapter);
                    addView(baseadapter, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
                    k = j + 1;
                }
                i++;
            }

            setWeightSum(j);
        }
    }

    public void onClick(View view)
    {
        if (c == null || b == null)
        {
            return;
        } else
        {
            b.onItemClick(null, view, c.indexOfValue(view), view.getId());
            return;
        }
    }
}

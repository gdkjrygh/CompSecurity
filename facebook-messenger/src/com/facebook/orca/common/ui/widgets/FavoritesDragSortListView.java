// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.q;
import com.facebook.widget.listview.d;

// Referenced classes of package com.facebook.orca.common.ui.widgets:
//            e

public class FavoritesDragSortListView extends d
{

    private int d;
    private int e;

    public FavoritesDragSortListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FavoritesDragSortListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = -1;
        e = -1;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, q.FavoritesDragSortListView, 0, 0);
            d = context.getResourceId(q.FavoritesDragSortListView_top_divider, -1);
            e = context.getResourceId(q.FavoritesDragSortListView_bottom_divider, -1);
            context.recycle();
        }
    }

    protected void a(View view)
    {
        if (b(view))
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            layoutparams.height = a;
            view.setVisibility(0);
            view.setLayoutParams(layoutparams);
            view.setVisibility(0);
            a(view, d, 4);
            a(view, e, 0);
        }
    }

    protected void a(View view, int i, int j, int k)
    {
        if (b(view))
        {
            e e1 = (e)view;
            Object obj = view.getLayoutParams();
            obj.height = i;
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            view.setVisibility(k);
            obj = new android.widget.FrameLayout.LayoutParams(-1, a, j);
            e1.getInnerRow().setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            if (i == b)
            {
                if (j == 48)
                {
                    a(view, e, 0);
                    a(view, d, 4);
                    a(view, e, 0);
                    a(view, d, 0);
                }
            } else
            {
                a(view, d, 4);
            }
            if (i != a || k != 0)
            {
                com.facebook.orca.common.ui.widgets.e.a(e1, false);
            }
        }
    }

    protected boolean b(View view)
    {
        return view.findViewById(c) != null;
    }
}

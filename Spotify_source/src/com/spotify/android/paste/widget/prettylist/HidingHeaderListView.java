// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.prettylist;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HidingHeaderListView extends ListView
{

    boolean a;
    private View b;
    private android.widget.AbsListView.LayoutParams c;
    private DataSetObserver d = new DataSetObserver() {

        private HidingHeaderListView a;

        public final void onChanged()
        {
            if (HidingHeaderListView.a(a))
            {
                a.requestLayout();
            }
        }

        public final void onInvalidated()
        {
            if (HidingHeaderListView.a(a))
            {
                a.requestLayout();
            }
        }

            
            {
                a = HidingHeaderListView.this;
                super();
            }
    };

    public HidingHeaderListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public HidingHeaderListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new android.widget.AbsListView.LayoutParams(-1, 0);
        b = new View(context);
        b.setLayoutParams(c);
    }

    static boolean a(HidingHeaderListView hidingheaderlistview)
    {
        return hidingheaderlistview.a;
    }

    private boolean b()
    {
        while (getAdapter().getCount() <= 2 || getFirstVisiblePosition() > 1 || 1 > getLastVisiblePosition()) 
        {
            return false;
        }
        return true;
    }

    private boolean c()
    {
        for (int i = getAdapter().getCount() - 2; i <= 0 || getFirstVisiblePosition() > i || i > getLastVisiblePosition();)
        {
            return false;
        }

        return true;
    }

    private boolean d()
    {
        return getAdapter().getCount() == 2;
    }

    private boolean e()
    {
        return getLastVisiblePosition() == getAdapter().getCount() - 1;
    }

    private int f()
    {
        int j = super.getChildCount();
        int i = j;
        if (getChildAt(j - 1) == b)
        {
            i = j - 1;
        }
        return i;
    }

    private View g()
    {
        return getChildAt(f() - 1);
    }

    public final void a()
    {
        a = false;
    }

    protected void layoutChildren()
    {
        int j = 1;
        if (a && getAdapter() != null && getAdapter().getCount() >= 2) goto _L2; else goto _L1
_L1:
        c.height = 0;
        super.layoutChildren();
_L10:
        return;
_L2:
        boolean flag;
        boolean flag1;
        int i;
        boolean flag2;
        boolean flag3;
        if (getFirstVisiblePosition() > 0 && d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.height = getHeight();
        super.layoutChildren();
        if (!b() && (c() || e()) && !d())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            setSelectionFromTop(1, 0);
            super.layoutChildren();
        }
        View view;
        int k;
        int l;
        int i1;
        if (f() > 0)
        {
            i = g().getBottom();
        } else
        {
            i = 0;
        }
        flag2 = b();
        flag3 = c();
        if (flag2 && flag3 || d()) goto _L4; else goto _L3
_L3:
        j = 0;
_L6:
        c.height = j;
        if (e() && !flag && !flag1)
        {
            b.layout(getLeft(), i, getRight(), j + i);
        }
        if (flag)
        {
            setSelectionFromTop(0, -getChildAt(0).getHeight());
            super.layoutChildren();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        k = getHeight();
        l = getPaddingTop();
        i1 = getPaddingBottom();
        if (!d())
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L7:
        j = k - l - i1 - j;
        if (true) goto _L6; else goto _L5
_L5:
        if (getFirstVisiblePosition() != 0)
        {
            j = 0;
        }
        view = getChildAt(j);
        j = g().getBottom() - view.getTop();
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
        if (!flag1) goto _L10; else goto _L9
_L9:
        setSelectionFromTop(getAdapter().getCount() - 2, 0);
        super.layoutChildren();
        return;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        ListAdapter listadapter1 = getAdapter();
        if (listadapter1 == null)
        {
            addFooterView(b, null, false);
        } else
        {
            listadapter1.unregisterDataSetObserver(d);
        }
        if (listadapter != null)
        {
            listadapter.registerDataSetObserver(d);
        }
        super.setAdapter(listadapter);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.HashSet;
import java.util.Set;

public class DragListView extends ListView
    implements android.view.View.OnDragListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemLongClickListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(android.view.View.DragShadowBuilder dragshadowbuilder);

        public abstract boolean a(int i, int j);
    }


    private a a;
    private boolean b;
    private int c;
    private int d;
    private Set e;

    public DragListView(Context context)
    {
        super(context);
        c = 0;
        d = 0;
        c();
    }

    public DragListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        d = 0;
        c();
    }

    public DragListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = 0;
        d = 0;
        c();
    }

    private int a(View view, DragEvent dragevent)
    {
        int i;
        int j;
        view = getChildAt(0);
        i = view.getHeight() + view.getTop() + getTop();
        j = (int)dragevent.getY() + d;
        if (j < i)
        {
            j = getFirstVisiblePosition();
        } else
        {
            j = (j - i) / view.getHeight() + getFirstVisiblePosition() + 1;
        }
        if (j <= c) goto _L2; else goto _L1
_L1:
        i = c + 1;
_L4:
        j = i;
        if (i - getFirstVisiblePosition() >= getChildCount())
        {
            j = getChildCount() - 1;
        }
        return j;
_L2:
        i = j;
        if (j < c)
        {
            i = c - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        e = new HashSet();
        setOnDragListener(this);
        setOnScrollListener(this);
        setOnItemLongClickListener(this);
    }

    public void a()
    {
        e.clear();
    }

    public void a(int i)
    {
        e.add(Integer.valueOf(i));
    }

    public void a(a a1)
    {
        a = a1;
    }

    public int b()
    {
        return c;
    }

    public void b(int i)
    {
        d = i;
    }

    public boolean onDrag(View view, DragEvent dragevent)
    {
        dragevent.getAction();
        JVM INSTR tableswitch 2 4: default 32
    //                   2 34
    //                   3 32
    //                   4 171;
           goto _L1 _L2 _L1 _L3
_L1:
        return true;
_L2:
        int i = a(view, dragevent);
        int j;
        int k;
        int l;
        int i1;
        boolean flag;
        if (a != null)
        {
            flag = a.a(c, i);
        } else
        {
            flag = true;
        }
        if (flag)
        {
            c = i;
        }
        i = getFirstVisiblePosition();
        j = getLastVisiblePosition();
        k = getChildAt(0).getHeight();
        l = getTop();
        i1 = getBottom();
        if (!b)
        {
            float f = dragevent.getY() + (float)d;
            if (f >= (float)(i1 - k))
            {
                smoothScrollToPosition(j + 1);
                return true;
            }
            if (f <= (float)(l + k))
            {
                smoothScrollToPosition(i - 1);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        view.post(new Runnable((View)dragevent.getLocalState()) {

            final View a;
            final DragListView b;

            public void run()
            {
                a.setVisibility(0);
            }

            
            {
                b = DragListView.this;
                a = view;
                super();
            }
        });
        if (a != null)
        {
            a.a();
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        if (e.contains(Integer.valueOf(i)))
        {
            return false;
        }
        adapterview = new android.view.View.DragShadowBuilder(view);
        if (a != null)
        {
            a.a(adapterview);
        }
        c = i;
        view.startDrag(null, adapterview, view, 0);
        view.setVisibility(4);
        return true;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 0)
        {
            b = false;
            return;
        } else
        {
            b = true;
            return;
        }
    }
}

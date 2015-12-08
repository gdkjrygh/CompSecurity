// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

public class HideableHeadersListView extends ListView
{

    private LinearLayout a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public HideableHeadersListView(Context context)
    {
        super(context);
        a(context);
    }

    public HideableHeadersListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
        a = new LinearLayout(context);
        a.setOrientation(1);
        a.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
    }

    public final void a()
    {
        e = true;
        d = true;
        requestLayout();
    }

    public final void a(View view)
    {
        b = false;
        removeHeaderView(view);
        a.removeView(view);
        c = false;
    }

    public final void b(View view)
    {
        if (!b)
        {
            addHeaderView(a, null, true);
            b = true;
        }
        a.addView(view);
        view.setVisibility(8);
        c = true;
    }

    protected void layoutChildren()
    {
        super.layoutChildren();
        if (c)
        {
            int i = getCount();
            int k = getFirstVisiblePosition();
            if (i - 1 > getLastVisiblePosition() - k || e)
            {
                int l = a.getChildCount();
                for (int j = 0; j < l; j++)
                {
                    a.getChildAt(j).setVisibility(0);
                }

                if (!d && !g && (!f || k <= 0))
                {
                    setSelectionFromTop(1, 0);
                }
                super.layoutChildren();
                c = false;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        f = true;
        super.onRestoreInstanceState(parcelable);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        g = true;
        return super.onTouchEvent(motionevent);
    }

    public void setSelection(int i)
    {
        if (i != 0)
        {
            d = true;
        }
        super.setSelection(i);
    }

    public void setSelectionAfterHeaderView()
    {
        d = true;
        super.setSelectionAfterHeaderView();
    }

    public void setSelectionFromTop(int i, int j)
    {
        if (i != 0)
        {
            d = true;
        }
        super.setSelectionFromTop(i, j);
    }

    public void smoothScrollBy(int i, int j)
    {
        if (i != 0)
        {
            d = true;
        }
        super.smoothScrollBy(i, j);
    }

    public void smoothScrollToPosition(int i)
    {
        if (i != 0)
        {
            d = true;
        }
        super.smoothScrollToPosition(i);
    }

    public void smoothScrollToPosition(int i, int j)
    {
        if (i != 0)
        {
            d = true;
        }
        super.smoothScrollToPosition(i, j);
    }
}

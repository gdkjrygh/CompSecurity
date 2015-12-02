// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.q;
import com.facebook.reflex.view.h;
import com.facebook.widget.refreshablelistview.b;
import com.facebook.widget.refreshablelistview.c;

public class a extends FrameLayout
    implements b
{

    b a;
    private final int b;

    public a(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, q.RefreshableListViewContainer);
        b = (int)context.getDimension(q.RefreshableListViewContainer_overflowAndListOverlap, 0.0F);
        context.recycle();
    }

    public void a()
    {
        a.a();
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (view instanceof h)
        {
            h h1 = (h)view;
            h1.setOverflowListOverlap(b);
            a = h1.getRefreshableInterface();
            super.addView(view, layoutparams);
        }
    }

    public void b()
    {
        a.b();
    }

    public void setLastLoadedTime(long l)
    {
        a.setLastLoadedTime(l);
    }

    public void setOnRefreshListener(c c)
    {
        a.setOnRefreshListener(c);
    }
}

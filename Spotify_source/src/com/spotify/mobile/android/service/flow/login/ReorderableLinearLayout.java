// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ctz;

public class ReorderableLinearLayout extends LinearLayout
{

    public View a;
    public View b;
    private final Rect c;
    private final Rect d;
    private boolean e;

    public ReorderableLinearLayout(Context context)
    {
        super(context);
        c = new Rect();
        d = new Rect();
    }

    public ReorderableLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Rect();
        d = new Rect();
    }

    public ReorderableLinearLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new Rect();
        d = new Rect();
    }

    private void a(View view, int i)
    {
        addViewInLayout(view, Math.max(0, Math.min(i, getChildCount())), view.getLayoutParams());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag2 = false;
        if (!e)
        {
            boolean flag1 = flag2;
            if (a != null)
            {
                flag1 = flag2;
                if (b != null)
                {
                    getRootView().getHitRect(c);
                    getHitRect(d);
                    flag1 = flag2;
                    if (!c.contains(d))
                    {
                        flag1 = true;
                    }
                }
            }
            if (flag1)
            {
                View view = (View)ctz.a(a);
                View view1 = (View)ctz.a(b);
                int i1 = indexOfChild(view);
                int j1 = indexOfChild(view1);
                removeViewInLayout(view);
                removeViewInLayout(view1);
                a(view1, i1);
                a(view, j1);
                e = true;
            }
        }
        super.onLayout(flag, i, j, k, l);
    }
}

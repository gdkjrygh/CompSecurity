// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.q;

public class k extends android.widget.FrameLayout.LayoutParams
{

    public boolean a;
    public int b;
    public int c;

    public k(int i, int j)
    {
        super(i, j);
    }

    public k(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, q.OverlayLayout_Layout);
        a = context.getBoolean(q.OverlayLayout_Layout_layout_isOverlay, false);
        b = context.getResourceId(q.OverlayLayout_Layout_layout_anchoredTo, 0);
        c = context.getInt(q.OverlayLayout_Layout_layout_anchorPosition, 129);
        context.recycle();
    }

    public k(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
    }
}

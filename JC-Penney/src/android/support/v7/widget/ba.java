// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.util.AttributeSet;

public class ba extends b
{

    int b;

    public ba(int i, int j)
    {
        super(i, j);
        b = 0;
        a = 0x800013;
    }

    public ba(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
    }

    public ba(b b1)
    {
        super(b1);
        b = 0;
    }

    public ba(ba ba1)
    {
        super(ba1);
        b = 0;
        b = ba1.b;
    }

    public ba(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        b = 0;
    }

    public ba(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        b = 0;
        a(marginlayoutparams);
    }

    void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        leftMargin = marginlayoutparams.leftMargin;
        topMargin = marginlayoutparams.topMargin;
        rightMargin = marginlayoutparams.rightMargin;
        bottomMargin = marginlayoutparams.bottomMargin;
    }
}

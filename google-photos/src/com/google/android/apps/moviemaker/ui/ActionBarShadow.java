// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import b;

public class ActionBarShadow extends View
{

    public ActionBarShadow(Context context)
    {
        super(context);
        a();
    }

    public ActionBarShadow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public ActionBarShadow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        setBackground(getResources().getDrawable(b.fh));
        setAlpha(0.0F);
    }

    protected void onMeasure(int i, int j)
    {
        int l = getBackground().getIntrinsicHeight();
        int i1 = android.view.View.MeasureSpec.getMode(j);
        int k = l;
        switch (i1)
        {
        default:
            super.onMeasure(i, j);
            return;

        case -2147483648: 
            k = Math.min(l, android.view.View.MeasureSpec.getSize(j));
            // fall through

        case 0: // '\0'
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(k, i1));
            break;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.dynamicwidth;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.apps.wallet.widgets.dynamicwidth:
//            SpaceAdder

public class DynamicWidthFrameLayout extends FrameLayout
{

    private final int initialPaddingLeft = getPaddingLeft();
    private final int initialPaddingRight = getPaddingRight();
    private boolean limitMaxWidth;

    public DynamicWidthFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        limitMaxWidth = true;
        SpaceAdder.padIfNecessary(this);
    }

    public final void limitMaximumWidth(boolean flag)
    {
        limitMaxWidth = flag;
        requestLayout();
    }

    protected void onMeasure(int i, int j)
    {
        if (limitMaxWidth)
        {
            SpaceAdder.padIfNecessary(this);
        } else
        {
            setPadding(initialPaddingLeft, getPaddingTop(), initialPaddingRight, getPaddingBottom());
        }
        super.onMeasure(i, j);
    }
}

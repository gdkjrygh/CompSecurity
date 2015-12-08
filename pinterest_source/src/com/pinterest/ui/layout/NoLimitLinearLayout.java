// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class NoLimitLinearLayout extends LinearLayout
{

    public NoLimitLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(0, 0);
    }
}

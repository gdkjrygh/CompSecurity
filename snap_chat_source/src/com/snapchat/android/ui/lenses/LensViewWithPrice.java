// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.lenses;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class LensViewWithPrice extends RelativeLayout
{

    public LensViewWithPrice(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public LensViewWithPrice(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void dispatchSetSelected(boolean flag)
    {
        super.dispatchSetSelected(flag);
        View view = findViewById(0x7f0d0323);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }
}

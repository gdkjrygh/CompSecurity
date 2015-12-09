// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ActivatableRelativeLayout extends RelativeLayout
{

    private static final int b[] = {
        0x10100a2
    };
    public boolean a;

    public ActivatableRelativeLayout(Context context)
    {
        super(context);
    }

    public ActivatableRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ActivatableRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (a)
        {
            mergeDrawableStates(ai, b);
        }
        return ai;
    }

}

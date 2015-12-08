// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.google.android.apps.translate.widget:
//            TintImageView

public class ToggleImage extends TintImageView
{

    private static final int b[] = {
        0x10100a0
    };
    private static final int c[] = {
        0x10100a4
    };
    public boolean a;
    private boolean d;

    public ToggleImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (a)
        {
            mergeDrawableStates(ai, b);
        } else
        if (d)
        {
            mergeDrawableStates(ai, c);
            return ai;
        }
        return ai;
    }

    public void setChecked(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            refreshDrawableState();
        }
    }

    public void setFirst(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            refreshDrawableState();
        }
    }

}

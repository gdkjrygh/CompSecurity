// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

public class SegmentedRadioGroup extends RadioGroup
{

    public SegmentedRadioGroup(Context context)
    {
        super(context);
    }

    public SegmentedRadioGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void changeButtonsImages()
    {
        int j = super.getChildCount();
        if (j <= 1) goto _L2; else goto _L1
_L1:
        int i;
        super.getChildAt(0).setBackgroundResource(0x7f020092);
        i = 1;
_L8:
        if (i < j - 1) goto _L4; else goto _L3
_L3:
        super.getChildAt(j - 1).setBackgroundResource(0x7f020092);
_L6:
        return;
_L4:
        super.getChildAt(i).setBackgroundResource(0x7f020092);
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j != 1) goto _L6; else goto _L5
_L5:
        super.getChildAt(0).setBackgroundResource(0x7f020092);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
    }
}

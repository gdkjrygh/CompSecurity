// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RadioButton;

public class InertRadioButton extends RadioButton
{

    public InertRadioButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }
}

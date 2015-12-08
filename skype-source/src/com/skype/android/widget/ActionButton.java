// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class ActionButton extends ImageButton
{

    public ActionButton(Context context)
    {
        super(context, null, 0x10102d8);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }

    public ActionButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0x10102d8);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
    }
}

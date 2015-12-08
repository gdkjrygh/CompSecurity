// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.ad;

public class CustomSwitch extends SwitchCompat
{

    public CustomSwitch(Context context)
    {
        super(context);
    }

    public CustomSwitch(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            ad.a(this, context, CustomFont.a(context, attributeset));
        }
    }
}

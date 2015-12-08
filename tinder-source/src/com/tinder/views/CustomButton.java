// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.tinder.utils.CustomFont;
import com.tinder.utils.ad;

public class CustomButton extends AppCompatButton
{

    public CustomButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ad.a(this, context, CustomFont.a(context, attributeset));
    }
}

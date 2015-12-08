// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.EnterpriseMobileBanking.AppHelper;

public class CapitalOneButton extends Button
{

    public CapitalOneButton(Context context)
    {
        super(context);
        setupFont();
    }

    public CapitalOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setupFont();
    }

    public CapitalOneButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setupFont();
    }

    private void setupFont()
    {
        setTypeface(AppHelper.getTypeface());
    }
}

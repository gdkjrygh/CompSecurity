// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

public class ProductSpinner extends Spinner
{

    public ProductSpinner(Context context)
    {
        super(context);
    }

    public ProductSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ProductSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void dismiss()
    {
        onDetachedFromWindow();
    }
}

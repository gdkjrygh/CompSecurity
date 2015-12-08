// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.microsoft.onlineid.internal.ui.e;

public class StyledButton extends Button
{

    public StyledButton(Context context)
    {
        super(context);
        a(context);
    }

    public StyledButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public StyledButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        if (!isInEditMode())
        {
            setTypeface(e.c.a(context));
        }
    }
}

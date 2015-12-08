// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.util.AttributeSet;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.ui.c;

public class WaterEditText extends DecimalEditText
{
    public static interface a
    {

        public abstract void a();
    }


    a a;

    public WaterEditText(Context context)
    {
        super(context);
    /* block-local class not found */
    class b {}

        addTextChangedListener(new b(null));
    }

    public WaterEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        addTextChangedListener(new b(null));
    }

    public WaterEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        addTextChangedListener(new b(null));
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void a(CharSequence charsequence)
    {
        a(true);
        setKeyListener(null);
        append((new StringBuilder()).append(" + ").append(charsequence).toString());
        a(false);
        setKeyListener(new c());
    }
}

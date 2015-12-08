// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import brt;
import cpk;
import cpl;
import cpu;

public final class PlusOneButton extends FrameLayout
{

    private View a;
    private int b;
    private int c;
    private cpl d;

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        String s = brt.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, "PlusOneButton");
        int i;
        if ("SMALL".equalsIgnoreCase(s))
        {
            i = 0;
        } else
        if ("MEDIUM".equalsIgnoreCase(s))
        {
            i = 1;
        } else
        if ("TALL".equalsIgnoreCase(s))
        {
            i = 2;
        } else
        {
            i = 3;
        }
        b = i;
        context = brt.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, "PlusOneButton");
        if (!"INLINE".equalsIgnoreCase(context))
        {
            "NONE".equalsIgnoreCase(context);
        }
        c = -1;
        context = getContext();
        if (a != null)
        {
            removeView(a);
        }
        a = cpu.a(context, b);
        context = d;
        d = context;
        a.setOnClickListener(new cpk(this, context));
        addView(a);
        if (!isInEditMode());
    }

    public static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.a;
    }

    public static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.c;
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(0, 0, k - i, l - j);
    }

    protected final void onMeasure(int i, int j)
    {
        View view = a;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}

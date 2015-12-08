// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.ProgressBar;
import daf;
import dah;

public class ProgressSpinner extends ProgressBar
{

    public static final Property a = new daf(java/lang/Float, "showingness");
    public float b;
    private int c;

    public ProgressSpinner(Context context)
    {
        super(context);
        a();
    }

    public ProgressSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public ProgressSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    public static float a(ProgressSpinner progressspinner)
    {
        return progressspinner.b;
    }

    public static int a(ProgressSpinner progressspinner, int i)
    {
        progressspinner.c = i;
        return i;
    }

    private void a()
    {
        setIndeterminateDrawable(new dah(this));
    }

    public static int b(ProgressSpinner progressspinner)
    {
        return progressspinner.c;
    }

}

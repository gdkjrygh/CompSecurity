// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.widget.Button;
import com.facebook.a.a;

public abstract class j extends Button
{

    private String a;
    private android.view.View.OnClickListener b;

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        com.facebook.a.a.c(getContext()).b(a, null);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        b = onclicklistener;
    }
}

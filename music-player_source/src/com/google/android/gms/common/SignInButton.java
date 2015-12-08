// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.a.i;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.gt;
import com.google.android.gms.internal.gu;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    private int a;
    private int b;
    private View c;
    private android.view.View.OnClickListener d;

    public SignInButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignInButton(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        d = null;
        gt.a(true, "Unknown button size 0");
        gt.a(true, "Unknown color scheme 0");
        a = 0;
        b = 0;
        context = getContext();
        if (c != null)
        {
            removeView(c);
        }
        try
        {
            c = gu.a(context, a, b);
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            j = a;
            int k = b;
            attributeset = new et(context);
            attributeset.a(context.getResources(), j, k);
            c = attributeset;
        }
        addView(c);
        c.setEnabled(isEnabled());
        c.setOnClickListener(this);
    }

    public final void onClick(View view)
    {
        if (d != null && view == c)
        {
            d.onClick(this);
        }
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setEnabled(flag);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
        if (c != null)
        {
            c.setOnClickListener(this);
        }
    }
}

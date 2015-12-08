// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.b.f;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.zzab;

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

    public SignInButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = null;
        bl.a(true, "Unknown button size %d", new Object[] {
            Integer.valueOf(0)
        });
        bl.a(true, "Unknown color scheme %s", new Object[] {
            Integer.valueOf(0)
        });
        a = 0;
        b = 0;
        context = getContext();
        if (c != null)
        {
            removeView(c);
        }
        try
        {
            c = com.google.android.gms.common.internal.c.a(context, a, b);
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            i = a;
            int j = b;
            attributeset = new zzab(context);
            attributeset.a(context.getResources(), i, j);
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import brr;
import com.google.android.gms.common.internal.zzab;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    private View a;
    private android.view.View.OnClickListener b;

    public SignInButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignInButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = null;
        context = getContext();
        if (a != null)
        {
            removeView(a);
        }
        try
        {
            a = brr.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            attributeset = new zzab(context);
            context = context.getResources();
            attributeset.setTypeface(Typeface.DEFAULT_BOLD);
            attributeset.setTextSize(14F);
            float f = context.getDisplayMetrics().density;
            attributeset.setMinHeight((int)(f * 48F + 0.5F));
            attributeset.setMinWidth((int)(f * 48F + 0.5F));
            i = zzab.a(0x7f02017c);
            if (i == -1)
            {
                throw new IllegalStateException("Could not find background resource!");
            }
            attributeset.setBackgroundDrawable(context.getDrawable(i));
            attributeset.setTextColor(context.getColorStateList(zzab.a(0x7f0f0177)));
            attributeset.setText(context.getString(0x7f08062b));
            a = attributeset;
        }
        addView(a);
        a.setEnabled(isEnabled());
        a.setOnClickListener(this);
    }

    public final void onClick(View view)
    {
        if (b != null && view == a)
        {
            b.onClick(this);
        }
    }

    public final void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a.setEnabled(flag);
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        b = onclicklistener;
        if (a != null)
        {
            a.setOnClickListener(this);
        }
    }
}

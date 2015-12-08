// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import b;
import c;
import njk;
import oiz;
import p;

public final class CurrentAccountBannerView extends LinearLayout
    implements oiz
{

    public TextView a;
    public TextView b;
    public String c;
    public boolean d;
    public boolean e;

    public CurrentAccountBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CurrentAccountBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static String a(CurrentAccountBannerView currentaccountbannerview)
    {
        return currentaccountbannerview.c;
    }

    public static String a(CurrentAccountBannerView currentaccountbannerview, String s)
    {
        currentaccountbannerview.c = null;
        return null;
    }

    public final void ax_()
    {
        c = null;
        e = false;
    }

    public void b()
    {
        if (c.b(getContext()))
        {
            return;
        } else
        {
            b.a(new njk(this), 2000L);
            return;
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        d = true;
        if (e)
        {
            e = false;
            if (c != null)
            {
                b();
            }
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d = false;
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(p.bI);
        b = (TextView)findViewById(p.bH);
    }
}

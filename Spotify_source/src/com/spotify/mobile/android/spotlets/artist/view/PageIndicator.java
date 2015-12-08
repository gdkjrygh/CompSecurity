// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.TextView;
import dgd;
import gcg;
import jz;
import lu;

public class PageIndicator extends TextView
    implements lu
{

    public ViewPager a;

    public PageIndicator(Context context)
    {
        super(context);
        b();
    }

    public PageIndicator(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b();
    }

    private void b()
    {
        setTextColor(gcg.b(getContext(), 0x7f0f007e));
        setTypeface(dgd.a(getContext(), null, 0x1010084));
    }

    public final void a()
    {
        int i = a.a().b();
        if (i > 0)
        {
            setText((new StringBuilder()).append(a.b() + 1).append(" / ").append(i).toString());
            return;
        } else
        {
            setText("");
            return;
        }
    }

    public final void a(int i)
    {
        a();
    }

    public final void a(int i, float f, int j)
    {
    }

    public final void b(int i)
    {
        a();
    }
}

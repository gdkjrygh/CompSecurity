// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.common.collect.Lists;
import dcw;
import dcx;
import dht;
import java.util.List;

public class CardRow extends LinearLayout
{

    public final List a;
    public boolean b;
    public int c;
    private dht d;

    public CardRow(Context context, int i, android.view.View.OnClickListener onclicklistener)
    {
        super(context);
        setOrientation(0);
        c = context.getResources().getDimensionPixelSize(0x7f0c008b);
        setPadding(c, 0, c, c);
        a = Lists.a(i);
        for (int j = 0; j < i; j++)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1);
            layoutparams.weight = 1.0F;
            if (j < i - 1)
            {
                layoutparams.rightMargin = c;
            }
            dcw dcw1 = dcx.b(context);
            dcw1.a().setLayoutParams(layoutparams);
            dcw1.a().setOnClickListener(onclicklistener);
            addView(dcw1.a());
            a.add(dcw1);
        }

        d = new dht(getContext());
    }

    public CardRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        throw new UnsupportedOperationException("This class should be used only from code");
    }

    public CardRow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        throw new UnsupportedOperationException("This class should be used only from code");
    }

    public static int a(int i, int j)
    {
        int k = i / j;
        if (i % j == 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        return i + k;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b)
        {
            d.a(canvas, getWidth(), getHeight());
        }
    }
}

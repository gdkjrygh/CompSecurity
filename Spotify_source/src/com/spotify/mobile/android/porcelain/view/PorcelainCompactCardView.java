// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SpotifyIconView;
import dgo;
import dgp;
import dta;
import dtc;
import dte;

public class PorcelainCompactCardView extends dta
{

    public SpotifyIcon a;
    public final SpotifyIconView b;
    public final ImageView c;
    private final TextView d;
    private final View e;
    private final int f;
    private boolean g;

    public PorcelainCompactCardView(Context context)
    {
        this(context, ((dtc) (new dte())));
    }

    public PorcelainCompactCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, ((dtc) (new dte())));
    }

    private PorcelainCompactCardView(Context context, AttributeSet attributeset, dtc dtc)
    {
        super(context, attributeset, dtc);
        c = new ImageView(context);
        c.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        c.setDuplicateParentStateEnabled(true);
        addView(c, -1, -1);
        b = (SpotifyIconView)inflate(context, 0x7f03011f, null);
        b.setVisibility(8);
        b.setDuplicateParentStateEnabled(true);
        addView(b, -1, -1);
        d = dgp.a(context, null);
        d.setMaxLines(2);
        a();
        f = (int)TypedValue.applyDimension(1, 10F, context.getResources().getDisplayMetrics());
        d.setDuplicateParentStateEnabled(true);
        addView(d, -1, -1);
        e = new View(context);
        e.setVisibility(8);
        e.setBackgroundResource(0x7f0200c8);
        e.setDuplicateParentStateEnabled(true);
        addView(e, -1, -1);
        a(true);
    }

    public PorcelainCompactCardView(Context context, dtc dtc)
    {
        this(context, null, dtc);
    }

    private void a()
    {
        int i;
        if (b())
        {
            i = 0x7f0101de;
            d.setGravity(17);
        } else
        {
            i = 0x7f0101d6;
            d.setGravity(49);
        }
        dgo.b(d.getContext(), d, i);
    }

    private boolean b()
    {
        return a == null && g;
    }

    public final void a(CharSequence charsequence)
    {
        d.setText(charsequence);
    }

    public final void a(boolean flag)
    {
        g = flag;
        a();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = getPaddingLeft();
        int j1 = getPaddingTop();
        i = k - i - getPaddingRight();
        j = l - j - getPaddingBottom();
        k = (i - i1) / 2;
        l = (j - j1) / 2;
        int k1 = (int)((float)(j - j1) * 0.66F) + j1;
        int l1 = f;
        int i2 = f;
        c.layout(i1, j1, i, j);
        e.layout(i1, j1, i, j);
        b.layout(k - b.getMeasuredWidth() / 2, k1 - b.getMeasuredHeight(), b.getMeasuredWidth() / 2 + k, k1);
        if (b())
        {
            d.layout(k - d.getMeasuredWidth() / 2, l - d.getMeasuredHeight() / 2, d.getMeasuredWidth() / 2 + k, d.getMeasuredHeight() / 2 + l);
            return;
        } else
        {
            d.layout(l1 + i1, j - d.getMeasuredHeight(), i - i2, j);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        j = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
        i = getMeasuredHeight() - getPaddingBottom() - getPaddingTop();
        int k = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        c.measure(k, l);
        e.measure(k, l);
        j = android.view.View.MeasureSpec.makeMeasureSpec(j - (f << 1), 0x40000000);
        i = android.view.View.MeasureSpec.makeMeasureSpec(i / 3, 0x40000000);
        d.measure(j, i);
        i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j = android.view.View.MeasureSpec.makeMeasureSpec((int)((float)getMeasuredHeight() * 0.4F), 0x40000000);
        b.measure(i, j);
    }

    public void setPressed(boolean flag)
    {
        View view = e;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        super.setPressed(flag);
    }
}

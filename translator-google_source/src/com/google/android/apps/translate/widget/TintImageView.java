// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.translate.t;

public class TintImageView extends View
{

    private final Drawable a;
    private ColorStateList b;
    private final int c;
    private int d;

    public TintImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, t.TintImageView);
        a = context.getDrawable(t.TintImageView_mask);
        if (context.getBoolean(t.TintImageView_mutate, false))
        {
            a.mutate();
        }
        b = context.getColorStateList(t.TintImageView_tint);
        c = context.getDimensionPixelSize(t.TintImageView_iconSize, 0);
        context.recycle();
        setTint(b.getColorForState(getDrawableState(), 0xff000000));
        a.setState(getDrawableState());
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public final void a(ColorStateList colorstatelist)
    {
        b = colorstatelist;
        drawableStateChanged();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int i = b.getColorForState(getDrawableState(), d);
        if (i != d)
        {
            setTint(i);
        }
        if (a.isStateful() && a.setState(getDrawableState()))
        {
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        a.draw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName("android.widget.ImageView");
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (c > 0)
        {
            k = c;
        } else
        {
            k = a.getIntrinsicHeight();
        }
        if (c > 0)
        {
            l = c;
        } else
        {
            l = a.getIntrinsicWidth();
        }
        a.setBounds((i - l) / 2, (j - k) / 2, (l + i) / 2, (k + j) / 2);
    }

    public void setLevel(int i)
    {
        if (a.setLevel(i))
        {
            invalidate();
        }
    }

    public void setTint(int i)
    {
        d = i;
        a.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
        invalidate();
    }
}

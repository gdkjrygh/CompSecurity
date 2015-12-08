// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.pager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.widget.ImageView;
import gna;

public final class ClippingImageView extends ImageView
{

    public static final Property b = new gna(android/graphics/Rect, "clipRect");
    public final Rect a;

    public ClippingImageView(Context context)
    {
        this(context, null);
    }

    public ClippingImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ClippingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
    }

    public final void a(Rect rect)
    {
        a.set(rect);
        invalidate();
    }

    protected final void onDraw(Canvas canvas)
    {
        canvas.clipRect(a);
        super.onDraw(canvas);
    }

}

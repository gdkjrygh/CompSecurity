// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getbase.floatingactionbutton;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

class b extends LayerDrawable
{

    private final int a;

    public transient b(int i, Drawable adrawable[])
    {
        super(adrawable);
        a = i;
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, a, 31);
        super.draw(canvas);
        canvas.restore();
    }
}

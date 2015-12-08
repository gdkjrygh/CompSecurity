// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kik.android.widget.ClampedContentPreviewView;

public class MaskedContentPreviewImage extends ClampedContentPreviewView
{

    private Drawable h;
    private int i;

    public MaskedContentPreviewImage(Context context)
    {
        super(context);
        i = 0;
    }

    public MaskedContentPreviewImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 0;
    }

    public final void a()
    {
        i = 0;
        invalidate();
    }

    public final void c(int j)
    {
        i = j;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i != 0)
        {
            canvas.drawColor(i);
        }
        if (h != null)
        {
            h.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            h.draw(canvas);
        }
    }
}

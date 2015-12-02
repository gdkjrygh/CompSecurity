// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

class Solid extends View
{

    private Paint a;
    private Paint b;

    public Solid(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public Solid(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = new android.widget.LinearLayout.LayoutParams(-1, -2);
        context.weight = 1.0F;
        setLayoutParams(context);
    }

    public void a(Paint paint)
    {
        a = paint;
    }

    public void b(Paint paint)
    {
        b = paint;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawRect(getLeft(), 0.0F, getRight(), getBottom(), b);
        canvas.drawRect(getLeft(), 0.0F, getRight(), getBottom(), a);
    }
}

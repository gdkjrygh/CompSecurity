// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            o, ct

private class setFocusable extends View
{

    int a;
    String b;
    int c;
    int d;
    TextPaint e;
    final o f;

    public void a(int i)
    {
        c = i;
        invalidate();
    }

    public void a(String s)
    {
        b = s;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Rect rect = new Rect();
        e.getTextBounds(b, 0, b.length(), rect);
        float f1 = (c - rect.width()) / 2;
        float f2 = ((float)d - e.getTextSize()) / 2.0F;
        canvas.drawText(b, f1, f2 + e.getTextSize() + (float)e.baselineShift, e);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(c, d);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        d = drawable.getMinimumHeight();
    }

    public (o o1, Context context, int i)
    {
        f = o1;
        super(context);
        b = "";
        a = i;
        c = 0;
        d = 0;
        e = new TextPaint();
        e.setTextSize(ct.G());
        e.setColor(a);
        e.setTypeface(Typeface.create("helvetica", 1));
        e.setAntiAlias(true);
        setFocusable(false);
    }
}

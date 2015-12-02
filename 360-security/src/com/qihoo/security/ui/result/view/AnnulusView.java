// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.qihoo360.mobilesafe.b.a;

public class AnnulusView extends View
{

    private final Paint a;
    private int b;
    private int c;
    private int d;
    private int e;

    public AnnulusView(Context context)
    {
        this(context, null);
    }

    public AnnulusView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AnnulusView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint();
        a.setAntiAlias(true);
        a.setStyle(android.graphics.Paint.Style.FILL);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        a.setColor(-1);
        canvas.drawCircle(b / 2, c / 2, d, a);
        a.setColor(Color.rgb(33, 150, 243));
        canvas.drawCircle(b / 2, c / 2, e, a);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        b = getMeasuredWidth();
        c = getMeasuredHeight();
        d = Math.min(b, c) / 2;
        e = com.qihoo360.mobilesafe.b.a.a(getContext(), 0x7f090056) / 2;
    }
}

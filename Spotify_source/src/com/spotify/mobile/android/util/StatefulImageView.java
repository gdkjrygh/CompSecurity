// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StatefulImageView extends ImageView
{

    private Paint a;
    private int b;
    private int c;

    public StatefulImageView(Context context)
    {
        super(context);
        a = new Paint();
        a.setColor(Color.argb(getResources().getInteger(0x7f0e0018), 127, 127, 127));
    }

    public StatefulImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        a.setColor(Color.argb(getResources().getInteger(0x7f0e0018), 127, 127, 127));
    }

    public StatefulImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint();
        a.setColor(Color.argb(getResources().getInteger(0x7f0e0018), 127, 127, 127));
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isEnabled())
        {
            canvas.drawRect(0.0F, 0.0F, c, b, a);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        c = getMeasuredWidth();
        b = getMeasuredHeight();
    }
}

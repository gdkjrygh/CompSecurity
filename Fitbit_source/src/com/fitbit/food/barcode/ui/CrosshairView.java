// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            c

public class CrosshairView extends LinearLayout
{

    public static final int a = 0x7f0f0172;
    public static final float b = 15F;
    private Rect c;
    private c d;

    public CrosshairView(Context context)
    {
        super(context);
        d = new c();
        a();
        setWillNotDraw(false);
    }

    public CrosshairView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new c();
        a();
        setWillNotDraw(false);
    }

    public CrosshairView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new c();
        a();
        setWillNotDraw(false);
    }

    private void a()
    {
        int i = getContext().getResources().getColor(0x7f0f0172);
        d.a(i);
        d.a(15F);
    }

    public void a(int i)
    {
        d.a(i);
    }

    public Rect d()
    {
        if (c == null)
        {
            c = new Rect();
        }
        return c;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        d.draw(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            d().set(i, j, k, l);
        }
    }
}

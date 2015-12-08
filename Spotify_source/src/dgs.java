// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class dgs extends LinearLayout
{

    private final int a;
    private final Paint b = new Paint();
    private final int c;
    private final Paint d = new Paint();
    private final int e;
    private final Paint f = new Paint();
    private final dgt g = new dgt((byte)0);

    public dgs(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setWillNotDraw(false);
        setId(0);
        context = context.obtainStyledAttributes(attributeset, dfh.aD, i, 0);
        i = context.getColor(dfh.aE, 0xff000000);
        int j = context.getDimensionPixelSize(dfh.aF, 0);
        int k = context.getDimensionPixelSize(dfh.aG, 0);
        int l = context.getColor(dfh.aH, -1);
        int i1 = context.getColor(dfh.aI, 0xff00ff00);
        int j1 = context.getDimensionPixelSize(dfh.aJ, 2);
        context.recycle();
        e = a(l, (byte)38);
        g.a = (new int[] {
            i1
        });
        g.b = (new int[] {
            a(l, (byte)32)
        });
        a = j;
        b.setColor(e);
        c = j1;
        f.setStrokeWidth(k);
        setBackgroundColor(i);
    }

    private static int a(int i, byte byte0)
    {
        return Color.argb(byte0, Color.red(i), Color.green(i), Color.blue(i));
    }

    protected final void onDraw(Canvas canvas)
    {
        int i = 0;
        int l = getHeight();
        int j = getChildCount();
        int k = (int)(Math.min(Math.max(0.0F, 0.5F), 1.0F) * (float)l);
        dgt dgt1 = g;
        if (j > 0)
        {
            View view = getChildAt(0);
            int i1 = view.getLeft();
            int j1 = view.getPaddingLeft();
            int k1 = view.getRight();
            int l1 = view.getPaddingRight();
            int i2 = dgt1.a();
            d.setColor(i2);
            canvas.drawRect(i1 + j1, l - c, k1 - l1, l, d);
        }
        if (a > 0)
        {
            canvas.drawRect(0.0F, l - a, getWidth(), l, b);
        }
        if (f.getStrokeWidth() > 0.0F)
        {
            l = (l - k) / 2;
            for (; i < j - 1; i++)
            {
                View view1 = getChildAt(i);
                f.setColor(dgt1.a(i));
                canvas.drawLine(view1.getRight(), l, view1.getRight(), l + k, f);
            }

        }
    }
}

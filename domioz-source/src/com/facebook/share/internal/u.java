// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

// Referenced classes of package com.facebook.share.internal:
//            v, w

public final class u extends FrameLayout
{

    private TextView a;
    private int b;
    private float c;
    private float d;
    private float e;
    private Paint f;
    private int g;
    private int h;

    private void a(int i, int j, int k, int l)
    {
        a.setPadding(g + i, g + j, g + k, g + l);
    }

    public final void a(int i)
    {
        b = i;
        switch (v.a[i - 1])
        {
        default:
            return;

        case 1: // '\001'
            a(h, 0, 0, 0);
            return;

        case 2: // '\002'
            a(0, h, 0, 0);
            return;

        case 3: // '\003'
            a(0, 0, h, 0);
            return;

        case 4: // '\004'
            a(0, 0, 0, h);
            break;
        }
    }

    public final void a(String s)
    {
        a.setText(s);
    }

    protected final void onDraw(Canvas canvas)
    {
        int i;
        int j;
        int k;
        int l;
        super.onDraw(canvas);
        l = getPaddingTop();
        k = getPaddingLeft();
        j = getWidth() - getPaddingRight();
        i = getHeight() - getPaddingBottom();
        v.a[b - 1];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 577
    //                   2 591
    //                   3 605
    //                   4 563;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        float f1 = k;
        float f2 = l;
        float f3 = j;
        float f4 = i;
        Path path = new Path();
        float f5 = e * 2.0F;
        path.addArc(new RectF(f1, f2, f1 + f5, f2 + f5), -180F, 90F);
        if (b == w.b)
        {
            path.lineTo((f3 - f1 - d) / 2.0F + f1, f2);
            path.lineTo((f3 - f1) / 2.0F + f1, f2 - c);
            path.lineTo(((f3 - f1) + d) / 2.0F + f1, f2);
        }
        path.lineTo(f3 - e, f2);
        path.addArc(new RectF(f3 - f5, f2, f3, f2 + f5), -90F, 90F);
        if (b == w.c)
        {
            path.lineTo(f3, (f4 - f2 - d) / 2.0F + f2);
            path.lineTo(c + f3, (f4 - f2) / 2.0F + f2);
            path.lineTo(f3, ((f4 - f2) + d) / 2.0F + f2);
        }
        path.lineTo(f3, f4 - e);
        path.addArc(new RectF(f3 - f5, f4 - f5, f3, f4), 0.0F, 90F);
        if (b == w.d)
        {
            path.lineTo(((f3 - f1) + d) / 2.0F + f1, f4);
            path.lineTo((f3 - f1) / 2.0F + f1, c + f4);
            path.lineTo((f3 - f1 - d) / 2.0F + f1, f4);
        }
        path.lineTo(e + f1, f4);
        path.addArc(new RectF(f1, f4 - f5, f5 + f1, f4), 90F, 90F);
        if (b == w.a)
        {
            path.lineTo(f1, ((f4 - f2) + d) / 2.0F + f2);
            path.lineTo(f1 - c, (f4 - f2) / 2.0F + f2);
            path.lineTo(f1, (f4 - f2 - d) / 2.0F + f2);
        }
        path.lineTo(f1, e + f2);
        canvas.drawPath(path, f);
        return;
_L5:
        i = (int)((float)i - c);
        continue; /* Loop/switch isn't completed */
_L2:
        k = (int)((float)k + c);
        continue; /* Loop/switch isn't completed */
_L3:
        l = (int)((float)l + c);
        continue; /* Loop/switch isn't completed */
_L4:
        j = (int)((float)j - c);
        if (true) goto _L1; else goto _L6
_L6:
    }
}

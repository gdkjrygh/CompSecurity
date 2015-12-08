// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class LikeBoxCountView extends FrameLayout
{

    private TextView a;
    private LikeBoxCountViewCaretPosition b;
    private float c;
    private float d;
    private float e;
    private Paint f;
    private int g;
    private int h;

    public LikeBoxCountView(Context context)
    {
        super(context);
        b = LikeBoxCountViewCaretPosition.a;
        setWillNotDraw(false);
        c = getResources().getDimension(0x7f0c00a5);
        d = getResources().getDimension(0x7f0c00a6);
        e = getResources().getDimension(0x7f0c00a3);
        f = new Paint();
        f.setColor(getResources().getColor(0x7f0f00c4));
        f.setStrokeWidth(getResources().getDimension(0x7f0c00a4));
        f.setStyle(android.graphics.Paint.Style.STROKE);
        a = new TextView(context);
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        a.setLayoutParams(context);
        a.setGravity(17);
        a.setTextSize(0, getResources().getDimension(0x7f0c00a8));
        a.setTextColor(getResources().getColor(0x7f0f00c5));
        g = getResources().getDimensionPixelSize(0x7f0c00a7);
        h = getResources().getDimensionPixelSize(0x7f0c00a5);
        addView(a);
        a(b);
    }

    private void a(int i, int j, int k, int l)
    {
        a.setPadding(g + i, g + j, g + k, g + l);
    }

    public final void a(LikeBoxCountViewCaretPosition likeboxcountviewcaretposition)
    {
        b = likeboxcountviewcaretposition;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[LikeBoxCountViewCaretPosition.values().length];
                try
                {
                    a[LikeBoxCountViewCaretPosition.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[LikeBoxCountViewCaretPosition.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[LikeBoxCountViewCaretPosition.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LikeBoxCountViewCaretPosition.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[likeboxcountviewcaretposition.ordinal()])
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
        _cls1.a[b.ordinal()];
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
        if (b == LikeBoxCountViewCaretPosition.b)
        {
            path.lineTo((f3 - f1 - d) / 2.0F + f1, f2);
            path.lineTo((f3 - f1) / 2.0F + f1, f2 - c);
            path.lineTo(((f3 - f1) + d) / 2.0F + f1, f2);
        }
        path.lineTo(f3 - e, f2);
        path.addArc(new RectF(f3 - f5, f2, f3, f2 + f5), -90F, 90F);
        if (b == LikeBoxCountViewCaretPosition.c)
        {
            path.lineTo(f3, (f4 - f2 - d) / 2.0F + f2);
            path.lineTo(c + f3, (f4 - f2) / 2.0F + f2);
            path.lineTo(f3, ((f4 - f2) + d) / 2.0F + f2);
        }
        path.lineTo(f3, f4 - e);
        path.addArc(new RectF(f3 - f5, f4 - f5, f3, f4), 0.0F, 90F);
        if (b == LikeBoxCountViewCaretPosition.d)
        {
            path.lineTo(((f3 - f1) + d) / 2.0F + f1, f4);
            path.lineTo((f3 - f1) / 2.0F + f1, c + f4);
            path.lineTo((f3 - f1 - d) / 2.0F + f1, f4);
        }
        path.lineTo(e + f1, f4);
        path.addArc(new RectF(f1, f4 - f5, f5 + f1, f4), 90F, 90F);
        if (b == LikeBoxCountViewCaretPosition.a)
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

    private class LikeBoxCountViewCaretPosition extends Enum
    {

        public static final LikeBoxCountViewCaretPosition a;
        public static final LikeBoxCountViewCaretPosition b;
        public static final LikeBoxCountViewCaretPosition c;
        public static final LikeBoxCountViewCaretPosition d;
        private static final LikeBoxCountViewCaretPosition e[];

        public static LikeBoxCountViewCaretPosition valueOf(String s)
        {
            return (LikeBoxCountViewCaretPosition)Enum.valueOf(com/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
        }

        public static LikeBoxCountViewCaretPosition[] values()
        {
            return (LikeBoxCountViewCaretPosition[])e.clone();
        }

        static 
        {
            a = new LikeBoxCountViewCaretPosition("LEFT", 0);
            b = new LikeBoxCountViewCaretPosition("TOP", 1);
            c = new LikeBoxCountViewCaretPosition("RIGHT", 2);
            d = new LikeBoxCountViewCaretPosition("BOTTOM", 3);
            e = (new LikeBoxCountViewCaretPosition[] {
                a, b, c, d
            });
        }

        private LikeBoxCountViewCaretPosition(String s, int i)
        {
            super(s, i);
        }
    }

}

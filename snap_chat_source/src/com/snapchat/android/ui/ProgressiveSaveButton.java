// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ProgressiveSaveButton extends View
{
    public static final class AnimationState extends Enum
    {

        private static final AnimationState $VALUES[];
        public static final AnimationState READY;
        public static final AnimationState SAVED;
        public static final AnimationState SAVING;

        public static AnimationState valueOf(String s)
        {
            return (AnimationState)Enum.valueOf(com/snapchat/android/ui/ProgressiveSaveButton$AnimationState, s);
        }

        public static AnimationState[] values()
        {
            return (AnimationState[])$VALUES.clone();
        }

        static 
        {
            READY = new AnimationState("READY", 0);
            SAVING = new AnimationState("SAVING", 1);
            SAVED = new AnimationState("SAVED", 2);
            $VALUES = (new AnimationState[] {
                READY, SAVING, SAVED
            });
        }

        private AnimationState(String s, int i)
        {
            super(s, i);
        }
    }


    private final int a;
    private final int b;
    private AnimationState c;
    private int d;
    private long e;

    public ProgressiveSaveButton(Context context)
    {
        this(context, null);
    }

    public ProgressiveSaveButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProgressiveSaveButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = null;
        d = 0;
        e = 0L;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        a = getResources().getColor(0x7f0c0050);
        b = getResources().getColor(0x7f0c0018);
        if (Color.alpha(a) != 255 || Color.alpha(b) != 255)
        {
            throw new IllegalArgumentException("Colors contain unexpected alpha");
        } else
        {
            setAnimationState(AnimationState.READY);
            setVisibility(0);
            return;
        }
    }

    private static int a(int i, int j)
    {
        return Color.argb(j, Color.red(i), Color.green(i), Color.blue(i));
    }

    private static Paint a(float f, int i)
    {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(f / 2.0F));
        return paint;
    }

    private static void a(Canvas canvas, float f, float f1, Paint paint, float f2)
    {
        canvas.drawArc(new RectF(0.05F * f, 0.04F * f1, f - 0.05F * f, f1 - 0.08F * f1), -68.5F, 317F * f2, false, paint);
    }

    private static void b(Canvas canvas, float f, float f1, Paint paint, float f2)
    {
        float f3 = 0.77F * f;
        f1 = 0.7F * f1;
        canvas.drawLine(f3 - (f3 - 0.3F * f) * f2, f1, f3, f1, paint);
    }

    private static void c(Canvas canvas, float f, float f1, Paint paint, float f2)
    {
        float f3 = 0.5F * f;
        float f4 = (0.58F + f2) * f1;
        canvas.drawLine(0.5F * f, (0.13F + f2) * f1, f3, f4 - paint.getStrokeWidth() / 2.0F, paint);
        Path path = new Path();
        path.moveTo(0.28F * f1, (0.4F + f2) * f1);
        path.lineTo(f3, f4);
        path.lineTo(0.75F * f1, (0.39F + f2) * f1);
        canvas.drawPath(path, paint);
    }

    protected void onDraw(Canvas canvas)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[AnimationState.values().length];
                try
                {
                    a[AnimationState.READY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AnimationState.SAVING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AnimationState.SAVED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        float f6;
        switch (_cls1.a[c.ordinal()])
        {
        default:
            throw new IllegalStateException("Illegal animation state.");

        case 2: // '\002'
            float f = canvas.getWidth();
            float f2 = canvas.getHeight();
            float f4 = 0.0775F * f;
            Paint paint = a(f4, a);
            Paint paint2 = a(f4, b);
            canvas.drawColor(-1);
            a(canvas, f, f2, paint2, 1.0F);
            a(canvas, f, f2, paint, (float)d / 100F);
            b(canvas, f, f2, paint2, 1.0F);
            c(canvas, f, f2, paint2, 0.0F);
            // fall through

        case 1: // '\001'
            return;

        case 3: // '\003'
            f6 = canvas.getWidth();
            break;
        }
        float f7 = canvas.getHeight();
        float f1 = System.currentTimeMillis() - e;
        float f3;
        float f5;
        float f8;
        Paint paint1;
        Paint paint3;
        Object obj;
        int i;
        int j;
        if (f1 > 1500F)
        {
            f1 = 1500F;
        } else
        {
            postInvalidate();
        }
        if (f1 <= 450F)
        {
            f1 /= 450F;
            f3 = 0.0F;
            f5 = 0.0F;
        } else
        if (f1 <= 900F)
        {
            f5 = (f1 - 450F) / 450F;
            f1 = 1.0F;
            f3 = 0.0F;
        } else
        {
            f3 = (1500F - f1) / 600F;
            f1 = 1.0F;
            f3 = 1.0F - f3;
            f5 = 1.0F;
        }
        f5 = 1.0F - f5;
        f5 = 1.0F - f5 * (f5 * f5);
        f8 = (1.0F - f5) * 0.6F;
        j = 255 - (int)(f3 * 255F);
        f3 = 0.0775F * f6;
        i = a(a, j);
        j = a(b, j);
        paint1 = a(f3, i);
        paint3 = a(f3, j);
        canvas.drawColor(-1);
        c(canvas, f6, f7, paint3, f1 * (f1 * f1) * 0.6F);
        obj = new Path();
        ((Path) (obj)).moveTo(0.27F * f6, (0.42F + f8) * f7);
        ((Path) (obj)).lineTo(0.44F * f6, (f8 + 0.6F) * f7);
        ((Path) (obj)).lineTo(0.7475F * f6, (f8 + 0.24F) * f7);
        canvas.drawPath(((Path) (obj)), paint1);
        obj = new Paint();
        ((Paint) (obj)).setColor(-1);
        canvas.drawRect(0.0F, 0.7F * f7, f6, f7, ((Paint) (obj)));
        if (f5 < 1.0F)
        {
            b(canvas, f6, f7, paint3, 1.0F);
        }
        b(canvas, f6, f7, paint1, f5);
        a(canvas, f6, f7, paint1, 1.0F);
    }

    public void setAnimationState(AnimationState animationstate)
    {
        if (animationstate == null)
        {
            throw new NullPointerException("animationState is null");
        }
        if (c == animationstate)
        {
            return;
        }
        c = animationstate;
        if (animationstate != AnimationState.SAVING)
        {
            d = 0;
        }
        _cls1.a[c.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 90
    //                   2 102
    //                   3 110;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException("Illegal animation state.");
_L2:
        setBackgroundResource(0x7f02020e);
_L6:
        postInvalidate();
        return;
_L3:
        setBackgroundColor(0);
        continue; /* Loop/switch isn't completed */
_L4:
        setBackgroundColor(0);
        e = System.currentTimeMillis();
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setSaveProgress(int i)
    {
        if (i < 0 || i > 100)
        {
            throw new IllegalArgumentException((new StringBuilder("Save progress out of range: ")).append(i).toString());
        }
        if (d != i)
        {
            d = i;
            postInvalidate();
        }
    }
}

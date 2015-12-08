// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.views;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import b;
import bgb;
import bhp;

public class StraightenSliderView extends View
{

    private float A;
    private boolean B;
    private final PointF C;
    private final PointF D;
    private final Rect E;
    public bhp a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private float k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Paint o;
    private Path p;
    private Path q;
    private int r;
    private int s;
    private long t;
    private long u;
    private final TimeInterpolator v;
    private final TimeInterpolator w;
    private long x;
    private long y;
    private boolean z;

    public StraightenSliderView(Context context, Drawable drawable)
    {
        super(context);
        v = bgb.d;
        w = bgb.e;
        A = 0.0F;
        B = false;
        C = new PointF();
        D = new PointF();
        E = new Rect();
    }

    public StraightenSliderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        v = bgb.d;
        w = bgb.e;
        A = 0.0F;
        B = false;
        C = new PointF();
        D = new PointF();
        E = new Rect();
    }

    public StraightenSliderView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        v = bgb.d;
        w = bgb.e;
        A = 0.0F;
        B = false;
        C = new PointF();
        D = new PointF();
        E = new Rect();
    }

    private int a(float f1, int i1)
    {
        float f2 = (float)getWidth() / 2.0F;
        return Color.argb((int)((Math.abs(f1 - f2) / f2) * -205F + 255F), Color.red(i1), Color.green(i1), Color.blue(i1));
    }

    private void a(boolean flag, long l1)
    {
        x = System.currentTimeMillis();
        y = x + l1;
        z = flag;
        invalidate();
    }

    private static float b(float f1)
    {
        return (-f1 * f1 * 2.0F) / 3F + 1.0F;
    }

    public final void a(float f1)
    {
        A = Math.max((float)Math.toRadians(-45F), Math.min(f1, (float)Math.toRadians(45F)));
        if (a != null)
        {
            a.b(A);
        }
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        float f2 = (float)(System.currentTimeMillis() - x) / (float)(y - x);
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float af[];
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        if (f1 < 1.0F)
        {
            invalidate();
        }
        if (z)
        {
            f1 = v.getInterpolation(f1);
        } else
        {
            f1 = 1.0F - w.getInterpolation(f1);
        }
        f2 = g;
        f2 = f1 * (float)h + (1.0F - f1) * f2;
        f1 = e;
        f5 = f2 / 2.0F;
        f6 = e;
        f7 = f2 / 2.0F;
        super.onDraw(canvas);
        f3 = Math.min(45F, Math.max(-45F, (float)Math.toDegrees(A)));
        f2 = (-f3 * f) / 3F;
        f4 = d + f2;
        f2 = f4 - (float)Math.floor(f2 / f) * f;
        af = new float[4];
        af[0] = f2;
        af[1] = f1 - f5;
        af[2] = f2;
        af[3] = f7 + f6;
        f1 = f2;
        do
        {
            if (f1 > c)
            {
                break;
            }
            if (f1 >= d + i)
            {
                af[2] = f1;
                af[0] = f1;
                if (f1 > f4)
                {
                    l.setColor(a(f1, r));
                    canvas.drawLines(af, l);
                } else
                if (f1 <= f4)
                {
                    m.setColor(a(f1, s));
                    canvas.drawLines(af, m);
                }
            }
            f1 += f * b((f1 - d) / d);
        } while (true);
        f1 = f2 - f;
        while (f1 >= 0.0F) 
        {
            if (f1 <= d - i)
            {
                af[2] = f1;
                af[0] = f1;
                if (f1 < f4)
                {
                    l.setColor(a(f1, r));
                    canvas.drawLines(af, l);
                } else
                if (f1 >= f4)
                {
                    m.setColor(a(f1, s));
                    canvas.drawLines(af, m);
                }
            }
            f1 -= f * b((d - f1) / d);
        }
        int i1 = Math.round(f3);
        String s1;
        if (i1 >= 0)
        {
            s1 = " %d\260";
        } else
        {
            s1 = "%d\260";
        }
        s1 = String.format(s1, new Object[] {
            Integer.valueOf(i1)
        });
        j.getTextBounds(s1, 0, s1.length(), E);
        canvas.drawText(s1, k + d, e - E.exactCenterY(), j);
        canvas.drawPath(p, n);
        canvas.translate(f4, 0.0F);
        canvas.drawPath(q, o);
        canvas.translate(-f4, 0.0F);
        canvas = String.valueOf(getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_controls_tilt));
        s1 = String.valueOf(getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_controls_tilt_value, new Object[] {
            Integer.valueOf(i1)
        }));
        if (s1.length() != 0)
        {
            canvas = canvas.concat(s1);
        } else
        {
            canvas = new String(canvas);
        }
        setContentDescription(canvas);
    }

    protected void onFinishInflate()
    {
        setBackgroundColor(0);
        Resources resources = getResources();
        t = resources.getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_rotation_activate_duration);
        u = resources.getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_rotation_deactivate_duration);
        r = resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_tick_marks);
        g = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_tickmarks_height_low);
        h = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_tickmarks_height_high);
        int i1 = Math.max(1, resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_tickmarks_stroke_width));
        j = new Paint();
        j.setColor(resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_degree_label));
        j.setTextAlign(android.graphics.Paint.Align.CENTER);
        l = new Paint();
        l.setStyle(android.graphics.Paint.Style.STROKE);
        l.setStrokeWidth(i1);
        m = new Paint();
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setStrokeWidth(i1);
        s = resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_highlighted_tick_marks);
        n = new Paint();
        n.setStyle(android.graphics.Paint.Style.FILL);
        n.setColor(resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_bottom_marker));
        o = new Paint();
        o.setStyle(android.graphics.Paint.Style.FILL);
        o.setColor(resources.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_top_marker));
        f = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_distance_between_tick_marks);
        setClickable(true);
        setEnabled(true);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Resources resources = getResources();
        b = getHeight();
        c = getWidth();
        d = c / 2.0F;
        e = b / 2.0F;
        j.setTextSize(resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_degree_label_text_size));
        Rect rect = new Rect();
        j.getTextBounds("\260", 0, 1, rect);
        k = (float)rect.width() / 4F;
        j.getTextBounds("-00\260", 0, 4, rect);
        i = (float)rect.width() / 2.0F + (float)resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_degree_label_padding);
        float f2 = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_top_marker_y);
        float f4 = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_bottom_marker_y);
        float f1 = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_marker_radius);
        float f3 = d;
        f4 += e;
        p = new Path();
        p.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        p.moveTo(f3, f4);
        p.lineTo(f3 - f1, f4 + f1);
        p.lineTo(f3 + f1, f4 + f1);
        p.close();
        f2 += e;
        q = new Path();
        q.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        q.moveTo(0.0F, f2);
        q.lineTo(0.0F - f1, f2 - f1);
        q.lineTo(f1 + 0.0F, f2 - f1);
        q.close();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = getPaddingLeft();
        int l1 = getPaddingRight();
        int i2 = getMeasuredWidth();
        int j2 = getMeasuredHeight();
        int k2 = getPaddingBottom();
        int l2 = getPaddingTop();
        setMeasuredDimension(resolveSize(k1 + l1 + i2, i1), resolveSize(j2 + k2 + l2, j1));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a != null && a.u())
        {
            return true;
        }
        switch (motionevent.getActionMasked())
        {
        default:
            return false;

        case 0: // '\0'
            D.set(motionevent.getX(), motionevent.getY());
            if (a != null)
            {
                a.u_();
            }
            a(true, t);
            return true;

        case 2: // '\002'
            float f4 = A;
            float f3 = motionevent.getX() - D.x;
            float f1 = (-(float)Math.toDegrees(A) * f) / 3F + f3;
            if ((f1 - f3) * f1 < 0.0F)
            {
                B = true;
                C.set(motionevent.getX(), motionevent.getY());
            }
            if (B && Math.abs(motionevent.getX() - C.x) < 0.15F * (float)getWidth())
            {
                f1 = 0.0F;
            } else
            {
                B = false;
            }
            f3 = Math.min(80F, Math.max(-80F, (-f1 / f) * 3F));
            A = (float)Math.toRadians(f3);
            invalidate();
            D.set(motionevent.getX(), motionevent.getY());
            if (a != null && f4 != A)
            {
                float f5 = Math.abs(f3) - 45F;
                float f2 = f3;
                if (f5 > 0.0F)
                {
                    if (f3 < 0.0F)
                    {
                        f2 = -1F;
                    } else
                    {
                        f2 = 1.0F;
                    }
                    f2 *= f5 / (f5 / 35F + 1.0F) + 45F;
                }
                a.b((float)Math.toRadians(f2));
            }
            return true;

        case 1: // '\001'
        case 3: // '\003'
            A = (float)Math.toRadians(Math.min(45F, Math.max(-45F, (float)Math.toDegrees(A))));
            B = false;
            break;
        }
        if (a != null)
        {
            a.t();
            b.a(getContext(), this, getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_controls_tilt_value, new Object[] {
                Integer.valueOf(Math.round((float)Math.toDegrees(A)))
            }));
        }
        a(false, u);
        return true;
    }
}

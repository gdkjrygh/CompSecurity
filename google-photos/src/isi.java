// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;

public final class isi extends ViewGroup
    implements oiz
{

    int a;
    int b;
    int c;
    int d;
    int e;
    Paint f;
    Paint g;
    TextView h;
    boolean i;
    private Path j;
    private int k;

    public isi(Context context)
    {
        this(context, null);
    }

    private isi(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isi(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, 0);
        setWillNotDraw(false);
        l = getResources().getDimensionPixelSize(b.Aj);
        f = new Paint(1);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        f.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        f.setPathEffect(new DashPathEffect(new float[] {
            (float)l, (float)l
        }, 0.0F));
        g = new Paint(1);
        g.setStyle(android.graphics.Paint.Style.FILL);
        j = new Path();
        h = new TextView(context);
        b();
        addView(h);
    }

    private void b()
    {
        f.setColor(getResources().getColor(af.R));
    }

    public final void ax_()
    {
        b();
        setTag(s.bZ, null);
    }

    public final void onDraw(Canvas canvas)
    {
        canvas.drawPath(j, g);
        canvas.drawPath(j, f);
    }

    public final void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        j1 = (j1 - l) / 2;
        int k2 = j1 - k / 2;
        int l2 = k;
        int j2 = getPaddingTop();
        int l1 = getPaddingBottom();
        l = c;
        int i2 = b + (l + k2);
        int i3 = c;
        int j3 = a;
        if (i)
        {
            l = 0;
        } else
        {
            l = d;
        }
        l += j3 + (i3 + j2);
        j3 = (int)Math.ceil((float)c / 2.0F);
        i3 = k2 + j3;
        k2 = (l2 + k2) - j3;
        j2 += j3;
        i1 = k1 - i1 - l1 - j3;
        if (i)
        {
            j.reset();
            j.moveTo(i3, j2);
            j.lineTo(i3, i1 - d);
            j.lineTo(j1 - e, i1 - d);
            j.lineTo(j1, i1);
            j.lineTo(j1 + e, i1 - d);
            j.lineTo(k2, i1 - d);
            j.lineTo(k2, j2);
            j.close();
        } else
        {
            j.reset();
            j.moveTo(i3, d + j2);
            j.lineTo(i3, i1);
            j.lineTo(k2, i1);
            j.lineTo(k2, d + j2);
            j.lineTo(e + j1, d + j2);
            j.lineTo(j1, j2);
            j.lineTo(j1 - e, d + j2);
            j.close();
        }
        h.layout(i2, l, h.getMeasuredWidth() + i2, h.getMeasuredHeight() + l);
    }

    public final void onMeasure(int l, int i1)
    {
        l = android.view.View.MeasureSpec.getSize(l);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int k1 = b;
        int j1 = a;
        l = Math.max(0, l - getPaddingLeft() - getPaddingRight() - (c << 1) - (k1 << 1));
        i1 = Math.max(0, i1 - getPaddingTop() - getPaddingBottom() - (c << 1) - (j1 << 1) - d);
        h.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000));
        TextView textview = h;
        Rect rect = new Rect();
        textview.getLineBounds(textview.getLineCount() - 1, rect);
        if (rect.bottom > h.getMeasuredHeight())
        {
            setTag(s.bZ, Boolean.valueOf(true));
        }
        k = h.getMeasuredWidth() + (b << 1) + (c << 1);
        l = h.getMeasuredHeight();
        i1 = a;
        j1 = c;
        k1 = d;
        setMeasuredDimension(k + getPaddingLeft() + getPaddingRight(), l + (i1 << 1) + (j1 << 1) + k1 + getPaddingBottom() + getPaddingTop());
    }
}

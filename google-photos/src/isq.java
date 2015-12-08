// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

public final class isq extends ViewGroup
    implements oiz
{

    private final pfp a;
    private final Rect b = new Rect();
    private final Paint c = new Paint();
    private final Paint d = new Paint();

    public isq(Context context, pfp pfp1)
    {
        super(context);
        a = pfp1;
        c.setColor(0x7fff0000);
        c.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0F);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        d.setColor(0xff0000ff);
        d.setTextSize(getResources().getDisplayMetrics().density * 11F);
        d.setTypeface(Typeface.MONOSPACE);
        setWillNotDraw(false);
    }

    public final void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        view.setAlpha(0.3F);
    }

    public final void ax_()
    {
        removeAllViews();
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        canvas.drawRect(b, c);
        canvas.drawLine(b.left, b.top, b.right, b.bottom, c);
        canvas.drawLine(b.left, b.bottom, b.right, b.top, c);
        isb isb1 = isb.a(this);
        float f2 = c.getStrokeWidth();
        float f = d.getTextSize();
        float f1 = (float)b.left + f2;
        f2 = f2 + (float)b.top + f;
        if (a.g != null)
        {
            canvas.drawText(a.g, f1, f2 + f, d);
            return;
        } else
        {
            int i = isb1.e();
            String s = String.valueOf(a.b.b.a);
            canvas.drawText((new StringBuilder(String.valueOf(s).length() + 18)).append("w = ").append(i).append(" (").append(s).append(")").toString(), f1, f * 0.0F + f2, d);
            i = isb1.g();
            s = String.valueOf(a.b.b.b);
            canvas.drawText((new StringBuilder(String.valueOf(s).length() + 18)).append("h = ").append(i).append(" (").append(s).append(")").toString(), f1, 1.0F * f + f2, d);
            i = isb1.b();
            s = String.valueOf(a.b.a.a);
            canvas.drawText((new StringBuilder(String.valueOf(s).length() + 18)).append("x = ").append(i).append(" (").append(s).append(")").toString(), f1, 2.0F * f + f2, d);
            i = isb1.c();
            s = String.valueOf(a.b.a.b);
            canvas.drawText((new StringBuilder(String.valueOf(s).length() + 18)).append("y = ").append(i).append(" (").append(s).append(")").toString(), f1, 3F * f + f2, d);
            float f3 = b.a(isb1.a.b.c, 0.0F);
            canvas.drawText((new StringBuilder(19)).append("z = ").append(f3).toString(), f1, f2 + f * 4F, d);
            return;
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = getChildCount();
        for (i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }

    }

    public final void onMeasure(int i, int j)
    {
        int k = 0;
        for (int l = getChildCount(); k < l; k++)
        {
            getChildAt(k).measure(i, j);
        }

        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
        isg isg1 = isb.a(this).A();
        i = Math.round(c.getStrokeWidth() / 2.0F);
        b.set(isg1.b + i, isg1.c + i, getMeasuredWidth() - i - isg1.d, getMeasuredHeight() - i - isg1.e);
    }
}

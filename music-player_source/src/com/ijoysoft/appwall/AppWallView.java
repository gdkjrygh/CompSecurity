// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.ijoysoft.appwall:
//            ad, a

public class AppWallView extends View
    implements android.view.View.OnClickListener
{

    private Drawable a;
    private Drawable b;
    private int c;
    private int d;
    private int e;
    private int f;
    private String g;
    private Rect h;
    private Rect i;
    private Rect j;
    private Rect k;
    private TextPaint l;

    public AppWallView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, ad.a);
        a = context.getDrawable(ad.b);
        b = context.getDrawable(ad.e);
        c = context.getDimensionPixelSize(ad.h, 13);
        d = context.getDimensionPixelSize(ad.g, 0);
        f = context.getDimensionPixelSize(ad.c, 0);
        e = context.getDimensionPixelSize(ad.f, 0);
        g = context.getString(ad.d);
        g = (new StringBuilder(String.valueOf(com.ijoysoft.appwall.a.d(getContext())))).toString();
        context.recycle();
        l = new TextPaint();
        l.setColor(-1);
        l.setTextSize(c);
        j = new Rect();
        h = new Rect();
        i = new Rect();
        k = new Rect();
        setOnClickListener(this);
    }

    private static void a(Rect rect, Rect rect1)
    {
        int i1 = rect1.right - rect1.left;
        int j1 = rect1.bottom - rect1.top;
        int k1 = Math.min(i1, rect.right - rect.left);
        int l1 = Math.min(j1, rect.bottom - rect.top);
        rect.set((i1 - k1) / 2 + rect1.left, (j1 - l1) / 2 + rect1.top, (i1 - k1) / 2 + k1 + rect1.left, (j1 - l1) / 2 + l1 + rect1.top);
    }

    public final void a(String s)
    {
        if (s == null)
        {
            s = "";
        }
        g = s;
        postInvalidate();
    }

    public void onClick(View view)
    {
        com.ijoysoft.appwall.a.b(getContext());
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        k.set(0, 0, getWidth(), getHeight());
        Rect rect = h;
        int i1;
        int j1;
        if (f != 0)
        {
            i1 = f;
        } else
        {
            i1 = a.getIntrinsicWidth();
        }
        if (f != 0)
        {
            j1 = f;
        } else
        {
            j1 = a.getIntrinsicHeight();
        }
        rect.set(0, 0, i1, j1);
        a(h, k);
        a.setBounds(h);
        a.draw(canvas);
        l.getTextBounds(g, 0, g.length(), i);
        i1 = d * 2 + Math.max(Math.abs(i.right - i.left), Math.abs(i.bottom - i.top));
        j.set(h.right - i1 - e, h.top + e, h.right - e, i1 + h.top + e);
        a(i, j);
        b.setBounds(j);
        b.draw(canvas);
        canvas.drawText(g, i.left, i.bottom, l);
    }

    protected void onMeasure(int i1, int j1)
    {
        int j2 = android.view.View.MeasureSpec.getMode(i1);
        int i2 = android.view.View.MeasureSpec.getMode(j1);
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int k1 = android.view.View.MeasureSpec.getSize(j1);
        j1 = a.getIntrinsicWidth();
        int i3 = b.getIntrinsicWidth() / 2;
        int k2 = a.getIntrinsicHeight();
        int l2 = b.getIntrinsicHeight() / 2;
        i1 = l1;
        if (j2 == 0x80000000)
        {
            i1 = Math.min(l1, j1 + i3);
        }
        j1 = k1;
        if (i2 == 0x80000000)
        {
            j1 = Math.min(k1, k2 + l2);
        }
        setMeasuredDimension(i1, j1);
    }
}

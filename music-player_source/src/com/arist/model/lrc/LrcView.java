// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;

import a.a.a.a.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.arist.c.g;
import com.arist.model.skin.m;

// Referenced classes of package com.arist.model.lrc:
//            f

public class LrcView extends View
    implements m
{

    protected f a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected float g;
    protected float h;
    protected float i;
    protected TextPaint j;
    protected TextPaint k;
    protected boolean l;
    protected String m[];
    protected String n[];

    public LrcView(Context context)
    {
        super(context);
        e = 3;
        f = 0;
        l = false;
        a(((AttributeSet) (null)));
    }

    public LrcView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = 3;
        f = 0;
        l = false;
        a(attributeset);
    }

    public LrcView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = 3;
        f = 0;
        l = false;
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        int j1 = -1;
        int i1 = Color.rgb(249, 239, 124);
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, b.f);
            g = attributeset.getDimension(0, 20F);
            h = attributeset.getDimension(1, 30F);
            e = attributeset.getInteger(5, 5);
            i = attributeset.getDimension(4, 10F);
            j1 = attributeset.getColor(2, -1);
            i1 = attributeset.getColor(3, Color.rgb(249, 239, 124));
            attributeset.recycle();
        } else
        {
            g = com.arist.c.g.b(getContext(), 18F);
            h = com.arist.c.g.b(getContext(), 20F);
            e = 4;
            i = com.arist.c.g.a(getContext(), 6F);
        }
        m = getResources().getString(0x7f0900ca).split("\n");
        n = getResources().getString(0x7f0900f2).split("\n");
        d = (int)(h * (float)e + i * (float)(e + 1));
        j = new TextPaint(1);
        k = new TextPaint(1);
        j.setTextSize(g);
        j.setTextAlign(android.graphics.Paint.Align.CENTER);
        j.setColor(j1);
        j.setTypeface(Typeface.MONOSPACE);
        k.setTextSize(h);
        k.setTextAlign(android.graphics.Paint.Align.CENTER);
        k.setColor(i1);
        k.setTypeface(Typeface.MONOSPACE);
        a = new f();
    }

    public final void a(int i1)
    {
        k.setColor(i1);
    }

    public final void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        f = a.a(l1);
        if (f != -1)
        {
            postInvalidate();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        l = false;
        a.a(s);
        postInvalidate();
    }

    public final void b()
    {
        l = true;
        a.a(null);
        postInvalidate();
    }

    public final boolean c()
    {
        return !a.a();
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        int i1 = 0;
        if (!a.a()) goto _L2; else goto _L1
_L1:
        String as[];
        if (l)
        {
            as = m;
        } else
        {
            as = n;
        }
        if (as != null && as.length != 0)
        {
            float f1 = as.length;
            float f3 = g;
            float f5 = i;
            float f7 = as.length - 1;
            f1 = ((float)getHeight() - (f1 * f3 + f5 * f7)) / 2.0F + g / 2.0F + i;
            int j1 = as.length;
            while (i1 < j1) 
            {
                canvas.drawText(as[i1], getWidth() / 2, f1, j);
                f1 += g + i;
                i1++;
            }
        }
_L8:
        return;
_L2:
        float f4;
        float f6;
        float f8;
        float f9;
        String as1[];
        if (!a.a)
        {
            a.a(k, b);
        }
        f6 = ((float)c - g) / 2.0F;
        f8 = b / 2;
        f9 = g + i;
        as1 = a.a(f).split("\n");
        i1 = 0;
        f4 = f6;
_L12:
        if (i1 < as1.length) goto _L4; else goto _L3
_L3:
        float f2;
        float f10;
        float f11;
        float f12;
        float f13;
        int k1;
        f2 = h / 2.0F;
        float f14 = g;
        float f15 = i;
        f10 = h / 2.0F;
        f11 = g;
        f12 = i;
        f13 = k.descent();
        k1 = f - 1;
        f2 = f6 - ((f2 - f14) + f15 * 2.0F);
        i1 = 255;
_L13:
        if (k1 >= 0) goto _L6; else goto _L5
_L5:
        k1 = f + 1;
        i1 = 255;
        f2 = f4 + (((f10 - f11) + f12 * 2.0F) - f13);
_L11:
        if (k1 >= a.b()) goto _L8; else goto _L7
_L7:
        int l1;
        as1 = a.a(k1).split("\n");
        l1 = 0;
_L17:
        if (l1 < as1.length) goto _L10; else goto _L9
_L9:
        k1++;
          goto _L11
_L4:
        canvas.drawText(as1[i1], f8, f4, k);
        f2 = f4;
        if (i1 < as1.length - 1)
        {
            f2 = f4 + (h + i);
        }
        i1++;
        f4 = f2;
          goto _L12
_L6:
        as1 = a.a(k1).split("\n");
        l1 = 0;
_L15:
label0:
        {
            if (l1 < as1.length)
            {
                break label0;
            }
            k1--;
        }
          goto _L13
        f2 -= f9;
        if (i1 < 20)
        {
            i1 = 0;
        } else
        {
            i1 -= 20;
        }
        j.setAlpha(i1);
        canvas.drawText(as1[l1], f8, f2, j);
        if (f2 < 0.0F) goto _L5; else goto _L14
_L14:
        l1++;
          goto _L15
_L10:
        f2 += f9;
        if (i1 < 20)
        {
            i1 = 0;
        } else
        {
            i1 -= 20;
        }
        j.setAlpha(i1);
        canvas.drawText(as1[l1], f8, f2, j);
        if (f2 > (float)c) goto _L8; else goto _L16
_L16:
        l1++;
          goto _L17
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        b = getMeasuredWidth();
        c = getMeasuredHeight();
        super.onSizeChanged(i1, j1, k1, l1);
    }
}

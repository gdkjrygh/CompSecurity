// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.widget.TextView;

final class v extends TextView
{
    public static interface a
    {

        public abstract void a();
    }


    private static final Canvas b = new Canvas();
    int a;
    private a c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;

    private v(Context context)
    {
        this(context, (byte)0);
    }

    private v(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private v(Context context, char c1)
    {
        super(context, null, 0);
        d = false;
        f = 0.0F;
        g = 20F;
        h = 1.0F;
        i = 0.0F;
        j = true;
        a = 1;
        e = getTextSize();
    }

    private StaticLayout a(CharSequence charsequence, TextPaint textpaint, int k, float f1)
    {
        textpaint.setTextSize(f1);
        charsequence = new StaticLayout(charsequence, textpaint, k, android.text.Layout.Alignment.ALIGN_NORMAL, h, i, true);
        charsequence.draw(b);
        return charsequence;
    }

    public static v a(Context context, String s, int k, int l, int i1, boolean flag, int j1)
    {
        context = new v(context);
        context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, i1));
        context.setTextSize(k);
        if (flag)
        {
            context.setTypeface(null, 1);
        }
        context.g = (float)l * context.getContext().getResources().getDisplayMetrics().density;
        context.requestLayout();
        context.invalidate();
        context.f = (float)k * context.getContext().getResources().getDisplayMetrics().density;
        context.requestLayout();
        context.invalidate();
        context.a = j1;
        context.setText(s);
        context.setTextColor(0xff000000);
        return context;
    }

    public final void a(a a1)
    {
        c = a1;
    }

    protected final void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        if (!flag && !d) goto _L2; else goto _L1
_L1:
        CharSequence charsequence;
        int k1;
        int i2;
        i2 = i1 - k - getCompoundPaddingLeft() - getCompoundPaddingRight();
        k1 = j1 - l - getCompoundPaddingBottom() - getCompoundPaddingTop();
        charsequence = getText();
        if (charsequence != null && charsequence.length() != 0 && k1 > 0 && i2 > 0 && e != 0.0F) goto _L3; else goto _L2
_L2:
        super.onLayout(flag, k, l, i1, j1);
        return;
_L3:
        float f1;
        float f2;
        StaticLayout staticlayout;
        TextPaint textpaint;
        int j2;
        textpaint = getPaint();
        textpaint.getTextSize();
        float f3;
        int l1;
        if (f > 0.0F)
        {
            f1 = Math.min(e, f);
        } else
        {
            f1 = e;
        }
        staticlayout = a(charsequence, textpaint, i2, f1);
_L9:
        if ((staticlayout.getLineCount() > a || staticlayout.getHeight() > k1) && f1 > g) goto _L5; else goto _L4
_L4:
        if (!j || f1 != g && staticlayout.getHeight() <= k1 && staticlayout.getLineCount() <= a) goto _L7; else goto _L6
_L6:
        staticlayout = new StaticLayout(charsequence, textpaint, i2, android.text.Layout.Alignment.ALIGN_NORMAL, h, i, false);
        staticlayout.draw(b);
        l1 = staticlayout.getLineForVertical(k1) - 1;
        k1 = l1;
        if (l1 < 0)
        {
            k1 = 0;
        }
        l1 = k1;
        if (k1 > a - 1)
        {
            l1 = a - 1;
        }
        j2 = staticlayout.getLineStart(l1);
        k1 = staticlayout.getLineEnd(l1);
        f2 = staticlayout.getLineWidth(l1);
        f3 = textpaint.measureText("...");
        if (k1 >= charsequence.length()) goto _L7; else goto _L8
_L8:
        if ((float)i2 < f2 + f3)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        setText((new StringBuilder()).append(charsequence.subSequence(0, k1)).append("...").toString());
_L7:
        setMaxLines(a);
        textpaint.setTextSize(f1);
        setLineSpacing(i, h);
        if (c != null)
        {
            c.a();
        }
        d = false;
          goto _L2
_L5:
        f1 = Math.max(f1 - 1.0F, g);
        staticlayout = a(charsequence, textpaint, i2, f1);
          goto _L9
        k1--;
        f2 = textpaint.measureText(charsequence.subSequence(j2, k1 + 1).toString());
          goto _L8
    }

    protected final void onSizeChanged(int k, int l, int i1, int j1)
    {
        if (k != i1 || l != j1)
        {
            d = true;
        }
    }

    protected final void onTextChanged(CharSequence charsequence, int k, int l, int i1)
    {
        d = true;
        super.setTextSize(0, e);
        f = e;
    }

    public final void setLineSpacing(float f1, float f2)
    {
        super.setLineSpacing(f1, f2);
        h = f2;
        i = f1;
    }

    public final void setTextSize(float f1)
    {
        super.setTextSize(f1);
        e = getTextSize();
    }

    public final void setTextSize(int k, float f1)
    {
        super.setTextSize(k, f1);
        e = getTextSize();
    }

}

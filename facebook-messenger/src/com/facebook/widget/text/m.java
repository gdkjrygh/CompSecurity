// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.FloatMath;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.debug.d.e;
import com.facebook.q;
import com.google.common.a.hq;
import com.google.common.a.hy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.widget.text:
//            n, d, c, l

public abstract class m extends View
{

    private static final Class a = com/facebook/widget/text/m;
    private Object b;
    private int c;
    private int d;
    private int e;
    private Typeface f;
    private int g;
    private android.text.Layout.Alignment h;
    private int i;
    private List j;
    private Layout k;
    private Map l;
    private int m;
    private android.view.ViewTreeObserver.OnPreDrawListener n;

    public m(Context context)
    {
        super(context);
        f = Typeface.SANS_SERIF;
        g = 1;
        m = 0;
        n = new n(this);
        a(context, ((AttributeSet) (null)));
    }

    public m(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = Typeface.SANS_SERIF;
        g = 1;
        m = 0;
        n = new n(this);
        a(context, attributeset);
    }

    public m(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = Typeface.SANS_SERIF;
        g = 1;
        m = 0;
        n = new n(this);
        a(context, attributeset);
    }

    private int a(Layout layout, int i1)
    {
        int j1 = 0;
        int k1 = 0;
        for (; j1 < layout.getLineCount(); j1++)
        {
            k1 = Math.max(k1, (int)layout.getLineWidth(j1));
        }

        j1 = getPaddingLeft() + getPaddingRight() + k1;
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = j1;
        switch (l1)
        {
        default:
            i1 = k1;
            // fall through

        case 0: // '\0'
            return i1;

        case -2147483648: 
            return Math.min(j1, k1);
        }
    }

    private android.text.Layout.Alignment a(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid alignment: ").append(i1).toString());

        case 0: // '\0'
            return android.text.Layout.Alignment.ALIGN_NORMAL;

        case 1: // '\001'
            return android.text.Layout.Alignment.ALIGN_OPPOSITE;

        case 2: // '\002'
            return android.text.Layout.Alignment.ALIGN_CENTER;
        }
    }

    private void a(Context context, AttributeSet attributeset)
    {
        l = (new hy()).b(5).c(120L, TimeUnit.SECONDS).n();
        attributeset = getContext().obtainStyledAttributes(attributeset, q.VariableTextLayoutView);
        c = attributeset.getColor(q.VariableTextLayoutView_textColor, Color.rgb(0, 0, 0));
        d = attributeset.getInteger(q.VariableTextLayoutView_minScaledTextSize, 14);
        e = attributeset.getInteger(q.VariableTextLayoutView_maxScaledTextSize, 18);
        h = a(attributeset.getInteger(q.VariableTextLayoutView_alignment, 2));
        i = attributeset.getInteger(q.VariableTextLayoutView_maxLines, 2);
        int i1 = attributeset.getInteger(q.VariableTextLayoutView_textStyle, 0);
        b(attributeset.getInt(q.VariableTextLayoutView_typeface, -1), i1);
        Typeface typeface = getTypefaceFamily();
        context = com.facebook.widget.text.c.a(context, com.facebook.widget.text.d.fromIndex(attributeset.getInt(q.VariableTextLayoutView_fontFamily, 0)), typeface);
        if (typeface != context)
        {
            a(((Typeface) (context)), 0);
        }
        attributeset.recycle();
        if (e < d)
        {
            throw new IllegalArgumentException("Invalid text sizes");
        } else
        {
            return;
        }
    }

    static boolean a(m m1)
    {
        return m1.d();
    }

    private float b(int i1)
    {
        if (i1 == -1)
        {
            return -1F;
        } else
        {
            return TypedValue.applyDimension(2, i1, getResources().getDisplayMetrics());
        }
    }

    private int b(Layout layout, int i1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(i1);
        int k1 = layout.getHeight() + getPaddingBottom() + getPaddingTop();
        i1 = k1;
        switch (l1)
        {
        default:
            i1 = j1;
            // fall through

        case 0: // '\0'
            return i1;

        case -2147483648: 
            return Math.min(k1, j1);
        }
    }

    private void b()
    {
        j = hq.a();
        for (int i1 = e; i1 >= d; i1--)
        {
            j.add(c(i1));
        }

    }

    private void b(int i1, int j1)
    {
        Typeface typeface = null;
        i1;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 35
    //                   2 42
    //                   3 49;
           goto _L1 _L2 _L3 _L4
_L1:
        a(typeface, j1);
        return;
_L2:
        typeface = Typeface.SANS_SERIF;
        continue; /* Loop/switch isn't completed */
_L3:
        typeface = Typeface.SERIF;
        continue; /* Loop/switch isn't completed */
_L4:
        typeface = Typeface.MONOSPACE;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private TextPaint c(int i1)
    {
        TextPaint textpaint = new TextPaint(1);
        textpaint.density = getResources().getDisplayMetrics().density;
        textpaint.setTextSize(b(i1));
        textpaint.setTypeface(Typeface.create(f, g));
        textpaint.setColor(c);
        return textpaint;
    }

    private void c()
    {
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null)
        {
            if (m == 0)
            {
                viewtreeobserver.addOnPreDrawListener(n);
                m = 1;
                return;
            }
            if (m == 2)
            {
                m = 1;
                return;
            }
        }
    }

    private Layout d(int i1)
    {
        return getVariableTextLayoutComputer().a(b, j, i1, h, i, -1);
    }

    private boolean d()
    {
        if (m == 1)
        {
            g();
            f();
            boolean flag = e();
            m = 2;
            if (flag)
            {
                return false;
            }
        }
        return true;
    }

    private boolean e()
    {
        android.text.Layout.Alignment alignment = k.getParagraphAlignment(0);
        int j1 = k.getParagraphDirection(0);
        int k1 = getWidth() - (getPaddingLeft() + getPaddingRight());
        int i1;
        if (alignment == android.text.Layout.Alignment.ALIGN_CENTER)
        {
            i1 = (int)FloatMath.floor(k.getLineLeft(0));
            int l1 = (int)FloatMath.ceil(k.getLineRight(0));
            if (l1 - i1 < k1)
            {
                i1 = (i1 + l1) / 2 - k1 / 2;
            } else
            if (j1 < 0)
            {
                i1 = l1 - k1;
            }
        } else
        if (alignment == android.text.Layout.Alignment.ALIGN_NORMAL)
        {
            if (j1 < 0)
            {
                i1 = (int)FloatMath.ceil(k.getLineRight(0)) - k1;
            } else
            {
                i1 = (int)FloatMath.floor(k.getLineLeft(0));
            }
        } else
        if (j1 < 0)
        {
            i1 = (int)FloatMath.floor(k.getLineLeft(0));
        } else
        {
            i1 = (int)FloatMath.ceil(k.getLineRight(0)) - k1;
        }
        if (i1 != getScrollX())
        {
            scrollTo(i1, getScrollY());
            return true;
        } else
        {
            return false;
        }
    }

    private void f()
    {
        if (k == null)
        {
            k = getVariableTextLayoutComputer().a(b, j, getWidth() - (getPaddingLeft() + getPaddingRight()), h, i, getHeight());
        }
    }

    private void g()
    {
        if (j == null)
        {
            b();
        }
    }

    protected void a()
    {
        k = null;
        l.clear();
        requestLayout();
        invalidate();
        c();
    }

    public void a(int i1, int j1)
    {
        if (j1 < i1)
        {
            throw new IllegalArgumentException("Invalid text sizes");
        } else
        {
            d = i1;
            e = j1;
            j = null;
            a();
            invalidate();
            return;
        }
    }

    public void a(Typeface typeface, int i1)
    {
        Typeface typeface1 = typeface;
        if (i1 > 0)
        {
            if (typeface == null)
            {
                typeface1 = Typeface.defaultFromStyle(i1);
            } else
            {
                typeface1 = Typeface.create(typeface, i1);
            }
        }
        f = typeface1;
        g = i1;
        j = null;
        a();
        invalidate();
    }

    public android.text.Layout.Alignment getAlignment()
    {
        return h;
    }

    public Object getData()
    {
        return b;
    }

    public int getMaxLines()
    {
        return i;
    }

    public float getMaxScaledTextSize()
    {
        return (float)e;
    }

    public float getMinScaledTextSize()
    {
        return (float)d;
    }

    public int getTextColor()
    {
        return c;
    }

    public Typeface getTypefaceFamily()
    {
        return f;
    }

    public int getTypefaceStyle()
    {
        return g;
    }

    protected abstract l getVariableTextLayoutComputer();

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (viewtreeobserver != null && m != 0)
        {
            viewtreeobserver.removeOnPreDrawListener(n);
            m = 0;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        g();
        f();
        canvas.save();
        int j1 = getPaddingTop();
        int j2 = getPaddingRight();
        int i1 = getPaddingBottom();
        int k2 = getScrollX();
        int k1 = getScrollY();
        int l1 = getHeight() - i1 - j1;
        int i2 = k.getHeight();
        float f2 = getPaddingLeft() + k2;
        float f1;
        float f3;
        if (k1 == 0)
        {
            f1 = 0.0F;
        } else
        {
            f1 = j1 + k1;
        }
        f3 = (getWidth() - j2) + k2;
        j2 = getHeight();
        if (k1 == i2 - l1)
        {
            i1 = 0;
        }
        canvas.clipRect(f2, f1, f3, (j2 + k1) - i1);
        i1 = Math.max(0, l1 - k.getHeight()) / 2;
        canvas.translate(getPaddingLeft(), i1 + j1);
        k.draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int i1, int j1)
    {
        e e1 = com.facebook.debug.d.e.a("ThreadNameView.onMeasure");
        g();
        int l1 = getDefaultSize(16384, i1);
        Layout layout1 = (Layout)l.get(Integer.valueOf(l1));
        Layout layout = layout1;
        if (layout1 == null)
        {
            layout = d(l1 - (getPaddingLeft() + getPaddingRight()));
            l.put(Integer.valueOf(l1), layout);
        }
        int k1 = a(layout, i1);
        if (k1 == l1)
        {
            i1 = b(layout, j1);
            k = layout;
        } else
        {
            k = d(k1 - (getPaddingLeft() + getPaddingRight()));
            i1 = b(k, j1);
        }
        setMeasuredDimension(k1, i1);
        e1.a();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a();
    }

    public void setAlignment(android.text.Layout.Alignment alignment)
    {
        h = alignment;
        j = null;
        a();
        invalidate();
    }

    public void setData(Object obj)
    {
        b = obj;
        a();
        invalidate();
    }

    public void setMaxLines(int i1)
    {
        i = i1;
        a();
        invalidate();
    }

    public void setTextColor(int i1)
    {
        c = i1;
        j = null;
        invalidate();
    }

    public void setTypefaceFamily(Typeface typeface)
    {
        f = typeface;
        j = null;
        a();
        invalidate();
    }

    public void setTypefaceStyle(int i1)
    {
        g = i1;
        j = null;
        a();
        invalidate();
    }

}

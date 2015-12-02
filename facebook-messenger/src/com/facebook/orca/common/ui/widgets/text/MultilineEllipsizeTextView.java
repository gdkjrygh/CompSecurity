// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets.text;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.debug.d.e;
import com.facebook.q;
import com.google.common.a.hq;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.common.ui.widgets.text:
//            d, c

public class MultilineEllipsizeTextView extends View
{

    private static final Class a = com/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;
    private int b;
    private float c;
    private Typeface d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private int m;
    private CharSequence n;
    private TextPaint o;
    private c p;
    private int q;
    private c r;

    public MultilineEllipsizeTextView(Context context)
    {
        this(context, null);
    }

    public MultilineEllipsizeTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MultilineEllipsizeTextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        q = -1;
        attributeset = getContext().obtainStyledAttributes(attributeset, q.MultilineEllipsizeTextView, i1, 0);
        b = attributeset.getColor(q.MultilineEllipsizeTextView_textColor, Color.rgb(0, 0, 0));
        c = attributeset.getDimensionPixelSize(q.MultilineEllipsizeTextView_textSize, -1);
        f = attributeset.getInteger(q.MultilineEllipsizeTextView_minLines, 1);
        g = attributeset.getInteger(q.MultilineEllipsizeTextView_maxLines, 2);
        h = attributeset.getDimensionPixelSize(q.MultilineEllipsizeTextView_maxWidth, 0x7fffffff);
        i = attributeset.getBoolean(q.MultilineEllipsizeTextView_includeFontPadding, false);
        j = attributeset.getFloat(q.MultilineEllipsizeTextView_shadowDx, 0.0F);
        k = attributeset.getFloat(q.MultilineEllipsizeTextView_shadowDy, 0.0F);
        l = attributeset.getFloat(q.MultilineEllipsizeTextView_shadowRadius, 0.0F);
        m = attributeset.getInt(q.MultilineEllipsizeTextView_shadowColor, 0);
        i1 = attributeset.getInteger(q.MultilineEllipsizeTextView_textStyle, 0);
        a(attributeset.getInt(q.MultilineEllipsizeTextView_typeface, -1), i1);
        attributeset.recycle();
        if (c == -1F)
        {
            c = com.facebook.common.w.j.b(context, 14F);
        }
    }

    private int a(Layout layout)
    {
        int i1;
        int j1;
        boolean flag;
        flag = true;
        j1 = 0;
        i1 = 1;
_L2:
        int k1;
        int l1;
        k1 = ((flag) ? 1 : 0);
        if (j1 >= layout.getLineCount())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        l1 = layout.getParagraphDirection(j1);
        if (j1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = l1;
_L4:
        j1++;
        i1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        k1 = i1;
        if (i1 == l1) goto _L4; else goto _L3
_L3:
        k1 = 0;
        if (k1 != 0)
        {
            return i1;
        } else
        {
            return 0;
        }
    }

    private int a(Layout layout, int i1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(i1);
        float f1 = 0.0F;
        for (i1 = 0; i1 < layout.getLineCount(); i1++)
        {
            f1 = Math.max(f1, layout.getLineWidth(i1));
        }

        int k1 = (int)f1 + getPaddingLeft() + getPaddingRight();
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

    private StaticLayout a(d d1, TextPaint textpaint, int i1)
    {
        if (d1 == null)
        {
            return null;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        Iterator iterator = d1.a.iterator();
        for (boolean flag = true; iterator.hasNext(); flag = false)
        {
            CharSequence charsequence = (CharSequence)iterator.next();
            if (!flag)
            {
                spannablestringbuilder.append("\n");
            }
            spannablestringbuilder.append(com.facebook.common.w.n.b(charsequence));
        }

        int j1;
        if (d1.b == 0)
        {
            j1 = i1;
        } else
        {
            j1 = 16384;
        }
        return new StaticLayout(spannablestringbuilder, 0, spannablestringbuilder.length(), textpaint, j1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, i, android.text.TextUtils.TruncateAt.END, i1);
    }

    private c a(int i1)
    {
        b();
        i1 -= getPaddingLeft() + getPaddingRight();
        d d1 = a(n, o, i1, g, f);
        return new c(a(d1, o, i1), d1.b, null);
    }

    private d a(CharSequence charsequence, TextPaint textpaint, int i1, int j1, int k1)
    {
        java.util.ArrayList arraylist;
        int j2;
        int k2;
        int i3;
        if (com.facebook.common.w.n.a(charsequence))
        {
            return new d(Collections.emptyList(), 1, null);
        }
        textpaint = new StaticLayout(charsequence, textpaint, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, i);
        i3 = a(((Layout) (textpaint)));
        arraylist = hq.a();
        k2 = 0;
        j2 = j1;
_L2:
        int l2;
        if (j2 <= 0 || k2 >= textpaint.getLineCount())
        {
            break MISSING_BLOCK_LABEL_201;
        }
        l2 = textpaint.getLineStart(k2);
        if (k2 >= j1 - 1 && i3 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = textpaint.getLineEnd(k2);
        i1 = l1;
        if (charsequence.charAt(l1 - 1) == '\n')
        {
            i1 = l1 - 1;
        }
_L4:
        arraylist.add(charsequence.subSequence(l2, i1));
        k2++;
        j2--;
        if (true) goto _L2; else goto _L1
_L1:
        int i2 = l2;
_L6:
        i1 = i2;
        if (i2 >= charsequence.length()) goto _L4; else goto _L3
_L3:
        i1 = i2;
        if (charsequence.charAt(i2) == '\n') goto _L4; else goto _L5
_L5:
        i2++;
          goto _L6
        for (; arraylist.size() < k1; arraylist.add("")) { }
        return new d(arraylist, i3, null);
    }

    private void a()
    {
        p = null;
        r = null;
        q = -1;
        requestLayout();
        invalidate();
    }

    private void a(int i1, int j1)
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

    private int b(Layout layout, int i1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int j1 = android.view.View.MeasureSpec.getSize(i1);
        int k1 = layout.getHeight() + getPaddingTop() + getPaddingBottom();
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
        boolean flag = false;
        if (o == null)
        {
            o = new TextPaint(1);
            o.density = getResources().getDisplayMetrics().density;
            o.setTextSize(c);
            o.setColor(b);
            o.setTypeface(d);
            o.setShadowLayer(l, j, k, m);
            float f1;
            TextPaint textpaint;
            int i1;
            if (d != null)
            {
                i1 = d.getStyle();
            } else
            {
                i1 = 0;
            }
            i1 = ~i1 & e;
            textpaint = o;
            if ((i1 & 1) != 0)
            {
                flag = true;
            }
            textpaint.setFakeBoldText(flag);
            textpaint = o;
            if ((i1 & 2) != 0)
            {
                f1 = -0.25F;
            } else
            {
                f1 = 0.0F;
            }
            textpaint.setTextSkewX(f1);
        }
    }

    private void c()
    {
        if (p == null)
        {
            p = a(getWidth());
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
        d = typeface1;
        e = i1;
        o = null;
        a();
    }

    public int getMaxLines()
    {
        return g;
    }

    public int getMaxWidth()
    {
        return h;
    }

    public int getMinLines()
    {
        return f;
    }

    public CharSequence getText()
    {
        return n;
    }

    public int getTextColor()
    {
        return b;
    }

    public float getTextSize()
    {
        return c;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b();
        c();
        canvas.save();
        int i1 = getHeight();
        Layout layout = p.a;
        i1 = Math.max(0, i1 - layout.getHeight()) / 2;
        canvas.translate(getPaddingLeft(), i1);
        if (p.b == -1)
        {
            int j1 = getWidth();
            int k1 = getPaddingLeft();
            int l1 = getPaddingRight();
            canvas.translate(-(layout.getWidth() - (j1 - (k1 + l1))), 0.0F);
        }
        layout.draw(canvas);
        canvas.restore();
    }

    protected void onMeasure(int i1, int j1)
    {
        e e1 = com.facebook.debug.d.e.a("MultilineEllipsizeTextView.onMeasure");
        b();
        int k1 = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i1), h);
        if (k1 != q || r == null)
        {
            r = a(k1);
            q = k1;
        }
        setMeasuredDimension(a(r.a, i1), b(r.a, j1));
        e1.a();
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        a();
    }

    public void setMaxLines(int i1)
    {
        g = i1;
        a();
    }

    public void setMaxWidth(int i1)
    {
        h = i1;
        a();
    }

    public void setMinLines(int i1)
    {
        f = i1;
        a();
    }

    public void setText(CharSequence charsequence)
    {
        n = charsequence;
        a();
    }

    public void setTextColor(int i1)
    {
        b = i1;
        o = null;
    }

    public void setTextSize(float f1)
    {
        c = f1;
        o = null;
    }

}

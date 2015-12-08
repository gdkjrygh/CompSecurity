// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.widget.TextView;

public class AutoResizeTextView extends TextView
{
    private static interface a
    {

        public abstract int a(int i1, RectF rectf);
    }


    private RectF a;
    private RectF b;
    private SparseIntArray c;
    private TextPaint d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private final a m;

    public AutoResizeTextView(Context context)
    {
        super(context);
        a = new RectF();
        f = 1.0F;
        g = 0.0F;
        h = 20F;
        k = true;
        m = new a() {

            final AutoResizeTextView a;

            public int a(int i1, RectF rectf)
            {
                Object obj;
                boolean flag;
                flag = true;
                AutoResizeTextView.a(a).setTextSize(i1);
                obj = a.getText().toString();
                if (a.getMaxLines() == 1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 == 0) goto _L2; else goto _L1
_L1:
                AutoResizeTextView.b(a).bottom = AutoResizeTextView.a(a).getFontSpacing();
                AutoResizeTextView.b(a).right = AutoResizeTextView.a(a).measureText(((String) (obj)));
_L6:
                AutoResizeTextView.b(a).offsetTo(0.0F, 0.0F);
                i1 = ((flag) ? 1 : 0);
                if (rectf.contains(AutoResizeTextView.b(a)))
                {
                    i1 = -1;
                }
_L4:
                return i1;
_L2:
                obj = new StaticLayout(((CharSequence) (obj)), AutoResizeTextView.a(a), AutoResizeTextView.c(a), android.text.Layout.Alignment.ALIGN_NORMAL, AutoResizeTextView.d(a), AutoResizeTextView.e(a), true);
                if (a.getMaxLines() == -1)
                {
                    break; /* Loop/switch isn't completed */
                }
                i1 = ((flag) ? 1 : 0);
                if (((StaticLayout) (obj)).getLineCount() > a.getMaxLines()) goto _L4; else goto _L3
_L3:
                AutoResizeTextView.b(a).bottom = ((StaticLayout) (obj)).getHeight();
                i1 = 0;
                int j1;
                int k1;
                for (j1 = -1; i1 < ((StaticLayout) (obj)).getLineCount(); j1 = k1)
                {
                    k1 = j1;
                    if ((float)j1 < ((StaticLayout) (obj)).getLineWidth(i1))
                    {
                        k1 = (int)((StaticLayout) (obj)).getLineWidth(i1);
                    }
                    i1++;
                }

                AutoResizeTextView.b(a).right = j1;
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = AutoResizeTextView.this;
                super();
            }
        };
        a();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new RectF();
        f = 1.0F;
        g = 0.0F;
        h = 20F;
        k = true;
        m = new _cls1();
        a();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new RectF();
        f = 1.0F;
        g = 0.0F;
        h = 20F;
        k = true;
        m = new _cls1();
        a();
    }

    private int a(int i1, int j1, a a1, RectF rectf)
    {
        if (!k)
        {
            return b(i1, j1, a1, rectf);
        }
        String s = getText().toString();
        int k1;
        int l1;
        if (s == null)
        {
            k1 = 0;
        } else
        {
            k1 = s.length();
        }
        l1 = c.get(k1);
        if (l1 != 0)
        {
            return l1;
        } else
        {
            i1 = b(i1, j1, a1, rectf);
            c.put(k1, i1);
            return i1;
        }
    }

    static TextPaint a(AutoResizeTextView autoresizetextview)
    {
        return autoresizetextview.d;
    }

    private void a()
    {
        d = new TextPaint(getPaint());
        e = getTextSize();
        b = new RectF();
        c = new SparseIntArray();
        if (j == 0)
        {
            j = -1;
        }
        l = true;
    }

    private void a(String s)
    {
        if (!l)
        {
            return;
        } else
        {
            int i1 = (int)h;
            int j1 = getMeasuredHeight();
            int k1 = getCompoundPaddingBottom();
            int l1 = getCompoundPaddingTop();
            i = getMeasuredWidth() - getCompoundPaddingLeft() - getCompoundPaddingRight();
            b.right = i;
            b.bottom = j1 - k1 - l1;
            super.setTextSize(0, a(i1, (int)e, m, b));
            return;
        }
    }

    private static int b(int i1, int j1, a a1, RectF rectf)
    {
        int i2 = j1 - 1;
        j1 = i1;
        int k1 = i1;
        i1 = j1;
        j1 = k1;
        for (int l1 = i2; i1 <= l1;)
        {
            j1 = i1 + l1 >>> 1;
            int j2 = a1.a(j1, rectf);
            if (j2 < 0)
            {
                j2 = j1 + 1;
                j1 = i1;
                i1 = j2;
            } else
            if (j2 > 0)
            {
                l1 = j1 - 1;
                j1 = l1;
            } else
            {
                return j1;
            }
        }

        return j1;
    }

    static RectF b(AutoResizeTextView autoresizetextview)
    {
        return autoresizetextview.a;
    }

    private void b()
    {
        a(getText().toString());
    }

    static int c(AutoResizeTextView autoresizetextview)
    {
        return autoresizetextview.i;
    }

    static float d(AutoResizeTextView autoresizetextview)
    {
        return autoresizetextview.f;
    }

    static float e(AutoResizeTextView autoresizetextview)
    {
        return autoresizetextview.g;
    }

    public int getMaxLines()
    {
        return j;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        c.clear();
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            b();
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
        super.onTextChanged(charsequence, i1, j1, k1);
        b();
    }

    public void setLineSpacing(float f1, float f2)
    {
        super.setLineSpacing(f1, f2);
        f = f2;
        g = f1;
    }

    public void setLines(int i1)
    {
        super.setLines(i1);
        j = i1;
        b();
    }

    public void setMaxLines(int i1)
    {
        super.setMaxLines(i1);
        j = i1;
        b();
    }

    public void setMinTextSize(float f1)
    {
        h = f1;
        b();
    }

    public void setSingleLine()
    {
        super.setSingleLine();
        j = 1;
        b();
    }

    public void setSingleLine(boolean flag)
    {
        super.setSingleLine(flag);
        if (flag)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        b();
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        a(charsequence.toString());
    }

    public void setTextSize(float f1)
    {
        e = f1;
        c.clear();
        a(getText().toString());
    }

    public void setTextSize(int i1, float f1)
    {
        Object obj = getContext();
        if (obj == null)
        {
            obj = Resources.getSystem();
        } else
        {
            obj = ((Context) (obj)).getResources();
        }
        e = TypedValue.applyDimension(i1, f1, ((Resources) (obj)).getDisplayMetrics());
        c.clear();
        a(getText().toString());
    }
}

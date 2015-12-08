// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.x;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//            Snackbar

public static class setClickable extends LinearLayout
{
    static interface a
    {

        public abstract void a();
    }


    TextView a;
    TextView b;
    private int c;
    private int d;
    private a e;

    private boolean a(int i, int j, int k)
    {
        boolean flag = false;
        if (i != getOrientation())
        {
            setOrientation(i);
            flag = true;
        }
        if (a.getPaddingTop() != j || a.getPaddingBottom() != k)
        {
            TextView textview = a;
            if (x.B(textview))
            {
                x.b(textview, x.m(textview), j, x.n(textview), k);
            } else
            {
                textview.setPadding(textview.getPaddingLeft(), j, textview.getPaddingRight(), k);
            }
            flag = true;
        }
        return flag;
    }

    TextView getActionView()
    {
        return b;
    }

    TextView getMessageView()
    {
        return a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(android.support.design.Layout.findViewById);
        b = (TextView)findViewById(android.support.design.Layout.findViewById);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag && e != null)
        {
            e.a();
        }
    }

    protected void onMeasure(int i, int j)
    {
        int l;
        int i1;
        super.onMeasure(i, j);
        int k = i;
        if (c > 0)
        {
            k = i;
            if (getMeasuredWidth() > c)
            {
                k = android.view.sureSpec(c, 0x40000000);
                super.onMeasure(k, j);
            }
        }
        l = getResources().getDimensionPixelSize(android.support.design.tical_2lines);
        i1 = getResources().getDimensionPixelSize(android.support.design.tical);
        if (a.getLayout().getLineCount() > 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 || d <= 0 || b.getMeasuredWidth() <= d) goto _L2; else goto _L1
_L1:
        if (!a(1, l, l - i1)) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        if (i != 0)
        {
            super.onMeasure(k, j);
        }
        return;
_L2:
        if (i != 0)
        {
            i = l;
        } else
        {
            i = i1;
        }
        if (a(0, i, i))
        {
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void setOnLayoutChangeListener(a a1)
    {
        e = a1;
    }

    public a(Context context)
    {
        this(context, null);
    }

    public <init>(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.Layout);
        c = attributeset.getDimensionPixelSize(android.support.design.id_maxWidth, -1);
        d = attributeset.getDimensionPixelSize(android.support.design.tionInlineWidth, -1);
        if (attributeset.hasValue(android.support.design.tion))
        {
            x.f(this, attributeset.getDimensionPixelSize(android.support.design.tion, 0));
        }
        attributeset.recycle();
        setClickable(true);
        LayoutInflater.from(context).inflate(android.support.design.ude, this);
    }
}

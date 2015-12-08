// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.af;
import android.support.v4.view.x;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//            Snackbar

public static class ude extends LinearLayout
{
    static interface a
    {

        public abstract void a();
    }


    private TextView a;
    private Button b;
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

    final void a()
    {
        x.c(a, 0.0F);
        x.s(a).a(1.0F).a(180L).b(70L).e();
        if (b.getVisibility() == 0)
        {
            x.c(b, 0.0F);
            x.s(b).a(1.0F).a(180L).b(70L).e();
        }
    }

    final void a(a a1)
    {
        e = a1;
    }

    final void b()
    {
        x.c(a, 1.0F);
        x.s(a).a(0.0F).a(180L).b(0L).e();
        if (b.getVisibility() == 0)
        {
            x.c(b, 1.0F);
            x.s(b).a(0.0F).a(180L).b(0L).e();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(android.support.design.Layout.findViewById);
        b = (Button)findViewById(android.support.design.Layout.findViewById);
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
        boolean flag;
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
        l = getResources().getDimensionPixelSize(android.support.design.ing_vertical_2lines);
        i1 = getResources().getDimensionPixelSize(android.support.design.ing_vertical);
        if (a.getLayout().getLineCount() > 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag = false;
        if (i == 0 || d <= 0 || b.getMeasuredWidth() <= d) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
        if (a(1, l, l - i1))
        {
            i = 1;
        }
_L4:
        if (i != 0)
        {
            super.onMeasure(k, j);
        }
        return;
_L2:
        if (i == 0)
        {
            l = i1;
        }
        i = ((flag) ? 1 : 0);
        if (a(0, l, l))
        {
            i = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
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
        LayoutInflater.from(context).inflate(android.support.design.ar_include, this);
    }
}

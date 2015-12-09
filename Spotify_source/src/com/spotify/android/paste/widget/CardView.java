// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dfh;
import dgi;
import dgj;
import dgk;
import dgn;
import dgo;
import dhr;

public class CardView extends ViewGroup
{

    private static final int f[] = {
        0x10100a2
    };
    public ImageView a;
    public TextView b;
    public TextView c;
    public int d;
    public boolean e;
    private CardTextType g;
    private TextView h;
    private boolean i;
    private dgj j;
    private ViewGroup k;
    private dhr l;
    private int m;
    private Drawable n;

    public CardView(Context context)
    {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        dgn.a(com/spotify/android/paste/widget/CardView, this);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.g, 0x7f0101ef, 0);
        Drawable drawable = attributeset.getDrawable(dfh.l);
        Drawable drawable1 = attributeset.getDrawable(dfh.h);
        i1 = attributeset.getColor(dfh.p, 0xff888888);
        int j1 = attributeset.getInt(dfh.s, 0);
        int k1 = attributeset.getInt(dfh.v, CardTextType.a.ordinal());
        int l1 = attributeset.getResourceId(dfh.w, 0);
        int i2 = attributeset.getResourceId(dfh.t, 0);
        int j2 = attributeset.getResourceId(dfh.r, 0);
        String s = attributeset.getString(dfh.o);
        String s1 = attributeset.getString(dfh.n);
        String s2 = attributeset.getString(dfh.q);
        boolean flag = attributeset.getBoolean(dfh.j, true);
        boolean flag1 = attributeset.getBoolean(dfh.k, true);
        boolean flag2 = attributeset.getBoolean(dfh.i, true);
        Drawable drawable2 = attributeset.getDrawable(dfh.m);
        d = attributeset.getDimensionPixelOffset(dfh.u, 0);
        attributeset.recycle();
        a = new ImageView(context);
        b = new TextView(context);
        h = new TextView(context);
        c = new TextView(context);
        b.setText(s);
        h.setText(s1);
        c.setText(s2);
        b.setDuplicateParentStateEnabled(true);
        h.setDuplicateParentStateEnabled(true);
        c.setDuplicateParentStateEnabled(true);
        if (drawable1 == null)
        {
            setBackgroundColor(0xffcccccc);
        } else
        {
            dgo.a(this, drawable1);
        }
        a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        a.setBackgroundColor(i1);
        if (drawable2 != null)
        {
            a.setImageDrawable(drawable2);
        }
        if (j1 == 0)
        {
            attributeset = new dgk(this, (byte)0);
        } else
        {
            attributeset = new dgi(this, (byte)0);
        }
        j = attributeset;
        if (l1 != 0)
        {
            dgo.a(context, b, l1);
        }
        if (i2 != 0)
        {
            dgo.a(context, h, i2);
        }
        if (j2 != 0)
        {
            dgo.a(context, c, j2);
        }
        a(CardTextType.values()[k1]);
        c.setMaxLines(1);
        b.setEllipsize(android.text.TextUtils.TruncateAt.END);
        h.setEllipsize(android.text.TextUtils.TruncateAt.END);
        c.setEllipsize(android.text.TextUtils.TruncateAt.END);
        k = new LinearLayout(context);
        k.setDuplicateParentStateEnabled(true);
        k.setClipChildren(false);
        l = new dhr(k);
        addView(a);
        addView(b);
        addView(h);
        addView(c);
        addView(k);
        setClickable(flag2);
        setFocusable(flag1);
        setEnabled(flag);
        setClipChildren(false);
        setForeground(drawable);
        e = true;
    }

    public static int a(int i1, int j1)
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1) - j1, android.view.View.MeasureSpec.getMode(i1));
    }

    public static int a(int i1, int j1, int k1, int l1, int i2)
    {
        float f2;
        float f3;
        f2 = (float)i1 / (float)((k1 - l1) + i2);
        f3 = f2 - (float)(int)f2;
        if (f3 >= 0.2F) goto _L2; else goto _L1
_L1:
        float f1 = (float)(int)f2 + 0.2F;
_L4:
        f1 = Math.max(f1, (float)(j1 - 1) + 0.2F);
        return ((int)((float)i1 / f1) - i2) + l1;
_L2:
        f1 = f2;
        if (f3 > 0.8F)
        {
            f1 = (float)(int)(f2 + 1.0F) + 0.2F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int a(TextView textview)
    {
        if (textview.getVisibility() == 8)
        {
            return 0;
        } else
        {
            textview = textview.getPaint().getFontMetricsInt();
            int i1 = ((android.graphics.Paint.FontMetricsInt) (textview)).bottom;
            int j1 = ((android.graphics.Paint.FontMetricsInt) (textview)).top;
            return (((android.graphics.Paint.FontMetricsInt) (textview)).leading + (i1 - j1)) * 1;
        }
    }

    public static ImageView a(CardView cardview)
    {
        return cardview.a;
    }

    public static void a(CardView cardview, int i1, int j1)
    {
        cardview.setMeasuredDimension(i1, j1);
    }

    public static int b(int i1)
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
    }

    public static ViewGroup b(CardView cardview)
    {
        return cardview.k;
    }

    public static void b(CardView cardview, int i1, int j1)
    {
        cardview.setMeasuredDimension(i1, j1);
    }

    public static int c(CardView cardview)
    {
        return cardview.d;
    }

    public static boolean d(CardView cardview)
    {
        return cardview.e;
    }

    public static float e()
    {
        return 0.0F;
    }

    public static TextView e(CardView cardview)
    {
        return cardview.b;
    }

    public static TextView f(CardView cardview)
    {
        return cardview.h;
    }

    public static TextView g(CardView cardview)
    {
        return cardview.c;
    }

    public static int h(CardView cardview)
    {
        return cardview.m;
    }

    public final void a()
    {
        a(false);
    }

    public final void a(int i1)
    {
        m = i1;
    }

    public final void a(View view)
    {
        l.a(view);
    }

    public final void a(CardTextType cardtexttype)
    {
        g = cardtexttype;
        public final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CardTextType.values().length];
                try
                {
                    a[CardTextType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CardTextType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CardTextType.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[g.ordinal()])
        {
        default:
            b.setMaxLines(2);
            h.setMaxLines(1);
            return;

        case 1: // '\001'
            b.setMaxLines(1);
            h.setMaxLines(1);
            return;

        case 2: // '\002'
            b.setMaxLines(1);
            break;
        }
        h.setMaxLines(2);
    }

    public final void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            l.a(null);
            m = 0;
        }
        a.setImageResource(0);
        a("");
        b("");
        c("");
        e = true;
        b(false);
    }

    public final ImageView b()
    {
        return a;
    }

    public final void b(CharSequence charsequence)
    {
        h.setText(charsequence);
    }

    public final void b(boolean flag)
    {
        i = flag;
        refreshDrawableState();
    }

    public final void c()
    {
        e = false;
    }

    public final void c(CharSequence charsequence)
    {
        c.setText(charsequence);
    }

    public final View d()
    {
        return l.a;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (n != null)
        {
            int i1 = getRight();
            int j1 = getLeft();
            int k1 = getBottom();
            int l1 = getTop();
            n.setBounds(0, 0, i1 - j1, k1 - l1);
            n.draw(canvas);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (n != null && n.isStateful())
        {
            n.setState(getDrawableState());
        }
    }

    public Drawable getForeground()
    {
        return n;
    }

    public boolean hasFocusable()
    {
        return false;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (n != null)
        {
            n.jumpToCurrentState();
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (i)
        {
            mergeDrawableStates(ai, f);
        }
        return ai;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j.a(i1, j1, k1, l1);
    }

    protected void onMeasure(int i1, int j1)
    {
        l.a();
        j.a(i1, j1);
    }

    public void setForeground(Drawable drawable)
    {
        if (n != drawable)
        {
            if (n != null)
            {
                n.setCallback(null);
                unscheduleDrawable(n);
            }
            n = drawable;
            if (drawable != null)
            {
                drawable.setCallback(this);
                if (drawable.isStateful())
                {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == n;
    }


    private class CardTextType extends Enum
    {

        public static final CardTextType a;
        public static final CardTextType b;
        public static final CardTextType c;
        private static final CardTextType d[];

        public static CardTextType valueOf(String s)
        {
            return (CardTextType)Enum.valueOf(com/spotify/android/paste/widget/CardView$CardTextType, s);
        }

        public static CardTextType[] values()
        {
            return (CardTextType[])d.clone();
        }

        static 
        {
            a = new CardTextType("EXPAND_TITLE", 0);
            b = new CardTextType("EXPAND_SUBTITLE", 1);
            c = new CardTextType("EXPAND_NONE", 2);
            d = (new CardTextType[] {
                a, b, c
            });
        }

        private CardTextType(String s, int i1)
        {
            super(s, i1);
        }
    }

}

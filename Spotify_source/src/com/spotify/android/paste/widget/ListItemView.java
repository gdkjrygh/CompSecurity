// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.internal.ListItemImageView;
import dfh;
import dgn;
import dgo;
import dhr;
import dht;

public class ListItemView extends LinearLayout
{

    private static final int p[] = {
        0x10100a2
    };
    private static final int q[] = {
        0x10100d4
    };
    private ImageView a;
    private TextView b;
    private TextView c;
    private dhr d;
    private dhr e;
    private dhr f;
    private int g;
    private ColorStateList h;
    private int i;
    private ColorStateList j;
    private int k;
    private ColorStateList l;
    private boolean m;
    private dht n;
    private boolean o;

    public ListItemView(Context context)
    {
        this(context, null);
    }

    public ListItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0101ee);
    }

    public ListItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        dgn.a(com/spotify/android/paste/widget/ListItemView, this);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, q, i1, 0);
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        dgo.a(this, drawable);
        attributeset = context.obtainStyledAttributes(attributeset, dfh.Y, i1, 0);
        g = attributeset.getResourceId(dfh.ah, 0);
        h = attributeset.getColorStateList(dfh.ai);
        i = attributeset.getResourceId(dfh.af, 0);
        j = attributeset.getColorStateList(dfh.ag);
        k = attributeset.getResourceId(dfh.ab, 0);
        l = attributeset.getColorStateList(dfh.ac);
        i1 = attributeset.getDimensionPixelOffset(dfh.ae, 0);
        int j1 = attributeset.getDimensionPixelOffset(dfh.ad, 0);
        int k1 = attributeset.getDimensionPixelSize(dfh.aa, 0);
        attributeset.getDimensionPixelSize(dfh.Z, 0);
        attributeset.recycle();
        setPadding(i1, 0, i1, 0);
        setMinimumHeight(j1);
        setOrientation(0);
        setGravity(16);
        inflate(context, 0x7f030104, this);
        b = (TextView)findViewById(0x7f11026e);
        c = (TextView)findViewById(0x7f1102ef);
        if (g != 0)
        {
            dgo.a(context, b, g);
        }
        if (i != 0)
        {
            dgo.a(context, c, i);
        }
        if (h != null)
        {
            b.setTextColor(h);
        }
        if (j != null)
        {
            c.setTextColor(j);
        }
        d = new dhr((ViewGroup)findViewById(0x7f1102f7));
        e = new dhr((ViewGroup)findViewById(0x7f110475));
        f = new dhr((ViewGroup)findViewById(0x7f1102f5));
        a = new ListItemImageView(context);
        a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        a.setLayoutParams(new android.widget.LinearLayout.LayoutParams(k1, k1));
        c();
        n = new dht(getContext());
        a(true);
        setWillNotDraw(false);
    }

    private void a(TextView textview, TextAppearance textappearance)
    {
        if (textview.getTag(0x7f1100e2) == textappearance)
        {
            return;
        }
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[TextAppearance.values().length];
                try
                {
                    a[TextAppearance.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TextAppearance.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TextAppearance.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[textappearance.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 74
    //                   2 117
    //                   3 131;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder("appearance ")).append(textappearance).append(" not implemented!").toString());
_L2:
        ColorStateList colorstatelist;
        int i1;
        i1 = g;
        colorstatelist = h;
_L6:
        if (i1 != 0)
        {
            dgo.a(getContext(), textview, i1);
        }
        if (colorstatelist != null)
        {
            textview.setTextColor(colorstatelist);
        }
        textview.setTag(0x7f1100e2, textappearance);
        return;
_L3:
        i1 = i;
        colorstatelist = j;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = k;
        colorstatelist = l;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final ImageView a()
    {
        if (d.a != a)
        {
            throw new IllegalStateException("This ListItemView has a prefix view set.");
        } else
        {
            return a;
        }
    }

    public final void a(View view)
    {
        f.a(view);
    }

    public final void a(CharSequence charsequence)
    {
        TextAppearance textappearance = TextAppearance.a;
        b.setText(charsequence);
        a(b, textappearance);
    }

    public final void a(boolean flag)
    {
        View view;
        o = flag;
        view = findViewById(0x7f1102f7);
        if (n == null) goto _L2; else goto _L1
_L1:
        if (!o) goto _L4; else goto _L3
_L3:
        dht dht1 = n;
        if (dht1.a == null) goto _L4; else goto _L5
_L5:
        int i1 = dht1.a.getIntrinsicHeight();
_L6:
        view.setPadding(0, 0, 0, i1);
        return;
_L4:
        i1 = 0;
        if (true) goto _L6; else goto _L2
_L2:
        view.setPadding(0, 0, 0, 0);
        return;
    }

    public final TextView b()
    {
        return c;
    }

    public final void b(CharSequence charsequence)
    {
        TextAppearance textappearance = TextAppearance.b;
        boolean flag = TextUtils.isEmpty(charsequence);
        TextView textview = c;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        c.setText(charsequence);
        if (!flag)
        {
            a(c, textappearance);
        }
    }

    public final void b(boolean flag)
    {
        m = flag;
        refreshDrawableState();
    }

    public final void c()
    {
        d.a(a);
        f.a(null);
        e.a(null);
        a(true);
        a.setImageResource(0);
        a("");
        b("");
        b(false);
        setActivated(false);
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (m)
        {
            mergeDrawableStates(ai, p);
        }
        return ai;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o)
        {
            n.a(canvas, getWidth(), getHeight());
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
    }

    protected void onMeasure(int i1, int j1)
    {
        d.a();
        f.a();
        e.a();
        super.onMeasure(i1, j1);
    }


    private class TextAppearance extends Enum
    {

        public static final TextAppearance a;
        public static final TextAppearance b;
        public static final TextAppearance c;
        private static final TextAppearance d[];

        public static TextAppearance valueOf(String s)
        {
            return (TextAppearance)Enum.valueOf(com/spotify/android/paste/widget/ListItemView$TextAppearance, s);
        }

        public static TextAppearance[] values()
        {
            return (TextAppearance[])d.clone();
        }

        static 
        {
            a = new TextAppearance("PRIMARY", 0);
            b = new TextAppearance("SECONDARY", 1);
            c = new TextAppearance("METADATA", 2);
            d = (new TextAppearance[] {
                a, b, c
            });
        }

        private TextAppearance(String s, int i1)
        {
            super(s, i1);
        }
    }

}

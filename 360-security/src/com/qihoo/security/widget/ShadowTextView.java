// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.AttributeSet;
import android.widget.TextView;
import com.qihoo.security.locale.c;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;

public class ShadowTextView extends LocaleTextView
{
    static class a extends CharacterStyle
        implements UpdateAppearance
    {

        private final int a[];

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setStyle(android.graphics.Paint.Style.FILL);
            LinearGradient lineargradient = new LinearGradient(0.0F, 0.0F, 0.0F, textpaint.getTextSize() * (float)a.length, a, null, android.graphics.Shader.TileMode.MIRROR);
            lineargradient.setLocalMatrix(new Matrix());
            textpaint.setShader(lineargradient);
        }

        public a(int ai[])
        {
            a = ai;
        }
    }


    private TextView a;
    private final boolean b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final TextPaint g;
    private final boolean h;

    public ShadowTextView(Context context)
    {
        this(context, null);
    }

    public ShadowTextView(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        a = null;
        h = true;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.ShadowTextView);
        c = typedarray.getDimension(2, 0.0F);
        d = typedarray.getDimension(0, 0.0F);
        e = typedarray.getDimension(1, 0.0F);
        f = typedarray.getColor(3, 0);
        if (!typedarray.getBoolean(4, false) || !com.qihoo.security.locale.c.a(context, com.qihoo.security.locale.d.a().f(), "en"))
        {
            flag = false;
        }
        b = flag;
        setShadowLayer(c, d, e, f);
        setPadding(0, 0, (int)d, (int)e);
        typedarray.recycle();
        if (b)
        {
            setTextColor(0x11000000 | getPaint().getColor() & 0xffffff);
            a = new TextView(context, attributeset);
            a.setGravity(getGravity());
            a.setShadowLayer(c, d, e, 0);
        }
        g = getPaint();
    }

    private void a()
    {
        if (b)
        {
            SpannableString spannablestring = new SpannableString(getText());
            spannablestring.setSpan(new a(new int[] {
                -1, 0x33ffffff
            }), 0, getText().length(), 0);
            a.setText(spannablestring);
            a.postInvalidate();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (a != null)
        {
            a.draw(canvas);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (a != null)
        {
            a.layout(i, j, k, l);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a != null)
        {
            a.measure(i, j);
        }
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setLayoutParams(layoutparams);
        if (a != null)
        {
            a.setLayoutParams(layoutparams);
        }
    }

    public void setLocalText(int i)
    {
        super.setLocalText(i);
        a();
    }

    public void setLocalText(CharSequence charsequence)
    {
        super.setLocalText(charsequence);
        a();
    }

    public void setTypeface(Typeface typeface)
    {
        super.setTypeface(typeface);
    }
}

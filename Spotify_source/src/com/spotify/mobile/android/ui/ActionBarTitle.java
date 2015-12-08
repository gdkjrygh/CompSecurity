// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import dgd;
import dge;

public final class ActionBarTitle
    implements Spanned, CharSequence
{

    public float a;
    float b;
    private SpannableString c;
    private Typeface d;

    public ActionBarTitle(Context context, String s)
    {
        this(context, s, false);
    }

    public ActionBarTitle(Context context, String s, boolean flag)
    {
        a = 1.0F;
        b = 1.0F;
        if (s == null)
        {
            s = "";
        }
        String s1 = s;
        if (!flag)
        {
            s1 = s.toUpperCase(context.getResources().getConfiguration().locale);
        }
        if (flag)
        {
            d = dgd.c(context, 0x7f010006);
        } else
        {
            d = dgd.b(context, 0x7f0101e4);
        }
        context = new SpannableString(s1);
        context.setSpan(new dge(d), 0, s1.length(), 33);
        context.setSpan(new AlphaSpan(), 0, s1.length(), 33);
        c = context;
    }

    static float a(ActionBarTitle actionbartitle)
    {
        return actionbartitle.a;
    }

    static float b(ActionBarTitle actionbartitle)
    {
        return actionbartitle.b;
    }

    public final char charAt(int i)
    {
        return c.charAt(i);
    }

    public final int getSpanEnd(Object obj)
    {
        return c.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj)
    {
        return c.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj)
    {
        return c.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int j, Class class1)
    {
        return c.getSpans(i, j, class1);
    }

    public final int length()
    {
        return c.length();
    }

    public final int nextSpanTransition(int i, int j, Class class1)
    {
        return c.nextSpanTransition(i, j, class1);
    }

    public final CharSequence subSequence(int i, int j)
    {
        return c.subSequence(i, j);
    }

    public final String toString()
    {
        return c.toString();
    }

    private class AlphaSpan extends ForegroundColorSpan
    {

        private ActionBarTitle a;

        public void updateDrawState(TextPaint textpaint)
        {
            int i = getForegroundColor();
            textpaint.setColor(Color.argb((int)(ActionBarTitle.a(a) * ActionBarTitle.b(a) * 255F), Color.red(i), Color.green(i), Color.blue(i)));
        }

        AlphaSpan()
        {
            a = ActionBarTitle.this;
            super(-1);
        }
    }

}

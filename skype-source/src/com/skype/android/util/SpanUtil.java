// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;

public class SpanUtil
{
    private class URLSpanWithoutUnderline extends URLSpan
    {

        final SpanUtil a;

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
            textpaint.setColor(SpanUtil.a(a));
        }

        public URLSpanWithoutUnderline(String s)
        {
            a = SpanUtil.this;
            super(s);
        }
    }


    private int a;

    public SpanUtil(Context context)
    {
        a = context.getResources().getColor(com.skype.android.widget.R.color.skype_link);
    }

    static int a(SpanUtil spanutil)
    {
        return spanutil.a;
    }

    public static void b(Spannable spannable)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            spannable.removeSpan(aurlspan[i]);
        }

    }

    public final void a(Spannable spannable)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = spannable.getSpanStart(urlspan);
            int l = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new URLSpanWithoutUnderline(urlspan.getURL()), k, l, 0);
        }

    }
}

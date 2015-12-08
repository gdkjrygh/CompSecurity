// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class LinkFriendlyTextView extends TextView
{
    static class URLSpanNoUnderline extends URLSpan
    {

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
        }

        public URLSpanNoUnderline(String s)
        {
            super(s);
        }
    }


    public LinkFriendlyTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setMovementMethod(LinkMovementMethod.getInstance());
        setLinkTextColor(context.getResources().getColor(0x7f0c0045));
        a(this);
    }

    private static void a(TextView textview)
    {
        Spannable spannable = (Spannable)textview.getText();
        if (spannable == null)
        {
            throw new NullPointerException();
        }
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = spannable.getSpanStart(urlspan);
            int l = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new URLSpanNoUnderline(urlspan.getURL()), k, l, 0);
        }

        textview.setText(spannable);
    }
}

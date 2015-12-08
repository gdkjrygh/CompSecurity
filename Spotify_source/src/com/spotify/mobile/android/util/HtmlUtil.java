// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.text.Spannable;
import android.text.style.URLSpan;
import gdt;

public final class HtmlUtil
{

    public static void a(Spannable spannable, gdt gdt)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int j = aurlspan.length;
        for (int i = 0; i < j; i++)
        {
            URLSpan urlspan = aurlspan[i];
            int k = spannable.getSpanStart(urlspan);
            int l = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new UnderlineFreeClickableSpan(urlspan.getURL(), gdt), k, l, 0);
        }

    }

    private class UnderlineFreeClickableSpan extends URLSpan
    {

        private gdt a;

        public void onClick(View view)
        {
            boolean flag = false;
            if (a != null)
            {
                flag = a.a(getURL());
            }
            if (!flag)
            {
                super.onClick(view);
            }
            view.invalidate();
        }

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
        }

        public UnderlineFreeClickableSpan(String s, gdt gdt1)
        {
            super(s);
            a = gdt1;
        }
    }

}

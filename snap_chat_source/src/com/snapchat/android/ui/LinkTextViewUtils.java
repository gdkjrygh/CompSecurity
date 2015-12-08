// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public final class LinkTextViewUtils
{
    public static class CustomURLSpan extends URLSpan
    {

        private final a a;

        public void onClick(View view)
        {
            a.a();
        }

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
        }

        public CustomURLSpan(String s, a a1)
        {
            super(s);
            a = a1;
        }
    }

    public static interface a
    {

        public abstract void a();
    }

}

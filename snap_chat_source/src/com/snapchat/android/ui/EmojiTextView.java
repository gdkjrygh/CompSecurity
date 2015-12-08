// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import LX;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class EmojiTextView extends TextView
{

    public EmojiTextView(Context context)
    {
        super(context);
    }

    public EmojiTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public EmojiTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private static void a(Resources resources, Spannable spannable, int i)
    {
        boolean flag = false;
        int j1 = spannable.length();
        LX alx[] = (LX[])spannable.getSpans(0, j1, LX);
        int k = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (k >= alx.length)
            {
                break;
            }
            spannable.removeSpan(alx[k]);
            k++;
        } while (true);
        int i1;
        for (; j < j1; j += i1)
        {
            int l = Character.codePointAt(spannable, j);
            i1 = Character.charCount(l);
            if (i1 > 1 || Character.getType(l) == 28)
            {
                spannable.setSpan(new LX(resources, new String(Character.toChars(l)), i), j, j + i1, 33);
            }
        }

    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        Object obj = charsequence;
        if (!TextUtils.isEmpty(charsequence))
        {
            obj = new SpannableStringBuilder(charsequence);
            int i = (int)(getTextSize() * 1.2F);
            a(getResources(), ((Spannable) (obj)), i);
        }
        super.setText(((CharSequence) (obj)), buffertype);
    }
}

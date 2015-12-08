// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.TextAppearanceSpan;
import com.fitbit.util.fonts.CustomTypefaceSpan;
import com.fitbit.util.fonts.FitbitFont;

public class bl extends SpannableStringBuilder
{

    public bl()
    {
    }

    public static Spanned a(Spanned spanned, int i, Spanned spanned1)
    {
        String s = (new StringBuilder()).append("%").append(i).append("$s").toString();
        i = 0;
        boolean flag = false;
        Spanned spanned2 = spanned;
        do
        {
            int k = TextUtils.indexOf(spanned2, s, i);
            int j = s.length() + k;
            if (k >= 0)
            {
                if (k > 0)
                {
                    spanned = (Spanned)TextUtils.concat(new CharSequence[] {
                        spanned2.subSequence(0, k), spanned1
                    });
                } else
                {
                    spanned = spanned1;
                }
                i = spanned.length();
                if (j < spanned2.length())
                {
                    spanned = (Spanned)TextUtils.concat(new CharSequence[] {
                        spanned, spanned2.subSequence(j, spanned2.length())
                    });
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = ((flag) ? 1 : 0);
                }
            } else
            {
                j = 1;
                spanned = spanned2;
            }
            flag = j;
            spanned2 = spanned;
        } while (!j);
        return spanned;
    }

    private static CharacterStyle a(Context context)
    {
        return new TextAppearanceSpan(context, 0x7f0c01ef);
    }

    private void a(CharacterStyle characterstyle, String s)
    {
        if (s != null && s.length() > 0 && characterstyle != null)
        {
            setSpan(characterstyle, length() - s.length(), length(), 33);
        }
    }

    private static CharacterStyle b(Context context)
    {
        return new TextAppearanceSpan(context, 0x7f0c01f0);
    }

    private static CharacterStyle c(Context context)
    {
        return new TextAppearanceSpan(context, 0x7f0c01f1);
    }

    private static CharacterStyle d(Context context)
    {
        return new CustomTypefaceSpan(FitbitFont.e.a(context, Typeface.DEFAULT));
    }

    private static CharacterStyle e(Context context)
    {
        return new CustomTypefaceSpan(FitbitFont.h.a(context, Typeface.DEFAULT));
    }

    public void a(Context context, String s)
    {
        append(s);
        a(a(context), s);
        a(d(context), s);
    }

    public void b(Context context, String s)
    {
        append(s);
        a(b(context), s);
        a(d(context), s);
    }

    public void c(Context context, String s)
    {
        append(s);
        a(c(context), s);
        a(e(context), s);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l
    implements InputFilter
{

    private static final Pattern a = Pattern.compile(" ");

    public l()
    {
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int i1)
    {
        spanned = spanned.toString();
        boolean flag = spanned.endsWith(" ");
        boolean flag1 = spanned.endsWith("\n\n");
        if (charsequence.length() == 0)
        {
            return null;
        }
        if (flag && charsequence.charAt(i) == ' ')
        {
            spanned = a.matcher(charsequence.toString()).replaceFirst("");
        } else
        if (flag1 && charsequence.charAt(i) == '\n')
        {
            spanned = charsequence.toString().replaceAll("\n", "");
        } else
        {
            spanned = null;
        }
        if ((charsequence instanceof Spanned) && spanned != null)
        {
            spanned = new SpannableString(spanned);
            TextUtils.copySpansFrom((Spanned)charsequence, i, j, null, spanned, 0);
            return spanned;
        } else
        {
            return spanned;
        }
    }

}

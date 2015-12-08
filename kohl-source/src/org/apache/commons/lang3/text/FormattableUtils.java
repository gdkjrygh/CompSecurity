// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.util.Formattable;
import java.util.Formatter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

public class FormattableUtils
{

    private static final String SIMPLEST_FORMAT = "%s";

    public FormattableUtils()
    {
    }

    public static Formatter append(CharSequence charsequence, Formatter formatter, int i, int j, int k)
    {
        return append(charsequence, formatter, i, j, k, ' ', null);
    }

    public static Formatter append(CharSequence charsequence, Formatter formatter, int i, int j, int k, char c)
    {
        return append(charsequence, formatter, i, j, k, c, null);
    }

    public static Formatter append(CharSequence charsequence, Formatter formatter, int i, int j, int k, char c, CharSequence charsequence1)
    {
        StringBuilder stringbuilder;
        boolean flag;
        if (charsequence1 == null || k < 0 || charsequence1.length() <= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Validate.isTrue(flag, "Specified ellipsis '%1$s' exceeds precision of %2$s", new Object[] {
            charsequence1, Integer.valueOf(k)
        });
        stringbuilder = new StringBuilder(charsequence);
        if (k >= 0 && k < charsequence.length())
        {
            charsequence1 = (CharSequence)ObjectUtils.defaultIfNull(charsequence1, "");
            stringbuilder.replace(k - charsequence1.length(), charsequence.length(), charsequence1.toString());
        }
        if ((i & 1) == 1)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        i = stringbuilder.length();
        while (i < j) 
        {
            int l;
            if (k != 0)
            {
                l = i;
            } else
            {
                l = 0;
            }
            stringbuilder.insert(l, c);
            i++;
        }
        formatter.format(stringbuilder.toString(), new Object[0]);
        return formatter;
    }

    public static Formatter append(CharSequence charsequence, Formatter formatter, int i, int j, int k, CharSequence charsequence1)
    {
        return append(charsequence, formatter, i, j, k, ' ', charsequence1);
    }

    public static String toString(Formattable formattable)
    {
        return String.format("%s", new Object[] {
            formattable
        });
    }
}

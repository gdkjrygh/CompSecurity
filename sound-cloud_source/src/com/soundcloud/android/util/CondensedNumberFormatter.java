// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.util;

import android.content.res.Resources;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class CondensedNumberFormatter
{

    private static final String DOUBLE_DECIMAL_PATTERN = "#.##";
    private static final String NO_DECIMAL_PATTERN = "#,###";
    private static final double ONE_HUNDRED = 100D;
    private static final double ONE_THOUSAND = 1000D;
    private static final String SINGLE_DECIMAL_PATTERN = "##.#";
    private static final double TEN = 10D;
    private final DecimalFormat doubleDecimalFormat;
    private final DecimalFormat noDecimalFormat;
    private final DecimalFormat singleDecimalFormat;
    private final String suffixes[];

    CondensedNumberFormatter(Locale locale, Resources resources)
    {
        locale = new DecimalFormatSymbols(locale);
        noDecimalFormat = createFormatter("#,###", locale);
        singleDecimalFormat = createFormatter("##.#", locale);
        doubleDecimalFormat = createFormatter("#.##", locale);
        suffixes = resources.getStringArray(com.soundcloud.androidkit.R.array.ak_number_suffixes);
    }

    public static CondensedNumberFormatter create(Locale locale, Resources resources)
    {
        return new CondensedNumberFormatter(locale, resources);
    }

    private DecimalFormat createFormatter(String s, DecimalFormatSymbols decimalformatsymbols)
    {
        s = new DecimalFormat(s, decimalformatsymbols);
        s.setRoundingMode(RoundingMode.DOWN);
        return s;
    }

    private String formatCondensedNumber(double d, int i)
    {
        do
        {
            if (d < 1000D)
            {
                return formatDecimalNumber(d, suffixes[i]);
            }
            d /= 1000D;
            i++;
        } while (true);
    }

    private String formatDecimalNumber(double d, String s)
    {
        if (d >= 100D)
        {
            return (new StringBuilder()).append(noDecimalFormat.format(d)).append(s).toString();
        }
        if (d >= 10D)
        {
            return (new StringBuilder()).append(singleDecimalFormat.format(d)).append(s).toString();
        } else
        {
            return (new StringBuilder()).append(doubleDecimalFormat.format(d)).append(s).toString();
        }
    }

    private boolean needsSuffix(long l)
    {
        return (double)l >= 10000D;
    }

    public final String format(long l)
    {
        if (!needsSuffix(l))
        {
            return noDecimalFormat.format(l);
        } else
        {
            return formatCondensedNumber(l, 0);
        }
    }
}

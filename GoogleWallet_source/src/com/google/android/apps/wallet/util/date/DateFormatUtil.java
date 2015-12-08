// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.date;

import android.content.Context;
import android.text.format.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class DateFormatUtil
{

    public static java.text.DateFormat getLocalizedDateFormatWithoutYear(Context context)
    {
        return getLocalizedDateFormatWithoutYear(context, Locale.getDefault());
    }

    private static java.text.DateFormat getLocalizedDateFormatWithoutYear(Context context, Locale locale)
    {
        String s = ((SimpleDateFormat)SimpleDateFormat.getDateInstance(1, locale)).toPattern();
        if (s.contains("de"))
        {
            locale = "[^Mm]*[Yy]+[^Mm]*";
        } else
        {
            locale = "[^DdMm]*[Yy]+[^DdMm]*";
        }
        try
        {
            locale = new SimpleDateFormat(s.replaceAll(locale, ""));
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            if (isMonthBeforeDay(context))
            {
                context = "MMMM dd";
            } else
            {
                context = "dd MMMM";
            }
            return new SimpleDateFormat(context);
        }
        return locale;
    }

    private static boolean isMonthBeforeDay(Context context)
    {
        context = DateFormat.getDateFormatOrder(context);
        int j = context.length;
        int i = 0;
        do
        {
            char c;
label0:
            {
                if (i < j)
                {
                    c = context[i];
                    if (c != 'd')
                    {
                        break label0;
                    }
                }
                return false;
            }
            if (c == 'M')
            {
                return true;
            }
            i++;
        } while (true);
    }
}

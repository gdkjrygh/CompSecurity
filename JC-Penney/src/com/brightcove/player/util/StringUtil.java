// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.util;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class StringUtil
{

    public static final String LONG_TIME_FORMAT = "%d:%02d:%02d";
    public static final String SHORTER_TIME_FORMAT = "%01d:%02d";
    public static final String SHORT_TIME_FORMAT = "%02d:%02d";
    public static final String ZERO_TIME_STRING = "0:00";

    public StringUtil()
    {
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.trim().isEmpty();
    }

    public static String join(List list, String s)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append((String)list.get(i));
            if (i < list.size() - 1)
            {
                stringbuilder.append(s);
            }
        }

        return stringbuilder.toString();
    }

    public static String join(String as[], String s)
    {
        if (as == null || as.length == 0)
        {
            return null;
        } else
        {
            return join(Arrays.asList(as), s);
        }
    }

    public static CharSequence replaceAll(CharSequence charsequence, String as[], CharSequence acharsequence[])
    {
        charsequence = new SpannableStringBuilder(charsequence);
        do
        {
            int k = as.length;
            int i = 0;
            boolean flag = false;
            for (; i < k; i++)
            {
                String s = as[i];
                int i1 = TextUtils.indexOf(charsequence, s);
                if (i1 >= 0)
                {
                    flag = true;
                    charsequence.setSpan(s, i1, s.length() + i1, 33);
                }
            }

            if (!flag)
            {
                return charsequence;
            }
            i = 0;
            while (i < as.length) 
            {
                int j = charsequence.getSpanStart(as[i]);
                int l = charsequence.getSpanEnd(as[i]);
                if (j >= 0)
                {
                    charsequence.replace(j, l, acharsequence[i]);
                }
                i++;
            }
        } while (true);
    }

    public static String stringForTime(long l)
    {
        if (l <= 0L)
        {
            return "0:00";
        }
        long l2 = l / 1000L;
        l = l2 % 60L;
        long l1 = (l2 / 60L) % 60L;
        l2 /= 3600L;
        Formatter formatter = new Formatter(Locale.getDefault());
        if (l2 > 0L)
        {
            return formatter.format("%d:%02d:%02d", new Object[] {
                Long.valueOf(l2), Long.valueOf(l1), Long.valueOf(l)
            }).toString();
        }
        if (l1 < 10L)
        {
            return formatter.format("%01d:%02d", new Object[] {
                Long.valueOf(l1), Long.valueOf(l)
            }).toString();
        } else
        {
            return formatter.format("%02d:%02d", new Object[] {
                Long.valueOf(l1), Long.valueOf(l)
            }).toString();
        }
    }
}

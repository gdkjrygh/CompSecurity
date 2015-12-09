// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale.util;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;

public final class Bcp47
{

    private static final Splitter SEPARATOR_SPLITTER = Splitter.on('-');

    public static String fromLocale(Locale locale)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(locale.getLanguage());
        String s = locale.getCountry();
        locale = locale.getVariant();
        if (!s.isEmpty())
        {
            stringbuilder.append('-').append(s);
        }
        if (!locale.isEmpty())
        {
            stringbuilder.append('-').append(locale);
        }
        return stringbuilder.toString();
    }

    public static Locale toLocale(String s)
    {
        Object obj = Lists.newArrayList(SEPARATOR_SPLITTER.split(s));
        String s1 = (String)((List) (obj)).get(0);
        if (((List) (obj)).size() > 1)
        {
            s = (String)((List) (obj)).get(1);
        } else
        {
            s = "";
        }
        if (((List) (obj)).size() > 2)
        {
            obj = (String)((List) (obj)).get(2);
        } else
        {
            obj = "";
        }
        return new Locale(s1, s, ((String) (obj)));
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.util.Locale;

public final class LocaleProvider
{

    private LocaleProvider()
    {
    }

    public static String getFormattedLocale()
    {
        Locale locale = Locale.getDefault();
        if (!locale.getLanguage().isEmpty() && !locale.getCountry().isEmpty())
        {
            return (new StringBuilder()).append(locale.getLanguage()).append("-").append(locale.getCountry()).toString();
        }
        if (!locale.getLanguage().isEmpty())
        {
            return locale.getLanguage();
        } else
        {
            return "";
        }
    }
}

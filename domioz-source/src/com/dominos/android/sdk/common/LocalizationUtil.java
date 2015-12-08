// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import java.util.Locale;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class LocalizationUtil
{

    private static final String ENGLISH = "en";
    private static final String SPANISH = "es";

    public LocalizationUtil()
    {
    }

    public static String getPhoneLang()
    {
        String s = Locale.getDefault().getLanguage();
        if (StringHelper.equalsIgnoreCase("es", s))
        {
            return s;
        } else
        {
            return "en";
        }
    }

    private static String replaceStoreDaysInSpanish(String s)
    {
        return s.replaceAll("Mo", "Lu").replaceAll("Tu", "Ma").replaceAll("We", "Mi").replaceAll("Th", "Ju").replaceAll("Fr", "Vi").replaceAll("Su", "Do");
    }

    public static String translateDayName(String s)
    {
        String s1 = s;
        if (StringHelper.equalsIgnoreCase(getPhoneLang(), "es"))
        {
            s1 = replaceStoreDaysInSpanish(s);
        }
        return s1;
    }
}

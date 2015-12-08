// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.Locale;

// Referenced classes of package org.chromium.base:
//            CommandLine

public class LocaleUtils
{

    private LocaleUtils()
    {
    }

    private static String getDefaultCountryCode()
    {
        CommandLine commandline = CommandLine.c();
        if (commandline.a())
        {
            return commandline.b();
        } else
        {
            return Locale.getDefault().getCountry();
        }
    }

    public static String getDefaultLocale()
    {
        Object obj = Locale.getDefault();
        String s = ((Locale) (obj)).getLanguage();
        String s1 = ((Locale) (obj)).getCountry();
        if ("iw".equals(s))
        {
            obj = "he";
        } else
        if ("in".equals(s))
        {
            obj = "id";
        } else
        {
            obj = s;
            if ("tl".equals(s))
            {
                obj = "fil";
            }
        }
        if (s1.isEmpty())
        {
            return ((String) (obj));
        } else
        {
            return (new StringBuilder()).append(((String) (obj))).append("-").append(s1).toString();
        }
    }
}

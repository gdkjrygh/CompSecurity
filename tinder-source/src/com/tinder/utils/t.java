// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import java.util.Locale;

public final class t
{

    public static String a()
    {
        Locale locale = Locale.getDefault();
        if (locale.getLanguage().equals("ms"))
        {
            return "ml";
        }
        if (locale.toString().startsWith(Locale.CHINESE.toString()))
        {
            return locale.toString().replace("_", "-");
        } else
        {
            return locale.getLanguage();
        }
    }

    public static String b()
    {
        Locale locale = Locale.getDefault();
        if (locale.getLanguage().equals("ms"))
        {
            return "ml".toUpperCase();
        } else
        {
            return locale.getCountry();
        }
    }
}

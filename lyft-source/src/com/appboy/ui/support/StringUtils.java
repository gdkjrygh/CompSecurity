// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.content.res.Resources;

public final class StringUtils
{

    public static final String EMPTY_STRING = "";

    public StringUtils()
    {
    }

    public static String getOptionalStringResource(Resources resources, int i, String s)
    {
        try
        {
            resources = resources.getString(i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            return s;
        }
        return resources;
    }

    public static boolean isNullOrBlank(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }
}

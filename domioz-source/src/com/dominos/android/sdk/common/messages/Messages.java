// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.messages;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages
{

    private static final String BUNDLE_NAME = "dpz.android.com.messages.messages";
    private static String language = null;

    private Messages()
    {
    }

    public static String getLang()
    {
        if (language == null)
        {
            String s;
            if (Locale.getDefault().getLanguage().contains("es"))
            {
                s = "es";
            } else
            {
                s = "en";
            }
            language = s;
        }
        return language;
    }

    public static String getString(String s)
    {
        try
        {
            s = ResourceBundle.getBundle("dpz.android.com.messages.messages", Locale.getDefault()).getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

}

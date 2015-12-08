// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.sms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.lyft.android.common.Strings;

public class VerificationCodeSmsParser
{

    private static final String DEFAULT_SMS_FORMAT = "^Your Lyft code is [0-9]{4}$";
    private static final String NO_DIGITS_REG_EX = "[^0-9]";

    public VerificationCodeSmsParser()
    {
    }

    public String extractCode(String s)
    {
        while (Strings.isNullOrEmpty(s) || !Pattern.compile("^Your Lyft code is [0-9]{4}$").matcher(s).find()) 
        {
            return null;
        }
        return s.replaceAll("[^0-9]", "");
    }
}

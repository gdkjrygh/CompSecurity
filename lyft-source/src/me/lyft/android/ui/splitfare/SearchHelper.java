// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.lyft.android.common.Strings;

public class SearchHelper
{

    private static final Pattern NUMBER_PATTERN = Pattern.compile(".*\\d+.*");

    public SearchHelper()
    {
    }

    public static boolean isNormalizedNumberValid(String s)
    {
        return !Strings.isNullOrEmpty(s) && s.length() >= 10;
    }

    public static boolean isNumberValid(String s)
    {
        return isNormalizedNumberValid(normalizeNumber(s));
    }

    public static boolean isPhoneNumber(String s)
    {
        return NUMBER_PATTERN.matcher(s).find();
    }

    public static String normalizeNumber(String s)
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        if (TextUtils.isEmpty(s))
        {
            return "";
        }
        stringbuilder = new StringBuilder();
        j = s.length();
        i = 0;
_L1:
        char c;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        c = s.charAt(i);
        int k = Character.digit(c, 10);
        if (k != -1)
        {
            stringbuilder.append(k);
        } else
        {
            if (i != 0 || c != '+')
            {
                continue; /* Loop/switch isn't completed */
            }
            stringbuilder.append(c);
        }
_L3:
        i++;
          goto _L1
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) goto _L3; else goto _L2
_L2:
        return normalizeNumber(PhoneNumberUtils.convertKeypadLettersToDigits(s));
        return stringbuilder.toString();
    }

    public static boolean startsWithDigit(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!Strings.isNullOrEmpty(s))
        {
            flag = flag1;
            if (String.valueOf(s.charAt(0)).matches("\\d"))
            {
                flag = true;
            }
        }
        return flag;
    }

}

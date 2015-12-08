// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UnicodeUtils
{

    private static final Pattern sEscapedUnicodePattern = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String unescape(String s)
    {
        StringBuffer stringbuffer;
        Matcher matcher;
label0:
        {
            if (!TextUtils.isEmpty(s))
            {
                matcher = sEscapedUnicodePattern.matcher(s);
                StringBuffer stringbuffer1;
                for (stringbuffer = null; matcher.find(); stringbuffer = stringbuffer1)
                {
                    stringbuffer1 = stringbuffer;
                    if (stringbuffer == null)
                    {
                        stringbuffer1 = new StringBuffer();
                    }
                    matcher.appendReplacement(stringbuffer1, new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
                }

                if (stringbuffer != null)
                {
                    break label0;
                }
            }
            return s;
        }
        matcher.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

}

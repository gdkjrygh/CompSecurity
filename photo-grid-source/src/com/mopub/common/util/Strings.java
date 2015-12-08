// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings
{

    private static Pattern a = Pattern.compile("((\\d{1,2})|(100))%");
    private static Pattern b = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    public Strings()
    {
    }

    public static String fromStream(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder();
        byte abyte0[] = new byte[4096];
        for (int i = 0; i != -1; i = inputstream.read(abyte0))
        {
            stringbuilder.append(new String(abyte0, 0, i));
        }

        inputstream.close();
        return stringbuilder.toString();
    }

    public static boolean isAbsoluteTracker(String s)
    {
        return !TextUtils.isEmpty(s) && b.matcher(s).matches();
    }

    public static boolean isPercentageTracker(String s)
    {
        return !TextUtils.isEmpty(s) && a.matcher(s).matches();
    }

    public static Integer parseAbsoluteOffset(String s)
    {
        s = s.split(":");
        if (s.length != 3)
        {
            return null;
        } else
        {
            int i = Integer.parseInt(s[0]);
            int j = Integer.parseInt(s[1]);
            return Integer.valueOf((int)(Float.parseFloat(s[2]) * 1000F) + (i * 60 * 60 * 1000 + j * 60 * 1000));
        }
    }

}

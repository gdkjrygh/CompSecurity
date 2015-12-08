// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.strings;

import java.math.BigInteger;
import java.util.Locale;

// Referenced classes of package com.soundcloud.java.strings:
//            Joiner

public final class Strings
{

    public static final String EMPTY = "";

    private Strings()
    {
    }

    public static boolean isBlank(CharSequence charsequence)
    {
        return isNullOrEmpty(nullToEmpty(charsequence).trim());
    }

    public static boolean isNotBlank(CharSequence charsequence)
    {
        return !isBlank(charsequence);
    }

    public static boolean isNullOrEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static Joiner joinOn(char c)
    {
        return new Joiner(String.valueOf(c));
    }

    public static Joiner joinOn(String s)
    {
        return new Joiner(s);
    }

    public static String nullToEmpty(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return "";
        } else
        {
            return charsequence.toString();
        }
    }

    public static String safeToString(Object obj)
    {
        if (obj == null)
        {
            return "";
        } else
        {
            return obj.toString();
        }
    }

    public static String toHexString(byte abyte0[])
    {
        return String.format(Locale.US, (new StringBuilder("%0")).append(abyte0.length << 1).append("x").toString(), new Object[] {
            new BigInteger(1, abyte0)
        });
    }
}

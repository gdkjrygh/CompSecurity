// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;


public class NumberUtils
{

    private static final String FALSE = "false";
    private static final String TRUE = "true";

    public NumberUtils()
    {
    }

    public static boolean isNumeric(String s)
    {
        try
        {
            Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public static boolean parseBoolean(String s)
        throws NumberFormatException
    {
        if (s == null || "false".equalsIgnoreCase(s.trim()))
        {
            return false;
        }
        if ("true".equalsIgnoreCase(s.trim()))
        {
            return true;
        } else
        {
            throw new NumberFormatException((new StringBuilder()).append("Unable to parse [").append(s).append("] to boolean.").toString());
        }
    }

    public static long parseLong(String s, long l)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.isEmpty()) goto _L2; else goto _L3
_L3:
        long l1 = Long.parseLong(s);
        l = l1;
_L5:
        return l;
_L2:
        l = 0L;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        return l;
    }

    public static long parseNumber(String s, long l)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.isEmpty()) goto _L2; else goto _L3
_L3:
        long l1 = Double.valueOf(Double.parseDouble(s)).longValue();
        l = l1;
_L5:
        return l;
_L2:
        l = 0L;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        return l;
    }
}

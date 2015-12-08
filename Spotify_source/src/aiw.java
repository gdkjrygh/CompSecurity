// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;

public final class aiw
{

    public static String a()
    {
        String s;
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() < 9)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = Build.SERIAL;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        boolean flag;
        if (s.length() <= 0 || s.equals("unknown") || s.length() <= 3 || s.substring(0, 3).equals("***"))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = s.substring(0, 3).equals("000");
        if (!flag)
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_79;
        Exception exception;
        exception;
        return null;
    }
}

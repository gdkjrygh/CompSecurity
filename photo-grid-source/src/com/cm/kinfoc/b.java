// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.text.TextUtils;

public final class b
{

    public long a;
    public int b;

    public b()
    {
        a = 0L;
        b = 0;
    }

    public static b a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String as[] = s.split("\r\n");
        s = new b();
        if (as.length < 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!as[0].equals("[common]") || !as[1].startsWith("result="))
        {
            continue; /* Loop/switch isn't completed */
        }
        String s2 = as[1].substring("result=".length()).trim();
        String s1;
        try
        {
            s.b = Integer.parseInt(s2);
        }
        catch (NumberFormatException numberformatexception1)
        {
            numberformatexception1.printStackTrace();
        }
        if (!as[2].startsWith("time="))
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = as[2].substring("time=".length()).trim();
        try
        {
            s.a = Long.parseLong(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            numberformatexception.printStackTrace();
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return s;
    }
}

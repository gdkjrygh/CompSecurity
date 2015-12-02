// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class c
{

    static final boolean a;
    private static final int b[] = {
        0, 3, 4, 5, 6, 7, 8, 9, 10, 11, 
        12, 17, 106, 2026, 1000, 1015
    };
    private static final String c[] = {
        "*", "us-ascii", "iso-8859-1", "iso-8859-2", "iso-8859-3", "iso-8859-4", "iso-8859-5", "iso-8859-6", "iso-8859-7", "iso-8859-8", 
        "iso-8859-9", "shift_JIS", "utf-8", "big5", "iso-10646-ucs-2", "utf-16"
    };
    private static final HashMap d;
    private static final HashMap e;

    private c()
    {
    }

    public static int a(String s)
    {
        if (s == null)
        {
            return -1;
        }
        s = (Integer)e.get(s);
        if (s == null)
        {
            throw new UnsupportedEncodingException();
        } else
        {
            return s.intValue();
        }
    }

    public static String a(int i)
    {
        String s = (String)d.get(Integer.valueOf(i));
        if (s == null)
        {
            throw new UnsupportedEncodingException();
        } else
        {
            return s;
        }
    }

    static 
    {
        int i = 0;
        boolean flag;
        if (!android_src/mms/e/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        d = new HashMap();
        e = new HashMap();
        if (!a && b.length != c.length)
        {
            throw new AssertionError();
        }
        for (int j = b.length; i <= j - 1; i++)
        {
            d.put(Integer.valueOf(b[i]), c[i]);
            e.put(c[i], Integer.valueOf(b[i]));
        }

    }
}

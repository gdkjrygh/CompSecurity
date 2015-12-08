// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.d.a;

import java.io.UnsupportedEncodingException;

public abstract class e
{

    private static String a[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
        "A", "B", "C", "D", "E", "F"
    };

    public e()
    {
    }

    private static String a(byte byte0)
    {
        byte byte1 = (byte)((byte)((byte)(byte0 & 0xf0) >>> 4) & 0xf);
        byte0 &= 0xf;
        return (new StringBuilder()).append(a[byte1]).append(a[byte0]).toString();
    }

    public static String b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < 16; i++)
        {
            stringbuffer.append(a(abyte0[i]));
            if (i == 3 || i == 5 || i == 7 || i == 9)
            {
                stringbuffer.append("-");
            }
        }

        return stringbuffer.toString().toLowerCase();
    }

    private static String[] c(byte abyte0[])
    {
        int i = abyte0.length / 8;
        int j = i;
        if (abyte0.length % 8 != 0)
        {
            j = i + 1;
        }
        String as[] = new String[j];
        Object obj;
        int k;
        try
        {
            obj = new String(abyte0, "ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new String(abyte0);
        }
        k = 0;
        i = 0;
        for (; k < j; k++)
        {
            char ac[] = new char[41];
            for (int l = 0; l < 41; l++)
            {
                ac[l] = ' ';
            }

            for (int i1 = 0; i1 < 8 && i < abyte0.length; i1++)
            {
                String s = a(abyte0[i]);
                ac[i1 * 3] = s.charAt(0);
                ac[i1 * 3 + 1] = s.charAt(1);
                ac[(i1 << 1) + 26] = ((String) (obj)).charAt(i);
                i++;
            }

            as[k] = new String(ac);
        }

        return as;
    }

    public abstract void a(Object obj);

    public abstract void a(Object obj, Throwable throwable);

    public final void a(byte abyte0[])
    {
        if (a())
        {
            c(abyte0);
        }
    }

    public abstract boolean a();

    public abstract void b(Object obj);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract void f();

    public abstract void g();

}

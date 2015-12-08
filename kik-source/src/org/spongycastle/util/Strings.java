// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public final class Strings
{

    public Strings()
    {
    }

    public static String a(byte abyte0[])
    {
        boolean flag = false;
        int k = 0;
        for (int i = 0; i < abyte0.length;)
        {
            k++;
            if ((abyte0[i] & 0xf0) == 240)
            {
                k++;
                i += 4;
            } else
            if ((abyte0[i] & 0xe0) == 224)
            {
                i += 3;
            } else
            if ((abyte0[i] & 0xc0) == 192)
            {
                i += 2;
            } else
            {
                i++;
            }
        }

        char ac[] = new char[k];
        k = 0;
        int j = ((flag) ? 1 : 0);
        while (k < abyte0.length) 
        {
            char c1;
            int i1;
            if ((abyte0[k] & 0xf0) == 240)
            {
                int l = ((abyte0[k] & 3) << 18 | (abyte0[k + 1] & 0x3f) << 12 | (abyte0[k + 2] & 0x3f) << 6 | abyte0[k + 3] & 0x3f) - 0x10000;
                char c2 = (char)(0xd800 | l >> 10);
                c1 = (char)(l & 0x3ff | 0xdc00);
                l = j + 1;
                ac[j] = c2;
                j = k + 4;
                k = l;
            } else
            if ((abyte0[k] & 0xe0) == 224)
            {
                c1 = (char)((abyte0[k] & 0xf) << 12 | (abyte0[k + 1] & 0x3f) << 6 | abyte0[k + 2] & 0x3f);
                int j1 = k + 3;
                k = j;
                j = j1;
            } else
            if ((abyte0[k] & 0xd0) == 208)
            {
                c1 = (char)((abyte0[k] & 0x1f) << 6 | abyte0[k + 1] & 0x3f);
                int k1 = k + 2;
                k = j;
                j = k1;
            } else
            if ((abyte0[k] & 0xc0) == 192)
            {
                c1 = (char)((abyte0[k] & 0x1f) << 6 | abyte0[k + 1] & 0x3f);
                int l1 = k + 2;
                k = j;
                j = l1;
            } else
            {
                c1 = (char)(abyte0[k] & 0xff);
                int i2 = k + 1;
                k = j;
                j = i2;
            }
            i1 = k + 1;
            ac[k] = c1;
            k = j;
            j = i1;
        }
        return new String(ac);
    }

    private static void a(char ac[], OutputStream outputstream)
    {
        int i = 0;
        while (i < ac.length) 
        {
            int j = ac[i];
            if (j < 128)
            {
                outputstream.write(j);
            } else
            if (j < 2048)
            {
                outputstream.write(j >> 6 | 0xc0);
                outputstream.write(j & 0x3f | 0x80);
            } else
            if (j >= 55296 && j <= 57343)
            {
                if (i + 1 >= ac.length)
                {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                i++;
                char c1 = ac[i];
                if (j > 56319)
                {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                j = ((j & 0x3ff) << 10 | c1 & 0x3ff) + 0x10000;
                outputstream.write(j >> 18 | 0xf0);
                outputstream.write(j >> 12 & 0x3f | 0x80);
                outputstream.write(j >> 6 & 0x3f | 0x80);
                outputstream.write(j & 0x3f | 0x80);
            } else
            {
                outputstream.write(j >> 12 | 0xe0);
                outputstream.write(j >> 6 & 0x3f | 0x80);
                outputstream.write(j & 0x3f | 0x80);
            }
            i++;
        }
    }

    public static byte[] a(String s)
    {
        return a(s.toCharArray());
    }

    private static byte[] a(char ac[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            a(ac, ((OutputStream) (bytearrayoutputstream)));
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static String b(String s)
    {
        int i = 0;
        char ac[] = s.toCharArray();
        boolean flag;
        boolean flag1;
        for (flag = false; i != ac.length; flag = flag1)
        {
            char c1 = ac[i];
            flag1 = flag;
            if ('a' <= c1)
            {
                flag1 = flag;
                if ('z' >= c1)
                {
                    flag1 = true;
                    ac[i] = (char)((c1 - 97) + 65);
                }
            }
            i++;
        }

        if (flag)
        {
            s = new String(ac);
        }
        return s;
    }

    public static String b(byte abyte0[])
    {
        return new String(c(abyte0));
    }

    public static String c(String s)
    {
        int i = 0;
        char ac[] = s.toCharArray();
        boolean flag;
        boolean flag1;
        for (flag = false; i != ac.length; flag = flag1)
        {
            char c1 = ac[i];
            flag1 = flag;
            if ('A' <= c1)
            {
                flag1 = flag;
                if ('Z' >= c1)
                {
                    flag1 = true;
                    ac[i] = (char)((c1 - 65) + 97);
                }
            }
            i++;
        }

        if (flag)
        {
            s = new String(ac);
        }
        return s;
    }

    private static char[] c(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        return ac;
    }

    public static byte[] d(String s)
    {
        byte abyte0[] = new byte[s.length()];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)s.charAt(i);
        }

        return abyte0;
    }

    public static String[] e(String s)
    {
        Vector vector = new Vector();
        for (boolean flag = true; flag;)
        {
            int j = s.indexOf('.');
            if (j > 0)
            {
                vector.addElement(s.substring(0, j));
                s = s.substring(j + 1);
            } else
            {
                vector.addElement(s);
                flag = false;
            }
        }

        s = new String[vector.size()];
        for (int i = 0; i != s.length; i++)
        {
            s[i] = (String)vector.elementAt(i);
        }

        return s;
    }
}

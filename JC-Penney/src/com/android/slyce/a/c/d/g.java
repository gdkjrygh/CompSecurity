// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.d.b;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class g
    implements Serializable
{

    public static final g a = a(new byte[0]);
    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    final byte b[];
    private transient int d;
    private transient String e;

    g(byte abyte0[])
    {
        b = abyte0;
    }

    public static g a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            g g1 = new g(s.getBytes(b.b));
            g1.e = s;
            return g1;
        }
    }

    public static transient g a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new g((byte[])abyte0.clone());
        }
    }

    public byte a(int i)
    {
        return b[i];
    }

    public String a()
    {
        String s = e;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(b, b.b);
            e = s1;
            return s1;
        }
    }

    public String b()
    {
        int i = 0;
        char ac[] = new char[b.length * 2];
        byte abyte0[] = b;
        int k = abyte0.length;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac[j] = c[byte0 >> 4 & 0xf];
            j = l + 1;
            ac[l] = c[byte0 & 0xf];
        }

        return new String(ac);
    }

    public g c()
    {
        Object obj;
label0:
        {
            int i = 0;
            byte byte0;
            do
            {
                obj = this;
                if (i >= b.length)
                {
                    break label0;
                }
                byte0 = b[i];
                if (byte0 >= 65 && byte0 <= 90)
                {
                    break;
                }
                i++;
            } while (true);
            obj = (byte[])b.clone();
            obj[i] = (byte)(byte0 + 32);
            i++;
            while (i < obj.length) 
            {
                byte byte1 = obj[i];
                if (byte1 >= 65 && byte1 <= 90)
                {
                    obj[i] = (byte)(byte1 + 32);
                }
                i++;
            }
            obj = new g(((byte []) (obj)));
        }
        return ((g) (obj));
    }

    public int d()
    {
        return b.length;
    }

    public byte[] e()
    {
        return (byte[])b.clone();
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof g) && Arrays.equals(((g)obj).b, b);
    }

    public int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(b);
            d = j;
            return j;
        }
    }

    public String toString()
    {
        if (b.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (b.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(b.length), b()
            });
        }
        String s;
        try
        {
            s = String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(b.length), a(MessageDigest.getInstance("MD5").digest(b)).b()
            });
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new AssertionError();
        }
        return s;
    }

}

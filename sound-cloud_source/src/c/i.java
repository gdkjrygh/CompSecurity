// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package c:
//            B

public final class i
    implements Serializable
{

    static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    public static final i b = a(new byte[0]);
    public final byte c[];
    transient int d;
    transient String e;

    i(byte abyte0[])
    {
        c = abyte0;
    }

    public static i a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            i j = new i(s.getBytes(B.a));
            j.e = s;
            return j;
        }
    }

    public static transient i a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new i((byte[])abyte0.clone());
        }
    }

    private i b(String s)
    {
        try
        {
            s = a(MessageDigest.getInstance(s).digest(c));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    public final String a()
    {
        String s = e;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(c, B.a);
            e = s1;
            return s1;
        }
    }

    public final String b()
    {
        int j = 0;
        char ac[] = new char[c.length * 2];
        byte abyte0[] = c;
        int l = abyte0.length;
        int k = 0;
        for (; j < l; j++)
        {
            byte byte0 = abyte0[j];
            int i1 = k + 1;
            ac[k] = a[byte0 >> 4 & 0xf];
            k = i1 + 1;
            ac[i1] = a[byte0 & 0xf];
        }

        return new String(ac);
    }

    public final i c()
    {
        int j = 0;
        do
        {
label0:
            {
                Object obj = this;
                if (j < c.length)
                {
                    byte byte0 = c[j];
                    if (byte0 < 65 || byte0 > 90)
                    {
                        break label0;
                    }
                    obj = (byte[])c.clone();
                    obj[j] = (byte)(byte0 + 32);
                    for (j++; j < obj.length; j++)
                    {
                        byte byte1 = obj[j];
                        if (byte1 >= 65 && byte1 <= 90)
                        {
                            obj[j] = (byte)(byte1 + 32);
                        }
                    }

                    obj = new i(((byte []) (obj)));
                }
                return ((i) (obj));
            }
            j++;
        } while (true);
    }

    public final byte[] d()
    {
        return (byte[])c.clone();
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof i) && ((i)obj).c.length == c.length)
        {
            obj = (i)obj;
            byte abyte0[] = c;
            int j = c.length;
            boolean flag;
            if (((i) (obj)).c.length - j >= 0 && abyte0.length - j >= 0 && B.a(((i) (obj)).c, abyte0, j))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = d;
        if (j != 0)
        {
            return j;
        } else
        {
            int k = Arrays.hashCode(c);
            d = k;
            return k;
        }
    }

    public final String toString()
    {
        if (c.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (c.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(c.length), b()
            });
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(c.length), b("MD5").b()
            });
        }
    }

}

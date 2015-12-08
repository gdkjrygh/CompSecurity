// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package c:
//            ag, e, f

public class k
    implements Serializable, Comparable
{

    static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    public static final k b = a(new byte[0]);
    final byte c[];
    transient int d;
    transient String e;

    k(byte abyte0[])
    {
        c = abyte0;
    }

    public static k a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            k k1 = new k(s.getBytes(ag.a));
            k1.e = s;
            return k1;
        }
    }

    public static transient k a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new k((byte[])abyte0.clone());
        }
    }

    public static k b(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("base64 == null");
        }
        s = c.e.a(s);
        if (s != null)
        {
            return new k(s);
        } else
        {
            return null;
        }
    }

    private k c(String s)
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

    public byte a(int i)
    {
        return c[i];
    }

    public int a(k k1)
    {
        if (j1 >= l1) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        return 1;
        int j = f();
        int l = k1.f();
        int i1 = Math.min(j, l);
        int j1;
        int l1;
        for (int i = 0; i < i1; i++)
        {
            j1 = a(i) & 0xff;
            l1 = k1.a(i) & 0xff;
            if (j1 != l1)
            {
                break MISSING_BLOCK_LABEL_63;
            }
        }

        if (j == l)
        {
            return 0;
        }
        if (j >= l)
        {
            return 1;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public String a()
    {
        String s = e;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(c, ag.a);
            e = s1;
            return s1;
        }
    }

    void a(f f1)
    {
        f1.b(c, 0, c.length);
    }

    public boolean a(int i, k k1, int j, int l)
    {
        return k1.a(j, c, i, l);
    }

    public boolean a(int i, byte abyte0[], int j, int l)
    {
        return i <= c.length - l && j <= abyte0.length - l && ag.a(c, i, abyte0, j, l);
    }

    public String b()
    {
        return c.e.a(c);
    }

    public k c()
    {
        return c("MD5");
    }

    public int compareTo(Object obj)
    {
        return a((k)obj);
    }

    public String d()
    {
        int i = 0;
        char ac[] = new char[c.length * 2];
        byte abyte0[] = c;
        int l = abyte0.length;
        int j = 0;
        for (; i < l; i++)
        {
            byte byte0 = abyte0[i];
            int i1 = j + 1;
            ac[j] = a[byte0 >> 4 & 0xf];
            j = i1 + 1;
            ac[i1] = a[byte0 & 0xf];
        }

        return new String(ac);
    }

    public k e()
    {
        Object obj;
label0:
        {
            int i = 0;
            byte byte0;
            do
            {
                obj = this;
                if (i >= c.length)
                {
                    break label0;
                }
                byte0 = c[i];
                if (byte0 >= 65 && byte0 <= 90)
                {
                    break;
                }
                i++;
            } while (true);
            obj = (byte[])c.clone();
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
            obj = new k(((byte []) (obj)));
        }
        return ((k) (obj));
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        if ((obj instanceof k) && ((k)obj).f() == c.length && ((k)obj).a(0, c, 0, c.length))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public int f()
    {
        return c.length;
    }

    public byte[] g()
    {
        return (byte[])c.clone();
    }

    public int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(c);
            d = j;
            return j;
        }
    }

    public String toString()
    {
        if (c.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (c.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(c.length), d()
            });
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(c.length), c().d()
            });
        }
    }

}

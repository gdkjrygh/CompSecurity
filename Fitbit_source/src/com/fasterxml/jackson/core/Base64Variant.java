// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.a;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core:
//            a

public final class Base64Variant
    implements Serializable
{

    static final char a = 0;
    public static final int b = -1;
    public static final int c = -2;
    private static final int g = 32;
    private static final long serialVersionUID = 1L;
    protected final String _name;
    protected final transient boolean d;
    protected final transient char e;
    protected final transient int f;
    private final transient int h[];
    private final transient char i[];
    private final transient byte j[];

    public Base64Variant(Base64Variant base64variant, String s, int k)
    {
        this(base64variant, s, base64variant.d, base64variant.e, k);
    }

    public Base64Variant(Base64Variant base64variant, String s, boolean flag, char c1, int k)
    {
        h = new int[128];
        i = new char[64];
        j = new byte[64];
        _name = s;
        s = base64variant.j;
        System.arraycopy(s, 0, j, 0, s.length);
        s = base64variant.i;
        System.arraycopy(s, 0, i, 0, s.length);
        base64variant = base64variant.h;
        System.arraycopy(base64variant, 0, h, 0, base64variant.length);
        d = flag;
        e = c1;
        f = k;
    }

    public Base64Variant(String s, String s1, boolean flag, char c1, int k)
    {
        boolean flag1 = false;
        super();
        h = new int[128];
        i = new char[64];
        j = new byte[64];
        _name = s;
        d = flag;
        e = c1;
        f = k;
        int l = s1.length();
        if (l != 64)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Base64Alphabet length must be exactly 64 (was ").append(l).append(")").toString());
        }
        s1.getChars(0, l, i, 0);
        Arrays.fill(h, -1);
        for (k = ((flag1) ? 1 : 0); k < l; k++)
        {
            char c2 = i[k];
            j[k] = (byte)c2;
            h[c2] = k;
        }

        if (flag)
        {
            h[c1] = -2;
        }
    }

    public int a(byte byte0)
    {
        if (byte0 <= 127)
        {
            return h[byte0];
        } else
        {
            return -1;
        }
    }

    public int a(int k, int l, byte abyte0[], int i1)
    {
        int j1 = i1 + 1;
        abyte0[i1] = j[k >> 18 & 0x3f];
        i1 = j1 + 1;
        abyte0[j1] = j[k >> 12 & 0x3f];
        if (d)
        {
            byte byte1 = (byte)e;
            int k1 = i1 + 1;
            byte byte0;
            if (l == 2)
            {
                byte0 = j[k >> 6 & 0x3f];
            } else
            {
                byte0 = byte1;
            }
            abyte0[i1] = byte0;
            abyte0[k1] = byte1;
            return k1 + 1;
        }
        if (l == 2)
        {
            abyte0[i1] = j[k >> 6 & 0x3f];
            return i1 + 1;
        } else
        {
            return i1;
        }
    }

    public int a(int k, int l, char ac[], int i1)
    {
        int j1 = i1 + 1;
        ac[i1] = i[k >> 18 & 0x3f];
        i1 = j1 + 1;
        ac[j1] = i[k >> 12 & 0x3f];
        if (d)
        {
            int k1 = i1 + 1;
            char c1;
            if (l == 2)
            {
                c1 = i[k >> 6 & 0x3f];
            } else
            {
                c1 = e;
            }
            ac[i1] = c1;
            ac[k1] = e;
            return k1 + 1;
        }
        if (l == 2)
        {
            ac[i1] = i[k >> 6 & 0x3f];
            return i1 + 1;
        } else
        {
            return i1;
        }
    }

    public int a(int k, byte abyte0[], int l)
    {
        int i1 = l + 1;
        abyte0[l] = j[k >> 18 & 0x3f];
        l = i1 + 1;
        abyte0[i1] = j[k >> 12 & 0x3f];
        i1 = l + 1;
        abyte0[l] = j[k >> 6 & 0x3f];
        abyte0[i1] = j[k & 0x3f];
        return i1 + 1;
    }

    public int a(int k, char ac[], int l)
    {
        int i1 = l + 1;
        ac[l] = i[k >> 18 & 0x3f];
        l = i1 + 1;
        ac[i1] = i[k >> 12 & 0x3f];
        i1 = l + 1;
        ac[l] = i[k >> 6 & 0x3f];
        ac[i1] = i[k & 0x3f];
        return i1 + 1;
    }

    public String a()
    {
        return _name;
    }

    public String a(byte abyte0[])
    {
        return a(abyte0, false);
    }

    public String a(byte abyte0[], boolean flag)
    {
        int j1 = abyte0.length;
        StringBuilder stringbuilder = new StringBuilder((j1 >> 2) + j1 + (j1 >> 3));
        if (flag)
        {
            stringbuilder.append('"');
        }
        int l = e();
        int k = 0;
        l >>= 2;
        int k1;
        for (; k <= j1 - 3; k = k1 + 1)
        {
            int i2 = k + 1;
            k = abyte0[k];
            k1 = i2 + 1;
            a(stringbuilder, (k << 8 | abyte0[i2] & 0xff) << 8 | abyte0[k1] & 0xff);
            l--;
            k = l;
            if (l <= 0)
            {
                stringbuilder.append('\\');
                stringbuilder.append('n');
                k = e() >> 2;
            }
            l = k;
        }

        j1 -= k;
        if (j1 > 0)
        {
            int l1 = k + 1;
            int i1 = abyte0[k] << 16;
            k = i1;
            if (j1 == 2)
            {
                k = i1 | (abyte0[l1] & 0xff) << 8;
            }
            a(stringbuilder, k, j1);
        }
        if (flag)
        {
            stringbuilder.append('"');
        }
        return stringbuilder.toString();
    }

    protected void a(char c1, int k, String s)
        throws IllegalArgumentException
    {
        String s1;
        String s2;
        if (c1 <= ' ')
        {
            s1 = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(c1)).append(") as character #").append(k + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (a(c1))
        {
            s1 = (new StringBuilder()).append("Unexpected padding character ('").append(c()).append("') as character #").append(k + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(c1) || Character.isISOControl(c1))
        {
            s1 = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(c1)).append(") in base64 content").toString();
        } else
        {
            s1 = (new StringBuilder()).append("Illegal character '").append(c1).append("' (code 0x").append(Integer.toHexString(c1)).append(") in base64 content").toString();
        }
        s2 = s1;
        if (s != null)
        {
            s2 = (new StringBuilder()).append(s1).append(": ").append(s).toString();
        }
        throw new IllegalArgumentException(s2);
    }

    public void a(String s, a a1)
        throws IllegalArgumentException
    {
        int k;
        int i1;
        i1 = s.length();
        k = 0;
_L4:
        if (k >= i1) goto _L2; else goto _L1
_L1:
        char c1;
        int l;
        l = k + 1;
        c1 = s.charAt(k);
        if (l < i1) goto _L3; else goto _L2
_L2:
        return;
_L3:
label0:
        {
            if (c1 <= ' ')
            {
                break label0;
            }
            int j1 = b(c1);
            if (j1 < 0)
            {
                a(c1, 0, ((String) (null)));
            }
            if (l >= i1)
            {
                f();
            }
            k = l + 1;
            c1 = s.charAt(l);
            l = b(c1);
            if (l < 0)
            {
                a(c1, 1, ((String) (null)));
            }
            j1 = j1 << 6 | l;
            if (k >= i1)
            {
                if (!b())
                {
                    a1.a(j1 >> 4);
                    return;
                }
                f();
            }
            l = k + 1;
            c1 = s.charAt(k);
            k = b(c1);
            if (k < 0)
            {
                if (k != -2)
                {
                    a(c1, 2, ((String) (null)));
                }
                if (l >= i1)
                {
                    f();
                }
                k = l + 1;
                c1 = s.charAt(l);
                if (!a(c1))
                {
                    a(c1, 3, (new StringBuilder()).append("expected padding character '").append(c()).append("'").toString());
                }
                a1.a(j1 >> 4);
            } else
            {
                j1 = j1 << 6 | k;
                if (l >= i1)
                {
                    if (!b())
                    {
                        a1.b(j1 >> 2);
                        return;
                    }
                    f();
                }
                k = l + 1;
                char c2 = s.charAt(l);
                l = b(c2);
                if (l < 0)
                {
                    if (l != -2)
                    {
                        a(c2, 3, ((String) (null)));
                    }
                    a1.b(j1 >> 2);
                } else
                {
                    a1.c(j1 << 6 | l);
                }
            }
        }
          goto _L4
        k = l;
          goto _L1
    }

    public void a(StringBuilder stringbuilder, int k)
    {
        stringbuilder.append(i[k >> 18 & 0x3f]);
        stringbuilder.append(i[k >> 12 & 0x3f]);
        stringbuilder.append(i[k >> 6 & 0x3f]);
        stringbuilder.append(i[k & 0x3f]);
    }

    public void a(StringBuilder stringbuilder, int k, int l)
    {
        stringbuilder.append(i[k >> 18 & 0x3f]);
        stringbuilder.append(i[k >> 12 & 0x3f]);
        if (d)
        {
            char c1;
            if (l == 2)
            {
                c1 = i[k >> 6 & 0x3f];
            } else
            {
                c1 = e;
            }
            stringbuilder.append(c1);
            stringbuilder.append(e);
        } else
        if (l == 2)
        {
            stringbuilder.append(i[k >> 6 & 0x3f]);
            return;
        }
    }

    public boolean a(char c1)
    {
        return c1 == e;
    }

    public boolean a(int k)
    {
        return k == e;
    }

    public byte[] a(String s)
        throws IllegalArgumentException
    {
        a a1 = new a();
        a(s, a1);
        return a1.c();
    }

    public int b(char c1)
    {
        if (c1 <= '\177')
        {
            return h[c1];
        } else
        {
            return -1;
        }
    }

    public int b(int k)
    {
        if (k <= 127)
        {
            return h[k];
        } else
        {
            return -1;
        }
    }

    public boolean b()
    {
        return d;
    }

    public char c()
    {
        return e;
    }

    public char c(int k)
    {
        return i[k];
    }

    public byte d()
    {
        return (byte)e;
    }

    public byte d(int k)
    {
        return j[k];
    }

    public int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    protected void f()
        throws IllegalArgumentException
    {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    public int hashCode()
    {
        return _name.hashCode();
    }

    protected Object readResolve()
    {
        return com.fasterxml.jackson.core.a.a(_name);
    }

    public String toString()
    {
        return _name;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            c

public final class j extends Writer
{

    static final int a = 55296;
    static final int b = 56319;
    static final int c = 56320;
    static final int d = 57343;
    private final c e;
    private OutputStream f;
    private byte g[];
    private final int h;
    private int i;
    private int j;

    public j(c c1, OutputStream outputstream)
    {
        j = 0;
        e = c1;
        f = outputstream;
        g = c1.f();
        h = g.length - 4;
        i = 0;
    }

    protected static void b(int k)
        throws IOException
    {
        throw new IOException(c(k));
    }

    protected static String c(int k)
    {
        if (k > 0x10ffff)
        {
            return (new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(k)).append(") to output; max is 0x10FFFF as per RFC 4627").toString();
        }
        if (k >= 55296)
        {
            if (k <= 56319)
            {
                return (new StringBuilder()).append("Unmatched first part of surrogate pair (0x").append(Integer.toHexString(k)).append(")").toString();
            } else
            {
                return (new StringBuilder()).append("Unmatched second part of surrogate pair (0x").append(Integer.toHexString(k)).append(")").toString();
            }
        } else
        {
            return (new StringBuilder()).append("Illegal character point (0x").append(Integer.toHexString(k)).append(") to output").toString();
        }
    }

    protected int a(int k)
        throws IOException
    {
        int l = j;
        j = 0;
        if (k < 56320 || k > 57343)
        {
            throw new IOException((new StringBuilder()).append("Broken surrogate pair: first char 0x").append(Integer.toHexString(l)).append(", second 0x").append(Integer.toHexString(k)).append("; illegal combination").toString());
        } else
        {
            return (l - 55296 << 10) + 0x10000 + (k - 56320);
        }
    }

    public Writer append(char c1)
        throws IOException
    {
        write(c1);
        return this;
    }

    public volatile Appendable append(char c1)
        throws IOException
    {
        return append(c1);
    }

    public void close()
        throws IOException
    {
        if (f != null)
        {
            if (i > 0)
            {
                f.write(g, 0, i);
                i = 0;
            }
            OutputStream outputstream = f;
            f = null;
            byte abyte0[] = g;
            if (abyte0 != null)
            {
                g = null;
                e.b(abyte0);
            }
            outputstream.close();
            int k = j;
            j = 0;
            if (k > 0)
            {
                b(k);
            }
        }
    }

    public void flush()
        throws IOException
    {
        if (f != null)
        {
            if (i > 0)
            {
                f.write(g, 0, i);
                i = 0;
            }
            f.flush();
        }
    }

    public void write(int k)
        throws IOException
    {
        int l;
        if (j > 0)
        {
            l = a(k);
        } else
        {
            l = k;
            if (k >= 55296)
            {
                l = k;
                if (k <= 57343)
                {
                    if (k > 56319)
                    {
                        b(k);
                    }
                    j = k;
                    return;
                }
            }
        }
        if (i >= h)
        {
            f.write(g, 0, i);
            i = 0;
        }
        if (l < 128)
        {
            byte abyte0[] = g;
            k = i;
            i = k + 1;
            abyte0[k] = (byte)l;
            return;
        }
        k = i;
        if (l < 2048)
        {
            byte abyte1[] = g;
            int i1 = k + 1;
            abyte1[k] = (byte)(l >> 6 | 0xc0);
            abyte1 = g;
            k = i1 + 1;
            abyte1[i1] = (byte)(l & 0x3f | 0x80);
        } else
        if (l <= 65535)
        {
            byte abyte2[] = g;
            int j1 = k + 1;
            abyte2[k] = (byte)(l >> 12 | 0xe0);
            abyte2 = g;
            int l1 = j1 + 1;
            abyte2[j1] = (byte)(l >> 6 & 0x3f | 0x80);
            abyte2 = g;
            k = l1 + 1;
            abyte2[l1] = (byte)(l & 0x3f | 0x80);
        } else
        {
            if (l > 0x10ffff)
            {
                b(l);
            }
            byte abyte3[] = g;
            int k1 = k + 1;
            abyte3[k] = (byte)(l >> 18 | 0xf0);
            abyte3 = g;
            k = k1 + 1;
            abyte3[k1] = (byte)(l >> 12 & 0x3f | 0x80);
            abyte3 = g;
            k1 = k + 1;
            abyte3[k] = (byte)(l >> 6 & 0x3f | 0x80);
            abyte3 = g;
            k = k1 + 1;
            abyte3[k1] = (byte)(l & 0x3f | 0x80);
        }
        i = k;
    }

    public void write(String s)
        throws IOException
    {
        write(s, 0, s.length());
    }

    public void write(String s, int k, int l)
        throws IOException
    {
        byte abyte0[];
        int j2;
        int k2;
        if (l < 2)
        {
            if (l == 1)
            {
                write(s.charAt(k));
            }
            return;
        }
        int i1 = k;
        int k1 = l;
        if (j > 0)
        {
            i1 = s.charAt(k);
            k1 = l - 1;
            write(a(i1));
            i1 = k + 1;
        }
        k = i;
        abyte0 = g;
        j2 = h;
        k2 = k1 + i1;
        l = i1;
_L3:
        int j1 = k;
        if (l >= k2) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        j1 = k;
        if (k >= j2)
        {
            f.write(abyte0, 0, k);
            j1 = 0;
        }
        l1 = l + 1;
        i2 = s.charAt(l);
        if (i2 >= 128)
        {
            break MISSING_BLOCK_LABEL_523;
        }
        k = j1 + 1;
        abyte0[j1] = (byte)i2;
        j1 = k2 - l1;
        l = j2 - k;
        if (j1 > l)
        {
            j1 = l;
        }
        l = l1;
_L7:
        if (l < j1 + l1) goto _L4; else goto _L3
_L4:
        char c1;
        i2 = l + 1;
        c1 = s.charAt(l);
        if (c1 < '\200') goto _L6; else goto _L5
_L5:
        l = i2;
        j1 = c1;
_L10:
        if (j1 < 2048)
        {
            l1 = k + 1;
            abyte0[k] = (byte)(j1 >> 6 | 0xc0);
            k = l1 + 1;
            abyte0[l1] = (byte)(j1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                if (j1 >= 55296 && j1 <= 57343)
                {
                    break label0;
                }
                l1 = k + 1;
                abyte0[k] = (byte)(j1 >> 12 | 0xe0);
                i2 = l1 + 1;
                abyte0[l1] = (byte)(j1 >> 6 & 0x3f | 0x80);
                k = i2 + 1;
                abyte0[i2] = (byte)(j1 & 0x3f | 0x80);
            }
        }
          goto _L3
_L6:
        abyte0[k] = (byte)c1;
        k++;
        l = i2;
          goto _L7
        if (j1 > 56319)
        {
            i = k;
            b(j1);
        }
        j = j1;
        if (l < k2) goto _L9; else goto _L8
_L8:
        j1 = k;
_L2:
        i = j1;
        return;
_L9:
        j1 = a(s.charAt(l));
        if (j1 > 0x10ffff)
        {
            i = k;
            b(j1);
        }
        l1 = k + 1;
        abyte0[k] = (byte)(j1 >> 18 | 0xf0);
        k = l1 + 1;
        abyte0[l1] = (byte)(j1 >> 12 & 0x3f | 0x80);
        l1 = k + 1;
        abyte0[k] = (byte)(j1 >> 6 & 0x3f | 0x80);
        k = l1 + 1;
        abyte0[l1] = (byte)(j1 & 0x3f | 0x80);
        l++;
          goto _L3
        l = l1;
        l1 = i2;
        k = j1;
        j1 = l1;
          goto _L10
    }

    public void write(char ac[])
        throws IOException
    {
        write(ac, 0, ac.length);
    }

    public void write(char ac[], int k, int l)
        throws IOException
    {
        byte abyte0[];
        int j2;
        int k2;
        if (l < 2)
        {
            if (l == 1)
            {
                write(ac[k]);
            }
            return;
        }
        int i1 = k;
        int k1 = l;
        if (j > 0)
        {
            i1 = ac[k];
            k1 = l - 1;
            write(a(i1));
            i1 = k + 1;
        }
        k = i;
        abyte0 = g;
        j2 = h;
        k2 = k1 + i1;
        l = i1;
_L3:
        int j1 = k;
        if (l >= k2) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        j1 = k;
        if (k >= j2)
        {
            f.write(abyte0, 0, k);
            j1 = 0;
        }
        l1 = l + 1;
        i2 = ac[l];
        if (i2 >= 128)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        k = j1 + 1;
        abyte0[j1] = (byte)i2;
        j1 = k2 - l1;
        l = j2 - k;
        if (j1 > l)
        {
            j1 = l;
        }
        l = l1;
_L7:
        if (l < j1 + l1) goto _L4; else goto _L3
_L4:
        char c1;
        i2 = l + 1;
        c1 = ac[l];
        if (c1 < '\200') goto _L6; else goto _L5
_L5:
        l = i2;
        j1 = c1;
_L10:
        if (j1 < 2048)
        {
            l1 = k + 1;
            abyte0[k] = (byte)(j1 >> 6 | 0xc0);
            k = l1 + 1;
            abyte0[l1] = (byte)(j1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                if (j1 >= 55296 && j1 <= 57343)
                {
                    break label0;
                }
                l1 = k + 1;
                abyte0[k] = (byte)(j1 >> 12 | 0xe0);
                i2 = l1 + 1;
                abyte0[l1] = (byte)(j1 >> 6 & 0x3f | 0x80);
                k = i2 + 1;
                abyte0[i2] = (byte)(j1 & 0x3f | 0x80);
            }
        }
          goto _L3
_L6:
        abyte0[k] = (byte)c1;
        k++;
        l = i2;
          goto _L7
        if (j1 > 56319)
        {
            i = k;
            b(j1);
        }
        j = j1;
        if (l < k2) goto _L9; else goto _L8
_L8:
        j1 = k;
_L2:
        i = j1;
        return;
_L9:
        j1 = a(ac[l]);
        if (j1 > 0x10ffff)
        {
            i = k;
            b(j1);
        }
        l1 = k + 1;
        abyte0[k] = (byte)(j1 >> 18 | 0xf0);
        k = l1 + 1;
        abyte0[l1] = (byte)(j1 >> 12 & 0x3f | 0x80);
        l1 = k + 1;
        abyte0[k] = (byte)(j1 >> 6 & 0x3f | 0x80);
        k = l1 + 1;
        abyte0[l1] = (byte)(j1 & 0x3f | 0x80);
        l++;
          goto _L3
        l = l1;
        l1 = i2;
        k = j1;
        j1 = l1;
          goto _L10
    }
}

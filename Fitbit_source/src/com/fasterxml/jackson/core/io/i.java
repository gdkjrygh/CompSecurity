// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fasterxml.jackson.core.io:
//            a, c

public class i extends a
{

    protected final boolean j;
    protected char k;
    protected int l;
    protected int m;
    protected final boolean n;

    public i(c c, InputStream inputstream, byte abyte0[], int i1, int j1, boolean flag)
    {
        boolean flag1 = false;
        super(c, inputstream, abyte0, i1, j1);
        k = '\0';
        l = 0;
        m = 0;
        j = flag;
        flag = flag1;
        if (inputstream != null)
        {
            flag = true;
        }
        n = flag;
    }

    private void a(int i1, int j1)
        throws IOException
    {
        int k1 = m;
        int l1 = l;
        throw new CharConversionException((new StringBuilder()).append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ").append(i1).append(", needed ").append(j1).append(", at char #").append(l1).append(", byte #").append(k1 + i1).append(")").toString());
    }

    private void a(int i1, int j1, String s)
        throws IOException
    {
        int k1 = m;
        int l1 = g;
        int i2 = l;
        throw new CharConversionException((new StringBuilder()).append("Invalid UTF-32 character 0x").append(Integer.toHexString(i1)).append(s).append(" at char #").append(i2 + j1).append(", byte #").append((k1 + l1) - 1).append(")").toString());
    }

    private boolean a(int i1)
        throws IOException
    {
        m = m + (h - i1);
        if (i1 > 0)
        {
            if (g > 0)
            {
                for (int j1 = 0; j1 < i1; j1++)
                {
                    f[j1] = f[g + j1];
                }

                g = 0;
            }
            h = i1;
        } else
        {
            g = 0;
            if (e == null)
            {
                i1 = -1;
            } else
            {
                i1 = e.read(f);
            }
            if (i1 < 1)
            {
                h = 0;
                if (i1 < 0)
                {
                    if (n)
                    {
                        a();
                    }
                    return false;
                }
                b();
            }
            h = i1;
        }
        while (h < 4) 
        {
            if (e == null)
            {
                i1 = -1;
            } else
            {
                i1 = e.read(f, h, f.length - h);
            }
            if (i1 < 1)
            {
                if (i1 < 0)
                {
                    if (n)
                    {
                        a();
                    }
                    a(h, 4);
                }
                b();
            }
            h = i1 + h;
        }
        return true;
    }

    public volatile void close()
        throws IOException
    {
        super.close();
    }

    public volatile int read()
        throws IOException
    {
        return super.read();
    }

    public int read(char ac[], int i1, int j1)
        throws IOException
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        int k1 = -1;
_L4:
        return k1;
_L2:
        k1 = j1;
        if (j1 < 1) goto _L4; else goto _L3
_L3:
        int k2;
        if (i1 < 0 || i1 + j1 > ac.length)
        {
            a(ac, i1, j1);
        }
        k2 = j1 + i1;
        if (k == 0) goto _L6; else goto _L5
_L5:
        j1 = i1 + 1;
        ac[i1] = k;
        k = '\0';
_L15:
        if (j1 >= k2) goto _L8; else goto _L7
_L7:
        int i2;
        k1 = g;
        int j2;
        if (j)
        {
            byte byte0 = f[k1];
            byte byte1 = f[k1 + 1];
            byte byte3 = f[k1 + 2];
            k1 = f[k1 + 3] & 0xff | (byte0 << 24 | (byte1 & 0xff) << 16 | (byte3 & 0xff) << 8);
        } else
        {
            i2 = f[k1];
            byte byte2 = f[k1 + 1];
            byte byte4 = f[k1 + 2];
            k1 = f[k1 + 3] << 24 | (i2 & 0xff | (byte2 & 0xff) << 8 | (byte4 & 0xff) << 16);
        }
        g = g + 4;
        if (k1 <= 65535) goto _L10; else goto _L9
_L9:
        if (k1 > 0x10ffff)
        {
            a(k1, j1 - i1, (new StringBuilder()).append("(above ").append(Integer.toHexString(0x10ffff)).append(") ").toString());
        }
        i2 = k1 - 0x10000;
        k1 = j1 + 1;
        ac[j1] = (char)(55296 + (i2 >> 10));
        j2 = i2 & 0x3ff | 0xdc00;
        i2 = j2;
        j1 = k1;
        if (k1 < k2) goto _L12; else goto _L11
_L11:
        k = (char)j2;
        j1 = k1;
_L8:
        i1 = j1 - i1;
        l = l + i1;
        return i1;
_L6:
        j1 = h - g;
        if (j1 < 4 && !a(j1))
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L10:
        i2 = k1;
_L12:
        int l1 = j1 + 1;
        ac[j1] = (char)i2;
        j1 = l1;
        if (g < h)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = l1;
        if (true) goto _L8; else goto _L13
_L13:
        j1 = i1;
        if (true) goto _L15; else goto _L14
_L14:
    }
}

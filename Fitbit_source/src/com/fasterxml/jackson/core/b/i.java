// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.b;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.io.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core.b:
//            b, d

public final class i extends com.fasterxml.jackson.core.b.b
{

    protected static final int m = 32;
    protected static final char n[] = com.fasterxml.jackson.core.io.b.g();
    protected final Writer o;
    protected char p[];
    protected int q;
    protected int r;
    protected int s;
    protected char t[];
    protected f u;

    public i(c c1, int i1, d d1, Writer writer)
    {
        super(c1, i1, d1);
        q = 0;
        r = 0;
        o = writer;
        p = c1.i();
        s = p.length;
    }

    private int a(InputStream inputstream, byte abyte0[], int i1, int j1, int k1)
        throws IOException
    {
        boolean flag = false;
        int l1 = i1;
        i1 = ((flag) ? 1 : 0);
        for (; l1 < j1; l1++)
        {
            abyte0[i1] = abyte0[l1];
            i1++;
        }

        k1 = Math.min(k1, abyte0.length);
_L5:
        j1 = k1 - i1;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        if ((j1 = inputstream.read(abyte0, i1, j1)) < 0) goto _L1; else goto _L3
_L3:
        j1 = i1 + j1;
        i1 = j1;
        if (j1 >= 3)
        {
            return j1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private int a(char ac[], int i1, int j1, char c1, int k1)
        throws IOException, JsonGenerationException
    {
        if (k1 >= 0)
        {
            if (i1 > 1 && i1 < j1)
            {
                i1 -= 2;
                ac[i1] = '\\';
                ac[i1 + 1] = (char)k1;
                return i1;
            }
            char ac1[] = t;
            ac = ac1;
            if (ac1 == null)
            {
                ac = v();
            }
            ac[1] = (char)k1;
            o.write(ac, 0, 2);
            return i1;
        }
        if (k1 != -2)
        {
            if (i1 > 5 && i1 < j1)
            {
                i1 -= 6;
                j1 = i1 + 1;
                ac[i1] = '\\';
                i1 = j1 + 1;
                ac[j1] = 'u';
                if (c1 > '\377')
                {
                    j1 = c1 >> 8 & 0xff;
                    k1 = i1 + 1;
                    ac[i1] = n[j1 >> 4];
                    i1 = k1 + 1;
                    ac[k1] = n[j1 & 0xf];
                    c1 &= '\377';
                } else
                {
                    j1 = i1 + 1;
                    ac[i1] = '0';
                    i1 = j1 + 1;
                    ac[j1] = '0';
                }
                j1 = i1 + 1;
                ac[i1] = n[c1 >> 4];
                ac[j1] = n[c1 & 0xf];
                return j1 - 5;
            }
            char ac2[] = t;
            ac = ac2;
            if (ac2 == null)
            {
                ac = v();
            }
            q = r;
            if (c1 > '\377')
            {
                j1 = c1 >> 8 & 0xff;
                c1 &= '\377';
                ac[10] = n[j1 >> 4];
                ac[11] = n[j1 & 0xf];
                ac[12] = n[c1 >> 4];
                ac[13] = n[c1 & 0xf];
                o.write(ac, 8, 6);
                return i1;
            } else
            {
                ac[6] = n[c1 >> 4];
                ac[7] = n[c1 & 0xf];
                o.write(ac, 2, 6);
                return i1;
            }
        }
        String s1;
        if (u == null)
        {
            s1 = k.a(c1).a();
        } else
        {
            s1 = u.a();
            u = null;
        }
        c1 = s1.length();
        if (i1 >= c1 && i1 < j1)
        {
            i1 -= c1;
            s1.getChars(0, c1, ac, i1);
            return i1;
        } else
        {
            o.write(s1);
            return i1;
        }
    }

    private void a(char c1, int i1)
        throws IOException, JsonGenerationException
    {
        if (i1 >= 0)
        {
            if (r >= 2)
            {
                c1 = r - 2;
                q = c1;
                p[c1] = '\\';
                p[c1 + 1] = (char)i1;
                return;
            }
            char ac3[] = t;
            char ac[] = ac3;
            if (ac3 == null)
            {
                ac = v();
            }
            q = r;
            ac[1] = (char)i1;
            o.write(ac, 0, 2);
            return;
        }
        if (i1 != -2)
        {
            if (r >= 6)
            {
                char ac1[] = p;
                i1 = r - 6;
                q = i1;
                ac1[i1] = '\\';
                i1++;
                ac1[i1] = 'u';
                if (c1 > '\377')
                {
                    int j1 = c1 >> 8 & 0xff;
                    i1++;
                    ac1[i1] = n[j1 >> 4];
                    i1++;
                    ac1[i1] = n[j1 & 0xf];
                    c1 &= '\377';
                } else
                {
                    i1++;
                    ac1[i1] = '0';
                    i1++;
                    ac1[i1] = '0';
                }
                i1++;
                ac1[i1] = n[c1 >> 4];
                ac1[i1 + 1] = n[c1 & 0xf];
                return;
            }
            char ac4[] = t;
            char ac2[] = ac4;
            if (ac4 == null)
            {
                ac2 = v();
            }
            q = r;
            if (c1 > '\377')
            {
                i1 = c1 >> 8 & 0xff;
                c1 &= '\377';
                ac2[10] = n[i1 >> 4];
                ac2[11] = n[i1 & 0xf];
                ac2[12] = n[c1 >> 4];
                ac2[13] = n[c1 & 0xf];
                o.write(ac2, 8, 6);
                return;
            } else
            {
                ac2[6] = n[c1 >> 4];
                ac2[7] = n[c1 & 0xf];
                o.write(ac2, 2, 6);
                return;
            }
        }
        String s1;
        if (u == null)
        {
            s1 = k.a(c1).a();
        } else
        {
            s1 = u.a();
            u = null;
        }
        c1 = s1.length();
        if (r >= c1)
        {
            i1 = r - c1;
            q = i1;
            s1.getChars(0, c1, p, i1);
            return;
        } else
        {
            q = r;
            o.write(s1);
            return;
        }
    }

    private void a(int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int ai[];
        int k1;
        int l1;
        k1 = r + i1;
        ai = i;
        l1 = Math.min(ai.length, j1 + 1);
_L8:
        if (r >= k1) goto _L2; else goto _L1
_L1:
        char c1 = p[r];
        if (c1 >= l1) goto _L4; else goto _L3
_L3:
        i1 = ai[c1];
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int i2 = r - q;
        if (i2 > 0)
        {
            o.write(p, q, i2);
        }
        r = r + 1;
        a(c1, i1);
        continue; /* Loop/switch isn't completed */
_L4:
        if (c1 <= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = -1;
        if (true) goto _L5; else goto _L6
_L6:
        i1 = r + 1;
        r = i1;
        if (i1 < k1) goto _L1; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(char ac[], int i1, int j1, int k1)
        throws IOException, JsonGenerationException
    {
        int ai[];
        int l2;
        int i3;
        l2 = j1 + i1;
        ai = i;
        i3 = Math.min(ai.length, k1 + 1);
        boolean flag = false;
        j1 = i1;
        i1 = ((flag) ? 1 : 0);
_L12:
        if (j1 >= l2) goto _L2; else goto _L1
_L1:
        int l1;
        int k2;
        l1 = j1;
        k2 = i1;
_L10:
        char c1 = ac[l1];
        if (c1 >= i3) goto _L4; else goto _L3
_L3:
        int i2;
        i2 = ai[c1];
        i1 = i2;
        if (i2 == 0) goto _L6; else goto _L5
_L5:
        i1 = i2;
_L8:
        int j2 = l1 - j1;
        if (j2 < 32)
        {
            if (r + j2 > s)
            {
                t();
            }
            if (j2 > 0)
            {
                System.arraycopy(ac, j1, p, r, j2);
                r = r + j2;
            }
        } else
        {
            t();
            o.write(ac, j1, j2);
        }
        if (l1 < l2)
        {
            break MISSING_BLOCK_LABEL_204;
        }
_L2:
        return;
_L4:
        i1 = k2;
        if (c1 <= k1) goto _L6; else goto _L7
_L7:
        i1 = -1;
          goto _L8
_L6:
        j2 = l1 + 1;
        k2 = i1;
        l1 = j2;
        if (j2 < l2) goto _L10; else goto _L9
_L9:
        l1 = j2;
          goto _L8
        j1 = l1 + 1;
        b(c1, i1);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(char c1, int i1)
        throws IOException, JsonGenerationException
    {
        if (i1 >= 0)
        {
            if (r + 2 > s)
            {
                t();
            }
            char ac[] = p;
            c1 = r;
            r = c1 + 1;
            ac[c1] = '\\';
            ac = p;
            c1 = r;
            r = c1 + 1;
            ac[c1] = (char)i1;
            return;
        }
        if (i1 != -2)
        {
            if (r + 2 > s)
            {
                t();
            }
            i1 = r;
            char ac1[] = p;
            int j1 = i1 + 1;
            ac1[i1] = '\\';
            i1 = j1 + 1;
            ac1[j1] = 'u';
            if (c1 > '\377')
            {
                j1 = c1 >> 8 & 0xff;
                int l1 = i1 + 1;
                ac1[i1] = n[j1 >> 4];
                i1 = l1 + 1;
                ac1[l1] = n[j1 & 0xf];
                c1 &= '\377';
            } else
            {
                int k1 = i1 + 1;
                ac1[i1] = '0';
                i1 = k1 + 1;
                ac1[k1] = '0';
            }
            j1 = i1 + 1;
            ac1[i1] = n[c1 >> 4];
            ac1[j1] = n[c1 & 0xf];
            r = j1 + 1;
            return;
        }
        String s1;
        if (u == null)
        {
            s1 = k.a(c1).a();
        } else
        {
            s1 = u.a();
            u = null;
        }
        c1 = s1.length();
        if (r + c1 > s)
        {
            t();
            if (c1 > s)
            {
                o.write(s1);
                return;
            }
        }
        s1.getChars(0, c1, p, r);
        r = r + c1;
    }

    private void b(int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int ai[];
        int k1;
        int l1;
        int i2;
        int i3;
        k1 = 0;
        ai = i;
        i3 = Math.min(ai.length, j1 + 1);
        i2 = 0;
        l1 = 0;
_L11:
        if (l1 >= i1) goto _L2; else goto _L1
_L1:
        int l2 = k1;
_L9:
        char c1 = p[l1];
        if (c1 >= i3) goto _L4; else goto _L3
_L3:
        k1 = ai[c1];
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        int j2 = l1 - i2;
        if (j2 <= 0)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        o.write(p, i2, j2);
        if (l1 < i1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
_L2:
        return;
_L4:
        k1 = l2;
        if (c1 > j1)
        {
            k1 = -1;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        int k2 = l1 + 1;
        l2 = k1;
        l1 = k2;
        if (k2 < i1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k2;
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
        l1++;
        i2 = a(p, l1, i1, c1, k1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void b(long l1)
        throws IOException
    {
        if (r + 23 >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
        r = com.fasterxml.jackson.core.io.g.a(l1, p, r);
        ac = p;
        i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
    }

    private void b(short word0)
        throws IOException
    {
        if (r + 8 >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
        r = com.fasterxml.jackson.core.io.g.a(word0, p, r);
        ac = p;
        word0 = r;
        r = word0 + 1;
        ac[word0] = '"';
    }

    private void c(int i1)
        throws IOException
    {
        if (r + 13 >= s)
        {
            t();
        }
        char ac[] = p;
        int j1 = r;
        r = j1 + 1;
        ac[j1] = '"';
        r = com.fasterxml.jackson.core.io.g.a(i1, p, r);
        ac = p;
        i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
    }

    private void c(Object obj)
        throws IOException
    {
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
        c(obj.toString());
        if (r >= s)
        {
            t();
        }
        obj = p;
        i1 = r;
        r = i1 + 1;
        obj[i1] = '"';
    }

    private void d(int i1)
        throws IOException, JsonGenerationException
    {
        i1 = r + i1;
        int ai[] = i;
        int j1 = ai.length;
label0:
        do
        {
            int k1;
            if (r < i1)
            {
                do
                {
                    k1 = p[r];
                    if (k1 < j1 && ai[k1] != 0)
                    {
                        k1 = r - q;
                        if (k1 > 0)
                        {
                            o.write(p, q, k1);
                        }
                        char ac[] = p;
                        k1 = r;
                        r = k1 + 1;
                        char c1 = ac[k1];
                        a(c1, ai[c1]);
                        continue label0;
                    }
                    k1 = r + 1;
                    r = k1;
                } while (k1 < i1);
            }
            return;
        } while (true);
    }

    private void d(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (k == null) goto _L2; else goto _L1
_L1:
        e(ac, i1, j1);
_L4:
        return;
_L2:
        int ai[];
        int l1;
        int i2;
        if (j != 0)
        {
            a(ac, i1, j1, j);
            return;
        }
        l1 = j1 + i1;
        ai = i;
        i2 = ai.length;
_L8:
        if (i1 >= l1) goto _L4; else goto _L3
_L3:
        j1 = i1;
_L10:
        char c2 = ac[j1];
        if (c2 >= i2 || ai[c2] == 0) goto _L6; else goto _L5
_L5:
        int k1 = j1 - i1;
        char c1;
        if (k1 < 32)
        {
            if (r + k1 > s)
            {
                t();
            }
            if (k1 > 0)
            {
                System.arraycopy(ac, i1, p, r, k1);
                r = r + k1;
            }
        } else
        {
            t();
            o.write(ac, i1, k1);
        }
        if (j1 >= l1) goto _L4; else goto _L7
_L7:
        i1 = j1 + 1;
        c1 = ac[j1];
        b(c1, ai[c1]);
          goto _L8
_L6:
        k1 = j1 + 1;
        j1 = k1;
        if (k1 < l1) goto _L10; else goto _L9
_L9:
        j1 = k1;
          goto _L5
    }

    private void e(int i1)
        throws IOException, JsonGenerationException
    {
        int ai[];
        int j1;
        int k1;
        int j2;
        ai = i;
        j2 = ai.length;
        j1 = 0;
        k1 = 0;
_L8:
        if (j1 >= i1) goto _L2; else goto _L1
_L1:
        char c1 = p[j1];
        if (c1 >= j2 || ai[c1] == 0) goto _L4; else goto _L3
_L3:
        int l1 = j1 - k1;
        if (l1 <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        o.write(p, k1, l1);
        if (j1 < i1)
        {
            break MISSING_BLOCK_LABEL_98;
        }
_L2:
        return;
_L4:
        int i2 = j1 + 1;
        j1 = i2;
        if (i2 < i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i2;
        if (true) goto _L3; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
        j1++;
        k1 = a(p, j1, i1, c1, ai[c1]);
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void e(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        char c1;
        CharacterEscapes characterescapes;
        int k1;
        int l1;
        int k2;
        int l2;
        l2 = j1 + i1;
        int ai[] = i;
        int i2;
        int i3;
        if (j < 1)
        {
            l1 = 65535;
        } else
        {
            l1 = j;
        }
        i3 = Math.min(ai.length, l1 + 1);
        characterescapes = k;
        k1 = 0;
        j1 = i1;
        i1 = k1;
_L12:
        if (j1 >= l2) goto _L2; else goto _L1
_L1:
        k1 = j1;
        k2 = i1;
_L10:
        c1 = ac[k1];
        if (c1 >= i3) goto _L4; else goto _L3
_L3:
        i2 = ai[c1];
        i1 = i2;
        if (i2 == 0) goto _L6; else goto _L5
_L5:
        i1 = i2;
_L7:
        int j2 = k1 - j1;
        f f1;
        if (j2 < 32)
        {
            if (r + j2 > s)
            {
                t();
            }
            if (j2 > 0)
            {
                System.arraycopy(ac, j1, p, r, j2);
                r = r + j2;
            }
        } else
        {
            t();
            o.write(ac, j1, j2);
        }
        if (k1 < l2)
        {
            break MISSING_BLOCK_LABEL_257;
        }
_L2:
        return;
_L4:
label0:
        {
            if (c1 <= l1)
            {
                break label0;
            }
            i1 = -1;
        }
          goto _L7
        f1 = characterescapes.a(c1);
        u = f1;
        i1 = k2;
        if (f1 == null) goto _L6; else goto _L8
_L8:
        i1 = -2;
          goto _L7
_L6:
        j2 = k1 + 1;
        k2 = i1;
        k1 = j2;
        if (j2 < l2) goto _L10; else goto _L9
_L9:
        k1 = j2;
          goto _L7
        j1 = k1 + 1;
        b(c1, i1);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void f(int i1)
        throws IOException, JsonGenerationException
    {
        char c1;
        CharacterEscapes characterescapes;
        int j1;
        int k1;
        k1 = r + i1;
        int ai[] = i;
        int l1;
        int i2;
        if (j < 1)
        {
            j1 = 65535;
        } else
        {
            j1 = j;
        }
        l1 = Math.min(ai.length, j1 + 1);
        characterescapes = k;
_L8:
        if (r >= k1) goto _L2; else goto _L1
_L1:
        c1 = p[r];
        if (c1 >= l1) goto _L4; else goto _L3
_L3:
        i1 = ai[c1];
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        i2 = r - q;
        if (i2 > 0)
        {
            o.write(p, q, i2);
        }
        r = r + 1;
        a(c1, i1);
        continue; /* Loop/switch isn't completed */
_L4:
        if (c1 > j1)
        {
            i1 = -1;
            continue; /* Loop/switch isn't completed */
        }
        f f1 = characterescapes.a(c1);
        u = f1;
        if (f1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = -2;
        if (true) goto _L5; else goto _L6
_L6:
        i1 = r + 1;
        r = i1;
        if (i1 < k1) goto _L1; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void g(int i1)
        throws IOException, JsonGenerationException
    {
        char c1;
        CharacterEscapes characterescapes;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        k1 = 0;
        int ai[] = i;
        int j2;
        int i3;
        if (j < 1)
        {
            l1 = 65535;
        } else
        {
            l1 = j;
        }
        i3 = Math.min(ai.length, l1 + 1);
        characterescapes = k;
        i2 = 0;
        j1 = 0;
_L11:
        if (k1 >= i1) goto _L2; else goto _L1
_L1:
        l2 = j1;
_L9:
        c1 = p[k1];
        if (c1 >= i3) goto _L4; else goto _L3
_L3:
        j1 = ai[c1];
        if (j1 == 0) goto _L6; else goto _L5
_L5:
        j2 = k1 - i2;
        if (j2 <= 0)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        o.write(p, i2, j2);
        if (k1 < i1)
        {
            break MISSING_BLOCK_LABEL_189;
        }
_L2:
        return;
_L4:
        if (c1 > l1)
        {
            j1 = -1;
            continue; /* Loop/switch isn't completed */
        }
        f f1 = characterescapes.a(c1);
        u = f1;
        j1 = l2;
        if (f1 != null)
        {
            j1 = -2;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        int k2 = k1 + 1;
        l2 = j1;
        k1 = k2;
        if (k2 < i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = k2;
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
        k1++;
        i2 = a(p, k1, i1, c1, j1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void k(String s1)
        throws IOException, JsonGenerationException
    {
        int j1 = s - r;
        s1.getChars(0, j1, p, r);
        r = r + j1;
        t();
        int i1;
        int k1;
        for (i1 = s1.length() - j1; i1 > s; i1 -= k1)
        {
            k1 = s;
            s1.getChars(j1, j1 + k1, p, 0);
            q = 0;
            r = k1;
            t();
            j1 += k1;
        }

        s1.getChars(j1, j1 + i1, p, 0);
        q = 0;
        r = i1;
    }

    private void l(String s1)
        throws IOException, JsonGenerationException
    {
        int i1 = s1.length();
        if (i1 > s)
        {
            m(s1);
            return;
        }
        if (r + i1 > s)
        {
            t();
        }
        s1.getChars(0, i1, p, r);
        if (k != null)
        {
            f(i1);
            return;
        }
        if (j != 0)
        {
            a(i1, j);
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    private void m(String s1)
        throws IOException, JsonGenerationException
    {
        t();
        int l1 = s1.length();
        int i1 = 0;
        do
        {
            int k1 = s;
            int j1 = k1;
            if (i1 + k1 > l1)
            {
                j1 = l1 - i1;
            }
            s1.getChars(i1, i1 + j1, p, 0);
            if (k != null)
            {
                g(j1);
            } else
            if (j != 0)
            {
                b(j1, j);
            } else
            {
                e(j1);
            }
            j1 = i1 + j1;
            i1 = j1;
        } while (j1 < l1);
    }

    private void u()
        throws IOException
    {
        if (r + 4 >= s)
        {
            t();
        }
        int i1 = r;
        char ac[] = p;
        ac[i1] = 'n';
        i1++;
        ac[i1] = 'u';
        i1++;
        ac[i1] = 'l';
        i1++;
        ac[i1] = 'l';
        r = i1 + 1;
    }

    private char[] v()
    {
        char ac[] = new char[14];
        ac[0] = '\\';
        ac[2] = '\\';
        ac[3] = 'u';
        ac[4] = '0';
        ac[5] = '0';
        ac[8] = '\\';
        ac[9] = 'u';
        t = ac;
        return ac;
    }

    public int a(Base64Variant base64variant, InputStream inputstream, int i1)
        throws IOException, JsonGenerationException
    {
        char ac[];
        i("write binary value");
        if (r >= s)
        {
            t();
        }
        ac = p;
        int j1 = r;
        r = j1 + 1;
        ac[j1] = '"';
        ac = h.g();
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = a(base64variant, inputstream, ((byte []) (ac)));
_L4:
        h.c(ac);
        if (r >= s)
        {
            t();
        }
        base64variant = p;
        i1 = r;
        r = i1 + 1;
        base64variant[i1] = '"';
        return k1;
_L2:
        int l1 = a(base64variant, inputstream, ((byte []) (ac)), i1);
        k1 = i1;
        if (l1 <= 0) goto _L4; else goto _L3
_L3:
        j((new StringBuilder()).append("Too few bytes available: missing ").append(l1).append(" bytes (out of ").append(i1).append(")").toString());
        k1 = i1;
          goto _L4
        base64variant;
        h.c(ac);
        throw base64variant;
    }

    protected int a(Base64Variant base64variant, InputStream inputstream, byte abyte0[])
        throws IOException, JsonGenerationException
    {
        int k2 = -3;
        int i3 = s - 6;
        int l1 = base64variant.e() >> 2;
        int j1 = 0;
        int j2 = 0;
        int i1 = 0;
        do
        {
            int i2 = k2;
            int l2 = i1;
            int k1 = j2;
            if (i1 > k2)
            {
                k1 = a(inputstream, abyte0, i1, j2, abyte0.length);
                if (k1 < 3)
                {
                    if (k1 < 0)
                    {
                        if (r > i3)
                        {
                            t();
                        }
                        i1 = abyte0[0] << 16;
                        char ac[];
                        if (1 < k1)
                        {
                            k1 = (abyte0[1] & 0xff) << 8 | i1;
                            i1 = 2;
                        } else
                        {
                            k1 = i1;
                            i1 = 1;
                        }
                        r = base64variant.a(k1, i1, p, r);
                        return j1 + i1;
                    } else
                    {
                        return j1;
                    }
                }
                i2 = k1 - 3;
                l2 = 0;
            }
            if (r > i3)
            {
                t();
            }
            j2 = l2 + 1;
            i1 = abyte0[l2];
            l2 = j2 + 1;
            k2 = abyte0[j2];
            j2 = l2 + 1;
            l2 = abyte0[l2];
            j1 += 3;
            r = base64variant.a((k2 & 0xff | i1 << 8) << 8 | l2 & 0xff, p, r);
            l1--;
            i1 = l1;
            if (l1 <= 0)
            {
                ac = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = '\\';
                ac = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = 'n';
                i1 = base64variant.e() >> 2;
            }
            l1 = i1;
            k2 = i2;
            i1 = j2;
            j2 = k1;
        } while (true);
    }

    protected int a(Base64Variant base64variant, InputStream inputstream, byte abyte0[], int i1)
        throws IOException, JsonGenerationException
    {
        boolean flag = false;
        int k1 = 0;
        int k2 = -3;
        int i3 = s - 6;
        int l1 = base64variant.e() >> 2;
        int j1 = i1;
        i1 = ((flag) ? 1 : 0);
        do
        {
label0:
            {
label1:
                {
                    int j2 = i1;
                    int i2 = k1;
                    int l2;
                    if (j1 > 2)
                    {
                        j2 = k2;
                        l2 = i1;
                        i2 = k1;
                        if (i1 <= k2)
                        {
                            break label0;
                        }
                        i2 = a(inputstream, abyte0, i1, k1, j1);
                        l2 = 0;
                        j2 = 0;
                        if (i2 >= 3)
                        {
                            break label1;
                        }
                    }
                    i1 = j1;
                    if (j1 > 0)
                    {
                        l1 = a(inputstream, abyte0, j2, i2, j1);
                        i1 = j1;
                        if (l1 > 0)
                        {
                            if (r > i3)
                            {
                                t();
                            }
                            k1 = abyte0[0] << 16;
                            char ac[];
                            if (1 < l1)
                            {
                                k1 |= (abyte0[1] & 0xff) << 8;
                                i1 = 2;
                            } else
                            {
                                i1 = 1;
                            }
                            r = base64variant.a(k1, i1, p, r);
                            i1 = j1 - i1;
                        }
                    }
                    return i1;
                }
                j2 = i2 - 3;
            }
            if (r > i3)
            {
                t();
            }
            k1 = l2 + 1;
            i1 = abyte0[l2];
            l2 = k1 + 1;
            k2 = abyte0[k1];
            k1 = l2 + 1;
            l2 = abyte0[l2];
            j1 -= 3;
            r = base64variant.a((k2 & 0xff | i1 << 8) << 8 | l2 & 0xff, p, r);
            l1--;
            i1 = l1;
            if (l1 <= 0)
            {
                ac = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = '\\';
                ac = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = 'n';
                i1 = base64variant.e() >> 2;
            }
            l1 = i1;
            k2 = j2;
            i1 = k1;
            k1 = i2;
        } while (true);
    }

    public void a(char c1)
        throws IOException, JsonGenerationException
    {
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = c1;
    }

    public void a(double d1)
        throws IOException, JsonGenerationException
    {
        if (d || (Double.isNaN(d1) || Double.isInfinite(d1)) && c(com.fasterxml.jackson.core.JsonGenerator.Feature.d))
        {
            b(String.valueOf(d1));
            return;
        } else
        {
            i("write number");
            c(String.valueOf(d1));
            return;
        }
    }

    public void a(float f1)
        throws IOException, JsonGenerationException
    {
        if (d || (Float.isNaN(f1) || Float.isInfinite(f1)) && c(com.fasterxml.jackson.core.JsonGenerator.Feature.d))
        {
            b(String.valueOf(f1));
            return;
        } else
        {
            i("write number");
            c(String.valueOf(f1));
            return;
        }
    }

    public void a(long l1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            b(l1);
            return;
        }
        if (r + 21 >= s)
        {
            t();
        }
        r = com.fasterxml.jackson.core.io.g.a(l1, p, r);
    }

    public void a(Base64Variant base64variant, byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write binary value");
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int k1 = r;
        r = k1 + 1;
        ac[k1] = '"';
        b(base64variant, abyte0, i1, i1 + j1);
        if (r >= s)
        {
            t();
        }
        base64variant = p;
        i1 = r;
        r = i1 + 1;
        base64variant[i1] = '"';
    }

    public void a(f f1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (a != null)
        {
            b(f1, flag);
            return;
        }
        if (r + 1 >= s)
        {
            t();
        }
        if (flag)
        {
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = ',';
        }
        f1 = f1.c();
        if (!c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            b(f1, 0, f1.length);
            return;
        }
        char ac1[] = p;
        int j1 = r;
        r = j1 + 1;
        ac1[j1] = '"';
        j1 = f1.length;
        if (r + j1 + 1 >= s)
        {
            b(f1, 0, j1);
            if (r >= s)
            {
                t();
            }
            f1 = p;
            j1 = r;
            r = j1 + 1;
            f1[j1] = '"';
            return;
        } else
        {
            System.arraycopy(f1, 0, p, r, j1);
            r = r + j1;
            f1 = p;
            j1 = r;
            r = j1 + 1;
            f1[j1] = '"';
            return;
        }
    }

    public void a(String s1)
        throws IOException, JsonGenerationException
    {
        boolean flag = true;
        int i1 = e.a(s1);
        if (i1 == 4)
        {
            j("Can not write a field name, expecting a value");
        }
        if (i1 != 1)
        {
            flag = false;
        }
        b(s1, flag);
    }

    public void a(String s1, int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int l1 = s - r;
        int k1 = l1;
        if (l1 < j1)
        {
            t();
            k1 = s - r;
        }
        if (k1 >= j1)
        {
            s1.getChars(i1, i1 + j1, p, r);
            r = r + j1;
            return;
        } else
        {
            k(s1.substring(i1, i1 + j1));
            return;
        }
    }

    public void a(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (bigdecimal == null)
        {
            u();
            return;
        }
        if (d)
        {
            c(bigdecimal);
            return;
        } else
        {
            c(bigdecimal.toString());
            return;
        }
    }

    public void a(BigInteger biginteger)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (biginteger == null)
        {
            u();
            return;
        }
        if (d)
        {
            c(biginteger);
            return;
        } else
        {
            c(biginteger.toString());
            return;
        }
    }

    public void a(short word0)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            b(word0);
            return;
        }
        if (r + 6 >= s)
        {
            t();
        }
        r = com.fasterxml.jackson.core.io.g.a(word0, p, r);
    }

    public void a(boolean flag)
        throws IOException, JsonGenerationException
    {
        i("write boolean value");
        if (r + 5 >= s)
        {
            t();
        }
        int i1 = r;
        char ac[] = p;
        if (flag)
        {
            ac[i1] = 't';
            i1++;
            ac[i1] = 'r';
            i1++;
            ac[i1] = 'u';
            i1++;
            ac[i1] = 'e';
        } else
        {
            ac[i1] = 'f';
            i1++;
            ac[i1] = 'a';
            i1++;
            ac[i1] = 'l';
            i1++;
            ac[i1] = 's';
            i1++;
            ac[i1] = 'e';
        }
        r = i1 + 1;
    }

    public void a(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        s();
    }

    public void a(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (r >= s)
        {
            t();
        }
        char ac1[] = p;
        int k1 = r;
        r = k1 + 1;
        ac1[k1] = '"';
        d(ac, i1, j1);
        if (r >= s)
        {
            t();
        }
        ac = p;
        i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
    }

    public void b(int i1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            c(i1);
            return;
        }
        if (r + 11 >= s)
        {
            t();
        }
        r = com.fasterxml.jackson.core.io.g.a(i1, p, r);
    }

    protected void b(Base64Variant base64variant, byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        int k2 = s - 6;
        int l1 = base64variant.e() >> 2;
        int k1 = i1;
        i1 = l1;
        do
        {
            if (k1 > j1 - 3)
            {
                break;
            }
            if (r > k2)
            {
                t();
            }
            l1 = k1 + 1;
            k1 = abyte0[k1];
            int i2 = l1 + 1;
            byte byte0 = abyte0[l1];
            l1 = i2 + 1;
            r = base64variant.a((byte0 & 0xff | k1 << 8) << 8 | abyte0[i2] & 0xff, p, r);
            i2 = i1 - 1;
            i1 = i2;
            k1 = l1;
            if (i2 <= 0)
            {
                char ac[] = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = '\\';
                ac = p;
                i1 = r;
                r = i1 + 1;
                ac[i1] = 'n';
                i1 = base64variant.e() >> 2;
                k1 = l1;
            }
        } while (true);
        l1 = j1 - k1;
        if (l1 > 0)
        {
            if (r > k2)
            {
                t();
            }
            int j2 = k1 + 1;
            j1 = abyte0[k1] << 16;
            i1 = j1;
            if (l1 == 2)
            {
                i1 = j1 | (abyte0[j2] & 0xff) << 8;
            }
            r = base64variant.a(i1, l1, p, r);
        }
    }

    public void b(f f1)
        throws IOException, JsonGenerationException
    {
        boolean flag = true;
        int i1 = e.a(f1.a());
        if (i1 == 4)
        {
            j("Can not write a field name, expecting a value");
        }
        if (i1 != 1)
        {
            flag = false;
        }
        a(f1, flag);
    }

    protected void b(f f1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (flag)
        {
            a.c(this);
        } else
        {
            a.h(this);
        }
        f1 = f1.c();
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            if (r >= s)
            {
                t();
            }
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = '"';
            b(((char []) (f1)), 0, f1.length);
            if (r >= s)
            {
                t();
            }
            f1 = p;
            i1 = r;
            r = i1 + 1;
            f1[i1] = '"';
            return;
        } else
        {
            b(((char []) (f1)), 0, f1.length);
            return;
        }
    }

    public void b(String s1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (s1 == null)
        {
            u();
            return;
        }
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
        l(s1);
        if (r >= s)
        {
            t();
        }
        s1 = p;
        i1 = r;
        r = i1 + 1;
        s1[i1] = '"';
    }

    protected void b(String s1, int i1)
        throws IOException, JsonGenerationException
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 70
    //                   1 37
    //                   2 48
    //                   3 59;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        r();
_L7:
        return;
_L3:
        a.f(this);
        return;
_L4:
        a.d(this);
        return;
_L5:
        a.a(this);
        return;
_L2:
        if (e.b())
        {
            a.g(this);
            return;
        }
        if (e.d())
        {
            a.h(this);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void b(String s1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (a != null)
        {
            c(s1, flag);
            return;
        }
        if (r + 1 >= s)
        {
            t();
        }
        if (flag)
        {
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = ',';
        }
        if (!c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            l(s1);
            return;
        }
        char ac1[] = p;
        int j1 = r;
        r = j1 + 1;
        ac1[j1] = '"';
        l(s1);
        if (r >= s)
        {
            t();
        }
        s1 = p;
        j1 = r;
        r = j1 + 1;
        s1[j1] = '"';
    }

    public void b(byte abyte0[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        s();
    }

    public void b(char ac[], int i1, int j1)
        throws IOException, JsonGenerationException
    {
        if (j1 < 32)
        {
            if (j1 > s - r)
            {
                t();
            }
            System.arraycopy(ac, i1, p, r, j1);
            r = r + j1;
            return;
        } else
        {
            t();
            o.write(ac, i1, j1);
            return;
        }
    }

    public Object c()
    {
        return o;
    }

    public void c(f f1)
        throws IOException, JsonGenerationException
    {
        i("write text value");
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '"';
        f1 = f1.c();
        i1 = f1.length;
        if (i1 < 32)
        {
            if (i1 > s - r)
            {
                t();
            }
            System.arraycopy(f1, 0, p, r, i1);
            r = r + i1;
        } else
        {
            t();
            o.write(f1, 0, i1);
        }
        if (r >= s)
        {
            t();
        }
        f1 = p;
        i1 = r;
        r = i1 + 1;
        f1[i1] = '"';
    }

    public void c(String s1)
        throws IOException, JsonGenerationException
    {
        int k1 = s1.length();
        int j1 = s - r;
        int i1 = j1;
        if (j1 == 0)
        {
            t();
            i1 = s - r;
        }
        if (i1 >= k1)
        {
            s1.getChars(0, k1, p, r);
            r = r + k1;
            return;
        } else
        {
            k(s1);
            return;
        }
    }

    protected void c(String s1, boolean flag)
        throws IOException, JsonGenerationException
    {
        if (flag)
        {
            a.c(this);
        } else
        {
            a.h(this);
        }
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.c))
        {
            if (r >= s)
            {
                t();
            }
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = '"';
            l(s1);
            if (r >= s)
            {
                t();
            }
            s1 = p;
            i1 = r;
            r = i1 + 1;
            s1[i1] = '"';
            return;
        } else
        {
            l(s1);
            return;
        }
    }

    public void close()
        throws IOException
    {
        super.close();
        if (p != null && c(com.fasterxml.jackson.core.JsonGenerator.Feature.b))
        {
            do
            {
                com.fasterxml.jackson.core.b.d d1 = p();
                if (d1.b())
                {
                    j();
                    continue;
                }
                if (!d1.d())
                {
                    break;
                }
                l();
            } while (true);
        }
        t();
        if (o == null) goto _L2; else goto _L1
_L1:
        if (!h.c() && !c(com.fasterxml.jackson.core.JsonGenerator.Feature.a)) goto _L4; else goto _L3
_L3:
        o.close();
_L2:
        q();
        return;
_L4:
        if (c(com.fasterxml.jackson.core.JsonGenerator.Feature.f))
        {
            o.flush();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void d(f f1)
        throws IOException, JsonGenerationException
    {
        c(f1.a());
    }

    public void e(String s1)
        throws IOException, JsonGenerationException
    {
        i("write number");
        if (d)
        {
            c(s1);
            return;
        } else
        {
            c(s1);
            return;
        }
    }

    public void flush()
        throws IOException
    {
        t();
        if (o != null && c(com.fasterxml.jackson.core.JsonGenerator.Feature.f))
        {
            o.flush();
        }
    }

    public void i()
        throws IOException, JsonGenerationException
    {
        i("start an array");
        e = e.j();
        if (a != null)
        {
            a.e(this);
            return;
        }
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '[';
    }

    protected void i(String s1)
        throws IOException, JsonGenerationException
    {
        int i1;
        i1 = e.m();
        if (i1 == 5)
        {
            j((new StringBuilder()).append("Can not ").append(s1).append(", expecting field name").toString());
        }
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        i1;
        JVM INSTR tableswitch 1 3: default 76
    //                   1 77
    //                   2 116
    //                   3 122;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        char c1 = ',';
_L5:
        if (r >= s)
        {
            t();
        }
        p[r] = c1;
        r = r + 1;
        return;
_L3:
        c1 = ':';
        if (true) goto _L5; else goto _L4
_L4:
        if (l == null) goto _L1; else goto _L6
_L6:
        c(l.a());
        return;
        b(s1, i1);
        return;
    }

    public void j()
        throws IOException, JsonGenerationException
    {
        if (!e.b())
        {
            j((new StringBuilder()).append("Current context not an ARRAY but ").append(e.e()).toString());
        }
        if (a != null)
        {
            a.b(this, e.f());
        } else
        {
            if (r >= s)
            {
                t();
            }
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = ']';
        }
        e = e.l();
    }

    public void k()
        throws IOException, JsonGenerationException
    {
        i("start an object");
        e = e.k();
        if (a != null)
        {
            a.b(this);
            return;
        }
        if (r >= s)
        {
            t();
        }
        char ac[] = p;
        int i1 = r;
        r = i1 + 1;
        ac[i1] = '{';
    }

    public void l()
        throws IOException, JsonGenerationException
    {
        if (!e.d())
        {
            j((new StringBuilder()).append("Current context not an object but ").append(e.e()).toString());
        }
        if (a != null)
        {
            a.a(this, e.f());
        } else
        {
            if (r >= s)
            {
                t();
            }
            char ac[] = p;
            int i1 = r;
            r = i1 + 1;
            ac[i1] = '}';
        }
        e = e.l();
    }

    public void m()
        throws IOException, JsonGenerationException
    {
        i("write null value");
        u();
    }

    protected void q()
    {
        char ac[] = p;
        if (ac != null)
        {
            p = null;
            h.b(ac);
        }
    }

    protected void t()
        throws IOException
    {
        int i1 = r - q;
        if (i1 > 0)
        {
            int j1 = q;
            q = 0;
            r = 0;
            o.write(p, j1, i1);
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.a.b;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.util.a;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

// Referenced classes of package com.fasterxml.jackson.core.b:
//            c

public final class f extends b
{

    protected Reader aJ;
    protected char aK[];
    protected d aL;
    protected final com.fasterxml.jackson.core.c.b aM;
    protected final int aN;
    protected boolean aO;

    public f(c c1, int j, Reader reader, d d, com.fasterxml.jackson.core.c.b b1)
    {
        super(c1, j);
        aO = false;
        aJ = reader;
        aK = c1.h();
        aL = d;
        aM = b1;
        aN = b1.f();
    }

    private String a(int j, int k, int l)
        throws IOException, JsonParseException
    {
        char ac[];
        n.a(aK, j, d - j);
        ac = n.l();
        j = n.n();
_L3:
        char c2;
        if (d >= e && !Y())
        {
            e((new StringBuilder()).append(": was expecting closing '").append((char)l).append("' for name").toString());
        }
        char ac1[] = aK;
        int i1 = d;
        d = i1 + 1;
        c2 = ac1[i1];
        if (c2 > '\\')
        {
            break MISSING_BLOCK_LABEL_243;
        }
        if (c2 != '\\') goto _L2; else goto _L1
_L1:
        char c1 = al();
_L4:
        k = k * 33 + c2;
        int j1 = j + 1;
        ac[j] = c1;
        com.fasterxml.jackson.core.util.f f1;
        char ac2[];
        if (j1 >= ac.length)
        {
            ac = n.o();
            j = 0;
        } else
        {
            j = j1;
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (c2 <= l)
        {
            if (c2 == l)
            {
                n.a(j);
                f1 = n;
                ac2 = f1.f();
                j = f1.d();
                l = f1.c();
                return aM.a(ac2, j, l, k);
            }
            if (c2 < ' ')
            {
                c(c2, "name");
            }
        }
        c1 = c2;
          goto _L4
    }

    private String a(int j, int k, int ai[])
        throws IOException, JsonParseException
    {
        char ac[];
        int j1;
        n.a(aK, j, d - j);
        ac = n.l();
        j = n.n();
        j1 = ai.length;
_L5:
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        char c1;
        n.a(j);
        ai = n;
        ac = ai.f();
        j = ai.d();
        int l = ai.c();
        return aM.a(ac, j, l, k);
_L2:
        int i1;
        if ((c1 = aK[d]) > j1 ? Character.isJavaIdentifierPart(c1) : ai[c1] == 0) goto _L3; else goto _L1
_L3:
        d = d + 1;
        k = k * 33 + c1;
        i1 = j + 1;
        ac[j] = c1;
        if (i1 >= ac.length)
        {
            ac = n.o();
            j = 0;
        } else
        {
            j = i1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void aA()
        throws IOException, JsonParseException
    {
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.b))
        {
            b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (d >= e && !Y())
        {
            e(" in a comment");
        }
        char ac[] = aK;
        int j = d;
        d = j + 1;
        j = ac[j];
        if (j == '/')
        {
            aC();
            return;
        }
        if (j == '*')
        {
            aB();
            return;
        } else
        {
            b(j, "was expecting either '*' or '/' for a comment");
            return;
        }
    }

    private void aB()
        throws IOException, JsonParseException
    {
        do
        {
            int j;
label0:
            {
label1:
                {
                    if (d < e || Y())
                    {
                        char ac[] = aK;
                        j = d;
                        d = j + 1;
                        j = ac[j];
                        if (j > '*')
                        {
                            continue;
                        }
                        if (j != '*')
                        {
                            break label0;
                        }
                        if (d < e || Y())
                        {
                            break label1;
                        }
                    }
                    e(" in a comment");
                    return;
                }
                if (aK[d] == '/')
                {
                    d = d + 1;
                    return;
                }
                continue;
            }
            if (j < ' ')
            {
                if (j == '\n')
                {
                    av();
                } else
                if (j == '\r')
                {
                    au();
                } else
                if (j != '\t')
                {
                    d(j);
                }
            }
        } while (true);
    }

    private void aC()
        throws IOException, JsonParseException
    {
        do
        {
            int j;
label0:
            {
                if (d < e || Y())
                {
                    char ac[] = aK;
                    j = d;
                    d = j + 1;
                    j = ac[j];
                    if (j >= ' ')
                    {
                        continue;
                    }
                    if (j != '\n')
                    {
                        break label0;
                    }
                    av();
                }
                return;
            }
            if (j == '\r')
            {
                au();
                return;
            }
            if (j != '\t')
            {
                d(j);
            }
        } while (true);
    }

    private JsonToken aw()
    {
        JsonToken jsontoken;
        p = false;
        jsontoken = m;
        m = null;
        if (jsontoken != JsonToken.d) goto _L2; else goto _L1
_L1:
        l = l.b(j, k);
_L4:
        aH = jsontoken;
        return jsontoken;
_L2:
        if (jsontoken == JsonToken.b)
        {
            l = l.c(j, k);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private char ax()
        throws IOException, JsonParseException
    {
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        char c1 = '0';
_L4:
        return c1;
_L2:
        char c2;
        c2 = aK[d];
        if (c2 < '0' || c2 > '9')
        {
            return '0';
        }
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.g))
        {
            d("Leading zeroes not allowed");
        }
        d = d + 1;
        c1 = c2;
        if (c2 != '0')
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = c2;
        do
        {
            if (d >= e && !Y())
            {
                continue; /* Loop/switch isn't completed */
            }
            c2 = aK[d];
            if (c2 < '0' || c2 > '9')
            {
                return '0';
            }
            d = d + 1;
            c1 = c2;
        } while (c2 == '0');
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return c2;
    }

    private int ay()
        throws IOException, JsonParseException
    {
        do
        {
            if (d >= e && !Y())
            {
                break;
            }
            char ac[] = aK;
            int j = d;
            d = j + 1;
            j = ac[j];
            if (j > ' ')
            {
                if (j != '/')
                {
                    return j;
                }
                aA();
            } else
            if (j != ' ')
            {
                if (j == '\n')
                {
                    av();
                } else
                if (j == '\r')
                {
                    au();
                } else
                if (j != '\t')
                {
                    d(j);
                }
            }
        } while (true);
        throw c((new StringBuilder()).append("Unexpected end-of-input within/between ").append(l.e()).append(" entries").toString());
    }

    private int az()
        throws IOException, JsonParseException
    {
        int j;
label0:
        {
            while (d < e || Y()) 
            {
                char ac[] = aK;
                j = d;
                d = j + 1;
                char c1 = ac[j];
                if (c1 > ' ')
                {
                    j = c1;
                    if (c1 != '/')
                    {
                        break label0;
                    }
                    aA();
                } else
                if (c1 != ' ')
                {
                    if (c1 == '\n')
                    {
                        av();
                    } else
                    if (c1 == '\r')
                    {
                        au();
                    } else
                    if (c1 != '\t')
                    {
                        d(c1);
                    }
                }
            }
            ac();
            j = -1;
        }
        return j;
    }

    private JsonToken b(boolean flag)
        throws IOException, JsonParseException
    {
        int j2 = 0;
        char ac2[] = n.m();
        char c1;
        char c2;
        char ac1[];
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            ac2[0] = '-';
            j = 1;
        } else
        {
            j = 0;
        }
        if (d < e)
        {
            char ac[] = aK;
            int k = d;
            d = k + 1;
            c1 = ac[k];
        } else
        {
            c1 = g("No digit following minus sign");
        }
        c2 = c1;
        if (c1 == '0')
        {
            c2 = ax();
        }
        l = 0;
        c1 = c2;
        if (c1 < '0' || c1 > '9')
        {
            break MISSING_BLOCK_LABEL_860;
        }
        l++;
        i1 = j;
        ac1 = ac2;
        if (j >= ac2.length)
        {
            ac1 = n.o();
            i1 = 0;
        }
        j = i1 + 1;
        ac1[i1] = c1;
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        i1 = 1;
        c1 = '\0';
        j1 = l;
        l = j;
        j = i1;
_L20:
        if (j1 == 0)
        {
            d((new StringBuilder()).append("Missing integer part (next char ").append(e(c1)).append(")").toString());
        }
        if (c1 != '.') goto _L4; else goto _L3
_L3:
        ac1[l] = c1;
        l++;
        i1 = 0;
_L15:
        if (d < e || Y()) goto _L6; else goto _L5
_L5:
        j = 1;
_L13:
        if (i1 == 0)
        {
            a(c1, "Decimal point not followed by a digit");
        }
        k1 = i1;
        i1 = l;
        l = j;
        ac2 = ac1;
        j = i1;
_L18:
        if (c1 != 'e' && c1 != 'E') goto _L8; else goto _L7
_L7:
        i1 = j;
        ac1 = ac2;
        if (j >= ac2.length)
        {
            ac1 = n.o();
            i1 = 0;
        }
        j = i1 + 1;
        ac1[i1] = c1;
        if (d < e)
        {
            ac2 = aK;
            i1 = d;
            d = i1 + 1;
            c1 = ac2[i1];
        } else
        {
            c1 = g("expected a digit for number exponent");
        }
        if (c1 == '-' || c1 == '+')
        {
            if (j >= ac1.length)
            {
                ac1 = n.o();
                j = 0;
            }
            ac1[j] = c1;
            if (d < e)
            {
                ac2 = aK;
                i1 = d;
                d = i1 + 1;
                c1 = ac2[i1];
            } else
            {
                c1 = g("expected a digit for number exponent");
            }
            j++;
            i1 = 0;
        } else
        {
            i1 = 0;
        }
        if (c1 > '9' || c1 < '0') goto _L10; else goto _L9
_L9:
        i1++;
        l1 = j;
        ac2 = ac1;
        if (j >= ac1.length)
        {
            ac2 = n.o();
            l1 = 0;
        }
        j = l1 + 1;
        ac2[l1] = c1;
        if (d < e || Y()) goto _L12; else goto _L11
_L11:
        l1 = 1;
        l = j;
        j = l1;
_L16:
        l1 = j;
        i2 = l;
        j2 = i1;
        if (i1 == 0)
        {
            a(c1, "Exponent indicator not followed by a digit");
            j2 = i1;
            i2 = l;
            l1 = j;
        }
_L17:
        if (l1 == 0)
        {
            d = d - 1;
        }
        n.a(i2);
        return a(flag, j1, k1, j2);
_L2:
        ac2 = aK;
        i1 = d;
        d = i1 + 1;
        c1 = ac2[i1];
        ac2 = ac1;
        break MISSING_BLOCK_LABEL_80;
_L6:
        ac2 = aK;
        k1 = d;
        d = k1 + 1;
        c1 = ac2[k1];
        if (c1 >= '0' && c1 <= '9') goto _L14; else goto _L13
_L14:
        i1++;
        if (l >= ac1.length)
        {
            ac1 = n.o();
            l = 0;
        }
        k1 = l + 1;
        ac1[l] = c1;
        l = k1;
          goto _L15
_L12:
        ac1 = aK;
        l1 = d;
        d = l1 + 1;
        c1 = ac1[l1];
        ac1 = ac2;
        break MISSING_BLOCK_LABEL_456;
_L10:
        l1 = j;
        j = l;
        l = l1;
          goto _L16
_L8:
        l1 = l;
        i2 = j;
          goto _L17
_L4:
        k1 = 0;
        i1 = j;
        j = l;
        ac2 = ac1;
        l = i1;
          goto _L18
        i1 = 0;
        j1 = l;
        ac1 = ac2;
        l = j;
        j = i1;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public String Q()
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.h)
        {
            if (aO)
            {
                aO = false;
                Z();
            }
            return n.g();
        } else
        {
            return super.b(null);
        }
    }

    protected boolean Y()
        throws IOException
    {
        boolean flag1 = false;
        f = f + (long)e;
        h = h - e;
        boolean flag = flag1;
        if (aJ != null)
        {
            int j = aJ.read(aK, 0, aK.length);
            if (j > 0)
            {
                d = 0;
                e = j;
                flag = true;
            } else
            {
                aa();
                flag = flag1;
                if (j == 0)
                {
                    throw new IOException((new StringBuilder()).append("Reader returned 0 characters when trying to read ").append(e).toString());
                }
            }
        }
        return flag;
    }

    protected void Z()
        throws IOException, JsonParseException
    {
        int j = d;
        int l = e;
        int k = j;
        if (j < l)
        {
            int ai[] = com.fasterxml.jackson.core.io.b.a();
            int i1 = ai.length;
            do
            {
                char c1 = aK[j];
                if (c1 < i1 && ai[c1] != 0)
                {
                    k = j;
                    if (c1 == '"')
                    {
                        n.a(aK, d, j - d);
                        d = j + 1;
                        return;
                    }
                    break;
                }
                k = j + 1;
                j = k;
            } while (k < l);
        }
        n.b(aK, d, k - d);
        d = k;
        as();
    }

    public int a(int j)
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.f) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        p = false;
        jsontoken = m;
        m = null;
        aH = jsontoken;
        if (jsontoken != JsonToken.i) goto _L4; else goto _L3
_L3:
        int k = D();
_L6:
        return k;
_L4:
        if (jsontoken == JsonToken.d)
        {
            l = l.b(this.j, this.k);
            return j;
        }
        k = j;
        if (jsontoken == JsonToken.b)
        {
            l = l.c(this.j, this.k);
            return j;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        k = j;
        if (f() == JsonToken.i)
        {
            return D();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int a(Base64Variant base64variant, OutputStream outputstream)
        throws IOException, JsonParseException
    {
        byte abyte0[];
        if (!aO || aH != JsonToken.h)
        {
            base64variant = a(base64variant);
            outputstream.write(base64variant);
            return base64variant.length;
        }
        abyte0 = b.g();
        int j = a(base64variant, outputstream, abyte0);
        b.c(abyte0);
        return j;
        base64variant;
        b.c(abyte0);
        throw base64variant;
    }

    protected int a(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
        throws IOException, JsonParseException
    {
        int j;
        int k;
        int l1;
        l1 = abyte0.length;
        k = 0;
        j = 0;
_L8:
        char c1;
        int i1;
        int j1;
        do
        {
            if (d >= e)
            {
                X();
            }
            char ac[] = aK;
            int l = d;
            d = l + 1;
            c1 = ac[l];
        } while (c1 <= ' ');
        i1 = base64variant.b(c1);
        j1 = i1;
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        if (c1 != '"') goto _L4; else goto _L3
_L3:
        i1 = j;
        j = k;
_L6:
        aO = false;
        k = j;
        if (i1 > 0)
        {
            k = j + i1;
            outputstream.write(abyte0, 0, i1);
        }
        return k;
_L4:
        j1 = a(base64variant, c1, 0);
        if (j1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        char c2;
        char ac1[];
        int k1;
        int i2;
        if (j > l1 - 3)
        {
            k += j;
            outputstream.write(abyte0, 0, j);
            i1 = 0;
            j = k;
        } else
        {
            i1 = j;
            j = k;
        }
        if (d >= e)
        {
            X();
        }
        ac1 = aK;
        k = d;
        d = k + 1;
        c2 = ac1[k];
        k1 = base64variant.b(c2);
        k = k1;
        if (k1 < 0)
        {
            k = a(base64variant, c2, 1);
        }
        i2 = j1 << 6 | k;
        if (d >= e)
        {
            X();
        }
        ac1 = aK;
        k = d;
        d = k + 1;
        c2 = ac1[k];
        j1 = base64variant.b(c2);
        k1 = j1;
        if (j1 < 0)
        {
            k = j1;
            if (j1 != -2)
            {
                if (c2 == '"' && !base64variant.b())
                {
                    k = i1 + 1;
                    abyte0[i1] = (byte)(i2 >> 4);
                    i1 = k;
                    continue; /* Loop/switch isn't completed */
                }
                k = a(base64variant, c2, 2);
            }
            k1 = k;
            if (k == -2)
            {
                if (d >= e)
                {
                    X();
                }
                ac1 = aK;
                k = d;
                d = k + 1;
                c2 = ac1[k];
                if (!base64variant.a(c2))
                {
                    throw a(base64variant, c2, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.c()).append("'").toString());
                }
                j1 = i1 + 1;
                abyte0[i1] = (byte)(i2 >> 4);
                k = j;
                j = j1;
                continue; /* Loop/switch isn't completed */
            }
        }
        i2 = i2 << 6 | k1;
        if (d >= e)
        {
            X();
        }
        ac1 = aK;
        k = d;
        d = k + 1;
        c2 = ac1[k];
        j1 = base64variant.b(c2);
        k1 = j1;
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_689;
        }
        k = j1;
        if (j1 == -2)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        if (c2 != '"' || base64variant.b())
        {
            break; /* Loop/switch isn't completed */
        }
        k = i2 >> 2;
        j1 = i1 + 1;
        abyte0[i1] = (byte)(k >> 8);
        i1 = j1 + 1;
        abyte0[j1] = (byte)k;
        if (true) goto _L6; else goto _L5
_L5:
        k = a(base64variant, c2, 3);
        k1 = k;
        if (k == -2)
        {
            k = i2 >> 2;
            j1 = i1 + 1;
            abyte0[i1] = (byte)(k >> 8);
            i1 = j1 + 1;
            abyte0[j1] = (byte)k;
            k = j;
            j = i1;
            continue; /* Loop/switch isn't completed */
        }
        k = i2 << 6 | k1;
        j1 = i1 + 1;
        abyte0[i1] = (byte)(k >> 16);
        k1 = j1 + 1;
        abyte0[j1] = (byte)(k >> 8);
        i1 = k1 + 1;
        abyte0[k1] = (byte)k;
        k = j;
        j = i1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int a(Writer writer)
        throws IOException
    {
        int j = e - d;
        if (j < 1)
        {
            return 0;
        } else
        {
            int k = d;
            writer.write(aK, k, j);
            return j;
        }
    }

    public long a(long l)
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.f) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        p = false;
        jsontoken = m;
        m = null;
        aH = jsontoken;
        if (jsontoken != JsonToken.i) goto _L4; else goto _L3
_L3:
        long l1 = E();
_L6:
        return l1;
_L4:
        if (jsontoken == JsonToken.d)
        {
            this.l = this.l.b(j, k);
            return l;
        }
        l1 = l;
        if (jsontoken == JsonToken.b)
        {
            this.l = this.l.c(j, k);
            return l;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = l;
        if (f() == JsonToken.i)
        {
            return E();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected JsonToken a(int j, boolean flag)
        throws IOException, JsonParseException
    {
        double d;
        int k;
        d = (-1.0D / 0.0D);
        k = j;
        if (j != 73) goto _L2; else goto _L1
_L1:
        if (this.d >= e && !Y())
        {
            ao();
        }
        char ac[] = aK;
        j = this.d;
        this.d = j + 1;
        j = ac[j];
        if (j != 78) goto _L4; else goto _L3
_L3:
        String s;
        if (flag)
        {
            s = "-INF";
        } else
        {
            s = "+INF";
        }
        a(s, 3);
        if (c(com.fasterxml.jackson.core.JsonParser.Feature.h))
        {
            if (!flag)
            {
                d = (1.0D / 0.0D);
            }
            return a(s, d);
        }
        f((new StringBuilder()).append("Non-standard token '").append(s).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
        k = j;
_L2:
        a(k, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
_L4:
        k = j;
        if (j == 110)
        {
            String s1;
            if (flag)
            {
                s1 = "-Infinity";
            } else
            {
                s1 = "+Infinity";
            }
            a(s1, 3);
            if (c(com.fasterxml.jackson.core.JsonParser.Feature.h))
            {
                if (!flag)
                {
                    d = (1.0D / 0.0D);
                }
                return a(s1, d);
            }
            f((new StringBuilder()).append("Non-standard token '").append(s1).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
            k = j;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public d a()
    {
        return aL;
    }

    protected String a(JsonToken jsontoken)
    {
        if (jsontoken == null)
        {
            return null;
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[JsonToken.values().length];
                try
                {
                    a[JsonToken.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[JsonToken.h.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[JsonToken.i.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[JsonToken.j.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[JsonToken.k.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonToken.l.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fasterxml.jackson.core.b._cls1.a[jsontoken.ordinal()])
        {
        default:
            return jsontoken.a();

        case 1: // '\001'
            return l.h();

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return n.g();
        }
    }

    public void a(d d)
    {
        aL = d;
    }

    protected void a(String s, int j)
        throws IOException, JsonParseException
    {
        int l = s.length();
        int k;
        do
        {
            if (d >= e && !Y())
            {
                h(s.substring(0, j));
            }
            if (aK[d] != s.charAt(j))
            {
                h(s.substring(0, j));
            }
            d = d + 1;
            k = j + 1;
            j = k;
        } while (k < l);
        char c1;
        if (d < e || Y())
        {
            if ((c1 = aK[d]) >= '0' && c1 != ']' && c1 != '}' && Character.isJavaIdentifierPart(c1))
            {
                h(s.substring(0, k));
                return;
            }
        }
    }

    protected void a(String s, String s1)
        throws IOException, JsonParseException
    {
        s = new StringBuilder(s);
_L5:
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        char c1;
        f((new StringBuilder()).append("Unrecognized token '").append(s.toString()).append("': was expecting ").append(s1).toString());
        return;
_L2:
        if (!Character.isJavaIdentifierPart(c1 = aK[d])) goto _L1; else goto _L3
_L3:
        d = d + 1;
        s.append(c1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public byte[] a(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.h && (aH != JsonToken.g || r == null))
        {
            f((new StringBuilder()).append("Current token (").append(aH).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
        }
        if (!aO) goto _L2; else goto _L1
_L1:
        try
        {
            r = b(base64variant);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw c((new StringBuilder()).append("Failed to decode VALUE_STRING as base64 (").append(base64variant).append("): ").append(illegalargumentexception.getMessage()).toString());
        }
        aO = false;
_L4:
        return r;
_L2:
        if (r == null)
        {
            a a1 = ad();
            a(u(), a1, base64variant);
            r = a1.c();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void aa()
        throws IOException
    {
        if (aJ != null)
        {
            if (b.c() || c(com.fasterxml.jackson.core.JsonParser.Feature.a))
            {
                aJ.close();
            }
            aJ = null;
        }
    }

    protected void ab()
        throws IOException
    {
        super.ab();
        char ac[] = aK;
        if (ac != null)
        {
            aK = null;
            b.a(ac);
        }
    }

    protected char al()
        throws IOException, JsonParseException
    {
        int k = 0;
        if (d >= e && !Y())
        {
            e(" in character escape sequence");
        }
        char ac[] = aK;
        int j = d;
        d = j + 1;
        char c2 = ac[j];
        char c1 = c2;
        switch (c2)
        {
        default:
            c1 = a(c2);
            // fall through

        case 34: // '"'
        case 47: // '/'
        case 92: // '\\'
            return c1;

        case 98: // 'b'
            return '\b';

        case 116: // 't'
            return '\t';

        case 110: // 'n'
            return '\n';

        case 102: // 'f'
            return '\f';

        case 114: // 'r'
            return '\r';

        case 117: // 'u'
            j = 0;
            break;
        }
        for (; j < 4; j++)
        {
            if (d >= e && !Y())
            {
                e(" in character escape sequence");
            }
            char ac1[] = aK;
            int l = d;
            d = l + 1;
            l = ac1[l];
            int i1 = com.fasterxml.jackson.core.io.b.a(l);
            if (i1 < 0)
            {
                b(l, "expected a hex-digit for character escape sequence");
            }
            k = k << 4 | i1;
        }

        return (char)k;
    }

    protected String aq()
        throws IOException, JsonParseException
    {
        int j;
        int k;
        int l;
        int j1;
        int l1;
        j1 = d;
        l = aN;
        l1 = e;
        j = l;
        k = j1;
        if (j1 >= l1) goto _L2; else goto _L1
_L1:
        int ai[];
        int i2;
        ai = com.fasterxml.jackson.core.io.b.a();
        i2 = ai.length;
        k = j1;
        j = l;
_L4:
        int i1 = aK[k];
        if (i1 == 39)
        {
            i1 = d;
            d = k + 1;
            return aM.a(aK, i1, k - i1, j);
        }
        if (i1 >= i2 || ai[i1] == 0)
        {
            int k1 = j * 33 + i1;
            i1 = k + 1;
            j = k1;
            k = i1;
            if (i1 < l1)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = k1;
            k = i1;
        }
_L2:
        i1 = d;
        d = k;
        return a(i1, j, 39);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected JsonToken ar()
        throws IOException, JsonParseException
    {
        char ac[];
        int j;
        ac = n.m();
        j = n.n();
_L2:
        char c1;
        char c2;
        if (d >= e && !Y())
        {
            e(": was expecting closing quote for a string value");
        }
        char ac1[] = aK;
        int k = d;
        d = k + 1;
        c2 = ac1[k];
        c1 = c2;
        if (c2 <= '\\')
        {
            if (c2 != '\\')
            {
                break; /* Loop/switch isn't completed */
            }
            c1 = al();
        }
_L3:
        if (j >= ac.length)
        {
            ac = n.o();
            j = 0;
        }
        int l = j + 1;
        ac[j] = c1;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        c1 = c2;
        if (c2 <= '\'')
        {
            if (c2 == '\'')
            {
                n.a(j);
                return JsonToken.h;
            }
            c1 = c2;
            if (c2 < ' ')
            {
                c(c2, "string value");
                c1 = c2;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected void as()
        throws IOException, JsonParseException
    {
        char ac[];
        int j;
        ac = n.l();
        j = n.n();
_L2:
        char c1;
        char c2;
        if (d >= e && !Y())
        {
            e(": was expecting closing quote for a string value");
        }
        char ac1[] = aK;
        int k = d;
        d = k + 1;
        c2 = ac1[k];
        c1 = c2;
        if (c2 <= '\\')
        {
            if (c2 != '\\')
            {
                break; /* Loop/switch isn't completed */
            }
            c1 = al();
        }
_L3:
        if (j >= ac.length)
        {
            ac = n.o();
            j = 0;
        }
        int l = j + 1;
        ac[j] = c1;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        c1 = c2;
        if (c2 <= '"')
        {
            if (c2 == '"')
            {
                n.a(j);
                return;
            }
            c1 = c2;
            if (c2 < ' ')
            {
                c(c2, "string value");
                c1 = c2;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    protected void at()
        throws IOException, JsonParseException
    {
        aO = false;
        int j = d;
        int k = e;
        char ac[] = aK;
        do
        {
            int l = k;
            int i1 = j;
            if (j >= k)
            {
                d = j;
                if (!Y())
                {
                    e(": was expecting closing quote for a string value");
                }
                i1 = d;
                l = e;
            }
            j = i1 + 1;
            k = ac[i1];
            if (k <= '\\')
            {
                if (k == '\\')
                {
                    d = j;
                    al();
                    j = d;
                    k = e;
                    continue;
                }
                if (k <= 34)
                {
                    if (k == 34)
                    {
                        d = j;
                        return;
                    }
                    if (k < 32)
                    {
                        d = j;
                        c(k, "string value");
                    }
                }
            }
            k = l;
        } while (true);
    }

    protected void au()
        throws IOException
    {
        if ((d < e || Y()) && aK[d] == '\n')
        {
            d = d + 1;
        }
        g = g + 1;
        h = d;
    }

    protected void av()
        throws IOException
    {
        g = g + 1;
        h = d;
    }

    public Object b()
    {
        return aJ;
    }

    public String b(String s)
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.h)
        {
            if (aO)
            {
                aO = false;
                Z();
            }
            return n.g();
        } else
        {
            return super.b(s);
        }
    }

    protected byte[] b(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        a a1 = ad();
        do
        {
            char c1;
            do
            {
                if (d >= e)
                {
                    X();
                }
                char ac[] = aK;
                int j = d;
                d = j + 1;
                c1 = ac[j];
            } while (c1 <= ' ');
            int i1 = base64variant.b(c1);
            int k = i1;
            if (i1 < 0)
            {
                if (c1 == '"')
                {
                    return a1.c();
                }
                k = a(base64variant, c1, 0);
                if (k < 0)
                {
                    continue;
                }
            }
            if (d >= e)
            {
                X();
            }
            char ac1[] = aK;
            i1 = d;
            d = i1 + 1;
            c1 = ac1[i1];
            int j1 = base64variant.b(c1);
            i1 = j1;
            if (j1 < 0)
            {
                i1 = a(base64variant, c1, 1);
            }
            int k1 = i1 | k << 6;
            if (d >= e)
            {
                X();
            }
            ac1 = aK;
            k = d;
            d = k + 1;
            c1 = ac1[k];
            i1 = base64variant.b(c1);
            j1 = i1;
            if (i1 < 0)
            {
                k = i1;
                if (i1 != -2)
                {
                    if (c1 == '"' && !base64variant.b())
                    {
                        a1.a(k1 >> 4);
                        return a1.c();
                    }
                    k = a(base64variant, c1, 2);
                }
                j1 = k;
                if (k == -2)
                {
                    if (d >= e)
                    {
                        X();
                    }
                    ac1 = aK;
                    k = d;
                    d = k + 1;
                    c1 = ac1[k];
                    if (!base64variant.a(c1))
                    {
                        throw a(base64variant, c1, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.c()).append("'").toString());
                    }
                    a1.a(k1 >> 4);
                    continue;
                }
            }
            k1 = k1 << 6 | j1;
            if (d >= e)
            {
                X();
            }
            ac1 = aK;
            k = d;
            d = k + 1;
            c1 = ac1[k];
            i1 = base64variant.b(c1);
            j1 = i1;
            if (i1 < 0)
            {
                int l = i1;
                if (i1 != -2)
                {
                    if (c1 == '"' && !base64variant.b())
                    {
                        a1.b(k1 >> 2);
                        return a1.c();
                    }
                    l = a(base64variant, c1, 3);
                }
                j1 = l;
                if (l == -2)
                {
                    a1.b(k1 >> 2);
                    continue;
                }
            }
            a1.c(j1 | k1 << 6);
        } while (true);
    }

    public void close()
        throws IOException
    {
        super.close();
        aM.b();
    }

    public JsonToken f()
        throws IOException, JsonParseException
    {
        int k;
        boolean flag;
        ac = 0;
        if (aH == JsonToken.f)
        {
            return aw();
        }
        if (aO)
        {
            at();
        }
        k = az();
        if (k < 0)
        {
            close();
            aH = null;
            return null;
        }
        i = (f + (long)d) - 1L;
        this.j = g;
        this.k = d - h - 1;
        r = null;
        if (k == 93)
        {
            if (!l.b())
            {
                a(k, '}');
            }
            l = l.j();
            JsonToken jsontoken = JsonToken.e;
            aH = jsontoken;
            return jsontoken;
        }
        if (k == 125)
        {
            if (!l.d())
            {
                a(k, ']');
            }
            l = l.j();
            JsonToken jsontoken1 = JsonToken.c;
            aH = jsontoken1;
            return jsontoken1;
        }
        int j = k;
        if (l.k())
        {
            if (k != 44)
            {
                b(k, (new StringBuilder()).append("was expecting comma to separate ").append(l.e()).append(" entries").toString());
            }
            j = ay();
        }
        flag = l.d();
        k = j;
        if (flag)
        {
            String s = g(j);
            l.a(s);
            aH = JsonToken.f;
            j = ay();
            if (j != 58)
            {
                b(j, "was expecting a colon to separate field name and value");
            }
            k = ay();
        }
        k;
        JVM INSTR lookupswitch 19: default 468
    //                   34: 489
    //                   45: 616
    //                   48: 616
    //                   49: 616
    //                   50: 616
    //                   51: 616
    //                   52: 616
    //                   53: 616
    //                   54: 616
    //                   55: 616
    //                   56: 616
    //                   57: 616
    //                   91: 501
    //                   93: 563
    //                   102: 586
    //                   110: 601
    //                   116: 571
    //                   123: 532
    //                   125: 563;
           goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L5
_L3:
        break MISSING_BLOCK_LABEL_616;
_L1:
        JsonToken jsontoken2 = i(k);
_L10:
        if (flag)
        {
            m = jsontoken2;
            return aH;
        } else
        {
            aH = jsontoken2;
            return jsontoken2;
        }
_L2:
        aO = true;
        jsontoken2 = JsonToken.h;
          goto _L10
_L4:
        if (!flag)
        {
            l = l.b(this.j, this.k);
        }
        jsontoken2 = JsonToken.d;
          goto _L10
_L9:
        if (!flag)
        {
            l = l.c(this.j, this.k);
        }
        jsontoken2 = JsonToken.b;
          goto _L10
_L5:
        b(k, "expected a value");
_L8:
        a("true", 1);
        jsontoken2 = JsonToken.k;
          goto _L10
_L6:
        a("false", 1);
        jsontoken2 = JsonToken.l;
          goto _L10
_L7:
        a("null", 1);
        jsontoken2 = JsonToken.m;
          goto _L10
        jsontoken2 = f(k);
          goto _L10
    }

    protected JsonToken f(int j)
        throws IOException, JsonParseException
    {
        int k;
        int i1;
        int k1;
        int i2;
        boolean flag;
        int j2;
        boolean flag1;
        i1 = 1;
        k1 = 0;
        flag = false;
        if (j == 45)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = d;
        i2 = k - 1;
        j2 = e;
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (k < e) goto _L4; else goto _L3
_L3:
        int j1;
        char ac[];
        int l;
        int l1;
        if (flag1)
        {
            j = i2 + 1;
        } else
        {
            j = i2;
        }
        d = j;
        return b(flag1);
_L4:
        ac = aK;
        l = k + 1;
        j1 = ac[k];
        if (j1 <= '9')
        {
            j = l;
            k = j1;
            if (j1 >= '0')
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        d = l;
        return a(j1, true);
_L2:
        l = k;
        k = j;
        j = l;
        if (k == 48) goto _L3; else goto _L5
_L5:
        k = j;
_L22:
        if (k >= e) goto _L3; else goto _L6
_L6:
        ac = aK;
        j = k + 1;
        l = ac[k];
        if (l >= 48 && l <= 57) goto _L8; else goto _L7
_L7:
        if (l != 46)
        {
            break MISSING_BLOCK_LABEL_456;
        }
        k = 0;
        l = j;
        j = k;
_L23:
        if (l >= j2) goto _L3; else goto _L9
_L9:
        ac = aK;
        k = l + 1;
        l = ac[l];
        if (l >= 48 && l <= 57) goto _L11; else goto _L10
_L10:
        if (j == 0)
        {
            a(l, "Decimal point not followed by a digit");
        }
        j1 = j;
        j = k;
_L24:
        if (l == 101)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = j;
        if (l != 69) goto _L13; else goto _L12
_L12:
        if (j >= j2) goto _L3; else goto _L14
_L14:
        ac = aK;
        k = j + 1;
        l = ac[j];
        if (l != '-' && l != '+') goto _L16; else goto _L15
_L15:
        if (k >= j2) goto _L3; else goto _L17
_L17:
        ac = aK;
        j = k + 1;
        l = ac[k];
        k = ((flag) ? 1 : 0);
_L21:
        if (l > '9' || l < '0') goto _L19; else goto _L18
_L18:
        k++;
        if (j >= j2) goto _L3; else goto _L20
_L20:
        l = aK[j];
        j++;
          goto _L21
_L8:
        i1++;
        k = j;
          goto _L22
_L11:
        j++;
        l = k;
          goto _L23
_L19:
        k1 = k;
        l1 = j;
        if (k == 0)
        {
            a(l, "Exponent indicator not followed by a digit");
            l1 = j;
            k1 = k;
        }
_L13:
        j = l1 - 1;
        d = j;
        n.a(aK, i2, j - i2);
        return a(flag1, i1, j1, k1);
_L16:
        j = k;
        k = ((flag) ? 1 : 0);
          goto _L21
        j1 = 0;
          goto _L24
    }

    protected char g(String s)
        throws IOException, JsonParseException
    {
        if (d >= e && !Y())
        {
            e(s);
        }
        s = aK;
        int j = d;
        d = j + 1;
        return s[j];
    }

    protected String g(int j)
        throws IOException, JsonParseException
    {
        if (j != 34)
        {
            return h(j);
        }
        j = d;
        int k = aN;
        int j1 = e;
        int i1 = k;
        int l = j;
        if (j < j1)
        {
            int ai[] = com.fasterxml.jackson.core.io.b.a();
            int k1 = ai.length;
            do
            {
                char c1 = aK[j];
                if (c1 < k1 && ai[c1] != 0)
                {
                    i1 = k;
                    l = j;
                    if (c1 == '"')
                    {
                        l = d;
                        d = j + 1;
                        return aM.a(aK, l, j - l, k);
                    }
                    break;
                }
                i1 = k * 33 + c1;
                l = j + 1;
                k = i1;
                j = l;
            } while (l < j1);
        }
        j = d;
        d = l;
        return a(j, i1, 34);
    }

    public String h()
        throws IOException, JsonParseException
    {
        String s = null;
        if (aH != JsonToken.f) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        p = false;
        jsontoken = m;
        m = null;
        aH = jsontoken;
        if (jsontoken != JsonToken.h) goto _L4; else goto _L3
_L3:
        if (aO)
        {
            aO = false;
            Z();
        }
        s = n.g();
_L6:
        return s;
_L4:
        if (jsontoken == JsonToken.d)
        {
            l = l.b(j, k);
            return null;
        }
        if (jsontoken == JsonToken.b)
        {
            l = l.c(j, k);
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (f() == JsonToken.h)
        {
            return u();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected String h(int j)
        throws IOException, JsonParseException
    {
        if (j == 39 && c(com.fasterxml.jackson.core.JsonParser.Feature.d))
        {
            return aq();
        }
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.c))
        {
            b(j, "was expecting double-quote to start field name");
        }
        int ai[] = com.fasterxml.jackson.core.io.b.c();
        int j1 = ai.length;
        int k;
        int l;
        int i1;
        int k1;
        boolean flag;
        if (j < j1)
        {
            if (ai[j] == 0 && (j < 48 || j > 57))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = Character.isJavaIdentifierPart((char)j);
        }
        if (!flag)
        {
            b(j, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        i1 = d;
        k = aN;
        k1 = e;
        l = k;
        j = i1;
        if (i1 < k1)
        {
            j = i1;
            do
            {
                l = aK[j];
                if (l < j1)
                {
                    if (ai[l] != 0)
                    {
                        l = d - 1;
                        d = j;
                        return aM.a(aK, l, j - l, k);
                    }
                } else
                if (!Character.isJavaIdentifierPart((char)l))
                {
                    l = d - 1;
                    d = j;
                    return aM.a(aK, l, j - l, k);
                }
                l = k * 33 + l;
                i1 = j + 1;
                k = l;
                j = i1;
            } while (i1 < k1);
            j = i1;
        }
        k = d;
        d = j;
        return a(k - 1, l, ai);
    }

    protected void h(String s)
        throws IOException, JsonParseException
    {
        a(s, "'null', 'true', 'false' or NaN");
    }

    protected JsonToken i(int j)
        throws IOException, JsonParseException
    {
        j;
        JVM INSTR lookupswitch 4: default 44
    //                   39: 54
    //                   43: 147
    //                   73: 108
    //                   78: 69;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        b(j, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
_L2:
        if (c(com.fasterxml.jackson.core.JsonParser.Feature.d))
        {
            return ar();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a("NaN", 1);
        if (c(com.fasterxml.jackson.core.JsonParser.Feature.h))
        {
            return a("NaN", (0.0D / 0.0D));
        }
        f("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        continue; /* Loop/switch isn't completed */
_L4:
        a("Infinity", 1);
        if (c(com.fasterxml.jackson.core.JsonParser.Feature.h))
        {
            return a("Infinity", (1.0D / 0.0D));
        }
        f("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        if (true) goto _L1; else goto _L3
_L3:
        if (d >= e && !Y())
        {
            ao();
        }
        char ac[] = aK;
        j = d;
        d = j + 1;
        return a(ac[j], false);
    }

    public Boolean i()
        throws IOException, JsonParseException
    {
        Boolean boolean1;
        JsonToken jsontoken;
        boolean1 = null;
        if (aH != JsonToken.f)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        p = false;
        jsontoken = m;
        m = null;
        aH = jsontoken;
        if (jsontoken != JsonToken.k) goto _L2; else goto _L1
_L1:
        boolean1 = Boolean.TRUE;
_L4:
        return boolean1;
_L2:
        if (jsontoken == JsonToken.l)
        {
            return Boolean.FALSE;
        }
        if (jsontoken == JsonToken.d)
        {
            l = l.b(j, k);
            return null;
        }
        if (jsontoken != JsonToken.b) goto _L4; else goto _L3
_L3:
        l = l.c(j, k);
        return null;
        switch (com.fasterxml.jackson.core.b._cls1.a[f().ordinal()])
        {
        default:
            return null;

        case 5: // '\005'
            return Boolean.TRUE;

        case 6: // '\006'
            return Boolean.FALSE;
        }
    }

    public String u()
        throws IOException, JsonParseException
    {
        JsonToken jsontoken = aH;
        if (jsontoken == JsonToken.h)
        {
            if (aO)
            {
                aO = false;
                Z();
            }
            return n.g();
        } else
        {
            return a(jsontoken);
        }
    }

    public char[] v()
        throws IOException, JsonParseException
    {
        if (aH == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        com.fasterxml.jackson.core.b._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 56
    //                   2 135
    //                   3 151
    //                   4 151;
           goto _L1 _L2 _L3 _L4 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        return aH.b();
_L2:
        if (p) goto _L6; else goto _L5
_L5:
        String s;
        int j;
        s = l.h();
        j = s.length();
        if (o != null) goto _L8; else goto _L7
_L7:
        o = b.a(j);
_L10:
        s.getChars(0, j, o, 0);
        p = true;
_L6:
        return o;
_L8:
        if (o.length < j)
        {
            o = new char[j];
        }
        if (true) goto _L10; else goto _L9
_L9:
        break; /* Loop/switch isn't completed */
_L3:
        if (aO)
        {
            aO = false;
            Z();
        }
        return n.f();
        return null;
    }

    public int w()
        throws IOException, JsonParseException
    {
label0:
        {
label1:
            {
label2:
                {
                    int j = 0;
                    if (aH != null)
                    {
                        switch (com.fasterxml.jackson.core.b._cls1.a[aH.ordinal()])
                        {
                        default:
                            j = aH.b().length;
                            break;

                        case 1: // '\001'
                            break label2;

                        case 2: // '\002'
                            break label1;

                        case 3: // '\003'
                        case 4: // '\004'
                            break label0;
                        }
                    }
                    return j;
                }
                return l.h().length();
            }
            if (aO)
            {
                aO = false;
                Z();
            }
        }
        return n.c();
    }

    public int x()
        throws IOException, JsonParseException
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        com.fasterxml.jackson.core.b._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 48
    //                   2 50
    //                   3 66
    //                   4 66;
           goto _L2 _L2 _L3 _L4 _L4
_L2:
        return 0;
_L3:
        if (aO)
        {
            aO = false;
            Z();
        }
_L4:
        return n.d();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.a.b;
import com.fasterxml.jackson.core.c.a;
import com.fasterxml.jackson.core.c.c;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.util.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.fasterxml.jackson.core.b:
//            c

public final class h extends b
{

    static final byte aJ = 10;
    private static final int aR[] = com.fasterxml.jackson.core.io.b.b();
    private static final int aS[] = com.fasterxml.jackson.core.io.b.a();
    protected d aK;
    protected final a aL;
    protected int aM[];
    protected boolean aN;
    protected InputStream aO;
    protected byte aP[];
    protected boolean aQ;
    private int aT;

    public h(com.fasterxml.jackson.core.io.c c1, int i1, InputStream inputstream, d d, a a1, byte abyte0[], int j1, 
            int k1, boolean flag)
    {
        super(c1, i1);
        aM = new int[16];
        aN = false;
        aO = inputstream;
        aK = d;
        aL = a1;
        aP = abyte0;
        this.d = j1;
        e = k1;
        aQ = flag;
    }

    private JsonToken a(char ac[], int i1, int j1, boolean flag, int k1)
        throws IOException, JsonParseException
    {
        int i2;
        int l2;
        boolean flag1 = false;
        i2 = 0;
        l2 = 0;
        if (j1 != 46)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        int j2 = i1 + 1;
        ac[i1] = (char)j1;
        i2 = j1;
        i1 = j2;
        j1 = ((flag1) ? 1 : 0);
_L12:
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        int l1 = 1;
_L10:
        char ac1[];
        int k2;
        if (j1 == 0)
        {
            a(i2, "Decimal point not followed by a digit");
        }
        k2 = j1;
        j1 = i2;
        ac1 = ac;
_L15:
        if (j1 != 101 && j1 != 69) goto _L4; else goto _L3
_L3:
        int i3;
        int j3;
        i2 = i1;
        ac = ac1;
        if (i1 >= ac1.length)
        {
            ac = n.o();
            i2 = 0;
        }
        i1 = i2 + 1;
        ac[i2] = (char)j1;
        if (d >= e)
        {
            X();
        }
        ac1 = aP;
        j1 = d;
        d = j1 + 1;
        i2 = ac1[j1] & 0xff;
        if (i2 == 45 || i2 == 43)
        {
            if (i1 >= ac.length)
            {
                ac = n.o();
                i1 = 0;
            }
            ac[i1] = (char)i2;
            if (d >= e)
            {
                X();
            }
            ac1 = aP;
            j1 = d;
            d = j1 + 1;
            i2 = ac1[j1] & 0xff;
            i1++;
            j1 = 0;
        } else
        {
            j1 = 0;
        }
        if (i2 > 57 || i2 < 48) goto _L6; else goto _L5
_L5:
        j1++;
        l2 = i1;
        ac1 = ac;
        if (i1 >= ac.length)
        {
            ac1 = n.o();
            l2 = 0;
        }
        i1 = l2 + 1;
        ac1[l2] = (char)i2;
        if (d < e || Y()) goto _L8; else goto _L7
_L7:
        l2 = j1;
        j1 = 1;
        l1 = i1;
        i1 = l2;
_L13:
        l2 = i1;
        i3 = j1;
        j3 = l1;
        if (i1 == 0)
        {
            a(i2, "Exponent indicator not followed by a digit");
            j3 = l1;
            i3 = j1;
            l2 = i1;
        }
_L14:
        if (i3 == 0)
        {
            d = d - 1;
        }
        n.a(j3);
        return b(flag, k1, k2, l2);
_L2:
        ac1 = aP;
        l1 = d;
        d = l1 + 1;
        k2 = ac1[l1] & 0xff;
        l1 = l2;
        i2 = k2;
        if (k2 < 48) goto _L10; else goto _L9
_L9:
        l1 = l2;
        i2 = k2;
        if (k2 > 57) goto _L10; else goto _L11
_L11:
        j1++;
        if (i1 >= ac.length)
        {
            ac = n.o();
            i1 = 0;
        }
        l1 = i1 + 1;
        ac[i1] = (char)k2;
        i1 = l1;
        i2 = k2;
          goto _L12
_L8:
        ac = aP;
        i2 = d;
        d = i2 + 1;
        i2 = ac[i2] & 0xff;
        ac = ac1;
        break MISSING_BLOCK_LABEL_251;
_L6:
        l2 = i1;
        i1 = j1;
        j1 = l1;
        l1 = l2;
          goto _L13
_L4:
        l2 = 0;
        i3 = l1;
        j3 = i1;
          goto _L14
        k2 = 0;
        ac1 = ac;
        l1 = i2;
          goto _L15
    }

    private JsonToken a(char ac[], int i1, boolean flag, int j1)
        throws IOException, JsonParseException
    {
        do
        {
            if (d >= e && !Y())
            {
                n.a(i1);
                return a(flag, j1);
            }
            byte abyte0[] = aP;
            int k1 = d;
            d = k1 + 1;
            int l1 = abyte0[k1] & 0xff;
            if (l1 > 57 || l1 < 48)
            {
                if (l1 == 46 || l1 == 101 || l1 == 69)
                {
                    return a(ac, i1, l1, flag, j1);
                } else
                {
                    d = d - 1;
                    n.a(i1);
                    return a(flag, j1);
                }
            }
            if (i1 >= ac.length)
            {
                ac = n.o();
                i1 = 0;
            }
            k1 = i1 + 1;
            ac[i1] = (char)l1;
            j1++;
            i1 = k1;
        } while (true);
    }

    private c a(int i1, int j1, int k1)
        throws IOException, JsonParseException
    {
        return a(aM, 0, i1, j1, k1);
    }

    private c a(int i1, int j1, int k1, int l1)
        throws IOException, JsonParseException
    {
        aM[0] = i1;
        return a(aM, 1, j1, k1, l1);
    }

    private c a(int ai[], int i1, int j1)
        throws JsonParseException
    {
        char ac[];
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3 = ((i1 << 2) - 4) + j1;
        char ac1[];
        if (j1 < 4)
        {
            i3 = ai[i1 - 1];
            ai[i1 - 1] = i3 << (4 - j1 << 3);
        } else
        {
            i3 = 0;
        }
        ac = n.m();
        j2 = 0;
        k1 = 0;
        if (k1 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = ai[k1 >> 2] >> (3 - (k1 & 3) << 3) & 0xff;
        i2 = k1 + 1;
        l2 = l1;
        k2 = i2;
        if (l1 <= 127)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        if ((l1 & 0xe0) == 192)
        {
            k1 = l1 & 0x1f;
            l1 = 1;
        } else
        if ((l1 & 0xf0) == 224)
        {
            k1 = l1 & 0xf;
            l1 = 2;
        } else
        if ((l1 & 0xf8) == 240)
        {
            k1 = l1 & 7;
            l1 = 3;
        } else
        {
            n(l1);
            k1 = 1;
            l1 = 1;
        }
        if (i2 + l1 > j3)
        {
            e(" in field name");
        }
        l2 = ai[i2 >> 2] >> (3 - (i2 & 3) << 3);
        k2 = i2 + 1;
        if ((l2 & 0xc0) != 128)
        {
            o(l2);
        }
        l2 = k1 << 6 | l2 & 0x3f;
        i2 = l2;
        k1 = k2;
        if (l1 > 1)
        {
            k1 = ai[k2 >> 2] >> (3 - (k2 & 3) << 3);
            k2++;
            if ((k1 & 0xc0) != 128)
            {
                o(k1);
            }
            l2 = l2 << 6 | k1 & 0x3f;
            i2 = l2;
            k1 = k2;
            if (l1 > 2)
            {
                i2 = ai[k2 >> 2] >> (3 - (k2 & 3) << 3);
                k1 = k2 + 1;
                if ((i2 & 0xc0) != 128)
                {
                    o(i2 & 0xff);
                }
                i2 = l2 << 6 | i2 & 0x3f;
            }
        }
        l2 = i2;
        k2 = k1;
        if (l1 <= 2)
        {
            break MISSING_BLOCK_LABEL_558;
        }
        l1 = i2 - 0x10000;
        ac1 = ac;
        if (j2 >= ac.length)
        {
            ac1 = n.p();
        }
        ac1[j2] = (char)(55296 + (l1 >> 10));
        i2 = j2 + 1;
        ac = ac1;
        l1 = l1 & 0x3ff | 0xdc00;
_L4:
        ac1 = ac;
        if (i2 >= ac.length)
        {
            ac1 = n.p();
        }
        j2 = i2 + 1;
        ac1[i2] = (char)l1;
        ac = ac1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_49;
_L1:
        String s1 = new String(ac, 0, j2);
        if (j1 < 4)
        {
            ai[i1 - 1] = i3;
        }
        return aL.a(s1, ai, i1);
        l1 = l2;
        k1 = k2;
        i2 = j2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private c a(int ai[], int i1, int j1, int k1)
        throws JsonParseException
    {
        int ai1[] = ai;
        if (i1 >= ai.length)
        {
            ai1 = a(ai, ai.length);
            aM = ai1;
        }
        int l1 = i1 + 1;
        ai1[i1] = j1;
        c c1 = aL.a(ai1, l1);
        ai = c1;
        if (c1 == null)
        {
            ai = a(ai1, l1, k1);
        }
        return ai;
    }

    private void a(char ac[], int i1)
        throws IOException, JsonParseException
    {
label0:
        {
label1:
            {
label2:
                {
                    int ai[] = aR;
                    byte abyte0[] = aP;
                    char ac1[] = ac;
label3:
                    do
                    {
                        {
                            int j1;
                            int k1;
label4:
                            {
                                j1 = d;
                                k1 = j1;
                                if (j1 >= e)
                                {
                                    X();
                                    k1 = d;
                                }
                                ac = ac1;
                                j1 = i1;
                                if (i1 >= ac1.length)
                                {
                                    ac = n.o();
                                    j1 = 0;
                                }
                                int l1 = Math.min(e, (ac.length - j1) + k1);
                                do
                                {
                                    if (k1 >= l1)
                                    {
                                        break;
                                    }
                                    i1 = k1 + 1;
                                    k1 = abyte0[k1] & 0xff;
                                    if (ai[k1] != 0)
                                    {
                                        d = i1;
                                        if (k1 == 34)
                                        {
                                            n.a(j1);
                                            return;
                                        }
                                        break label4;
                                    }
                                    ac[j1] = (char)k1;
                                    k1 = i1;
                                    j1++;
                                } while (true);
                                d = k1;
                                ac1 = ac;
                                i1 = j1;
                                continue;
                            }
                            int i2;
                            switch (ai[k1])
                            {
                            default:
                                if (k1 < 32)
                                {
                                    c(k1, "string value");
                                    i1 = k1;
                                } else
                                {
                                    m(k1);
                                    i1 = k1;
                                }
                                break;

                            case 1: // '\001'
                                break label3;

                            case 2: // '\002'
                                break label2;

                            case 3: // '\003'
                                break label1;

                            case 4: // '\004'
                                break label0;
                            }
                        }
                        if (j1 >= ac.length)
                        {
                            ac = n.o();
                            j1 = 0;
                        }
                        k1 = j1 + 1;
                        ac[j1] = (char)i1;
                        ac1 = ac;
                        i1 = k1;
                    } while (true);
                    i1 = al();
                    break MISSING_BLOCK_LABEL_222;
                }
                i1 = q(k1);
                break MISSING_BLOCK_LABEL_222;
            }
            if (e - d >= 2)
            {
                i1 = s(k1);
            } else
            {
                i1 = r(k1);
            }
            break MISSING_BLOCK_LABEL_222;
        }
        i2 = t(k1);
        k1 = j1 + 1;
        ac[j1] = (char)(0xd800 | i2 >> 10);
        i1 = k1;
        ac1 = ac;
        if (k1 >= ac.length)
        {
            ac1 = n.o();
            i1 = 0;
        }
        j1 = i1;
        i1 = i2 & 0x3ff | 0xdc00;
        ac = ac1;
        break MISSING_BLOCK_LABEL_222;
    }

    private boolean a(int i1, com.fasterxml.jackson.core.f f1)
        throws IOException, JsonParseException
    {
        boolean flag;
        String s1 = h(i1).a();
        l.a(s1);
        flag = s1.equals(f1.a());
        aH = JsonToken.f;
        i1 = az();
        if (i1 != 58)
        {
            b(i1, "was expecting a colon to separate field name and value");
        }
        i1 = az();
        if (i1 == 34)
        {
            aN = true;
            m = JsonToken.h;
            return flag;
        }
        i1;
        JVM INSTR lookupswitch 18: default 236
    //                   45: 313
    //                   48: 313
    //                   49: 313
    //                   50: 313
    //                   51: 313
    //                   52: 313
    //                   53: 313
    //                   54: 313
    //                   55: 313
    //                   56: 313
    //                   57: 313
    //                   91: 250
    //                   93: 264
    //                   102: 285
    //                   110: 299
    //                   116: 271
    //                   123: 257
    //                   125: 264;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L1:
        f1 = k(i1);
_L10:
        m = f1;
        return flag;
_L3:
        f1 = JsonToken.d;
        continue; /* Loop/switch isn't completed */
_L8:
        f1 = JsonToken.b;
        continue; /* Loop/switch isn't completed */
_L4:
        b(i1, "expected a value");
_L7:
        a("true", 1);
        f1 = JsonToken.k;
        continue; /* Loop/switch isn't completed */
_L5:
        a("false", 1);
        f1 = JsonToken.l;
        continue; /* Loop/switch isn't completed */
_L6:
        a("null", 1);
        f1 = JsonToken.m;
        continue; /* Loop/switch isn't completed */
_L2:
        f1 = g(i1);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static int[] a(int ai[], int i1)
    {
        if (ai == null)
        {
            return new int[i1];
        } else
        {
            int j1 = ai.length;
            int ai1[] = new int[j1 + i1];
            System.arraycopy(ai, 0, ai1, 0, j1);
            return ai1;
        }
    }

    private int aA()
        throws IOException, JsonParseException
    {
        do
        {
            if (d >= e && !Y())
            {
                break;
            }
            byte abyte0[] = aP;
            int i1 = d;
            d = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            if (i1 > 32)
            {
                if (i1 != 47)
                {
                    return i1;
                }
                aC();
            } else
            if (i1 != 32)
            {
                if (i1 == 10)
                {
                    av();
                } else
                if (i1 == 13)
                {
                    au();
                } else
                if (i1 != 9)
                {
                    d(i1);
                }
            }
        } while (true);
        ac();
        return -1;
    }

    private int aB()
        throws IOException, JsonParseException
    {
        int i1;
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if (i1 != 58) goto _L2; else goto _L1
_L1:
        if (d >= e) goto _L4; else goto _L3
_L3:
        i1 = aP[d] & 0xff;
        if (i1 <= 32 || i1 == 47) goto _L4; else goto _L5
_L5:
        d = d + 1;
_L14:
        return i1;
_L2:
        i1 &= 0xff;
_L15:
        i1;
        JVM INSTR lookupswitch 5: default 148
    //                   9: 240
    //                   10: 283
    //                   13: 236
    //                   32: 240
    //                   47: 290;
           goto _L6 _L7 _L8 _L9 _L7 _L10
_L6:
        if (i1 < 32)
        {
            d(i1);
        }
        if (i1 != 58)
        {
            b(i1, "was expecting a colon to separate field name and value");
        }
_L4:
        int j1;
        if (d >= e && !Y())
        {
            break MISSING_BLOCK_LABEL_343;
        }
        byte abyte1[] = aP;
        i1 = d;
        d = i1 + 1;
        j1 = abyte1[i1] & 0xff;
        if (j1 <= 32) goto _L12; else goto _L11
_L11:
        i1 = j1;
        if (j1 != 47) goto _L14; else goto _L13
_L13:
        aC();
          goto _L4
_L9:
        au();
_L7:
        if (d >= e)
        {
            X();
        }
        byte abyte2[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte2[i1] & 0xff;
          goto _L15
_L8:
        av();
          goto _L7
_L10:
        aC();
          goto _L7
_L12:
        if (j1 != 32)
        {
            if (j1 == 10)
            {
                av();
            } else
            if (j1 == 13)
            {
                au();
            } else
            if (j1 != 9)
            {
                d(j1);
            }
        }
          goto _L4
        throw c((new StringBuilder()).append("Unexpected end-of-input within/between ").append(l.e()).append(" entries").toString());
          goto _L15
    }

    private void aC()
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
        byte abyte0[] = aP;
        int i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1] & 0xff;
        if (i1 == 47)
        {
            aE();
            return;
        }
        if (i1 == 42)
        {
            aD();
            return;
        } else
        {
            b(i1, "was expecting either '*' or '/' for a comment");
            return;
        }
    }

    private void aD()
        throws IOException, JsonParseException
    {
        int ai[] = com.fasterxml.jackson.core.io.b.e();
_L12:
        if (d >= e && !Y()) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1] & 0xff;
        j1 = ai[i1];
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1;
        JVM INSTR lookupswitch 6: default 116
    //                   2: 189
    //                   3: 197
    //                   4: 205
    //                   10: 175
    //                   13: 182
    //                   42: 124;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        m(i1);
        continue; /* Loop/switch isn't completed */
_L9:
        if (d < e || Y()) goto _L10; else goto _L2
_L2:
        e(" in a comment");
        return;
_L10:
        if (aP[d] == 47)
        {
            d = d + 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        av();
        continue; /* Loop/switch isn't completed */
_L8:
        au();
        continue; /* Loop/switch isn't completed */
_L4:
        u(i1);
        continue; /* Loop/switch isn't completed */
_L5:
        v(i1);
        continue; /* Loop/switch isn't completed */
_L6:
        w(i1);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void aE()
        throws IOException, JsonParseException
    {
        int ai[] = com.fasterxml.jackson.core.io.b.e();
        do
        {
            int i1;
label0:
            {
label1:
                {
label2:
                    {
label3:
                        {
                            if (d < e || Y())
                            {
                                byte abyte0[] = aP;
                                i1 = d;
                                d = i1 + 1;
                                i1 = abyte0[i1] & 0xff;
                                int j1 = ai[i1];
                                if (j1 == 0)
                                {
                                    continue;
                                }
                                switch (j1)
                                {
                                default:
                                    m(i1);
                                    continue;

                                case 2: // '\002'
                                    break label2;

                                case 3: // '\003'
                                    break label1;

                                case 4: // '\004'
                                    break label0;

                                case 13: // '\r'
                                    break label3;

                                case 42: // '*'
                                    continue;

                                case 10: // '\n'
                                    av();
                                    break;
                                }
                            }
                            return;
                        }
                        au();
                        return;
                    }
                    u(i1);
                    continue;
                }
                v(i1);
                continue;
            }
            w(i1);
        } while (true);
    }

    private int aF()
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        int i1 = d;
        d = i1 + 1;
        return abyte0[i1] & 0xff;
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

    private void ax()
        throws IOException, JsonParseException
    {
        int i1;
label0:
        {
            if (d >= e - 1 || aP[d] != 58)
            {
                break MISSING_BLOCK_LABEL_314;
            }
            byte abyte0[] = aP;
            i1 = d + 1;
            d = i1;
            i1 = abyte0[i1];
            d = d + 1;
            if (i1 == 34)
            {
                aN = true;
                m = JsonToken.h;
                return;
            }
            if (i1 == 123)
            {
                m = JsonToken.b;
                return;
            }
            if (i1 == 91)
            {
                m = JsonToken.d;
                return;
            }
            int j1 = i1 & 0xff;
            if (j1 > 32)
            {
                i1 = j1;
                if (j1 != 47)
                {
                    break label0;
                }
            }
            d = d - 1;
            i1 = az();
        }
_L1:
        switch (i1)
        {
        default:
            m = k(i1);
            return;

        case 34: // '"'
            aN = true;
            m = JsonToken.h;
            return;

        case 91: // '['
            m = JsonToken.d;
            return;

        case 123: // '{'
            m = JsonToken.b;
            return;

        case 93: // ']'
        case 125: // '}'
            b(i1, "expected a value");
            // fall through

        case 116: // 't'
            a("true", 1);
            m = JsonToken.k;
            return;

        case 102: // 'f'
            a("false", 1);
            m = JsonToken.l;
            return;

        case 110: // 'n'
            a("null", 1);
            m = JsonToken.m;
            return;

        case 45: // '-'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            m = g(i1);
            return;
        }
        i1 = aB();
          goto _L1
    }

    private int ay()
        throws IOException, JsonParseException
    {
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        int i1 = 48;
_L4:
        return i1;
_L2:
        int j1;
        j1 = aP[d] & 0xff;
        if (j1 < 48 || j1 > 57)
        {
            return 48;
        }
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.g))
        {
            d("Leading zeroes not allowed");
        }
        d = d + 1;
        i1 = j1;
        if (j1 != 48)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1;
        do
        {
            if (d >= e && !Y())
            {
                continue; /* Loop/switch isn't completed */
            }
            j1 = aP[d] & 0xff;
            if (j1 < 48 || j1 > 57)
            {
                return 48;
            }
            d = d + 1;
            i1 = j1;
        } while (j1 == 48);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return j1;
    }

    private int az()
        throws IOException, JsonParseException
    {
        do
        {
            if (d >= e && !Y())
            {
                break;
            }
            byte abyte0[] = aP;
            int i1 = d;
            d = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            if (i1 > 32)
            {
                if (i1 != 47)
                {
                    return i1;
                }
                aC();
            } else
            if (i1 != 32)
            {
                if (i1 == 10)
                {
                    av();
                } else
                if (i1 == 13)
                {
                    au();
                } else
                if (i1 != 9)
                {
                    d(i1);
                }
            }
        } while (true);
        throw c((new StringBuilder()).append("Unexpected end-of-input within/between ").append(l.e()).append(" entries").toString());
    }

    private c b(int i1, int j1)
        throws JsonParseException
    {
        c c1 = aL.b(i1);
        if (c1 != null)
        {
            return c1;
        } else
        {
            aM[0] = i1;
            return a(aM, 1, j1);
        }
    }

    private c b(int i1, int j1, int k1)
        throws JsonParseException
    {
        c c1 = aL.a(i1, j1);
        if (c1 != null)
        {
            return c1;
        } else
        {
            aM[0] = i1;
            aM[1] = j1;
            return a(aM, 2, k1);
        }
    }

    private JsonToken p(int i1)
        throws IOException, JsonParseException
    {
        if (i1 == 34)
        {
            aN = true;
            JsonToken jsontoken = JsonToken.h;
            aH = jsontoken;
            return jsontoken;
        }
        switch (i1)
        {
        default:
            JsonToken jsontoken1 = k(i1);
            aH = jsontoken1;
            return jsontoken1;

        case 91: // '['
            l = l.b(j, k);
            JsonToken jsontoken2 = JsonToken.d;
            aH = jsontoken2;
            return jsontoken2;

        case 123: // '{'
            l = l.c(j, k);
            JsonToken jsontoken3 = JsonToken.b;
            aH = jsontoken3;
            return jsontoken3;

        case 93: // ']'
        case 125: // '}'
            b(i1, "expected a value");
            // fall through

        case 116: // 't'
            a("true", 1);
            JsonToken jsontoken4 = JsonToken.k;
            aH = jsontoken4;
            return jsontoken4;

        case 102: // 'f'
            a("false", 1);
            JsonToken jsontoken5 = JsonToken.l;
            aH = jsontoken5;
            return jsontoken5;

        case 110: // 'n'
            a("null", 1);
            JsonToken jsontoken6 = JsonToken.m;
            aH = jsontoken6;
            return jsontoken6;

        case 45: // '-'
        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            JsonToken jsontoken7 = g(i1);
            aH = jsontoken7;
            return jsontoken7;
        }
    }

    private int q(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1];
        if ((j1 & 0xc0) != 128)
        {
            a(j1 & 0xff, d);
        }
        return j1 & 0x3f | (i1 & 0x1f) << 6;
    }

    private int r(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1];
        if ((j1 & 0xc0) != 128)
        {
            a(j1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        int k1 = d;
        d = k1 + 1;
        k1 = abyte0[k1];
        if ((k1 & 0xc0) != 128)
        {
            a(k1 & 0xff, d);
        }
        return ((i1 & 0xf) << 6 | j1 & 0x3f) << 6 | k1 & 0x3f;
    }

    private int s(int i1)
        throws IOException, JsonParseException
    {
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1];
        if ((j1 & 0xc0) != 128)
        {
            a(j1 & 0xff, d);
        }
        abyte0 = aP;
        int k1 = d;
        d = k1 + 1;
        k1 = abyte0[k1];
        if ((k1 & 0xc0) != 128)
        {
            a(k1 & 0xff, d);
        }
        return ((i1 & 0xf) << 6 | j1 & 0x3f) << 6 | k1 & 0x3f;
    }

    private int t(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1];
        if ((j1 & 0xc0) != 128)
        {
            a(j1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        int k1 = d;
        d = k1 + 1;
        k1 = abyte0[k1];
        if ((k1 & 0xc0) != 128)
        {
            a(k1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        int l1 = d;
        d = l1 + 1;
        l1 = abyte0[l1];
        if ((l1 & 0xc0) != 128)
        {
            a(l1 & 0xff, d);
        }
        return (((j1 & 0x3f | (i1 & 7) << 6) << 6 | k1 & 0x3f) << 6 | l1 & 0x3f) - 0x10000;
    }

    private void u(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
    }

    private void v(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
    }

    private void w(int i1)
        throws IOException, JsonParseException
    {
        if (d >= e)
        {
            X();
        }
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
        if (d >= e)
        {
            X();
        }
        abyte0 = aP;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1];
        if ((i1 & 0xc0) != 128)
        {
            a(i1 & 0xff, d);
        }
    }

    public String Q()
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.h)
        {
            if (aN)
            {
                aN = false;
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
        if (aO != null)
        {
            int i1 = aO.read(aP, 0, aP.length);
            if (i1 > 0)
            {
                d = 0;
                e = i1;
                flag = true;
            } else
            {
                aa();
                flag = flag1;
                if (i1 == 0)
                {
                    throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(aP.length).append(" bytes").toString());
                }
            }
        }
        return flag;
    }

    protected void Z()
        throws IOException, JsonParseException
    {
        int j1 = d;
        int i1 = j1;
        if (j1 >= e)
        {
            X();
            i1 = d;
        }
        char ac[] = n.m();
        int ai[] = aR;
        int k1 = Math.min(e, ac.length + i1);
        byte abyte0[] = aP;
        j1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            int l1 = abyte0[i1] & 0xff;
            if (ai[l1] != 0)
            {
                if (l1 == 34)
                {
                    d = i1 + 1;
                    n.a(j1);
                    return;
                }
                break;
            }
            ac[j1] = (char)l1;
            j1++;
            i1++;
        } while (true);
        d = i1;
        a(ac, j1);
    }

    public int a(int i1)
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
        int j1 = D();
_L6:
        return j1;
_L4:
        if (jsontoken == JsonToken.d)
        {
            l = l.b(j, k);
            return i1;
        }
        j1 = i1;
        if (jsontoken == JsonToken.b)
        {
            l = l.c(j, k);
            return i1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = i1;
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
        if (!aN || aH != JsonToken.h)
        {
            base64variant = a(base64variant);
            outputstream.write(base64variant);
            return base64variant.length;
        }
        abyte0 = b.g();
        int i1 = a(base64variant, outputstream, abyte0);
        b.c(abyte0);
        return i1;
        base64variant;
        b.c(abyte0);
        throw base64variant;
    }

    protected int a(Base64Variant base64variant, OutputStream outputstream, byte abyte0[])
        throws IOException, JsonParseException
    {
        int i1;
        int j1;
        int l2;
        l2 = abyte0.length;
        j1 = 0;
        i1 = 0;
_L8:
        int l1;
        int i2;
        int j2;
        do
        {
            if (d >= e)
            {
                X();
            }
            byte abyte1[] = aP;
            int k1 = d;
            d = k1 + 1;
            j2 = abyte1[k1] & 0xff;
        } while (j2 <= 32);
        l1 = base64variant.b(j2);
        i2 = l1;
        if (l1 >= 0) goto _L2; else goto _L1
_L1:
        if (j2 != 34) goto _L4; else goto _L3
_L3:
        l1 = i1;
        i1 = j1;
_L6:
        aN = false;
        j1 = i1;
        if (l1 > 0)
        {
            j1 = i1 + l1;
            outputstream.write(abyte0, 0, l1);
        }
        return j1;
_L4:
        i2 = a(base64variant, j2, 0);
        if (i2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        byte abyte2[];
        int k2;
        int i3;
        int j3;
        if (i1 > l2 - 3)
        {
            j1 += i1;
            outputstream.write(abyte0, 0, i1);
            l1 = 0;
            i1 = j1;
        } else
        {
            l1 = i1;
            i1 = j1;
        }
        if (d >= e)
        {
            X();
        }
        abyte2 = aP;
        j1 = d;
        d = j1 + 1;
        i3 = abyte2[j1] & 0xff;
        k2 = base64variant.b(i3);
        j1 = k2;
        if (k2 < 0)
        {
            j1 = a(base64variant, i3, 1);
        }
        i3 = i2 << 6 | j1;
        if (d >= e)
        {
            X();
        }
        abyte2 = aP;
        j1 = d;
        d = j1 + 1;
        j3 = abyte2[j1] & 0xff;
        i2 = base64variant.b(j3);
        k2 = i2;
        if (i2 < 0)
        {
            j1 = i2;
            if (i2 != -2)
            {
                if (j3 == 34 && !base64variant.b())
                {
                    j1 = l1 + 1;
                    abyte0[l1] = (byte)(i3 >> 4);
                    l1 = j1;
                    continue; /* Loop/switch isn't completed */
                }
                j1 = a(base64variant, j3, 2);
            }
            k2 = j1;
            if (j1 == -2)
            {
                if (d >= e)
                {
                    X();
                }
                abyte2 = aP;
                j1 = d;
                d = j1 + 1;
                j1 = abyte2[j1] & 0xff;
                if (!base64variant.a(j1))
                {
                    throw a(base64variant, j1, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.c()).append("'").toString());
                }
                i2 = l1 + 1;
                abyte0[l1] = (byte)(i3 >> 4);
                j1 = i1;
                i1 = i2;
                continue; /* Loop/switch isn't completed */
            }
        }
        i3 = i3 << 6 | k2;
        if (d >= e)
        {
            X();
        }
        abyte2 = aP;
        j1 = d;
        d = j1 + 1;
        j3 = abyte2[j1] & 0xff;
        i2 = base64variant.b(j3);
        k2 = i2;
        if (i2 >= 0)
        {
            break MISSING_BLOCK_LABEL_709;
        }
        j1 = i2;
        if (i2 == -2)
        {
            break MISSING_BLOCK_LABEL_652;
        }
        if (j3 != 34 || base64variant.b())
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = i3 >> 2;
        i2 = l1 + 1;
        abyte0[l1] = (byte)(j1 >> 8);
        l1 = i2 + 1;
        abyte0[i2] = (byte)j1;
        if (true) goto _L6; else goto _L5
_L5:
        j1 = a(base64variant, j3, 3);
        k2 = j1;
        if (j1 == -2)
        {
            j1 = i3 >> 2;
            i2 = l1 + 1;
            abyte0[l1] = (byte)(j1 >> 8);
            l1 = i2 + 1;
            abyte0[i2] = (byte)j1;
            j1 = i1;
            i1 = l1;
            continue; /* Loop/switch isn't completed */
        }
        j1 = i3 << 6 | k2;
        i2 = l1 + 1;
        abyte0[l1] = (byte)(j1 >> 16);
        k2 = i2 + 1;
        abyte0[i2] = (byte)(j1 >> 8);
        l1 = k2 + 1;
        abyte0[k2] = (byte)j1;
        j1 = i1;
        i1 = l1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int a(OutputStream outputstream)
        throws IOException
    {
        int i1 = e - d;
        if (i1 < 1)
        {
            return 0;
        } else
        {
            int j1 = d;
            outputstream.write(aP, j1, i1);
            return i1;
        }
    }

    public long a(long l1)
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
        long l2 = E();
_L6:
        return l2;
_L4:
        if (jsontoken == JsonToken.d)
        {
            l = l.b(j, k);
            return l1;
        }
        l2 = l1;
        if (jsontoken == JsonToken.b)
        {
            l = l.c(j, k);
            return l1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l2 = l1;
        if (f() == JsonToken.i)
        {
            return E();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected JsonToken a(int i1, boolean flag)
        throws IOException, JsonParseException
    {
        int j1;
label0:
        {
            do
            {
                j1 = i1;
                if (i1 != 73)
                {
                    break label0;
                }
                if (this.d >= e && !Y())
                {
                    ao();
                }
                byte abyte0[] = aP;
                i1 = this.d;
                this.d = i1 + 1;
                i1 = abyte0[i1];
                String s1;
                if (i1 == 78)
                {
                    if (flag)
                    {
                        s1 = "-INF";
                    } else
                    {
                        s1 = "+INF";
                    }
                } else
                {
                    if (i1 != 110)
                    {
                        break;
                    }
                    if (flag)
                    {
                        s1 = "-Infinity";
                    } else
                    {
                        s1 = "+Infinity";
                    }
                }
                a(s1, 3);
                if (c(com.fasterxml.jackson.core.JsonParser.Feature.h))
                {
                    double d;
                    if (flag)
                    {
                        d = (-1.0D / 0.0D);
                    } else
                    {
                        d = (1.0D / 0.0D);
                    }
                    return a(s1, d);
                }
                f((new StringBuilder()).append("Non-standard token '").append(s1).append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow").toString());
            } while (true);
            j1 = i1;
        }
        a(j1, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected c a(int i1, int ai[])
        throws IOException, JsonParseException
    {
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1] & 0xff;
        if (ai[j1] != 0)
        {
            if (j1 == 34)
            {
                return b(aT, i1, 1);
            } else
            {
                return a(aT, i1, j1, 1);
            }
        }
        i1 = j1 | i1 << 8;
        abyte0 = aP;
        j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1] & 0xff;
        if (ai[j1] != 0)
        {
            if (j1 == 34)
            {
                return b(aT, i1, 2);
            } else
            {
                return a(aT, i1, j1, 2);
            }
        }
        i1 = i1 << 8 | j1;
        abyte0 = aP;
        j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1] & 0xff;
        if (ai[j1] != 0)
        {
            if (j1 == 34)
            {
                return b(aT, i1, 3);
            } else
            {
                return a(aT, i1, j1, 3);
            }
        }
        i1 = i1 << 8 | j1;
        abyte0 = aP;
        j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1] & 0xff;
        if (ai[j1] != 0)
        {
            if (j1 == 34)
            {
                return b(aT, i1, 4);
            } else
            {
                return a(aT, i1, j1, 4);
            }
        } else
        {
            aM[0] = aT;
            aM[1] = i1;
            return i(j1);
        }
    }

    protected c a(int ai[], int i1, int j1, int k1, int l1)
        throws IOException, JsonParseException
    {
        int ai5[] = aS;
_L2:
        int i2;
        i2 = k1;
        if (ai5[k1] == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 == 34)
        {
            int ai1[] = ai;
            k1 = i1;
            if (l1 > 0)
            {
                ai1 = ai;
                if (i1 >= ai.length)
                {
                    ai1 = a(ai, ai.length);
                    aM = ai1;
                }
                ai1[i1] = j1;
                k1 = i1 + 1;
            }
            c c1 = aL.a(ai1, k1);
            ai = c1;
            if (c1 == null)
            {
                ai = a(ai1, k1, l1);
            }
            return ai;
        }
        byte abyte0[];
        int j2;
        if (k1 != 92)
        {
            c(k1, "name");
        } else
        {
            k1 = al();
        }
        i2 = k1;
        if (k1 <= 127)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l1 >= 4)
        {
            int ai2[] = ai;
            if (i1 >= ai.length)
            {
                ai2 = a(ai, ai.length);
                aM = ai2;
            }
            i2 = i1 + 1;
            ai2[i1] = j1;
            l1 = 0;
            j1 = 0;
            ai = ai2;
            i1 = i2;
        }
        if (k1 < 2048)
        {
            i2 = k1 >> 6 | 0xc0 | j1 << 8;
            l1++;
            j1 = i1;
            i1 = i2;
        } else
        {
            i2 = k1 >> 12 | 0xe0 | j1 << 8;
            j1 = l1 + 1;
            int ai4[];
            if (j1 >= 4)
            {
                int ai3[] = ai;
                if (i1 >= ai.length)
                {
                    ai3 = a(ai, ai.length);
                    aM = ai3;
                }
                ai3[i1] = i2;
                i1++;
                ai = ai3;
                j1 = 0;
                l1 = 0;
            } else
            {
                l1 = i2;
            }
            i2 = l1 << 8 | (k1 >> 6 & 0x3f | 0x80);
            l1 = j1 + 1;
            j1 = i1;
            i1 = i2;
        }
        j2 = k1 & 0x3f | 0x80;
        i2 = l1;
        k1 = j1;
        l1 = i1;
        j1 = j2;
        i1 = k1;
        k1 = l1;
_L3:
        if (i2 < 4)
        {
            l1 = i2 + 1;
            j1 |= k1 << 8;
        } else
        {
            ai4 = ai;
            if (i1 >= ai.length)
            {
                ai4 = a(ai, ai.length);
                aM = ai4;
            }
            ai4[i1] = k1;
            l1 = 1;
            i1++;
            ai = ai4;
        }
        if (d >= e && !Y())
        {
            e(" in field name");
        }
        abyte0 = aP;
        k1 = d;
        d = k1 + 1;
        k1 = abyte0[k1] & 0xff;
        if (true) goto _L2; else goto _L1
_L1:
        k1 = j1;
        j1 = i2;
        i2 = l1;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public d a()
    {
        return aK;
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

    protected void a(int i1, int j1)
        throws JsonParseException
    {
        d = j1;
        o(i1);
    }

    public void a(d d)
    {
        aK = d;
    }

    protected void a(String s1, int i1)
        throws IOException, JsonParseException
    {
        int k1 = s1.length();
        int j1;
        do
        {
            if (d >= e && !Y() || aP[d] != s1.charAt(i1))
            {
                g(s1.substring(0, i1));
            }
            d = d + 1;
            j1 = i1 + 1;
            i1 = j1;
        } while (j1 < k1);
        if (d < e || Y())
        {
            if ((i1 = aP[d] & 0xff) >= 48 && i1 != 93 && i1 != 125 && Character.isJavaIdentifierPart((char)l(i1)))
            {
                g(s1.substring(0, j1));
                return;
            }
        }
    }

    protected void a(String s1, String s2)
        throws IOException, JsonParseException
    {
        s1 = new StringBuilder(s1);
_L5:
        if (d < e || Y()) goto _L2; else goto _L1
_L1:
        f((new StringBuilder()).append("Unrecognized token '").append(s1.toString()).append("': was expecting ").append(s2).toString());
        return;
_L2:
        char c1;
        byte abyte0[] = aP;
        int i1 = d;
        d = i1 + 1;
        c1 = (char)l(abyte0[i1]);
        if (!Character.isJavaIdentifierPart(c1)) goto _L1; else goto _L3
_L3:
        s1.append(c1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean a(com.fasterxml.jackson.core.f f1)
        throws IOException, JsonParseException
    {
        int i1;
        int j1;
        j1 = 0;
        ac = 0;
        if (aH == JsonToken.f)
        {
            aw();
            return false;
        }
        if (aN)
        {
            as();
        }
        int k1 = aA();
        if (k1 < 0)
        {
            close();
            aH = null;
            return false;
        }
        i = (f + (long)d) - 1L;
        j = g;
        k = d - h - 1;
        r = null;
        if (k1 == 93)
        {
            if (!l.b())
            {
                a(k1, '}');
            }
            l = l.j();
            aH = JsonToken.e;
            return false;
        }
        if (k1 == 125)
        {
            if (!l.d())
            {
                a(k1, ']');
            }
            l = l.j();
            aH = JsonToken.c;
            return false;
        }
        i1 = k1;
        if (l.k())
        {
            if (k1 != 44)
            {
                b(k1, (new StringBuilder()).append("was expecting comma to separate ").append(l.e()).append(" entries").toString());
            }
            i1 = az();
        }
        if (!l.d())
        {
            p(i1);
            return false;
        }
        if (i1 != 34) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        int l1;
        abyte0 = f1.e();
        l1 = abyte0.length;
        if (d + l1 >= e) goto _L2; else goto _L3
_L3:
        int i2 = d + l1;
        if (aP[i2] != 34) goto _L2; else goto _L4
_L4:
        int j2 = d;
_L7:
        if (j1 == l1)
        {
            d = i2 + 1;
            l.a(f1.a());
            aH = JsonToken.f;
            ax();
            return true;
        }
        if (abyte0[j1] == aP[j2 + j1]) goto _L5; else goto _L2
_L2:
        return a(i1, f1);
_L5:
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public byte[] a(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.h && (aH != JsonToken.g || r == null))
        {
            f((new StringBuilder()).append("Current token (").append(aH).append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary").toString());
        }
        if (!aN) goto _L2; else goto _L1
_L1:
        try
        {
            r = b(base64variant);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw c((new StringBuilder()).append("Failed to decode VALUE_STRING as base64 (").append(base64variant).append("): ").append(illegalargumentexception.getMessage()).toString());
        }
        aN = false;
_L4:
        return r;
_L2:
        if (r == null)
        {
            com.fasterxml.jackson.core.util.a a1 = ad();
            a(u(), a1, base64variant);
            r = a1.c();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void aa()
        throws IOException
    {
        if (aO != null)
        {
            if (b.c() || c(com.fasterxml.jackson.core.JsonParser.Feature.a))
            {
                aO.close();
            }
            aO = null;
        }
    }

    protected void ab()
        throws IOException
    {
        super.ab();
        if (aQ)
        {
            byte abyte0[] = aP;
            if (abyte0 != null)
            {
                aP = null;
                b.a(abyte0);
            }
        }
    }

    protected char al()
        throws IOException, JsonParseException
    {
        int i1 = 0;
        if (d >= e && !Y())
        {
            e(" in character escape sequence");
        }
        byte abyte0[] = aP;
        int j1 = d;
        d = j1 + 1;
        j1 = abyte0[j1];
        switch (j1)
        {
        default:
            return a((char)l(j1));

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

        case 34: // '"'
        case 47: // '/'
        case 92: // '\\'
            return (char)j1;

        case 117: // 'u'
            j1 = 0;
            break;
        }
        for (; i1 < 4; i1++)
        {
            if (d >= e && !Y())
            {
                e(" in character escape sequence");
            }
            byte abyte1[] = aP;
            int k1 = d;
            d = k1 + 1;
            k1 = abyte1[k1];
            int l1 = com.fasterxml.jackson.core.io.b.a(k1);
            if (l1 < 0)
            {
                b(k1, "expected a hex-digit for character escape sequence");
            }
            j1 = j1 << 4 | l1;
        }

        return (char)j1;
    }

    protected c aq()
        throws IOException, JsonParseException
    {
        if (d >= e && !Y())
        {
            e(": was expecting closing '\"' for name");
        }
        byte abyte0[] = aP;
        int i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1] & 0xff;
        if (i1 == 34)
        {
            return com.fasterxml.jackson.core.c.a.i();
        } else
        {
            return a(aM, 0, 0, i1, 0);
        }
    }

    protected c ar()
        throws IOException, JsonParseException
    {
        int ai[];
        int ai2[];
        int i1;
        int j1;
        int k1;
        int l1;
        if (d >= e && !Y())
        {
            e(": was expecting closing ''' for name");
        }
        ai = aP;
        i1 = d;
        d = i1 + 1;
        l1 = ai[i1] & 0xff;
        if (l1 == 39)
        {
            return com.fasterxml.jackson.core.c.a.i();
        }
        ai = aM;
        ai2 = aS;
        j1 = 0;
        k1 = 0;
        i1 = 0;
_L1:
        int i2;
        if (l1 == 39)
        {
            if (j1 > 0)
            {
                int ai1[] = ai;
                if (i1 >= ai.length)
                {
                    ai1 = a(ai, ai.length);
                    aM = ai1;
                }
                ai1[i1] = k1;
                ai = ai1;
                i1++;
            }
            c c1 = aL.a(ai, i1);
            if (c1 == null)
            {
                return a(ai, i1, j1);
            } else
            {
                return c1;
            }
        }
        i2 = l1;
        if (l1 == 34)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        i2 = l1;
        if (ai2[l1] == 0)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        if (l1 != 92)
        {
            c(l1, "name");
        } else
        {
            l1 = al();
        }
        i2 = l1;
        if (l1 <= 127)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        if (j1 >= 4)
        {
            c1 = ai;
            if (i1 >= ai.length)
            {
                c1 = a(ai, ai.length);
                aM = c1;
            }
            c1[i1] = k1;
            j1 = 0;
            i1++;
            k1 = 0;
            ai = c1;
        }
        if (l1 < 2048)
        {
            k1 = k1 << 8 | (l1 >> 6 | 0xc0);
            j1++;
        } else
        {
            k1 = k1 << 8 | (l1 >> 12 | 0xe0);
            j1++;
            if (j1 >= 4)
            {
                c1 = ai;
                if (i1 >= ai.length)
                {
                    c1 = a(ai, ai.length);
                    aM = c1;
                }
                c1[i1] = k1;
                i1++;
                ai = c1;
                j1 = 0;
                k1 = 0;
            }
            k1 = k1 << 8 | (l1 >> 6 & 0x3f | 0x80);
            j1++;
        }
        i2 = k1;
        k1 = j1;
        j1 = l1 & 0x3f | 0x80;
        l1 = k1;
_L2:
        if (l1 < 4)
        {
            k1 = j1 | i2 << 8;
            l1++;
            j1 = i1;
            i1 = l1;
        } else
        {
            c1 = ai;
            if (i1 >= ai.length)
            {
                c1 = a(ai, ai.length);
                aM = c1;
            }
            c1[i1] = i2;
            ai = c1;
            k1 = 1;
            l1 = i1 + 1;
            i1 = k1;
            k1 = j1;
            j1 = l1;
        }
        if (d >= e && !Y())
        {
            e(" in field name");
        }
        c1 = aP;
        l1 = d;
        d = l1 + 1;
        i2 = c1[l1] & 0xff;
        l1 = i1;
        i1 = j1;
        j1 = l1;
        l1 = i2;
          goto _L1
        l1 = j1;
        j1 = i2;
        i2 = k1;
          goto _L2
    }

    protected void as()
        throws IOException, JsonParseException
    {
        int ai[];
        byte abyte0[];
        aN = false;
        ai = aR;
        abyte0 = aP;
_L2:
        do
        {
label0:
            {
                int k1 = d;
                int i2 = e;
                int j1 = i2;
                int i1 = k1;
                if (k1 >= i2)
                {
                    X();
                    i1 = d;
                    j1 = e;
                }
                int l1;
                for (; i1 < j1; i1 = l1)
                {
                    l1 = i1 + 1;
                    i1 = abyte0[i1] & 0xff;
                    if (ai[i1] == 0)
                    {
                        break MISSING_BLOCK_LABEL_192;
                    }
                    d = l1;
                    if (i1 == 34)
                    {
                        return;
                    }
                    break label0;
                }

                d = i1;
            }
        } while (true);
        switch (ai[i1])
        {
        default:
            if (i1 < 32)
            {
                c(i1, "string value");
            } else
            {
                m(i1);
            }
            break;

        case 1: // '\001'
            al();
            break;

        case 2: // '\002'
            u(i1);
            break;

        case 3: // '\003'
            v(i1);
            break;

        case 4: // '\004'
            w(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected JsonToken at()
        throws IOException, JsonParseException
    {
        char ac1[];
        int ai[];
        byte abyte0[];
        int i1;
        ac1 = n.m();
        ai = aR;
        abyte0 = aP;
        i1 = 0;
_L7:
        char ac[];
        int j1;
        if (d >= e)
        {
            X();
        }
        ac = ac1;
        j1 = i1;
        if (i1 >= ac1.length)
        {
            ac = n.o();
            j1 = 0;
        }
        int k1 = e;
        i1 = d + (ac.length - j1);
        if (i1 < k1)
        {
            k1 = i1;
        }
        do
        {
            ac1 = ac;
            i1 = j1;
            if (d >= k1)
            {
                continue; /* Loop/switch isn't completed */
            }
            i1 = d;
            d = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            if (i1 == 39 || ai[i1] != 0)
            {
                if (i1 == 39)
                {
                    n.a(j1);
                    return JsonToken.h;
                }
                break;
            }
            ac[j1] = (char)i1;
            j1++;
        } while (true);
        ai[i1];
        JVM INSTR tableswitch 1 4: default 212
    //                   1 273
    //                   2 289
    //                   3 300
    //                   4 335;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_335;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        if (i1 < 32)
        {
            c(i1, "string value");
        }
        m(i1);
_L8:
        if (j1 >= ac.length)
        {
            ac = n.o();
            j1 = 0;
        }
        int l1 = j1 + 1;
        ac[j1] = (char)i1;
        ac1 = ac;
        i1 = l1;
        if (true) goto _L7; else goto _L6
_L6:
        if (i1 != 34)
        {
            i1 = al();
        }
          goto _L8
_L3:
        i1 = q(i1);
          goto _L8
_L4:
        if (e - d >= 2)
        {
            i1 = s(i1);
        } else
        {
            i1 = r(i1);
        }
          goto _L8
        int i2 = t(i1);
        i1 = j1 + 1;
        ac[j1] = (char)(0xd800 | i2 >> 10);
        if (i1 >= ac.length)
        {
            ac = n.o();
            j1 = 0;
        } else
        {
            j1 = i1;
        }
        i1 = 0xdc00 | i2 & 0x3ff;
          goto _L8
    }

    protected void au()
        throws IOException
    {
        if ((d < e || Y()) && aP[d] == 10)
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
        return aO;
    }

    public String b(String s1)
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.h)
        {
            if (aN)
            {
                aN = false;
                Z();
            }
            return n.g();
        } else
        {
            return super.b(s1);
        }
    }

    protected byte[] b(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        com.fasterxml.jackson.core.util.a a1 = ad();
        do
        {
            int i2;
            do
            {
                if (d >= e)
                {
                    X();
                }
                byte abyte0[] = aP;
                int i1 = d;
                d = i1 + 1;
                i2 = abyte0[i1] & 0xff;
            } while (i2 <= 32);
            int l1 = base64variant.b(i2);
            int j1 = l1;
            if (l1 < 0)
            {
                if (i2 == 34)
                {
                    return a1.c();
                }
                j1 = a(base64variant, i2, 0);
                if (j1 < 0)
                {
                    continue;
                }
            }
            if (d >= e)
            {
                X();
            }
            byte abyte1[] = aP;
            l1 = d;
            d = l1 + 1;
            int j2 = abyte1[l1] & 0xff;
            i2 = base64variant.b(j2);
            l1 = i2;
            if (i2 < 0)
            {
                l1 = a(base64variant, j2, 1);
            }
            j2 = l1 | j1 << 6;
            if (d >= e)
            {
                X();
            }
            abyte1 = aP;
            j1 = d;
            d = j1 + 1;
            int k2 = abyte1[j1] & 0xff;
            l1 = base64variant.b(k2);
            i2 = l1;
            if (l1 < 0)
            {
                j1 = l1;
                if (l1 != -2)
                {
                    if (k2 == 34 && !base64variant.b())
                    {
                        a1.a(j2 >> 4);
                        return a1.c();
                    }
                    j1 = a(base64variant, k2, 2);
                }
                i2 = j1;
                if (j1 == -2)
                {
                    if (d >= e)
                    {
                        X();
                    }
                    abyte1 = aP;
                    j1 = d;
                    d = j1 + 1;
                    j1 = abyte1[j1] & 0xff;
                    if (!base64variant.a(j1))
                    {
                        throw a(base64variant, j1, 3, (new StringBuilder()).append("expected padding character '").append(base64variant.c()).append("'").toString());
                    }
                    a1.a(j2 >> 4);
                    continue;
                }
            }
            j2 = j2 << 6 | i2;
            if (d >= e)
            {
                X();
            }
            abyte1 = aP;
            j1 = d;
            d = j1 + 1;
            k2 = abyte1[j1] & 0xff;
            l1 = base64variant.b(k2);
            i2 = l1;
            if (l1 < 0)
            {
                int k1 = l1;
                if (l1 != -2)
                {
                    if (k2 == 34 && !base64variant.b())
                    {
                        a1.b(j2 >> 2);
                        return a1.c();
                    }
                    k1 = a(base64variant, k2, 3);
                }
                i2 = k1;
                if (k1 == -2)
                {
                    a1.b(j2 >> 2);
                    continue;
                }
            }
            a1.c(i2 | j2 << 6);
        } while (true);
    }

    public void close()
        throws IOException
    {
        super.close();
        aL.b();
    }

    public JsonToken f()
        throws IOException, JsonParseException
    {
        int i1;
        ac = 0;
        if (aH == JsonToken.f)
        {
            return aw();
        }
        if (aN)
        {
            as();
        }
        int j1 = aA();
        if (j1 < 0)
        {
            close();
            aH = null;
            return null;
        }
        i = (f + (long)d) - 1L;
        j = g;
        k = d - h - 1;
        r = null;
        if (j1 == 93)
        {
            if (!l.b())
            {
                a(j1, '}');
            }
            l = l.j();
            JsonToken jsontoken = JsonToken.e;
            aH = jsontoken;
            return jsontoken;
        }
        if (j1 == 125)
        {
            if (!l.d())
            {
                a(j1, ']');
            }
            l = l.j();
            JsonToken jsontoken1 = JsonToken.c;
            aH = jsontoken1;
            return jsontoken1;
        }
        i1 = j1;
        if (l.k())
        {
            if (j1 != 44)
            {
                b(j1, (new StringBuilder()).append("was expecting comma to separate ").append(l.e()).append(" entries").toString());
            }
            i1 = az();
        }
        if (!l.d())
        {
            return p(i1);
        }
        c c1 = h(i1);
        l.a(c1.a());
        aH = JsonToken.f;
        i1 = az();
        if (i1 != 58)
        {
            b(i1, "was expecting a colon to separate field name and value");
        }
        i1 = az();
        if (i1 == 34)
        {
            aN = true;
            m = JsonToken.h;
            return aH;
        }
        i1;
        JVM INSTR lookupswitch 18: default 488
    //                   45: 567
    //                   48: 567
    //                   49: 567
    //                   50: 567
    //                   51: 567
    //                   52: 567
    //                   53: 567
    //                   54: 567
    //                   55: 567
    //                   56: 567
    //                   57: 567
    //                   91: 504
    //                   93: 518
    //                   102: 539
    //                   110: 553
    //                   116: 525
    //                   123: 511
    //                   125: 518;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L1:
        JsonToken jsontoken2 = k(i1);
_L10:
        m = jsontoken2;
        return aH;
_L3:
        jsontoken2 = JsonToken.d;
        continue; /* Loop/switch isn't completed */
_L8:
        jsontoken2 = JsonToken.b;
        continue; /* Loop/switch isn't completed */
_L4:
        b(i1, "expected a value");
_L7:
        a("true", 1);
        jsontoken2 = JsonToken.k;
        continue; /* Loop/switch isn't completed */
_L5:
        a("false", 1);
        jsontoken2 = JsonToken.l;
        continue; /* Loop/switch isn't completed */
_L6:
        a("null", 1);
        jsontoken2 = JsonToken.m;
        continue; /* Loop/switch isn't completed */
_L2:
        jsontoken2 = g(i1);
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected boolean f(int i1)
        throws IOException
    {
        if (aO != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = e - d;
        if (j1 > 0 && d > 0)
        {
            f = f + (long)d;
            h = h - d;
            System.arraycopy(aP, d, aP, 0, j1);
            e = j1;
        } else
        {
            e = 0;
        }
        d = 0;
        do
        {
            if (e >= i1)
            {
                break;
            }
            int k1 = aO.read(aP, e, aP.length - e);
            if (k1 < 1)
            {
                aa();
                if (k1 == 0)
                {
                    throw new IOException((new StringBuilder()).append("InputStream.read() returned 0 characters when trying to read ").append(j1).append(" bytes").toString());
                }
                continue; /* Loop/switch isn't completed */
            }
            e = k1 + e;
        } while (true);
        return true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected JsonToken g(int i1)
        throws IOException, JsonParseException
    {
        boolean flag = true;
        char ac1[] = n.m();
        boolean flag1;
        if (i1 == 45)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        char ac[];
        int j1;
        int k1;
        int i2;
        int k2;
        if (flag1)
        {
            ac1[0] = '-';
            if (d >= e)
            {
                X();
            }
            byte abyte0[] = aP;
            i1 = d;
            d = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            if (i1 < 48 || i1 > 57)
            {
                return a(i1, true);
            }
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        k1 = i1;
        if (i1 == 48)
        {
            k1 = ay();
        }
        i2 = j1 + 1;
        ac1[j1] = (char)k1;
        k2 = d + ac1.length;
        j1 = k2;
        ac = ac1;
        i1 = i2;
        k1 = ((flag) ? 1 : 0);
        if (k2 > e)
        {
            j1 = e;
            k1 = ((flag) ? 1 : 0);
            i1 = i2;
            ac = ac1;
        }
        do
        {
            if (d >= j1)
            {
                return a(ac, i1, flag1, k1);
            }
            byte abyte1[] = aP;
            int l1 = d;
            d = l1 + 1;
            int j2 = abyte1[l1] & 0xff;
            if (j2 < 48 || j2 > 57)
            {
                if (j2 == 46 || j2 == 101 || j2 == 69)
                {
                    return a(ac, i1, j2, flag1, k1);
                } else
                {
                    d = d - 1;
                    n.a(i1);
                    return a(flag1, k1);
                }
            }
            k1++;
            if (i1 >= ac.length)
            {
                ac = n.o();
                i1 = 0;
            }
            l1 = i1 + 1;
            ac[i1] = (char)j2;
            i1 = l1;
        } while (true);
    }

    protected void g(String s1)
        throws IOException, JsonParseException
    {
        a(s1, "'null', 'true', 'false' or NaN");
    }

    protected c h(int i1)
        throws IOException, JsonParseException
    {
        if (i1 != 34)
        {
            return j(i1);
        }
        if (d + 9 > e)
        {
            return aq();
        }
        byte abyte0[] = aP;
        int ai[] = aS;
        i1 = d;
        d = i1 + 1;
        i1 = abyte0[i1] & 0xff;
        if (ai[i1] == 0)
        {
            int j1 = d;
            d = j1 + 1;
            j1 = abyte0[j1] & 0xff;
            if (ai[j1] == 0)
            {
                i1 = i1 << 8 | j1;
                j1 = d;
                d = j1 + 1;
                j1 = abyte0[j1] & 0xff;
                if (ai[j1] == 0)
                {
                    i1 = i1 << 8 | j1;
                    j1 = d;
                    d = j1 + 1;
                    j1 = abyte0[j1] & 0xff;
                    if (ai[j1] == 0)
                    {
                        i1 = i1 << 8 | j1;
                        j1 = d;
                        d = j1 + 1;
                        j1 = abyte0[j1] & 0xff;
                        if (ai[j1] == 0)
                        {
                            aT = i1;
                            return a(j1, ai);
                        }
                        if (j1 == 34)
                        {
                            return b(i1, 4);
                        } else
                        {
                            return a(i1, j1, 4);
                        }
                    }
                    if (j1 == 34)
                    {
                        return b(i1, 3);
                    } else
                    {
                        return a(i1, j1, 3);
                    }
                }
                if (j1 == 34)
                {
                    return b(i1, 2);
                } else
                {
                    return a(i1, j1, 2);
                }
            }
            if (j1 == 34)
            {
                return b(i1, 1);
            } else
            {
                return a(i1, j1, 1);
            }
        }
        if (i1 == 34)
        {
            return com.fasterxml.jackson.core.c.a.i();
        } else
        {
            return a(0, i1, 0);
        }
    }

    public String h()
        throws IOException, JsonParseException
    {
        String s1 = null;
        if (aH != JsonToken.f) goto _L2; else goto _L1
_L1:
        JsonToken jsontoken;
        p = false;
        jsontoken = m;
        m = null;
        aH = jsontoken;
        if (jsontoken != JsonToken.h) goto _L4; else goto _L3
_L3:
        if (aN)
        {
            aN = false;
            Z();
        }
        s1 = n.g();
_L6:
        return s1;
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

    protected c i(int i1)
        throws IOException, JsonParseException
    {
        int ai[] = aS;
        byte byte0 = 2;
        int j1 = i1;
        i1 = byte0;
        do
        {
            if (e - d < 4)
            {
                return a(aM, i1, 0, j1, 0);
            }
            byte abyte0[] = aP;
            int k1 = d;
            d = k1 + 1;
            k1 = abyte0[k1] & 0xff;
            if (ai[k1] != 0)
            {
                if (k1 == 34)
                {
                    return a(aM, i1, j1, 1);
                } else
                {
                    return a(aM, i1, j1, k1, 1);
                }
            }
            j1 = j1 << 8 | k1;
            abyte0 = aP;
            k1 = d;
            d = k1 + 1;
            k1 = abyte0[k1] & 0xff;
            if (ai[k1] != 0)
            {
                if (k1 == 34)
                {
                    return a(aM, i1, j1, 2);
                } else
                {
                    return a(aM, i1, j1, k1, 2);
                }
            }
            j1 = j1 << 8 | k1;
            abyte0 = aP;
            k1 = d;
            d = k1 + 1;
            k1 = abyte0[k1] & 0xff;
            if (ai[k1] != 0)
            {
                if (k1 == 34)
                {
                    return a(aM, i1, j1, 3);
                } else
                {
                    return a(aM, i1, j1, k1, 3);
                }
            }
            k1 = j1 << 8 | k1;
            abyte0 = aP;
            j1 = d;
            d = j1 + 1;
            j1 = abyte0[j1] & 0xff;
            if (ai[j1] != 0)
            {
                if (j1 == 34)
                {
                    return a(aM, i1, k1, 4);
                } else
                {
                    return a(aM, i1, k1, j1, 4);
                }
            }
            if (i1 >= aM.length)
            {
                aM = a(aM, i1);
            }
            aM[i1] = k1;
            i1++;
        } while (true);
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

    protected c j(int i1)
        throws IOException, JsonParseException
    {
        if (i1 == 39 && c(com.fasterxml.jackson.core.JsonParser.Feature.d))
        {
            return ar();
        }
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.c))
        {
            b(i1, "was expecting double-quote to start field name");
        }
        int ai2[] = com.fasterxml.jackson.core.io.b.d();
        if (ai2[i1] != 0)
        {
            b(i1, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        c c1 = aM;
        int l1 = 0;
        int k1 = 0;
        int j1 = i1;
        i1 = 0;
        do
        {
            int i2;
            if (l1 < 4)
            {
                k1 = j1 | k1 << 8;
                j1 = l1 + 1;
            } else
            {
                int ai1[] = c1;
                if (i1 >= c1.length)
                {
                    ai1 = a(c1, c1.length);
                    aM = ai1;
                }
                ai1[i1] = k1;
                c1 = ai1;
                l1 = 1;
                k1 = j1;
                i1++;
                j1 = l1;
            }
            if (d >= e && !Y())
            {
                e(" in field name");
            }
            i2 = aP[d] & 0xff;
            if (ai2[i2] != 0)
            {
                l1 = i1;
                int ai[] = c1;
                if (j1 > 0)
                {
                    ai = c1;
                    if (i1 >= c1.length)
                    {
                        ai = a(c1, c1.length);
                        aM = ai;
                    }
                    ai[i1] = k1;
                    l1 = i1 + 1;
                }
                c1 = aL.a(ai, l1);
                if (c1 == null)
                {
                    return a(ai, l1, j1);
                } else
                {
                    return c1;
                }
            }
            d = d + 1;
            l1 = j1;
            j1 = i2;
        } while (true);
    }

    protected JsonToken k(int i1)
        throws IOException, JsonParseException
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   39: 54
    //                   43: 147
    //                   73: 108
    //                   78: 69;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        b(i1, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
_L2:
        if (c(com.fasterxml.jackson.core.JsonParser.Feature.d))
        {
            return at();
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
        byte abyte0[] = aP;
        i1 = d;
        d = i1 + 1;
        return a(abyte0[i1] & 0xff, false);
    }

    protected int l(int i1)
        throws IOException, JsonParseException
    {
        int k1 = i1;
        if (i1 < 0)
        {
            int j1;
            if ((i1 & 0xe0) == 192)
            {
                i1 &= 0x1f;
                j1 = 1;
            } else
            if ((i1 & 0xf0) == 224)
            {
                i1 &= 0xf;
                j1 = 2;
            } else
            if ((i1 & 0xf8) == 240)
            {
                i1 &= 7;
                j1 = 3;
            } else
            {
                n(i1 & 0xff);
                j1 = 1;
            }
            k1 = aF();
            if ((k1 & 0xc0) != 128)
            {
                o(k1 & 0xff);
            }
            i1 = i1 << 6 | k1 & 0x3f;
            k1 = i1;
            if (j1 > 1)
            {
                k1 = aF();
                if ((k1 & 0xc0) != 128)
                {
                    o(k1 & 0xff);
                }
                i1 = i1 << 6 | k1 & 0x3f;
                k1 = i1;
                if (j1 > 2)
                {
                    j1 = aF();
                    if ((j1 & 0xc0) != 128)
                    {
                        o(j1 & 0xff);
                    }
                    k1 = i1 << 6 | j1 & 0x3f;
                }
            }
        }
        return k1;
    }

    protected void m(int i1)
        throws JsonParseException
    {
        if (i1 < 32)
        {
            d(i1);
        }
        n(i1);
    }

    protected void n(int i1)
        throws JsonParseException
    {
        f((new StringBuilder()).append("Invalid UTF-8 start byte 0x").append(Integer.toHexString(i1)).toString());
    }

    protected void o(int i1)
        throws JsonParseException
    {
        f((new StringBuilder()).append("Invalid UTF-8 middle byte 0x").append(Integer.toHexString(i1)).toString());
    }

    public JsonLocation p()
    {
        return new JsonLocation(b.a(), U(), -1L, V(), W());
    }

    public JsonLocation q()
    {
        int i1 = d;
        int j1 = h;
        return new JsonLocation(b.a(), (f + (long)d) - 1L, -1L, g, (i1 - j1) + 1);
    }

    public String u()
        throws IOException, JsonParseException
    {
        if (aH == JsonToken.h)
        {
            if (aN)
            {
                aN = false;
                Z();
            }
            return n.g();
        } else
        {
            return a(aH);
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
        String s1;
        int i1;
        s1 = l.h();
        i1 = s1.length();
        if (o != null) goto _L8; else goto _L7
_L7:
        o = b.a(i1);
_L10:
        s1.getChars(0, i1, o, 0);
        p = true;
_L6:
        return o;
_L8:
        if (o.length < i1)
        {
            o = new char[i1];
        }
        if (true) goto _L10; else goto _L9
_L9:
        break; /* Loop/switch isn't completed */
_L3:
        if (aN)
        {
            aN = false;
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
                    int i1 = 0;
                    if (aH != null)
                    {
                        switch (com.fasterxml.jackson.core.b._cls1.a[aH.ordinal()])
                        {
                        default:
                            i1 = aH.b().length;
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
                    return i1;
                }
                return l.h().length();
            }
            if (aN)
            {
                aN = false;
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
        if (aN)
        {
            aN = false;
            Z();
        }
_L4:
        return n.d();
    }

}

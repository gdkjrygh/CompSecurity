// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alipay.android.app.util.encrypt;


public final class Base64
{

    private static final byte a[];
    private static final char b[];

    public Base64()
    {
    }

    private static boolean a(char c)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static boolean b(char c)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static byte[] decode(String s)
    {
        char ac[];
        if (s == null)
        {
            return null;
        }
        ac = s.toCharArray();
        if (ac != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        if (i1 % 4 != 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        int j1 = ac.length;
        int k = 0;
        int i = 0;
        do
        {
            i1 = i;
            if (k >= j1)
            {
                break;
            }
            i1 = ac[k];
            if (i1 == 32 || i1 == 13 || i1 == 10 || i1 == 9)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = i + 1;
                ac[i] = ac[k];
                i = i1;
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        int k1 = i1 / 4;
        if (k1 == 0)
        {
            return new byte[0];
        }
        s = new byte[k1 * 3];
        i1 = 0;
        int j = 0;
        int l = 0;
label0:
        do
        {
            char c;
            char c2;
            char c4;
            char c5;
label1:
            {
                if (l >= k1 - 1)
                {
                    break label0;
                }
                int l1 = i1 + 1;
                c = ac[i1];
                if (b(c))
                {
                    i1 = l1 + 1;
                    c2 = ac[l1];
                    if (b(c2))
                    {
                        int i2 = i1 + 1;
                        c4 = ac[i1];
                        if (b(c4))
                        {
                            i1 = i2 + 1;
                            c5 = ac[i2];
                            if (b(c5))
                            {
                                break label1;
                            }
                        }
                    }
                }
                return null;
            }
            int i3 = a[c];
            byte byte5 = a[c2];
            byte byte1 = a[c4];
            byte byte4 = a[c5];
            int l2 = j + 1;
            s[j] = (byte)(i3 << 2 | byte5 >> 4);
            i3 = l2 + 1;
            s[l2] = (byte)((byte5 & 0xf) << 4 | byte1 >> 2 & 0xf);
            j = i3 + 1;
            s[i3] = (byte)(byte1 << 6 | byte4);
            l++;
        } while (true);
        char c1;
        char c3;
        int j2;
label2:
        {
            k1 = i1 + 1;
            c1 = ac[i1];
            if (b(c1))
            {
                j2 = k1 + 1;
                c3 = ac[k1];
                if (b(c3))
                {
                    break label2;
                }
            }
            return null;
        }
        i1 = a[c1];
        k1 = a[c3];
        c1 = ac[j2];
        c3 = ac[j2 + 1];
        if (!b(c1) || !b(c3))
        {
            if (a(c1) && a(c3))
            {
                if ((k1 & 0xf) != 0)
                {
                    return null;
                } else
                {
                    byte abyte0[] = new byte[l * 3 + 1];
                    System.arraycopy(s, 0, abyte0, 0, l * 3);
                    abyte0[j] = (byte)(i1 << 2 | k1 >> 4);
                    return abyte0;
                }
            }
            if (!a(c1) && a(c3))
            {
                byte byte2 = a[c1];
                if ((byte2 & 3) != 0)
                {
                    return null;
                } else
                {
                    byte abyte1[] = new byte[l * 3 + 2];
                    System.arraycopy(s, 0, abyte1, 0, l * 3);
                    abyte1[j] = (byte)(i1 << 2 | k1 >> 4);
                    abyte1[j + 1] = (byte)((k1 & 0xf) << 4 | byte2 >> 2 & 0xf);
                    return abyte1;
                }
            } else
            {
                return null;
            }
        } else
        {
            byte byte0 = a[c1];
            byte byte3 = a[c3];
            int k2 = j + 1;
            s[j] = (byte)(i1 << 2 | k1 >> 4);
            s[k2] = (byte)((k1 & 0xf) << 4 | byte0 >> 2 & 0xf);
            s[k2 + 1] = (byte)(byte3 | byte0 << 6);
            return s;
        }
    }

    public static String encode(byte abyte0[])
    {
        char ac[];
        int i;
        byte byte2;
        int k1;
        byte2 = 0;
        if (abyte0 == null)
        {
            return null;
        }
        i = abyte0.length * 8;
        if (i == 0)
        {
            return "";
        }
        k1 = i % 24;
        int i1 = i / 24;
        int j;
        if (k1 != 0)
        {
            i = i1 + 1;
        } else
        {
            i = i1;
        }
        ac = new char[i * 4];
        j = 0;
        i = 0;
        while (j < i1) 
        {
            int k = byte2 + 1;
            byte2 = abyte0[byte2];
            int l1 = k + 1;
            k = abyte0[k];
            byte byte6 = abyte0[l1];
            byte byte7 = (byte)(k & 0xf);
            byte byte8 = (byte)(byte2 & 3);
            byte byte4;
            int i2;
            if ((byte2 & 0xffffff80) == 0)
            {
                byte2 >>= 2;
            } else
            {
                byte2 = (byte)(byte2 >> 2 ^ 0xc0);
            }
            if ((k & 0xffffff80) == 0)
            {
                k >>= 4;
            } else
            {
                k = (byte)(k >> 4 ^ 0xf0);
            }
            if ((byte6 & 0xffffff80) == 0)
            {
                byte4 = (byte)(byte6 >> 6);
            } else
            {
                byte4 = (byte)(byte6 >> 6 ^ 0xfc);
            }
            i2 = i + 1;
            ac[i] = b[byte2];
            i = i2 + 1;
            ac[i2] = b[k | byte8 << 4];
            byte2 = i + 1;
            ac[i] = b[byte4 | byte7 << 2];
            ac[byte2] = b[byte6 & 0x3f];
            j++;
            i = byte2 + 1;
            byte2 = l1 + 1;
        }
        if (k1 != 8) goto _L2; else goto _L1
_L1:
        byte byte0 = abyte0[byte2];
        byte2 = (byte)(byte0 & 3);
        int l;
        if ((byte0 & 0xffffff80) == 0)
        {
            byte0 >>= 2;
        } else
        {
            byte0 = (byte)(byte0 >> 2 ^ 0xc0);
        }
        l = i + 1;
        ac[i] = b[byte0];
        i = l + 1;
        ac[l] = b[byte2 << 4];
        ac[i] = '=';
        ac[i + 1] = '=';
_L4:
        return new String(ac);
_L2:
        if (k1 == 16)
        {
            byte byte1 = abyte0[byte2];
            byte2 = abyte0[byte2 + 1];
            byte byte3 = (byte)(byte2 & 0xf);
            byte byte5 = (byte)(byte1 & 3);
            int j1;
            if ((byte1 & 0xffffff80) == 0)
            {
                byte1 >>= 2;
            } else
            {
                byte1 = (byte)(byte1 >> 2 ^ 0xc0);
            }
            if ((byte2 & 0xffffff80) == 0)
            {
                byte2 >>= 4;
            } else
            {
                byte2 = (byte)(byte2 >> 4 ^ 0xf0);
            }
            j1 = i + 1;
            ac[i] = b[byte1];
            i = j1 + 1;
            ac[j1] = b[byte2 | byte5 << 4];
            ac[i] = b[byte3 << 2];
            ac[i + 1] = '=';
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag = false;
        a = new byte[128];
        b = new char[64];
        for (int i = 0; i < 128; i++)
        {
            a[i] = -1;
        }

        for (int j = 90; j >= 65; j--)
        {
            a[j] = (byte)(j - 65);
        }

        for (int k = 122; k >= 97; k--)
        {
            a[k] = (byte)((k - 97) + 26);
        }

        for (int l = 57; l >= 48; l--)
        {
            a[l] = (byte)((l - 48) + 52);
        }

        a[43] = 62;
        a[47] = 63;
        for (int i1 = 0; i1 <= 25; i1++)
        {
            b[i1] = (char)(i1 + 65);
        }

        int l1 = 26;
        for (int j1 = 0; l1 <= 51; j1++)
        {
            b[l1] = (char)(j1 + 97);
            l1++;
        }

        l1 = 52;
        for (int k1 = ((flag) ? 1 : 0); l1 <= 61; k1++)
        {
            b[l1] = (char)(k1 + 48);
            l1++;
        }

        b[62] = '+';
        b[63] = '/';
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aza
{

    private final ayo a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public aza(ayo ayo1)
        throws ayc
    {
        this(ayo1, 10, ayo1.e() / 2, ayo1.f() / 2);
    }

    public aza(ayo ayo1, int i, int j, int k)
        throws ayc
    {
        a = ayo1;
        b = ayo1.f();
        c = ayo1.e();
        i /= 2;
        d = j - i;
        e = j + i;
        g = k - i;
        f = i + k;
        if (g < 0 || d < 0 || f >= b || e >= c)
        {
            throw ayc.a();
        } else
        {
            return;
        }
    }

    private ayh a(float f1, float f2, float f3, float f4)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private boolean a(int i, int j, int k, boolean flag)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private ayh[] a(ayh ayh1, ayh ayh2, ayh ayh3, ayh ayh4)
    {
        float f1 = ayh1.a();
        float f2 = ayh1.b();
        float f3 = ayh2.a();
        float f4 = ayh2.b();
        float f5 = ayh3.a();
        float f6 = ayh3.b();
        float f7 = ayh4.a();
        float f8 = ayh4.b();
        if (f1 < (float)c / 2.0F)
        {
            return (new ayh[] {
                new ayh(f7 - 1.0F, f8 + 1.0F), new ayh(f3 + 1.0F, f4 + 1.0F), new ayh(f5 - 1.0F, f6 - 1.0F), new ayh(f1 + 1.0F, f2 - 1.0F)
            });
        } else
        {
            return (new ayh[] {
                new ayh(f7 + 1.0F, f8 + 1.0F), new ayh(f3 + 1.0F, f4 - 1.0F), new ayh(f5 - 1.0F, f6 + 1.0F), new ayh(f1 - 1.0F, f2 - 1.0F)
            });
        }
    }

    public ayh[] a()
        throws ayc
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        int l1;
        int k2;
        boolean flag2;
        flag2 = false;
        l = d;
        l1 = e;
        j = g;
        k = f;
        i1 = 0;
        k1 = 0;
        flag = false;
        i = 0;
        k2 = 0;
        j1 = 1;
_L28:
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        i1 = l;
        i = k;
        l = l1;
        k = j;
        j = i1;
        i1 = ((flag2) ? 1 : 0);
_L6:
        if (i1 != 0 || k2 == 0) goto _L4; else goto _L3
_L3:
        ayh ayh1;
        j1 = l - j;
        i1 = 1;
        ayh1 = null;
_L11:
        ayh ayh2;
        int i2;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if (i1 >= j1)
        {
            ayh2 = ayh1;
        } else
        {
label0:
            {
                ayh1 = a(j, i - i1, j + i1, i);
                if (ayh1 == null)
                {
                    break label0;
                }
                ayh2 = ayh1;
            }
        }
        if (ayh2 == null)
        {
            throw ayc.a();
        }
        i1 = 1;
        ayh1 = null;
          goto _L5
_L2:
        flag3 = true;
        i2 = 0;
        j1 = i;
        i = l1;
_L7:
label1:
        {
            if ((flag3 || j1 == 0) && i < c)
            {
                break label1;
            }
            if (i < c)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            i1 = 1;
            j1 = j;
            k1 = i;
            j = l;
            i = k;
            k = j1;
            l = k1;
        }
          goto _L6
        flag4 = a(j, k, i, false);
        if (flag4)
        {
            i++;
            j1 = 1;
            i2 = 1;
            flag3 = flag4;
        } else
        {
            flag3 = flag4;
            if (j1 == 0)
            {
                i++;
                flag3 = flag4;
            }
        }
          goto _L7
        l1 = i2;
        flag3 = true;
_L8:
label2:
        {
            if ((flag3 || !flag) && k < b)
            {
                break label2;
            }
            if (k < b)
            {
                break MISSING_BLOCK_LABEL_368;
            }
            i1 = 1;
            j1 = j;
            k1 = i;
            j = l;
            i = k;
            k = j1;
            l = k1;
        }
          goto _L6
        flag4 = a(l, i, k, true);
        if (flag4)
        {
            k++;
            flag = true;
            l1 = 1;
            flag3 = flag4;
        } else
        {
            flag3 = flag4;
            if (!flag)
            {
                k++;
                flag3 = flag4;
            }
        }
          goto _L8
        flag3 = true;
_L9:
label3:
        {
            if ((flag3 || k1 == 0) && l >= 0)
            {
                break label3;
            }
            if (l >= 0)
            {
                break MISSING_BLOCK_LABEL_480;
            }
            i1 = 1;
            j1 = j;
            k1 = i;
            j = l;
            i = k;
            k = j1;
            l = k1;
        }
          goto _L6
        flag4 = a(j, k, l, false);
        if (flag4)
        {
            l--;
            k1 = 1;
            l1 = 1;
            flag3 = flag4;
        } else
        {
            flag3 = flag4;
            if (k1 == 0)
            {
                l--;
                flag3 = flag4;
            }
        }
          goto _L9
        i2 = i1;
        flag3 = true;
        i1 = l1;
        l1 = i2;
_L10:
label4:
        {
            if ((flag3 || l1 == 0) && j >= 0)
            {
                break label4;
            }
            if (j < 0)
            {
                i1 = 1;
                j1 = j;
                k1 = i;
                j = l;
                i = k;
                k = j1;
                l = k1;
            } else
            {
                ayh ayh3;
                ayh ayh4;
                ayh ayh5;
                if (i1 != 0)
                {
                    k2 = l1;
                    flag1 = true;
                    i2 = i1;
                    l1 = i;
                    i1 = k2;
                    i = j1;
                    j1 = i2;
                    k2 = ((flag1) ? 1 : 0);
                } else
                {
                    int l2 = l1;
                    int j2 = i1;
                    l1 = i;
                    i1 = l2;
                    i = j1;
                    j1 = j2;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L6
        flag4 = a(l, i, j, true);
        if (flag4)
        {
            j--;
            l1 = 1;
            i1 = 1;
            flag3 = flag4;
        } else
        {
            flag3 = flag4;
            if (l1 == 0)
            {
                j--;
                flag3 = flag4;
            }
        }
          goto _L10
        i1++;
          goto _L11
_L5:
        if (i1 < j1) goto _L13; else goto _L12
_L12:
        ayh3 = ayh1;
_L15:
        if (ayh3 == null)
        {
            throw ayc.a();
        }
        break; /* Loop/switch isn't completed */
_L13:
        ayh1 = a(j, k + i1, j + i1, k);
        if (ayh1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ayh3 = ayh1;
        if (true) goto _L15; else goto _L14
_L14:
        i1++;
        if (true) goto _L5; else goto _L16
_L16:
        j = 1;
        ayh1 = null;
_L22:
        if (j < j1) goto _L18; else goto _L17
_L17:
        ayh4 = ayh1;
_L20:
        if (ayh4 == null)
        {
            throw ayc.a();
        }
        break; /* Loop/switch isn't completed */
_L18:
        ayh1 = a(l, k + j, l - j, k);
        ayh4 = ayh1;
        if (ayh1 != null) goto _L20; else goto _L19
_L19:
        j++;
        if (true) goto _L22; else goto _L21
_L21:
        ayh1 = null;
        j = 1;
_L26:
        if (j < j1) goto _L24; else goto _L23
_L23:
        if (ayh1 == null)
        {
            throw ayc.a();
        } else
        {
            return a(ayh1, ayh2, ayh4, ayh3);
        }
_L24:
        ayh5 = a(l, i - j, l - j, i);
        ayh1 = ayh5;
        if (ayh5 != null) goto _L23; else goto _L25
_L25:
        j++;
        ayh1 = ayh5;
        if (true) goto _L26; else goto _L4
_L4:
        throw ayc.a();
        if (true) goto _L28; else goto _L27
_L27:
    }
}

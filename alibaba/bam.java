// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bam
{

    private static int a(int i, int j)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int a(int ai[], int i, boolean flag)
    {
        int j;
        int k;
        int j2;
        int k2;
        int j3;
        j3 = ai.length;
        int l = ai.length;
        k = 0;
        j = 0;
        do
        {
            if (k >= l)
            {
                k2 = 0;
                k = 0;
                boolean flag1 = false;
                j2 = j;
                j = k;
                k = ((flag1) ? 1 : 0);
                break MISSING_BLOCK_LABEL_39;
            }
            int l1 = ai[k];
            k++;
            j = l1 + j;
        } while (true);
_L2:
        int l2;
        if (k2 >= j3 - 1)
        {
            return j;
        }
        int i1 = k | 1 << k2;
        l2 = 1;
        k = j;
        j = i1;
_L5:
label0:
        {
            if (l2 < ai[k2])
            {
                break label0;
            }
            k2++;
            j2 -= l2;
            int j1 = k;
            k = j;
            j = j1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        int k1;
        int i2;
        int i3;
        i2 = a(j2 - l2 - 1, j3 - k2 - 2);
        k1 = i2;
        if (flag)
        {
            k1 = i2;
            if (j == 0)
            {
                k1 = i2;
                if (j2 - l2 - (j3 - k2 - 1) >= j3 - k2 - 1)
                {
                    k1 = i2 - a(j2 - l2 - (j3 - k2), j3 - k2 - 2);
                }
            }
        }
        if (j3 - k2 - 1 <= 1)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        i2 = j2 - l2 - (j3 - k2 - 2);
        i3 = 0;
_L6:
        if (i2 > i) goto _L4; else goto _L3
_L3:
        i2 = k1 - (j3 - 1 - k2) * i3;
_L7:
        k += i2;
        l2++;
        j &= ~(1 << k2);
          goto _L5
_L4:
        i3 += a(j2 - l2 - i2 - 1, j3 - k2 - 3);
        i2--;
          goto _L6
        i2 = k1;
        if (j2 - l2 > i)
        {
            i2 = k1 - 1;
        }
          goto _L7
    }
}

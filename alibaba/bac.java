// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bac
{

    private final int a[] = new int[4];
    private final StringBuilder b = new StringBuilder();

    bac()
    {
    }

    private static Map a(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    int a(ayn ayn1, int ai[], StringBuilder stringbuilder)
        throws ayc
    {
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int i1 = ayn1.a();
        int i = ai[1];
        int k = 0;
        int j = 0;
label0:
        do
        {
            if (k >= 2 || i >= i1)
            {
                if (stringbuilder.length() != 2)
                {
                    throw ayc.a();
                }
            } else
            {
                int j1 = baf.a(ayn1, ai1, i, baf.e);
                stringbuilder.append((char)(j1 % 10 + 48));
                int k1 = ai1.length;
                int l = 0;
                do
                {
                    if (l >= k1)
                    {
                        l = j;
                        if (j1 >= 10)
                        {
                            l = j | 1 << 1 - k;
                        }
                        j = i;
                        if (k != 1)
                        {
                            j = ayn1.d(ayn1.c(i));
                        }
                        k++;
                        i = j;
                        j = l;
                        continue label0;
                    }
                    int l1 = ai1[l];
                    l++;
                    i = l1 + i;
                } while (true);
            }
            if (Integer.parseInt(stringbuilder.toString()) % 4 != j)
            {
                throw ayc.a();
            }
            return i;
        } while (true);
    }

    ayf a(int i, ayn ayn1, int ai[])
        throws ayc
    {
        Object obj = b;
        ((StringBuilder) (obj)).setLength(0);
        int j = a(ayn1, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        ayn1 = a(((String) (obj)));
        ai = new ayh((float)(ai[0] + ai[1]) / 2.0F, i);
        ayh ayh1 = new ayh(j, i);
        axu axu1 = axu.q;
        ai = new ayf(((String) (obj)), null, new ayh[] {
            ai, ayh1
        }, axu1);
        if (ayn1 != null)
        {
            ai.a(ayn1);
        }
        return ai;
    }
}

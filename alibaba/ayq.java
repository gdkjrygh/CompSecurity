// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ayq extends Enum
{

    public static final ayq A;
    private static final Map B;
    private static final Map C;
    private static final ayq F[];
    public static final ayq a;
    public static final ayq b;
    public static final ayq c;
    public static final ayq d;
    public static final ayq e;
    public static final ayq f;
    public static final ayq g;
    public static final ayq h;
    public static final ayq i;
    public static final ayq j;
    public static final ayq k;
    public static final ayq l;
    public static final ayq m;
    public static final ayq n;
    public static final ayq o;
    public static final ayq p;
    public static final ayq q;
    public static final ayq r;
    public static final ayq s;
    public static final ayq t;
    public static final ayq u;
    public static final ayq v;
    public static final ayq w;
    public static final ayq x;
    public static final ayq y;
    public static final ayq z;
    private final int D[];
    private final String E[];

    private ayq(String s1, int i1, int j1)
    {
        this(s1, i1, new int[] {
            j1
        }, new String[0]);
    }

    private transient ayq(String s1, int i1, int j1, String as[])
    {
        super(s1, i1);
        D = (new int[] {
            j1
        });
        E = as;
    }

    private transient ayq(String s1, int i1, int ai[], String as[])
    {
        super(s1, i1);
        D = ai;
        E = as;
    }

    public static ayq a(int i1)
        throws axz
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ayq valueOf(String s1)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ayq[] values()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        Object aobj[];
        int i1;
        int k1;
        aobj = new int[2];
        aobj[1] = 2;
        a = new ayq("Cp437", 0, ((int []) (aobj)), new String[0]);
        b = new ayq("ISO8859_1", 1, new int[] {
            1, 3
        }, new String[] {
            "ISO-8859-1"
        });
        c = new ayq("ISO8859_2", 2, 4, new String[] {
            "ISO-8859-2"
        });
        d = new ayq("ISO8859_3", 3, 5, new String[] {
            "ISO-8859-3"
        });
        e = new ayq("ISO8859_4", 4, 6, new String[] {
            "ISO-8859-4"
        });
        f = new ayq("ISO8859_5", 5, 7, new String[] {
            "ISO-8859-5"
        });
        g = new ayq("ISO8859_6", 6, 8, new String[] {
            "ISO-8859-6"
        });
        h = new ayq("ISO8859_7", 7, 9, new String[] {
            "ISO-8859-7"
        });
        i = new ayq("ISO8859_8", 8, 10, new String[] {
            "ISO-8859-8"
        });
        j = new ayq("ISO8859_9", 9, 11, new String[] {
            "ISO-8859-9"
        });
        k = new ayq("ISO8859_10", 10, 12, new String[] {
            "ISO-8859-10"
        });
        l = new ayq("ISO8859_11", 11, 13, new String[] {
            "ISO-8859-11"
        });
        m = new ayq("ISO8859_13", 12, 15, new String[] {
            "ISO-8859-13"
        });
        n = new ayq("ISO8859_14", 13, 16, new String[] {
            "ISO-8859-14"
        });
        o = new ayq("ISO8859_15", 14, 17, new String[] {
            "ISO-8859-15"
        });
        p = new ayq("ISO8859_16", 15, 18, new String[] {
            "ISO-8859-16"
        });
        q = new ayq("SJIS", 16, 20, new String[] {
            "Shift_JIS"
        });
        r = new ayq("Cp1250", 17, 21, new String[] {
            "windows-1250"
        });
        s = new ayq("Cp1251", 18, 22, new String[] {
            "windows-1251"
        });
        t = new ayq("Cp1252", 19, 23, new String[] {
            "windows-1252"
        });
        u = new ayq("Cp1256", 20, 24, new String[] {
            "windows-1256"
        });
        v = new ayq("UnicodeBigUnmarked", 21, 25, new String[] {
            "UTF-16BE", "UnicodeBig"
        });
        w = new ayq("UTF8", 22, 26, new String[] {
            "UTF-8"
        });
        x = new ayq("ASCII", 23, new int[] {
            27, 170
        }, new String[] {
            "US-ASCII"
        });
        y = new ayq("Big5", 24, 28);
        z = new ayq("GB18030", 25, 29, new String[] {
            "GB2312", "EUC_CN", "GBK"
        });
        A = new ayq("EUC_KR", 26, 30, new String[] {
            "EUC-KR"
        });
        F = (new ayq[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A
        });
        B = new HashMap();
        C = new HashMap();
        aobj = values();
        k1 = aobj.length;
        i1 = 0;
_L3:
        ayq ayq1;
        Object aobj1[];
        int j1;
        int l1;
        if (i1 >= k1)
        {
            return;
        }
        ayq1 = aobj[i1];
        aobj1 = ayq1.D;
        l1 = aobj1.length;
        j1 = 0;
_L4:
        if (j1 < l1) goto _L2; else goto _L1
_L1:
        C.put(ayq1.name(), ayq1);
        aobj1 = ayq1.E;
        l1 = aobj1.length;
        j1 = 0;
_L5:
        if (j1 < l1)
        {
            break MISSING_BLOCK_LABEL_1022;
        }
        i1++;
          goto _L3
_L2:
        int i2 = ((int) (aobj1[j1]));
        B.put(Integer.valueOf(i2), ayq1);
        j1++;
          goto _L4
        Object obj = aobj1[j1];
        C.put(obj, ayq1);
        j1++;
          goto _L5
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;

import java.util.EnumSet;
import java.util.Iterator;

public final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final n p;
    public static final n q;
    public static final n r;
    public static final n s;
    public static final n t;
    public static final n u;
    public static final n v;
    public static final n w;
    public static final n x;
    private static final n z[];
    String y;

    private n(String s1, int i1, String s2)
    {
        super(s1, i1);
        y = s2;
    }

    public static n a(String s1)
    {
        for (Iterator iterator = EnumSet.allOf(p/bh/n).iterator(); iterator.hasNext();)
        {
            n n1 = (n)iterator.next();
            if (n1.toString().equals(s1))
            {
                return n1;
            }
        }

        return null;
    }

    public static n valueOf(String s1)
    {
        return (n)Enum.valueOf(p/bh/n, s1);
    }

    public static n[] values()
    {
        return (n[])z.clone();
    }

    public String toString()
    {
        return y;
    }

    static 
    {
        a = new n("EN_US", 0, "EN-US");
        b = new n("ES_MX", 1, "ES-MX");
        c = new n("FR_CA", 2, "FR-CA");
        d = new n("DE_DE", 3, "DE-DE");
        e = new n("ES_ES", 4, "ES-ES");
        f = new n("EN_GB", 5, "EN-GB");
        g = new n("RU_RU", 6, "RU-RU");
        h = new n("TR_TR", 7, "TR-TR");
        i = new n("PL_PL", 8, "PL-PL");
        j = new n("FR_FR", 9, "FR-FR");
        k = new n("IT_IT", 10, "IT-IT");
        l = new n("SV_SE", 11, "SV-SE");
        m = new n("PT_PT", 12, "PT-PT");
        n = new n("NL_NL", 13, "NL-NL");
        o = new n("EN_AU", 14, "EN-AU");
        p = new n("ZH_CN", 15, "ZH-CN");
        q = new n("ZH_TW", 16, "ZH-TW");
        r = new n("JA_JP", 17, "JA-JP");
        s = new n("AR_SA", 18, "AR-SA");
        t = new n("KO_KR", 19, "KO-KR");
        u = new n("PT_BR", 20, "PT-BR");
        v = new n("CS_CZ", 21, "CS-CZ");
        w = new n("DA_DK", 22, "DA-DK");
        x = new n("NO_NO", 23, "NO-NO");
        z = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x
        });
    }
}

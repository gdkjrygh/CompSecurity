// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;

import java.util.EnumSet;
import java.util.Iterator;

public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    public static final j k;
    public static final j l;
    public static final j m;
    public static final j n;
    public static final j o;
    public static final j p;
    public static final j q;
    public static final j r;
    public static final j s;
    public static final j t;
    public static final j u;
    public static final j v;
    public static final j w;
    public static final j x;
    private static final j z[];
    String y;

    private j(String s1, int i1, String s2)
    {
        super(s1, i1);
        y = s2;
    }

    public static j a(String s1)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/e/c/a/j).iterator(); iterator.hasNext();)
        {
            j j1 = (j)iterator.next();
            if (j1.toString().equals(s1))
            {
                return j1;
            }
        }

        return null;
    }

    public static j valueOf(String s1)
    {
        return (j)Enum.valueOf(com/ford/syncV4/e/c/a/j, s1);
    }

    public static j[] values()
    {
        return (j[])z.clone();
    }

    public final String toString()
    {
        return y;
    }

    static 
    {
        a = new j("EN_US", 0, "EN-US");
        b = new j("ES_MX", 1, "ES-MX");
        c = new j("FR_CA", 2, "FR-CA");
        d = new j("DE_DE", 3, "DE-DE");
        e = new j("ES_ES", 4, "ES-ES");
        f = new j("EN_GB", 5, "EN-GB");
        g = new j("RU_RU", 6, "RU-RU");
        h = new j("TR_TR", 7, "TR-TR");
        i = new j("PL_PL", 8, "PL-PL");
        j = new j("FR_FR", 9, "FR-FR");
        k = new j("IT_IT", 10, "IT-IT");
        l = new j("SV_SE", 11, "SV-SE");
        m = new j("PT_PT", 12, "PT-PT");
        n = new j("NL_NL", 13, "NL-NL");
        o = new j("EN_AU", 14, "EN-AU");
        p = new j("ZH_CN", 15, "ZH-CN");
        q = new j("ZH_TW", 16, "ZH-TW");
        r = new j("JA_JP", 17, "JA-JP");
        s = new j("AR_SA", 18, "AR-SA");
        t = new j("KO_KR", 19, "KO-KR");
        u = new j("PT_BR", 20, "PT-BR");
        v = new j("CS_CZ", 21, "CS-CZ");
        w = new j("DA_DK", 22, "DA-DK");
        x = new j("NO_NO", 23, "NO-NO");
        z = (new j[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x
        });
    }
}

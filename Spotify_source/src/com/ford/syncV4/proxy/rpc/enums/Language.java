// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;

import java.util.EnumSet;
import java.util.Iterator;

public final class Language extends Enum
{

    public static final Language a;
    private static Language b;
    private static Language c;
    private static Language d;
    private static Language e;
    private static Language f;
    private static Language g;
    private static Language h;
    private static Language i;
    private static Language j;
    private static Language k;
    private static Language l;
    private static Language m;
    private static Language n;
    private static Language o;
    private static Language p;
    private static Language q;
    private static Language r;
    private static Language s;
    private static Language t;
    private static Language u;
    private static Language v;
    private static Language w;
    private static Language x;
    private static final Language y[];
    String internalName;

    private Language(String s1, int i1, String s2)
    {
        super(s1, i1);
        internalName = s2;
    }

    public static Language a(String s1)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/proxy/rpc/enums/Language).iterator(); iterator.hasNext();)
        {
            Language language = (Language)iterator.next();
            if (language.toString().equals(s1))
            {
                return language;
            }
        }

        return null;
    }

    public static Language valueOf(String s1)
    {
        return (Language)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/Language, s1);
    }

    public static Language[] values()
    {
        return (Language[])y.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        a = new Language("EN_US", 0, "EN-US");
        b = new Language("ES_MX", 1, "ES-MX");
        c = new Language("FR_CA", 2, "FR-CA");
        d = new Language("DE_DE", 3, "DE-DE");
        e = new Language("ES_ES", 4, "ES-ES");
        f = new Language("EN_GB", 5, "EN-GB");
        g = new Language("RU_RU", 6, "RU-RU");
        h = new Language("TR_TR", 7, "TR-TR");
        i = new Language("PL_PL", 8, "PL-PL");
        j = new Language("FR_FR", 9, "FR-FR");
        k = new Language("IT_IT", 10, "IT-IT");
        l = new Language("SV_SE", 11, "SV-SE");
        m = new Language("PT_PT", 12, "PT-PT");
        n = new Language("NL_NL", 13, "NL-NL");
        o = new Language("EN_AU", 14, "EN-AU");
        p = new Language("ZH_CN", 15, "ZH-CN");
        q = new Language("ZH_TW", 16, "ZH-TW");
        r = new Language("JA_JP", 17, "JA-JP");
        s = new Language("AR_SA", 18, "AR-SA");
        t = new Language("KO_KR", 19, "KO-KR");
        u = new Language("PT_BR", 20, "PT-BR");
        v = new Language("CS_CZ", 21, "CS-CZ");
        w = new Language("DA_DK", 22, "DA-DK");
        x = new Language("NO_NO", 23, "NO-NO");
        y = (new Language[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x
        });
    }
}

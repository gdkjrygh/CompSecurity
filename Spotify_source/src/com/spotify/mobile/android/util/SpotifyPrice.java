// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class SpotifyPrice
{

    private static final Map a;
    private static final Map b;

    public static String a(String s, Tier tier)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Tier.values().length];
                try
                {
                    a[Tier.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Tier.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = s.toUpperCase(Locale.US);
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        _cls1.a[tier.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 57
    //                   2 70;
           goto _L2 _L3 _L4
_L2:
        return null;
_L3:
        return (String)b.get(s);
_L4:
        return (String)a.get(s);
    }

    static 
    {
        a = new HashMap();
        HashMap hashmap = new HashMap();
        b = hashmap;
        hashmap.put("AD", "3.99\u20AC");
        b.put("AR", "14 ARS");
        b.put("AT", "\u20AC 3,99");
        b.put("AU", "$4.99");
        b.put("BE-FR", "\u20AC 3,99");
        b.put("BE-NL", "\u20AC 3,99");
        b.put("BG", "1.99 EUR");
        b.put("BO", "USD $2.49");
        b.put("BR", "5.99 BRL");
        b.put("CA-EN", "3.99 CAD");
        b.put("CA-FR", "3.99 CAD");
        b.put("CH-DE", "Fr. 4.99");
        b.put("CH-FR", "Fr. 4.99");
        b.put("CL", "CLP 1299");
        b.put("CO", "COP 4599");
        b.put("CR", "USD $2.49");
        b.put("CY", "2.99 EUR");
        b.put("CZ", "2.49 EUR");
        b.put("DE", "3,99 \u20AC");
        b.put("DK", "kr 39,00");
        b.put("DO", "USD $2.49");
        b.put("EC", "USD $2.49");
        b.put("EE", "2.99 EUR");
        b.put("ES", "3,99 \u20AC");
        b.put("FI", "3,99 \u20AC");
        b.put("FR", "3,99 \u20AC");
        b.put("GR", "3.99 EUR");
        b.put("GT", "USD $2.99");
        b.put("HK-EN", "19 HKD");
        b.put("HK-ZH", "19 HKD");
        b.put("HN", "USD $2.49");
        b.put("HU", "1,99 \u20AC");
        b.put("IE", "\u20AC3.99");
        b.put("IS", "3.99 EUR");
        b.put("IT", "\u20AC3,99");
        b.put("LI", "4.99 CHF");
        b.put("LT", "2.99 EUR");
        b.put("LU-DE", "2.99 EUR");
        b.put("LU-FR", "2.99 EUR");
        b.put("LV", "2.99 EUR");
        b.put("MC", "3.99 \u20AC");
        b.put("MT", "2.99 EUR");
        b.put("MX", "39 MXN");
        b.put("MY-EN", "5.99 MYR");
        b.put("MY-MS", "5.99 MYR");
        b.put("NI", "USD $2.49");
        b.put("NL", "\u20AC3,99");
        b.put("NO", "kr 39,00");
        b.put("NZ", "$4.99");
        b.put("PA", "USD $2.49");
        b.put("PE", "PEN 6.99");
        b.put("PH", "49 PHP");
        b.put("PL", "7,99 PLN");
        b.put("PT", "\u20AC7.99");
        b.put("PY", "USD $2.49");
        b.put("SE", "39,00 kr");
        b.put("SG-EN", "3.99 SGD");
        b.put("SK", "2.49 EUR");
        b.put("SV", "USD $2.49");
        b.put("TR", "3.99 TRY");
        b.put("TW", "59 NTD");
        b.put("UK", "\2433.99");
        b.put("US", "$3.99");
        b.put("UY", "USD $2.49");
        a.put("AD", "9.99\u20AC");
        a.put("AR", "36 ARS");
        a.put("AU", "$11.99");
        a.put("AT", "\u20AC 9,99");
        a.put("BE-FR", "\u20AC 9,99");
        a.put("BE-NL", "\u20AC 9,99");
        a.put("BO", "USD $5.99");
        a.put("BR", "14.90 BRL");
        a.put("BG", "4.99 EUR");
        a.put("CA-EN", "9.99 CAD");
        a.put("CA-FR", "9.99 CAD");
        a.put("CL", "CLP 3099");
        a.put("CO", "COP 11499");
        a.put("CR", "USD $5.99");
        a.put("CY", "6.99 EUR");
        a.put("CZ", "5.99 EUR");
        a.put("DK", "kr 99,00");
        a.put("DO", "USD $5.99");
        a.put("EC", "USD $5.99");
        a.put("SV", "USD $5.99");
        a.put("EE", "6.99 EUR");
        a.put("FI", "9,99 \u20AC");
        a.put("FR", "9,99 \u20AC");
        a.put("DE", "9,99 \u20AC");
        a.put("GR", "6.99 EUR");
        a.put("GT", "USD $5.99");
        a.put("HN", "USD $5.99");
        a.put("HK-EN", "48 HKD");
        a.put("HK-ZH", "48 HKD");
        a.put("HU", "4,99 \u20AC");
        a.put("IS", "9.99 EUR");
        a.put("IE", "\u20AC9.99");
        a.put("IT", "\u20AC9,99");
        a.put("LV", "6.99 EUR");
        a.put("LI", "12.95 CHF");
        a.put("LT", "6.99 EUR");
        a.put("LU-FR", "9.99 EUR");
        a.put("LU-DE", "9.99 EUR");
        a.put("MY-EN", "14.9 MYR");
        a.put("MY-MS", "14.9 MYR");
        a.put("MT", "6.99 EUR");
        a.put("MX", "99 MXN");
        a.put("MC", "9.99 \u20AC");
        a.put("NL", "\u20AC9,99");
        a.put("NZ", "$12.99");
        a.put("NI", "USD $5.99");
        a.put("NO", "kr 99,00");
        a.put("PA", "USD $5.99");
        a.put("PY", "USD $5.99");
        a.put("PE", "PEN 16.9");
        a.put("PH", "129 PHP");
        a.put("PL", "19,99 PLN");
        a.put("PT", "\u20AC6.99");
        a.put("SG-EN", "9.9 SGD");
        a.put("SK", "5.99 EUR");
        a.put("ES", "9,99 \u20AC");
        a.put("SE", "99,00 kr");
        a.put("CH-FR", "Fr. 12.95");
        a.put("CH-DE", "Fr. 12.95");
        a.put("TW", "149 NTD");
        a.put("TR", "9.99 TRY");
        a.put("UK", "\2439.99");
        a.put("US", "$9.99");
        a.put("UY", "USD $5.99");
    }

    private class Tier extends Enum
    {

        public static final Tier a;
        public static final Tier b;
        private static final Tier c[];

        public static Tier valueOf(String s)
        {
            return (Tier)Enum.valueOf(com/spotify/mobile/android/util/SpotifyPrice$Tier, s);
        }

        public static Tier[] values()
        {
            return (Tier[])c.clone();
        }

        static 
        {
            a = new Tier("PLUS", 0);
            b = new Tier("PREMIUM", 1);
            c = (new Tier[] {
                a, b
            });
        }

        private Tier(String s, int i)
        {
            super(s, i);
        }
    }

}

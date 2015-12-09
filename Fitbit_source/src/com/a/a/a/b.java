// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.a.a.a:
//            n, f, g, d, 
//            i, j, o, p, 
//            q, c, k, t, 
//            e, h, r, l, 
//            s, u, m

public abstract class b
{

    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 4;
    static final int e = 8;
    static final int f = 16;
    static final int g = 0x1000004;
    static final int h = 0x1000005;
    private static Map i = new HashMap();

    public b()
    {
    }

    static final b a(Locale locale)
    {
        return (b)i.get(locale.getLanguage());
    }

    public static void a(String s1, b b1)
    {
        i.put(s1, b1);
    }

    public static void a(String as[], b b1)
    {
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            i.put(s1, b1);
        }

    }

    static final int c(int i1)
    {
        switch (i1)
        {
        default:
            return 0x1000004;

        case 1: // '\001'
            return 0x1000005;

        case 2: // '\002'
            return 0x1000006;

        case 4: // '\004'
            return 0x1000007;

        case 8: // '\b'
            return 0x1000008;

        case 16: // '\020'
            return 0x1000009;
        }
    }

    static final String d(int i1)
    {
        switch (i1)
        {
        default:
            return "other";

        case 1: // '\001'
            return "zero";

        case 2: // '\002'
            return "one";

        case 4: // '\004'
            return "two";

        case 8: // '\b'
            return "few";

        case 16: // '\020'
            return "many";
        }
    }

    int a(double d1)
    {
        return 0;
    }

    abstract int a(int i1);

    final int b(int i1)
    {
        return c(a(i1));
    }

    static 
    {
        Object obj = new n();
        a(new String[] {
            "bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", 
            "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", 
            "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", 
            "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", 
            "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", 
            "gsw", "chr", "rm", "pt"
        }, ((b) (obj)));
        obj = new f();
        a(new String[] {
            "cs", "sk"
        }, ((b) (obj)));
        obj = new g();
        a(new String[] {
            "ff", "fr", "kab"
        }, ((b) (obj)));
        obj = new d();
        a(new String[] {
            "hr", "ru", "sr", "uk", "be", "bs", "sh"
        }, ((b) (obj)));
        obj = new i();
        a(new String[] {
            "lv"
        }, ((b) (obj)));
        obj = new j();
        a(new String[] {
            "lt"
        }, ((b) (obj)));
        obj = new o();
        a(new String[] {
            "pl"
        }, ((b) (obj)));
        obj = new p();
        a(new String[] {
            "ro", "mo"
        }, ((b) (obj)));
        obj = new q();
        a(new String[] {
            "sl"
        }, ((b) (obj)));
        obj = new c();
        a(new String[] {
            "ar"
        }, ((b) (obj)));
        obj = new k();
        a(new String[] {
            "mk"
        }, ((b) (obj)));
        obj = new t();
        a(new String[] {
            "cy"
        }, ((b) (obj)));
        obj = new e();
        a(new String[] {
            "br"
        }, ((b) (obj)));
        obj = new h();
        a(new String[] {
            "lag"
        }, ((b) (obj)));
        obj = new r();
        a(new String[] {
            "shi"
        }, ((b) (obj)));
        obj = new l();
        a(new String[] {
            "mt"
        }, ((b) (obj)));
        obj = new s();
        a(new String[] {
            "ga", "se", "sma", "smi", "smj", "smn", "sms"
        }, ((b) (obj)));
        obj = new u();
        a(new String[] {
            "ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", 
            "ti", "wa"
        }, ((b) (obj)));
        obj = new m();
        a(new String[] {
            "az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", 
            "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", 
            "id", "jv", "ka", "km", "kn", "ms", "th"
        }, ((b) (obj)));
    }
}

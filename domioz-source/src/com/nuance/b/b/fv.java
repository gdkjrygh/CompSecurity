// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            ft, fr

final class fv extends Enum
{

    public static final fv a;
    public static final fv b;
    public static final fv c;
    public static final fv d;
    public static final fv e;
    public static final fv f;
    public static final fv g;
    public static final fv h;
    public static final fv i;
    public static final fv j;
    public static final fv k;
    public static final fv l;
    public static final fv m;
    public static final fv n;
    public static final fv o;
    public static final fv p;
    public static final fv q;
    public static final fv r;
    private static final fv u[];
    private final int s;
    private final String t;

    private fv(String s1, int i1, int j1, String s2)
    {
        super(s1, i1);
        s = j1;
        t = s2;
    }

    public static fv a(int i1)
    {
        fv afv[] = values();
        int k1 = afv.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            fv fv1 = afv[j1];
            if (fv1.s == i1)
            {
                return fv1;
            }
        }

        ft.c();
        fr.b((new StringBuilder("Unrecognized completion cause value: ")).append(i1).append(" Will default to UNKNOWN.").toString());
        return r;
    }

    public static fv valueOf(String s1)
    {
        return (fv)Enum.valueOf(com/nuance/b/b/fv, s1);
    }

    public static fv[] values()
    {
        return (fv[])u.clone();
    }

    public final String a()
    {
        return t;
    }

    static 
    {
        a = new fv("SUCCESS", 0, 0, "Success");
        b = new fv("NO_MATCH", 1, 1, "No Match");
        c = new fv("NO_INPUT_TIMEOUT", 2, 2, "No Input Timeout");
        d = new fv("RECOGNITION_TIMEOUT", 3, 3, "Recognition Timeout");
        e = new fv("GRAMMAR_LOAD_FAILURE", 4, 4, "Grammar Load Failure");
        f = new fv("GRAMMAR_COMPILATION_FAILURE", 5, 5, "Grammar Compilation Failure");
        g = new fv("ERROR", 6, 6, "Error");
        h = new fv("SPEECH_TOO_EARLY", 7, 7, "Speech Too Early");
        i = new fv("TOO_MUCH_SPEECH_TIMEOUT", 8, 8, "Too Much Speech Timeout");
        j = new fv("URI_FAILURE", 9, 9, "URI Failure");
        k = new fv("LANGUAGE_UNSUPPORTED", 10, 10, "Language Unsupported");
        l = new fv("CANCELLED", 11, 11, "Cancelled");
        m = new fv("SEMANTICS_FAILURE", 12, 12, "Semantics Failure");
        n = new fv("NO_GRAMMAR_DEFINED", 13, 13, "No Grammar Defined");
        o = new fv("RESOURCE_UNAVAILABLE", 14, 14, "Resource Unavailable");
        p = new fv("INVALID_REQUEST", 15, 600, "Invalid Request");
        q = new fv("RESOURCE_UNAVAILABLE_2", 16, 601, "Resource Unavailable 2");
        r = new fv("UNKNOWN", 17, 65535, "Unknown");
        u = (new fv[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}

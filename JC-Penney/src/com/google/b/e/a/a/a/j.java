// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.b.a;

// Referenced classes of package com.google.b.e.a.a.a:
//            t, g, k, a, 
//            b, c, d, e

public abstract class j
{

    private final a a;
    private final t b;

    j(a a1)
    {
        a = a1;
        b = new t(a1);
    }

    public static j a(a a1)
    {
        if (a1.a(1))
        {
            return new g(a1);
        }
        if (!a1.a(2))
        {
            return new k(a1);
        }
        switch (com.google.b.e.a.a.a.t.a(a1, 1, 4))
        {
        default:
            switch (com.google.b.e.a.a.a.t.a(a1, 1, 5))
            {
            default:
                switch (com.google.b.e.a.a.a.t.a(a1, 1, 7))
                {
                default:
                    throw new IllegalStateException((new StringBuilder()).append("unknown decoder: ").append(a1).toString());

                case 56: // '8'
                    return new e(a1, "310", "11");

                case 57: // '9'
                    return new e(a1, "320", "11");

                case 58: // ':'
                    return new e(a1, "310", "13");

                case 59: // ';'
                    return new e(a1, "320", "13");

                case 60: // '<'
                    return new e(a1, "310", "15");

                case 61: // '='
                    return new e(a1, "320", "15");

                case 62: // '>'
                    return new e(a1, "310", "17");

                case 63: // '?'
                    return new e(a1, "320", "17");
                }

            case 12: // '\f'
                return new c(a1);

            case 13: // '\r'
                return new d(a1);
            }

        case 4: // '\004'
            return new com.google.b.e.a.a.a.a(a1);

        case 5: // '\005'
            return new b(a1);
        }
    }

    public abstract String a();

    protected final a b()
    {
        return a;
    }

    protected final t c()
    {
        return b;
    }
}

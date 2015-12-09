// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Locale;

// Referenced classes of package com.tealium.library:
//            u

final class b extends Enum
{

    private static d c;
    private static d d;
    private static final d e[];
    final a a;
    final String b;

    static b a(String s)
    {
        if ("equals".equalsIgnoreCase(s))
        {
            return c;
        }
        if ("does_not_equal".equalsIgnoreCase(s))
        {
            return d;
        } else
        {
            u.e(String.format(Locale.ROOT, "\"%s\" isn't parceable to a known filter type.", new Object[] {
                s
            }));
            return null;
        }
    }

    public final String toString()
    {
        return b;
    }

    static 
    {
        class _cls1
            implements a
        {

            public final boolean a(String s, String s1)
            {
                return s.equals(s1);
            }

            _cls1()
            {
            }
        }

        c = new <init>("EQUALS", 0, "==", new _cls1());
        class _cls2
            implements a
        {

            public final boolean a(String s, String s1)
            {
                return !s.equals(s1);
            }

            _cls2()
            {
            }
        }

        d = new <init>("DOES_NOT_EQUAL", 1, "!=", new _cls2());
        e = (new e[] {
            c, d
        });
    }

    private a(String s, int i, String s1, a a1)
    {
        super(s, i);
        a = a1;
        b = s1;
    }
}

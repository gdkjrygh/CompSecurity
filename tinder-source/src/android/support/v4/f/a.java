// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;

import java.util.Locale;

// Referenced classes of package android.support.v4.f:
//            c, b

public final class android.support.v4.f.a
{
    static interface a
    {

        public abstract String a(Locale locale);
    }

    static final class b
        implements a
    {

        public final String a(Locale locale)
        {
            return null;
        }

        b()
        {
        }
    }

    static final class c
        implements a
    {

        public final String a(Locale locale)
        {
            return android.support.v4.f.c.a(locale);
        }

        c()
        {
        }
    }

    static final class d
        implements a
    {

        public final String a(Locale locale)
        {
            return android.support.v4.f.b.a(locale);
        }

        d()
        {
        }
    }


    private static final a a;

    public static String a(Locale locale)
    {
        return a.a(locale);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new d();
        } else
        if (i >= 14)
        {
            a = new c();
        } else
        {
            a = new b();
        }
    }
}

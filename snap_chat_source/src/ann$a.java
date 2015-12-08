// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

static final class a
    implements ano, anq
{

    private final char a;

    public final int a()
    {
        return 1;
    }

    public final int a(anp anp, String s, int i)
    {
        if (i >= s.length())
        {
            return ~i;
        }
        char c1 = s.charAt(i);
        char c = a;
        if (c1 != c)
        {
            c1 = Character.toUpperCase(c1);
            c = Character.toUpperCase(c);
            if (c1 != c && Character.toLowerCase(c1) != Character.toLowerCase(c))
            {
                return ~i;
            }
        }
        return i + 1;
    }

    public final void a(StringBuffer stringbuffer, long l, alr alr, int i, alw alw, Locale locale)
    {
        stringbuffer.append(a);
    }

    public final void a(StringBuffer stringbuffer, alO alo, Locale locale)
    {
        stringbuffer.append(a);
    }

    public final int b()
    {
        return 1;
    }

    (char c)
    {
        a = c;
    }
}

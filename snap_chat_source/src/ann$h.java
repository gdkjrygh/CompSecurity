// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

static final class a
    implements ano, anq
{

    private final String a;

    public final int a()
    {
        return a.length();
    }

    public final int a(anp anp, String s, int i)
    {
        if (s.regionMatches(true, i, a, 0, a.length()))
        {
            return a.length() + i;
        } else
        {
            return ~i;
        }
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
        return a.length();
    }

    (String s)
    {
        a = s;
    }
}

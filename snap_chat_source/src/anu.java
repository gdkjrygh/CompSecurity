// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class anu
{

    final anx a;
    final anw b;
    private final Locale c;
    private final alH d;

    public anu(anx anx, anw anw)
    {
        a = anx;
        b = anw;
        c = null;
        d = null;
    }

    private anu(anx anx, anw anw, Locale locale, alH alh)
    {
        a = anx;
        b = anw;
        c = locale;
        d = alh;
    }

    public final anu a(alH alh)
    {
        if (alh == d)
        {
            return this;
        } else
        {
            return new anu(a, b, c, alh);
        }
    }
}

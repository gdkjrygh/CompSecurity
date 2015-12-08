// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jed
{

    private final npk a;
    private final jdr b;
    private final jdy c;

    public jed(jdy jdy1, npk npk1, jdr jdr1)
    {
        c = jdy1;
        a = npk1;
        b = jdr1;
    }

    public final jea a()
    {
        if (c.a != null)
        {
            return c.a;
        }
        if (c.b != null && (b.b(c.b.b) || a.b()))
        {
            return c.b;
        }
        if (c.c != null && (b.b(c.c.b) || a.a()))
        {
            return c.c;
        } else
        {
            return null;
        }
    }
}

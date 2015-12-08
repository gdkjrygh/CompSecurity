// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecu
{

    public final String a;
    public final String b;

    public ecu(ect ect1)
    {
        a = ect1.b;
        StringBuilder stringbuilder = new StringBuilder();
        if (ect1.d.b())
        {
            stringbuilder.append((String)ect1.d.a());
            if (ect1.c.b())
            {
                stringbuilder.append(" \u2014 ");
            }
        }
        if (ect1.c.b())
        {
            stringbuilder.append((String)ect1.c.a());
        }
        b = stringbuilder.toString();
    }
}

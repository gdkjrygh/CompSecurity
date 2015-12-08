// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecr
{

    public final String a;

    public ecr(ect ect1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(ect1.b);
        if (ect1.d.b())
        {
            stringbuilder.append(" \u2014 ").append((String)ect1.d.a());
        }
        a = stringbuilder.toString();
    }
}

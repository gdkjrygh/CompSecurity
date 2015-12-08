// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class eiv
{

    private flk a;

    eiv(flk flk1)
    {
        a = flk1;
    }

    public final int a(ejm ejm1)
    {
        switch (eiw.a[ejm1.ordinal()])
        {
        default:
            ejm1 = String.valueOf(ejm1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ejm1).length() + 22)).append("Unknown content size: ").append(ejm1).toString());

        case 1: // '\001'
        case 2: // '\002'
            return -1;

        case 3: // '\003'
            return a.c() << 1;

        case 4: // '\004'
            return a.c();
        }
    }
}

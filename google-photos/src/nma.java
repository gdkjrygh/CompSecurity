// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nma
{

    public nma()
    {
    }

    static boolean a(nnb nnb1)
    {
        return nnb1 != nnb.d;
    }

    static int b(nnb nnb1)
    {
        switch (nmb.a[nnb1.ordinal()])
        {
        default:
            nnb1 = String.valueOf(nnb1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(nnb1).length() + 24)).append("unknown storage policy: ").append(nnb1).toString());

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }
}

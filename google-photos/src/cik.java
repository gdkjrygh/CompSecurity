// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cik
{

    private cic a;
    private cic b;

    public cik(cic cic1, cic cic2)
    {
        b.a(cic1, "vertexShaderIdentifier", null);
        b.a(cic2, "fragmentShaderIdentifier", null);
        a = cic1;
        b = cic2;
    }

    public cik(ciq ciq1, chj chj1)
    {
        this(ciq1.a, chj1.a);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cik)
        {
            if (a.equals(((cik) (obj = (cik)obj)).a) && b.equals(((cik) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 ^ b.hashCode();
    }
}

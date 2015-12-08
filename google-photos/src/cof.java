// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cof
{

    public final int a;
    public final cod b;
    public final cml c;

    public cof(cod cod, int i)
    {
        this(cod, null, 3);
    }

    public cof(cod cod, cml cml, int i)
    {
        b = cod;
        c = cml;
        a = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cof))
            {
                return false;
            }
            obj = (cof)obj;
            if (a != ((cof) (obj)).a || !b.e(b, ((cof) (obj)).b) || !b.e(c, ((cof) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(c, b.h(b, a + 527));
    }
}

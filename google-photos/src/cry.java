// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cry
{

    public coa a;
    public int b;
    public int c;

    public cry()
    {
    }

    public cry(cry cry1)
    {
        a = cry1.a;
        b = cry1.b;
        c = cry1.c;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof cry))
            {
                return false;
            }
            obj = (cry)obj;
            if (!b.e(a, ((cry) (obj)).a) || b != ((cry) (obj)).b || c != ((cry) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (b.h(a, 17) * 31 + b) * 31 + c;
    }
}

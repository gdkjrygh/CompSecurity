// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cxf
{

    public final long a;
    public float b;
    public float c;

    public cxf(long l)
    {
        a = b.b(l, "timestampUs");
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cxf))
            {
                return false;
            }
            obj = (cxf)obj;
            if (a != ((cxf) (obj)).a || b != ((cxf) (obj)).b || c != ((cxf) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(a, b.a(b, b.a(c, 17)));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Long.valueOf(a), Float.valueOf(b), Float.valueOf(c)
        });
    }
}

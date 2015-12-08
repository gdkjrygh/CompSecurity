// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class coa
{

    public final cnz a;
    public final boolean b;
    public final long c;

    public coa(coo coo)
    {
        a = (cnz)b.a(coo, "photo", null);
        c = 0L;
        b = true;
    }

    public coa(cqk cqk, long l)
    {
        a = (cnz)b.a(cqk, "video", null);
        c = l;
        b = false;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof coa))
            {
                return false;
            }
            obj = (coa)obj;
            if (c != ((coa) (obj)).c || !b.e(a, ((coa) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(c, b.h(a, 17));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, Long.valueOf(c)
        });
    }
}

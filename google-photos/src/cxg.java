// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cxg
{

    public final long a;
    private float b;
    private float c;
    private float d;

    private cxg(long l, float f, float f1, float f2)
    {
        a = b.b(l, "timestampUs");
        b = f;
        c = f1;
        d = b.a(f2, "zoom");
    }

    public static cxg a(long l, float f, float f1, float f2)
    {
        return new cxg(l, f, f1, f2);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cxg))
            {
                return false;
            }
            obj = (cxg)obj;
            if (a != ((cxg) (obj)).a || b != ((cxg) (obj)).b || c != ((cxg) (obj)).c || d != ((cxg) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(a, b.a(b, b.a(c, b.a(d, 17))));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Long.valueOf(a), Float.valueOf(b), Float.valueOf(c), Float.valueOf(d)
        });
    }
}

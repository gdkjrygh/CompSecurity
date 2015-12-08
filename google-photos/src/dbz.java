// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dbz
{

    public static final dbz a = new dbz(0.0F, 0.0F, 0);
    public final float b;
    public final float c;
    public final int d;

    public dbz(float f, float f1, int i)
    {
        b = f;
        c = f1;
        d = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof dbz))
            {
                return false;
            }
            obj = (dbz)obj;
            if (d != ((dbz) (obj)).d || c != ((dbz) (obj)).c || b != ((dbz) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return d + c.a(b, c.a(c, 17)) * 31;
    }

}

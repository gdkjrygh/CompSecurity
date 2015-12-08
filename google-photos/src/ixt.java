// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ixt
{

    final bz a;
    final int b;

    public ixt(bz bz, int i)
    {
        a = bz;
        b = i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ixt)obj;
            if (b != ((ixt) (obj)).b)
            {
                return false;
            }
            if (!a.equals(((ixt) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31 + b;
    }
}

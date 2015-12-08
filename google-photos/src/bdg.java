// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bdg
{

    int a;
    int b;
    int c;
    int d;

    public bdg()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bdg)obj;
            if (c != ((bdg) (obj)).c)
            {
                return false;
            }
            if (b != ((bdg) (obj)).b)
            {
                return false;
            }
            if (d != ((bdg) (obj)).d)
            {
                return false;
            }
            if (a != ((bdg) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((a * 31 + b) * 31 + c) * 31 + d;
    }
}

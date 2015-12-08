// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;


final class b
{

    public final String a;
    public final boolean b;

    b(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (b != ((b) (obj)).b)
            {
                return false;
            }
            if (a == null ? ((b) (obj)).a != null : !a.equals(((b) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        }
        return i * 31 + j;
    }
}

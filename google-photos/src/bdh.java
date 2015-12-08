// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class bdh
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f[] = {
        255, 255, 255, 255
    };

    public bdh()
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
            obj = (bdh)obj;
            if (b != ((bdh) (obj)).b)
            {
                return false;
            }
            if (d != ((bdh) (obj)).d)
            {
                return false;
            }
            if (c != ((bdh) (obj)).c)
            {
                return false;
            }
            if (e != ((bdh) (obj)).e)
            {
                return false;
            }
            if (a != ((bdh) (obj)).a)
            {
                return false;
            }
            if (!Arrays.equals(f, ((bdh) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = a;
        int k = b;
        int l = c;
        int i1 = d;
        int j1 = e;
        int i;
        if (f != null)
        {
            i = Arrays.hashCode(f);
        } else
        {
            i = 0;
        }
        return i + ((((j * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
    }
}

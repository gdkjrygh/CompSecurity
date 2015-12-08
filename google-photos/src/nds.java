// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DateFormat;
import java.util.Calendar;

public final class nds
    implements Comparable
{

    static Calendar f = Calendar.getInstance();
    public int a;
    public int b;
    public int c;
    long d;
    String e;

    public nds()
    {
    }

    public final int a(nds nds1)
    {
        int i = c - nds1.c;
        if (i == 0)
        {
            int j = a - nds1.a;
            i = j;
            if (j == 0)
            {
                return b - nds1.b;
            }
        }
        return i;
    }

    public final int compareTo(Object obj)
    {
        return a((nds)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof nds))
            {
                return false;
            }
            obj = (nds)obj;
            if (c != ((nds) (obj)).c)
            {
                return false;
            }
            if (a != ((nds) (obj)).a)
            {
                return false;
            }
            if (b != ((nds) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((b + 31) * 31 + a) * 31 + c;
    }

    public final String toString()
    {
        if (e == null)
        {
            e = DateFormat.getDateInstance(3).format(Long.valueOf(d));
        }
        return e;
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class bax
{

    public final long a;
    public final long b;
    public final String c;
    public final String d;
    private int e;

    public bax(String s, String s1, long l, long l1)
    {
        boolean flag;
        if (s != null || s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        c = s;
        d = s1;
        a = l;
        b = l1;
    }

    public final Uri a()
    {
        return Uri.parse(bei.a(c, d));
    }

    public final String b()
    {
        return bei.a(c, d);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (bax)obj;
            if (a != ((bax) (obj)).a || b != ((bax) (obj)).b || !b().equals(((bax) (obj)).b()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (e == 0)
        {
            e = (((int)a + 527) * 31 + (int)b) * 31 + b().hashCode();
        }
        return e;
    }
}

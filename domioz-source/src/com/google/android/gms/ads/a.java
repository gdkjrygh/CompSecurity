// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;


public final class a
{

    public static final a a = new a(320, 50, "320x50_mb");
    public static final a b = new a(468, 60, "468x60_as");
    public static final a c = new a(320, 100, "320x100_as");
    public static final a d = new a(728, 90, "728x90_as");
    public static final a e = new a(300, 250, "300x250_as");
    public static final a f = new a(160, 600, "160x600_as");
    public static final a g = new a(-1, -2, "smart_banner");
    private final int h;
    private final int i;
    private final String j;

    public a(int k, int l)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (k == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(k);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (l == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(l);
        }
        this(k, l, stringbuilder.append(s).append("_as").toString());
    }

    private a(int k, int l, String s)
    {
        if (k < 0 && k != -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(k).toString());
        }
        if (l < 0 && l != -2)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(l).toString());
        } else
        {
            h = k;
            i = l;
            j = s;
            return;
        }
    }

    public final int a()
    {
        return i;
    }

    public final int b()
    {
        return h;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (h != ((a) (obj)).h || i != ((a) (obj)).i || !j.equals(((a) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return j.hashCode();
    }

    public final String toString()
    {
        return j;
    }

}

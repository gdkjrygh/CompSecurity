// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


class aw
{

    public static final aw a = new aw(0, 0, 0, 0);
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public aw(int i, int j, int k, int l)
    {
        b = i;
        c = k;
        d = j;
        e = l;
    }

    public final int a()
    {
        return b;
    }

    public final aw a(float f)
    {
        return new aw((int)((float)b * f), (int)((float)d * f), (int)((float)c * f), (int)((float)e * f));
    }

    public final int b()
    {
        return d;
    }

    public final int c()
    {
        return b + c;
    }

    public final int d()
    {
        return d + e;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && com/microsoft/advertising/android/aw.isAssignableFrom(obj.getClass()))
        {
            obj = (aw)obj;
            if (b == ((aw) (obj)).b && c == ((aw) (obj)).c && d == ((aw) (obj)).d && e == ((aw) (obj)).e)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Integer.valueOf(b << d + 3 << c + 2 << e + 1).hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Margin(");
        stringbuilder.append(b).append(",");
        stringbuilder.append(d).append(",");
        stringbuilder.append(c).append(",");
        stringbuilder.append(e);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

}

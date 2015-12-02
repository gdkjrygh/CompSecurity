// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;


// Referenced classes of package com.facebook.location:
//            Coordinates

public class p
{

    private final double a;
    private final double b;

    private p(double d, double d1)
    {
        a = d;
        b = d1;
    }

    public static p a(Coordinates coordinates)
    {
        return new p(coordinates.b(), coordinates.c());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (p)obj;
            if (Double.compare(((p) (obj)).a, a) != 0)
            {
                return false;
            }
            if (Double.compare(((p) (obj)).b, b) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l1 = 0L;
        int i;
        long l;
        if (a != 0.0D)
        {
            l = Double.doubleToLongBits(a);
        } else
        {
            l = 0L;
        }
        i = (int)(l ^ l >>> 32);
        l = l1;
        if (b != 0.0D)
        {
            l = Double.doubleToLongBits(b);
        }
        return i * 31 + (int)(l ^ l >>> 32);
    }
}

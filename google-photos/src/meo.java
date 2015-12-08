// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class meo
{

    public final double a;
    public final double b;

    public meo(double d, double d1)
    {
        a = d;
        b = d1;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof meo))
            {
                return false;
            }
            obj = (meo)obj;
            if (Double.doubleToLongBits(a) != Double.doubleToLongBits(((meo) (obj)).a) || Double.doubleToLongBits(b) != Double.doubleToLongBits(((meo) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }
}

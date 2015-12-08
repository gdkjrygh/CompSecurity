// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ogr extends msm
{

    public final int b;

    public ogr(msp msp, int i)
    {
        super(msp);
        b = i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            obj = (ogr)obj;
            flag = flag1;
            if (b == ((ogr) (obj)).b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b + super.hashCode() * 31;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ogg extends msm
{

    public final qzb b = new qzb();

    public ogg(msp msp, int i)
    {
        super(msp);
        b.a = i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            flag = flag1;
            if (((ogg)obj).b.a == b.a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b.a + super.hashCode() * 31;
    }
}

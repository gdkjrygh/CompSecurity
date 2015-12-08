// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ogx extends msm
{

    public final long b;

    public ogx(msp msp, long l)
    {
        super(msp);
        b = l;
    }

    public final boolean equals(Object obj)
    {
        if (super.equals(obj))
        {
            obj = (ogx)obj;
            return c.c(Long.valueOf(b), Long.valueOf(((ogx) (obj)).b));
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return c.a(b, super.hashCode());
    }
}

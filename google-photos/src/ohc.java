// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ohc extends msm
{

    public final String b;

    public ohc(msp msp, String s)
    {
        super(msp);
        b = s;
    }

    public final boolean equals(Object obj)
    {
        if (super.equals(obj))
        {
            obj = (ohc)obj;
            return c.c(b, ((ohc) (obj)).b);
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

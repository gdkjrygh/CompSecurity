// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ZD extends ZB
{

    public ZD(afi afi1)
    {
        super(afi1);
    }

    protected final afi b()
    {
        if (super.c)
        {
            return new afl(this);
        }
        if (super.a && super.b > 0)
        {
            return new afj(this, super.b);
        } else
        {
            super.d.b(f());
            return super.d.b();
        }
    }
}

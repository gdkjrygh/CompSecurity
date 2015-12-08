// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class sS
{

    public sS()
    {
    }

    public static sR a(Hb hb)
    {
        if (hb instanceof AT)
        {
            hb = (AT)hb;
            return new sR(hb.I(), hb.h(), hb.ac(), hb.P());
        } else
        {
            throw new RuntimeException(String.format("SnapViewMediaInfoFactory#getMediaInfo called with invalid type [%s]", new Object[] {
                hb.getClass()
            }));
        }
    }
}

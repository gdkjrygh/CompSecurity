// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class blv
    implements bkr
{

    private final blc a;

    public blv(blc blc1)
    {
        a = blc1;
    }

    static bkq a(blc blc1, bjw bjw, bmj bmj1, bkt bkt1)
    {
        bkt1 = bkt1.a();
        if (bkq.isAssignableFrom(bkt1))
        {
            return (bkq)blc1.a(bmj.get(bkt1)).a();
        }
        if (bkr.isAssignableFrom(bkt1))
        {
            return ((bkr)blc1.a(bmj.get(bkt1)).a()).create(bjw, bmj1);
        } else
        {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
    }

    public final bkq create(bjw bjw, bmj bmj1)
    {
        bkt bkt1 = (bkt)bmj1.getRawType().getAnnotation(bkt);
        if (bkt1 == null)
        {
            return null;
        } else
        {
            return a(a, bjw, bmj1, bkt1);
        }
    }
}

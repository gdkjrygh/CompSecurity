// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;


// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e

public final class g extends e
{

    private Double a;

    public g(double d)
    {
        super((short)6);
        a = new Double(d);
    }

    public g(byte abyte0[])
    {
        super((short)6);
        a = new Double(Double.longBitsToDouble((long)(abyte0[7] & 0xff) << 56 | (long)(abyte0[6] & 0xff) << 48 | (long)(abyte0[5] & 0xff) << 40 | (long)(abyte0[4] & 0xff) << 32 | (long)(abyte0[3] & 0xff) << 24 | (long)(abyte0[2] & 0xff) << 16 | (long)(abyte0[1] & 0xff) << 8 | (long)(abyte0[0] & 0xff)));
    }

    public final double a()
    {
        return a.doubleValue();
    }

    public final byte[] b()
    {
        long l = Double.doubleToRawLongBits(a.doubleValue());
        return super.b(new byte[] {
            (byte)(int)l, (byte)(int)(l >>> 8), (byte)(int)(l >>> 16), (byte)(int)(l >>> 24), (byte)(int)(l >>> 32), (byte)(int)(l >>> 40), (byte)(int)(l >>> 48), (byte)(int)(l >>> 56)
        });
    }
}

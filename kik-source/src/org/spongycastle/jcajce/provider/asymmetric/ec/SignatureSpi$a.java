// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import org.spongycastle.jcajce.provider.asymmetric.util.DSAEncoder;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            SignatureSpi

private static final class <init>
    implements DSAEncoder
{

    private static byte[] a(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    public final byte[] a(BigInteger biginteger, BigInteger biginteger1)
    {
        byte abyte0[] = a(biginteger);
        biginteger1 = a(biginteger1);
        if (abyte0.length > biginteger1.length)
        {
            biginteger = new byte[abyte0.length * 2];
        } else
        {
            biginteger = new byte[biginteger1.length * 2];
        }
        System.arraycopy(abyte0, 0, biginteger, biginteger.length / 2 - abyte0.length, abyte0.length);
        System.arraycopy(biginteger1, 0, biginteger, biginteger.length - biginteger1.length, biginteger1.length);
        return biginteger;
    }

    public final BigInteger[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length / 2];
        byte abyte2[] = new byte[abyte0.length / 2];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
        System.arraycopy(abyte0, abyte1.length, abyte2, 0, abyte2.length);
        return (new BigInteger[] {
            new BigInteger(1, abyte1), new BigInteger(1, abyte2)
        });
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}

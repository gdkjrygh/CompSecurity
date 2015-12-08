// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMExponentiator, a

public class Tables1kGCMExponentiator
    implements GCMExponentiator
{

    byte a[][];

    public Tables1kGCMExponentiator()
    {
        a = new byte[64][];
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        byte abyte1[] = org.bouncycastle.crypto.modes.gcm.a.oneAsBytes();
        int i = 1;
        for (; l > 0L; l >>>= 1)
        {
            if ((1L & l) != 0L)
            {
                org.bouncycastle.crypto.modes.gcm.a.multiply(abyte1, a[i]);
            }
            i++;
        }

        System.arraycopy(abyte1, 0, abyte0, 0, 16);
    }

    public void init(byte abyte0[])
    {
        a[0] = new byte[16];
        a[0][0] = -128;
        a[1] = Arrays.c(abyte0);
        for (int i = 2; i != 64; i++)
        {
            abyte0 = Arrays.c(a[i - 1]);
            org.bouncycastle.crypto.modes.gcm.a.multiply(abyte0, abyte0);
            a[i] = abyte0;
        }

    }
}

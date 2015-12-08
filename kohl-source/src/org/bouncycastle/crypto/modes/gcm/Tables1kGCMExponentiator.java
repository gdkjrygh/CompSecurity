// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMExponentiator, GCMUtil

public class Tables1kGCMExponentiator
    implements GCMExponentiator
{

    byte lookupPowX2[][];

    public Tables1kGCMExponentiator()
    {
        lookupPowX2 = new byte[64][];
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        byte abyte1[] = GCMUtil.oneAsBytes();
        int i = 1;
        for (; l > 0L; l >>>= 1)
        {
            if ((1L & l) != 0L)
            {
                GCMUtil.multiply(abyte1, lookupPowX2[i]);
            }
            i++;
        }

        System.arraycopy(abyte1, 0, abyte0, 0, 16);
    }

    public void init(byte abyte0[])
    {
        lookupPowX2[0] = GCMUtil.oneAsBytes();
        lookupPowX2[1] = Arrays.clone(abyte0);
        for (int i = 2; i != 64; i++)
        {
            abyte0 = Arrays.clone(lookupPowX2[i - 1]);
            GCMUtil.multiply(abyte0, abyte0);
            lookupPowX2[i] = abyte0;
        }

    }
}

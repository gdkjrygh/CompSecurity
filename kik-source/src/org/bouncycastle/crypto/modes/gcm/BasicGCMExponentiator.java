// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes.gcm:
//            GCMExponentiator, a

public class BasicGCMExponentiator
    implements GCMExponentiator
{

    private byte a[];

    public BasicGCMExponentiator()
    {
    }

    public void exponentiateX(long l, byte abyte0[])
    {
        byte abyte1[] = org.bouncycastle.crypto.modes.gcm.a.oneAsBytes();
        if (l > 0L)
        {
            byte abyte2[] = Arrays.c(a);
            long l1;
            do
            {
                if ((1L & l) != 0L)
                {
                    org.bouncycastle.crypto.modes.gcm.a.multiply(abyte1, abyte2);
                }
                org.bouncycastle.crypto.modes.gcm.a.multiply(abyte2, abyte2);
                l1 = l >>> 1;
                l = l1;
            } while (l1 > 0L);
        }
        System.arraycopy(abyte1, 0, abyte0, 0, 16);
    }

    public void init(byte abyte0[])
    {
        a = Arrays.c(abyte0);
    }
}

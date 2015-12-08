// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            BlockCipherPadding

public class TBCPadding
    implements BlockCipherPadding
{

    public TBCPadding()
    {
    }

    public final int a(byte abyte0[])
    {
        byte byte0 = abyte0[abyte0.length - 1];
        int i;
        for (i = abyte0.length - 1; i > 0 && abyte0[i - 1] == byte0; i--) { }
        return abyte0.length - i;
    }

    public final int a(byte abyte0[], int i)
    {
        int j = 255;
        int k = abyte0.length;
        byte byte0;
        if (i > 0)
        {
            if ((abyte0[i - 1] & 1) != 0)
            {
                j = 0;
            }
            byte0 = (byte)j;
        } else
        {
            if ((abyte0[abyte0.length - 1] & 1) != 0)
            {
                j = 0;
            }
            byte0 = (byte)j;
            j = i;
        }
        for (j = i; j < abyte0.length; j++)
        {
            abyte0[j] = byte0;
        }

        return k - i;
    }

    public final void a(SecureRandom securerandom)
    {
    }
}

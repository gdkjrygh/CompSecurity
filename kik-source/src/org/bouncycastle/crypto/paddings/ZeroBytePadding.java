// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;

// Referenced classes of package org.bouncycastle.crypto.paddings:
//            BlockCipherPadding

public class ZeroBytePadding
    implements BlockCipherPadding
{

    public ZeroBytePadding()
    {
    }

    public int addPadding(byte abyte0[], int i)
    {
        int k = abyte0.length;
        for (int j = i; j < abyte0.length; j++)
        {
            abyte0[j] = 0;
        }

        return k - i;
    }

    public String getPaddingName()
    {
        return "ZeroByte";
    }

    public void init(SecureRandom securerandom)
    {
    }

    public int padCount(byte abyte0[])
    {
        int i;
        for (i = abyte0.length; i > 0 && abyte0[i - 1] == 0; i--) { }
        return abyte0.length - i;
    }
}

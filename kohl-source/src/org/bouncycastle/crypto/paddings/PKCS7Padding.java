// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.bouncycastle.crypto.paddings:
//            BlockCipherPadding

public class PKCS7Padding
    implements BlockCipherPadding
{

    public PKCS7Padding()
    {
    }

    public int addPadding(byte abyte0[], int i)
    {
        byte byte0 = (byte)(abyte0.length - i);
        for (; i < abyte0.length; i++)
        {
            abyte0[i] = byte0;
        }

        return byte0;
    }

    public String getPaddingName()
    {
        return "PKCS7";
    }

    public void init(SecureRandom securerandom)
        throws IllegalArgumentException
    {
    }

    public int padCount(byte abyte0[])
        throws InvalidCipherTextException
    {
        int j = abyte0[abyte0.length - 1] & 0xff;
        if (j > abyte0.length || j == 0)
        {
            throw new InvalidCipherTextException("pad block corrupted");
        }
        for (int i = 1; i <= j; i++)
        {
            if (abyte0[abyte0.length - i] != j)
            {
                throw new InvalidCipherTextException("pad block corrupted");
            }
        }

        return j;
    }
}

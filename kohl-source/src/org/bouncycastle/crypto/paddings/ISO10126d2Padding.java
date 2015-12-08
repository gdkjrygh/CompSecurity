// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.bouncycastle.crypto.paddings:
//            BlockCipherPadding

public class ISO10126d2Padding
    implements BlockCipherPadding
{

    SecureRandom random;

    public ISO10126d2Padding()
    {
    }

    public int addPadding(byte abyte0[], int i)
    {
        byte byte0 = (byte)(abyte0.length - i);
        for (; i < abyte0.length - 1; i++)
        {
            abyte0[i] = (byte)random.nextInt();
        }

        abyte0[i] = byte0;
        return byte0;
    }

    public String getPaddingName()
    {
        return "ISO10126-2";
    }

    public void init(SecureRandom securerandom)
        throws IllegalArgumentException
    {
        if (securerandom != null)
        {
            random = securerandom;
            return;
        } else
        {
            random = new SecureRandom();
            return;
        }
    }

    public int padCount(byte abyte0[])
        throws InvalidCipherTextException
    {
        int i = abyte0[abyte0.length - 1] & 0xff;
        if (i > abyte0.length)
        {
            throw new InvalidCipherTextException("pad block corrupted");
        } else
        {
            return i;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.bouncycastle.crypto.paddings:
//            BlockCipherPadding

public class X923Padding
    implements BlockCipherPadding
{

    SecureRandom random;

    public X923Padding()
    {
        random = null;
    }

    public int addPadding(byte abyte0[], int i)
    {
        byte byte0 = (byte)(abyte0.length - i);
        while (i < abyte0.length - 1) 
        {
            if (random == null)
            {
                abyte0[i] = 0;
            } else
            {
                abyte0[i] = (byte)random.nextInt();
            }
            i++;
        }
        abyte0[i] = byte0;
        return byte0;
    }

    public String getPaddingName()
    {
        return "X9.23";
    }

    public void init(SecureRandom securerandom)
        throws IllegalArgumentException
    {
        random = securerandom;
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

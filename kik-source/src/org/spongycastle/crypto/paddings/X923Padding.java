// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            BlockCipherPadding

public class X923Padding
    implements BlockCipherPadding
{

    SecureRandom a;

    public X923Padding()
    {
        a = null;
    }

    public final int a(byte abyte0[])
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

    public final int a(byte abyte0[], int i)
    {
        byte byte0 = (byte)(abyte0.length - i);
        while (i < abyte0.length - 1) 
        {
            if (a == null)
            {
                abyte0[i] = 0;
            } else
            {
                abyte0[i] = (byte)a.nextInt();
            }
            i++;
        }
        abyte0[i] = byte0;
        return byte0;
    }

    public final void a(SecureRandom securerandom)
    {
        a = securerandom;
    }
}

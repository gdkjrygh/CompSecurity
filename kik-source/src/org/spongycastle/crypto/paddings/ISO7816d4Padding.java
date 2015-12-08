// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import java.security.SecureRandom;
import org.spongycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            BlockCipherPadding

public class ISO7816d4Padding
    implements BlockCipherPadding
{

    public ISO7816d4Padding()
    {
    }

    public final int a(byte abyte0[])
    {
        int i;
        for (i = abyte0.length - 1; i > 0 && abyte0[i] == 0; i--) { }
        if (abyte0[i] != -128)
        {
            throw new InvalidCipherTextException("pad block corrupted");
        } else
        {
            return abyte0.length - i;
        }
    }

    public final int a(byte abyte0[], int i)
    {
        int k = abyte0.length;
        abyte0[i] = -128;
        for (int j = i + 1; j < abyte0.length; j++)
        {
            abyte0[j] = 0;
        }

        return k - i;
    }

    public final void a(SecureRandom securerandom)
    {
    }
}

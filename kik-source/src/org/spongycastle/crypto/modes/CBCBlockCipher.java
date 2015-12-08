// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

public class CBCBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private BlockCipher e;
    private boolean f;

    public CBCBlockCipher(BlockCipher blockcipher)
    {
        e = null;
        e = blockcipher;
        d = blockcipher.b();
        a = new byte[d];
        b = new byte[d];
        c = new byte[d];
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 0;
        if (f)
        {
            if (d + i > abyte0.length)
            {
                throw new DataLengthException("input buffer too short");
            }
            for (k = 0; k < d; k++)
            {
                byte abyte2[] = b;
                abyte2[k] = (byte)(abyte2[k] ^ abyte0[i + k]);
            }

            i = e.a(b, 0, abyte1, j);
            System.arraycopy(abyte1, j, b, 0, b.length);
            return i;
        }
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(abyte0, i, c, 0, d);
        int i1 = e.a(abyte0, i, abyte1, j);
        for (i = k; i < d; i++)
        {
            int l = j + i;
            abyte1[l] = (byte)(abyte1[l] ^ b[i]);
        }

        abyte0 = b;
        b = c;
        c = abyte0;
        return i1;
    }

    public final String a()
    {
        return (new StringBuilder()).append(e.a()).append("/CBC").toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        boolean flag1;
        flag1 = f;
        f = flag;
        if (!(cipherparameters instanceof ParametersWithIV)) goto _L2; else goto _L1
_L1:
        cipherparameters = (ParametersWithIV)cipherparameters;
        byte abyte0[] = cipherparameters.a();
        if (abyte0.length != d)
        {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(abyte0, 0, a, 0, abyte0.length);
        c();
        if (cipherparameters.b() == null) goto _L4; else goto _L3
_L3:
        e.a(flag, cipherparameters.b());
_L6:
        return;
_L4:
        if (flag1 != flag)
        {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        c();
        if (cipherparameters != null)
        {
            e.a(flag, cipherparameters);
            return;
        }
        if (flag1 != flag)
        {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int b()
    {
        return e.b();
    }

    public final void c()
    {
        System.arraycopy(a, 0, b, 0, a.length);
        Arrays.a(c, (byte)0);
        e.c();
    }

    public final BlockCipher d()
    {
        return e;
    }
}

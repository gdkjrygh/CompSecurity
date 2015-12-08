// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;

public class RFC3211WrapEngine
    implements Wrapper
{

    private CBCBlockCipher a;
    private ParametersWithIV b;
    private boolean c;
    private SecureRandom d;

    public RFC3211WrapEngine(BlockCipher blockcipher)
    {
        a = new CBCBlockCipher(blockcipher);
    }

    public final String a()
    {
        return (new StringBuilder()).append(a.d().a()).append("/RFC3211Wrap").toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            d = cipherparameters.a();
            b = (ParametersWithIV)cipherparameters.b();
            return;
        }
        if (flag)
        {
            d = new SecureRandom();
        }
        b = (ParametersWithIV)cipherparameters;
    }

    public final byte[] a(byte abyte0[], int i)
    {
        boolean flag = false;
        if (!c)
        {
            throw new IllegalStateException("not set for wrapping");
        }
        a.a(true, b);
        int k = a.b();
        byte abyte1[];
        int j;
        if (i + 4 < k * 2)
        {
            j = k * 2;
        } else
        if ((i + 4) % k == 0)
        {
            j = i + 4;
        } else
        {
            j = ((i + 4) / k + 1) * k;
        }
        abyte1 = new byte[j];
        abyte1[0] = (byte)i;
        abyte1[1] = (byte)(~abyte0[0]);
        abyte1[2] = (byte)(~abyte0[1]);
        abyte1[3] = (byte)(~abyte0[2]);
        System.arraycopy(abyte0, 0, abyte1, 4, i);
        for (i += 4; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)d.nextInt();
        }

        i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= abyte1.length)
            {
                break;
            }
            a.a(abyte1, i, abyte1, i);
            i += k;
        } while (true);
        for (; j < abyte1.length; j += k)
        {
            a.a(abyte1, j, abyte1, j);
        }

        return abyte1;
    }

    public final byte[] b(byte abyte0[], int i)
    {
        int j = 0;
        if (c)
        {
            throw new IllegalStateException("not set for unwrapping");
        }
        int k = a.b();
        if (i < k * 2)
        {
            throw new InvalidCipherTextException("input too short");
        }
        byte abyte1[] = new byte[i];
        byte abyte2[] = new byte[k];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        System.arraycopy(abyte0, 0, abyte2, 0, abyte2.length);
        a.a(false, new ParametersWithIV(b.b(), abyte2));
        for (i = k; i < abyte1.length; i += k)
        {
            a.a(abyte1, i, abyte1, i);
        }

        System.arraycopy(abyte1, abyte1.length - abyte2.length, abyte2, 0, abyte2.length);
        a.a(false, new ParametersWithIV(b.b(), abyte2));
        a.a(abyte1, 0, abyte1, 0);
        a.a(false, b);
        for (i = 0; i < abyte1.length; i += k)
        {
            a.a(abyte1, i, abyte1, i);
        }

        if ((abyte1[0] & 0xff) > abyte1.length - 4)
        {
            throw new InvalidCipherTextException("wrapped key corrupted");
        }
        abyte0 = new byte[abyte1[0] & 0xff];
        System.arraycopy(abyte1, 4, abyte0, 0, abyte1[0]);
        for (i = 0; i != 3; i++)
        {
            j |= (byte)(~abyte1[i + 1]) ^ abyte0[i];
        }

        if (j != 0)
        {
            throw new InvalidCipherTextException("wrapped key fails checksum");
        } else
        {
            return abyte0;
        }
    }
}

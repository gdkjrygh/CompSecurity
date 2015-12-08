// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

// Referenced classes of package org.bouncycastle.crypto.engines:
//            DESEngine

public class DESedeEngine extends DESEngine
{

    private int a[];
    private int b[];
    private int c[];
    private boolean d;

    public DESedeEngine()
    {
        a = null;
        b = null;
        c = null;
    }

    public String getAlgorithmName()
    {
        return "DESede";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to DESede init - ")).append(cipherparameters.getClass().getName()).toString());
        }
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        if (cipherparameters.length > 24)
        {
            throw new IllegalArgumentException("key size greater than 24 bytes");
        }
        d = flag;
        byte abyte0[] = new byte[8];
        System.arraycopy(cipherparameters, 0, abyte0, 0, 8);
        a = generateWorkingKey(flag, abyte0);
        abyte0 = new byte[8];
        System.arraycopy(cipherparameters, 8, abyte0, 0, 8);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = generateWorkingKey(flag1, abyte0);
        if (cipherparameters.length == 24)
        {
            byte abyte1[] = new byte[8];
            System.arraycopy(cipherparameters, 16, abyte1, 0, 8);
            c = generateWorkingKey(flag, abyte1);
            return;
        } else
        {
            c = a;
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (a == null)
        {
            throw new IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        byte abyte2[] = new byte[8];
        if (d)
        {
            desFunc(a, abyte0, i, abyte2, 0);
            desFunc(b, abyte2, 0, abyte2, 0);
            desFunc(c, abyte2, 0, abyte1, j);
            return 8;
        } else
        {
            desFunc(c, abyte0, i, abyte2, 0);
            desFunc(b, abyte2, 0, abyte2, 0);
            desFunc(a, abyte2, 0, abyte1, j);
            return 8;
        }
    }

    public void reset()
    {
    }
}

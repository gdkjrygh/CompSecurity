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

    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int workingKey1[];
    private int workingKey2[];
    private int workingKey3[];

    public DESedeEngine()
    {
        workingKey1 = null;
        workingKey2 = null;
        workingKey3 = null;
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
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to DESede init - ").append(cipherparameters.getClass().getName()).toString());
        }
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        if (cipherparameters.length != 24 && cipherparameters.length != 16)
        {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        forEncryption = flag;
        byte abyte0[] = new byte[8];
        System.arraycopy(cipherparameters, 0, abyte0, 0, abyte0.length);
        workingKey1 = generateWorkingKey(flag, abyte0);
        abyte0 = new byte[8];
        System.arraycopy(cipherparameters, 8, abyte0, 0, abyte0.length);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        workingKey2 = generateWorkingKey(flag1, abyte0);
        if (cipherparameters.length == 24)
        {
            byte abyte1[] = new byte[8];
            System.arraycopy(cipherparameters, 16, abyte1, 0, abyte1.length);
            workingKey3 = generateWorkingKey(flag, abyte1);
            return;
        } else
        {
            workingKey3 = workingKey1;
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (workingKey1 == null)
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
        if (forEncryption)
        {
            desFunc(workingKey1, abyte0, i, abyte2, 0);
            desFunc(workingKey2, abyte2, 0, abyte2, 0);
            desFunc(workingKey3, abyte2, 0, abyte1, j);
            return 8;
        } else
        {
            desFunc(workingKey3, abyte0, i, abyte2, 0);
            desFunc(workingKey2, abyte2, 0, abyte2, 0);
            desFunc(workingKey1, abyte2, 0, abyte1, j);
            return 8;
        }
    }

    public void reset()
    {
    }
}

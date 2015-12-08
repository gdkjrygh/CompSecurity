// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class ISAACEngine
    implements StreamCipher
{

    private int a;
    private int b;
    private int c;
    private int engineState[];
    private int index;
    private boolean initialised;
    private byte keyStream[];
    private int results[];
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private byte workingKey[];

    public ISAACEngine()
    {
        engineState = null;
        results = null;
        a = 0;
        b = 0;
        c = 0;
        index = 0;
        keyStream = new byte[1024];
        workingKey = null;
        initialised = false;
    }

    private int byteToIntLittle(byte abyte0[], int i)
    {
        int k = i + 1;
        i = abyte0[i];
        int j = k + 1;
        k = abyte0[k];
        int l = j + 1;
        return (k & 0xff) << 8 | i & 0xff | (abyte0[j] & 0xff) << 16 | abyte0[l] << 24;
    }

    private byte[] intToByteLittle(int i)
    {
        byte byte0 = (byte)i;
        byte byte1 = (byte)(i >>> 8);
        byte byte2 = (byte)(i >>> 16);
        return (new byte[] {
            (byte)(i >>> 24), byte2, byte1, byte0
        });
    }

    private byte[] intToByteLittle(int ai[])
    {
        byte abyte0[] = new byte[ai.length * 4];
        int i = 0;
        for (int j = 0; j < ai.length;)
        {
            System.arraycopy(intToByteLittle(ai[j]), 0, abyte0, i, 4);
            j++;
            i += 4;
        }

        return abyte0;
    }

    private void isaac()
    {
        int i;
        i = b;
        int j = c + 1;
        c = j;
        b = i + j;
        i = 0;
_L7:
        int k;
        if (i >= 256)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        k = engineState[i];
        i & 3;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 167
    //                   1 186
    //                   2 205
    //                   3 223;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_223;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        a = a + engineState[i + 128 & 0xff];
        int ai[] = engineState;
        int l = engineState[k >>> 2 & 0xff] + a + b;
        ai[i] = l;
        ai = results;
        k += engineState[l >>> 10 & 0xff];
        b = k;
        ai[i] = k;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        a = a ^ a << 13;
          goto _L8
_L3:
        a = a ^ a >>> 6;
          goto _L8
_L4:
        a = a ^ a << 2;
          goto _L8
        a = a ^ a >>> 16;
          goto _L8
    }

    private void mix(int ai[])
    {
        ai[0] = ai[0] ^ ai[1] << 11;
        ai[3] = ai[3] + ai[0];
        ai[1] = ai[1] + ai[2];
        ai[1] = ai[1] ^ ai[2] >>> 2;
        ai[4] = ai[4] + ai[1];
        ai[2] = ai[2] + ai[3];
        ai[2] = ai[2] ^ ai[3] << 8;
        ai[5] = ai[5] + ai[2];
        ai[3] = ai[3] + ai[4];
        ai[3] = ai[3] ^ ai[4] >>> 16;
        ai[6] = ai[6] + ai[3];
        ai[4] = ai[4] + ai[5];
        ai[4] = ai[4] ^ ai[5] << 10;
        ai[7] = ai[7] + ai[4];
        ai[5] = ai[5] + ai[6];
        ai[5] = ai[5] ^ ai[6] >>> 4;
        ai[0] = ai[0] + ai[5];
        ai[6] = ai[6] + ai[7];
        ai[6] = ai[6] ^ ai[7] << 8;
        ai[1] = ai[1] + ai[6];
        ai[7] = ai[7] + ai[0];
        ai[7] = ai[7] ^ ai[0] >>> 9;
        ai[2] = ai[2] + ai[7];
        ai[0] = ai[0] + ai[1];
    }

    private void setKey(byte abyte0[])
    {
        workingKey = abyte0;
        if (engineState == null)
        {
            engineState = new int[256];
        }
        if (results == null)
        {
            results = new int[256];
        }
        for (int i = 0; i < 256; i++)
        {
            int ai[] = engineState;
            results[i] = 0;
            ai[i] = 0;
        }

        c = 0;
        b = 0;
        a = 0;
        index = 0;
        byte abyte1[] = new byte[abyte0.length + (abyte0.length & 3)];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        for (int j = 0; j < abyte1.length; j += 4)
        {
            results[j >> 2] = byteToIntLittle(abyte1, j);
        }

        abyte0 = new int[8];
        for (int k = 0; k < 8; k++)
        {
            abyte0[k] = 0x9e3779b9;
        }

        for (int l = 0; l < 4; l++)
        {
            mix(abyte0);
        }

        for (int i1 = 0; i1 < 2; i1++)
        {
            for (int j1 = 0; j1 < 256; j1 += 8)
            {
                int k1 = 0;
                while (k1 < 8) 
                {
                    byte byte0 = abyte0[k1];
                    int i2;
                    if (i1 < 1)
                    {
                        i2 = results[j1 + k1];
                    } else
                    {
                        i2 = engineState[j1 + k1];
                    }
                    abyte0[k1] = i2 + byte0;
                    k1++;
                }
                mix(abyte0);
                for (int l1 = 0; l1 < 8; l1++)
                {
                    engineState[j1 + l1] = abyte0[l1];
                }

            }

        }

        isaac();
        initialised = true;
    }

    public String getAlgorithmName()
    {
        return "ISAAC";
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to ISAAC init - ").append(cipherparameters.getClass().getName()).toString());
        } else
        {
            setKey(((KeyParameter)cipherparameters).getKey());
            return;
        }
    }

    public void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (!initialised)
        {
            throw new IllegalStateException((new StringBuilder()).append(getAlgorithmName()).append(" not initialised").toString());
        }
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            if (index == 0)
            {
                isaac();
                keyStream = intToByteLittle(results);
            }
            abyte1[l + k] = (byte)(keyStream[index] ^ abyte0[l + i]);
            index = index + 1 & 0x3ff;
        }

    }

    public void reset()
    {
        setKey(workingKey);
    }

    public byte returnByte(byte byte0)
    {
        if (index == 0)
        {
            isaac();
            keyStream = intToByteLittle(results);
        }
        byte byte1 = (byte)(keyStream[index] ^ byte0);
        index = index + 1 & 0x3ff;
        return byte1;
    }
}

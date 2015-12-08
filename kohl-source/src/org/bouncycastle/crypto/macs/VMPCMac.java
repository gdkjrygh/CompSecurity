// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class VMPCMac
    implements Mac
{

    private byte P[];
    private byte T[];
    private byte g;
    private byte n;
    private byte s;
    private byte workingIV[];
    private byte workingKey[];
    private byte x1;
    private byte x2;
    private byte x3;
    private byte x4;

    public VMPCMac()
    {
        n = 0;
        P = null;
        s = 0;
    }

    private void initKey(byte abyte0[], byte abyte1[])
    {
        s = 0;
        P = new byte[256];
        for (int i = 0; i < 256; i++)
        {
            P[i] = (byte)i;
        }

        for (int j = 0; j < 768; j++)
        {
            s = P[s + P[j & 0xff] + abyte0[j % abyte0.length] & 0xff];
            byte byte0 = P[j & 0xff];
            P[j & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
        }

        for (int k = 0; k < 768; k++)
        {
            s = P[s + P[k & 0xff] + abyte1[k % abyte1.length] & 0xff];
            byte byte1 = P[k & 0xff];
            P[k & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte1;
        }

        n = 0;
    }

    public int doFinal(byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        for (int j = 1; j < 25; j++)
        {
            s = P[s + P[n & 0xff] & 0xff];
            x4 = P[x4 + x3 + j & 0xff];
            x3 = P[x3 + x2 + j & 0xff];
            x2 = P[x2 + x1 + j & 0xff];
            x1 = P[x1 + s + j & 0xff];
            T[g & 0x1f] = (byte)(T[g & 0x1f] ^ x1);
            T[g + 1 & 0x1f] = (byte)(T[g + 1 & 0x1f] ^ x2);
            T[g + 2 & 0x1f] = (byte)(T[g + 2 & 0x1f] ^ x3);
            T[g + 3 & 0x1f] = (byte)(T[g + 3 & 0x1f] ^ x4);
            g = (byte)(g + 4 & 0x1f);
            byte byte0 = P[n & 0xff];
            P[n & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte0;
            n = (byte)(n + 1 & 0xff);
        }

        for (int k = 0; k < 768; k++)
        {
            s = P[s + P[k & 0xff] + T[k & 0x1f] & 0xff];
            byte byte1 = P[k & 0xff];
            P[k & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte1;
        }

        byte abyte1[] = new byte[20];
        for (int l = 0; l < 20; l++)
        {
            s = P[s + P[l & 0xff] & 0xff];
            abyte1[l] = P[P[P[s & 0xff] & 0xff] + 1 & 0xff];
            byte byte2 = P[l & 0xff];
            P[l & 0xff] = P[s & 0xff];
            P[s & 0xff] = byte2;
        }

        System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        reset();
        return abyte1.length;
    }

    public String getAlgorithmName()
    {
        return "VMPC-MAC";
    }

    public int getMacSize()
    {
        return 20;
    }

    public void init(CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (!(cipherparameters instanceof ParametersWithIV))
        {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        cipherparameters = (ParametersWithIV)cipherparameters;
        KeyParameter keyparameter = (KeyParameter)cipherparameters.getParameters();
        if (!(cipherparameters.getParameters() instanceof KeyParameter))
        {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        workingIV = cipherparameters.getIV();
        if (workingIV == null || workingIV.length < 1 || workingIV.length > 768)
        {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        } else
        {
            workingKey = keyparameter.getKey();
            reset();
            return;
        }
    }

    public void reset()
    {
        initKey(workingKey, workingIV);
        n = 0;
        x4 = 0;
        x3 = 0;
        x2 = 0;
        x1 = 0;
        g = 0;
        T = new byte[32];
        for (int i = 0; i < 32; i++)
        {
            T[i] = 0;
        }

    }

    public void update(byte byte0)
        throws IllegalStateException
    {
        s = P[s + P[n & 0xff] & 0xff];
        byte0 = (byte)(P[P[P[s & 0xff] & 0xff] + 1 & 0xff] ^ byte0);
        x4 = P[x4 + x3 & 0xff];
        x3 = P[x3 + x2 & 0xff];
        x2 = P[x2 + x1 & 0xff];
        x1 = P[byte0 + (x1 + s) & 0xff];
        T[g & 0x1f] = (byte)(T[g & 0x1f] ^ x1);
        T[g + 1 & 0x1f] = (byte)(T[g + 1 & 0x1f] ^ x2);
        T[g + 2 & 0x1f] = (byte)(T[g + 2 & 0x1f] ^ x3);
        T[g + 3 & 0x1f] = (byte)(T[g + 3 & 0x1f] ^ x4);
        g = (byte)(g + 4 & 0x1f);
        byte byte1 = P[n & 0xff];
        P[n & 0xff] = P[s & 0xff];
        P[s & 0xff] = byte1;
        n = (byte)(n + 1 & 0xff);
    }

    public void update(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalStateException
    {
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        for (i = 0; i < j; i++)
        {
            update(abyte0[i]);
        }

    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

public class OldHMac
    implements Mac
{

    private static final int BLOCK_LENGTH = 64;
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private Digest digest;
    private int digestSize;
    private byte inputPad[];
    private byte outputPad[];

    public OldHMac(Digest digest1)
    {
        inputPad = new byte[64];
        outputPad = new byte[64];
        digest = digest1;
        digestSize = digest1.getDigestSize();
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[digestSize];
        digest.doFinal(abyte1, 0);
        digest.update(outputPad, 0, outputPad.length);
        digest.update(abyte1, 0, abyte1.length);
        i = digest.doFinal(abyte0, i);
        reset();
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(digest.getAlgorithmName()).append("/HMAC").toString();
    }

    public int getMacSize()
    {
        return digestSize;
    }

    public Digest getUnderlyingDigest()
    {
        return digest;
    }

    public void init(CipherParameters cipherparameters)
    {
        digest.reset();
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        if (cipherparameters.length > 64)
        {
            digest.update(cipherparameters, 0, cipherparameters.length);
            digest.doFinal(inputPad, 0);
            for (int i = digestSize; i < inputPad.length; i++)
            {
                inputPad[i] = 0;
            }

        } else
        {
            System.arraycopy(cipherparameters, 0, inputPad, 0, cipherparameters.length);
            for (int j = cipherparameters.length; j < inputPad.length; j++)
            {
                inputPad[j] = 0;
            }

        }
        outputPad = new byte[inputPad.length];
        System.arraycopy(inputPad, 0, outputPad, 0, inputPad.length);
        for (int k = 0; k < inputPad.length; k++)
        {
            cipherparameters = inputPad;
            cipherparameters[k] = (byte)(cipherparameters[k] ^ 0x36);
        }

        for (int l = 0; l < outputPad.length; l++)
        {
            cipherparameters = outputPad;
            cipherparameters[l] = (byte)(cipherparameters[l] ^ 0x5c);
        }

        digest.update(inputPad, 0, inputPad.length);
    }

    public void reset()
    {
        digest.reset();
        digest.update(inputPad, 0, inputPad.length);
    }

    public void update(byte byte0)
    {
        digest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }
}

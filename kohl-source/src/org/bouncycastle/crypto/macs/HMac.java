// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import java.util.Hashtable;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

public class HMac
    implements Mac
{

    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private static Hashtable blockLengths;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte inputPad[];
    private byte outputPad[];

    public HMac(Digest digest1)
    {
        this(digest1, getByteLength(digest1));
    }

    private HMac(Digest digest1, int i)
    {
        digest = digest1;
        digestSize = digest1.getDigestSize();
        blockLength = i;
        inputPad = new byte[blockLength];
        outputPad = new byte[blockLength];
    }

    private static int getByteLength(Digest digest1)
    {
        if (digest1 instanceof ExtendedDigest)
        {
            return ((ExtendedDigest)digest1).getByteLength();
        }
        Integer integer = (Integer)blockLengths.get(digest1.getAlgorithmName());
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown digest passed: ").append(digest1.getAlgorithmName()).toString());
        } else
        {
            return integer.intValue();
        }
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
        if (cipherparameters.length > blockLength)
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

    static 
    {
        blockLengths = new Hashtable();
        blockLengths.put("GOST3411", new Integer(32));
        blockLengths.put("MD2", new Integer(16));
        blockLengths.put("MD4", new Integer(64));
        blockLengths.put("MD5", new Integer(64));
        blockLengths.put("RIPEMD128", new Integer(64));
        blockLengths.put("RIPEMD160", new Integer(64));
        blockLengths.put("SHA-1", new Integer(64));
        blockLengths.put("SHA-224", new Integer(64));
        blockLengths.put("SHA-256", new Integer(64));
        blockLengths.put("SHA-384", new Integer(128));
        blockLengths.put("SHA-512", new Integer(128));
        blockLengths.put("Tiger", new Integer(64));
        blockLengths.put("Whirlpool", new Integer(64));
    }
}

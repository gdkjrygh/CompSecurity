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

    private static Hashtable f;
    private Digest a;
    private int b;
    private int c;
    private byte d[];
    private byte e[];

    public HMac(Digest digest)
    {
        this(digest, getByteLength(digest));
    }

    private HMac(Digest digest, int i)
    {
        a = digest;
        b = digest.getDigestSize();
        c = i;
        d = new byte[c];
        e = new byte[c];
    }

    private static int getByteLength(Digest digest)
    {
        if (digest instanceof ExtendedDigest)
        {
            return ((ExtendedDigest)digest).getByteLength();
        }
        Integer integer = (Integer)f.get(digest.getAlgorithmName());
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder("unknown digest passed: ")).append(digest.getAlgorithmName()).toString());
        } else
        {
            return integer.intValue();
        }
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[b];
        a.doFinal(abyte1, 0);
        a.update(e, 0, e.length);
        a.update(abyte1, 0, abyte1.length);
        i = a.doFinal(abyte0, i);
        reset();
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append("/HMAC").toString();
    }

    public int getMacSize()
    {
        return b;
    }

    public Digest getUnderlyingDigest()
    {
        return a;
    }

    public void init(CipherParameters cipherparameters)
    {
        a.reset();
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        if (cipherparameters.length > c)
        {
            a.update(cipherparameters, 0, cipherparameters.length);
            a.doFinal(d, 0);
            for (int i = b; i < d.length; i++)
            {
                d[i] = 0;
            }

        } else
        {
            System.arraycopy(cipherparameters, 0, d, 0, cipherparameters.length);
            for (int j = cipherparameters.length; j < d.length; j++)
            {
                d[j] = 0;
            }

        }
        e = new byte[d.length];
        System.arraycopy(d, 0, e, 0, d.length);
        for (int k = 0; k < d.length; k++)
        {
            cipherparameters = d;
            cipherparameters[k] = (byte)(cipherparameters[k] ^ 0x36);
        }

        for (int l = 0; l < e.length; l++)
        {
            cipherparameters = e;
            cipherparameters[l] = (byte)(cipherparameters[l] ^ 0x5c);
        }

        a.update(d, 0, d.length);
    }

    public void reset()
    {
        a.reset();
        a.update(d, 0, d.length);
    }

    public void update(byte byte0)
    {
        a.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        f = hashtable;
        hashtable.put("GOST3411", new Integer(32));
        f.put("MD2", new Integer(16));
        f.put("MD4", new Integer(64));
        f.put("MD5", new Integer(64));
        f.put("RIPEMD128", new Integer(64));
        f.put("RIPEMD160", new Integer(64));
        f.put("SHA-1", new Integer(64));
        f.put("SHA-224", new Integer(64));
        f.put("SHA-256", new Integer(64));
        f.put("SHA-384", new Integer(128));
        f.put("SHA-512", new Integer(128));
        f.put("Tiger", new Integer(64));
        f.put("Whirlpool", new Integer(64));
    }
}

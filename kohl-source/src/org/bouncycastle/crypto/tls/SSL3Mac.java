// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class SSL3Mac
    implements Mac
{

    private static final byte IPAD = 54;
    static final byte MD5_IPAD[] = genPad((byte)54, 48);
    static final byte MD5_OPAD[] = genPad((byte)92, 48);
    private static final byte OPAD = 92;
    static final byte SHA1_IPAD[] = genPad((byte)54, 40);
    static final byte SHA1_OPAD[] = genPad((byte)92, 40);
    private Digest digest;
    private byte ipad[];
    private byte opad[];
    private byte secret[];

    public SSL3Mac(Digest digest1)
    {
        digest = digest1;
        if (digest1.getDigestSize() == 20)
        {
            ipad = SHA1_IPAD;
            opad = SHA1_OPAD;
            return;
        } else
        {
            ipad = MD5_IPAD;
            opad = MD5_OPAD;
            return;
        }
    }

    private static byte[] genPad(byte byte0, int i)
    {
        byte abyte0[] = new byte[i];
        Arrays.fill(abyte0, byte0);
        return abyte0;
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        digest.update(secret, 0, secret.length);
        digest.update(opad, 0, opad.length);
        digest.update(abyte1, 0, abyte1.length);
        i = digest.doFinal(abyte0, i);
        reset();
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(digest.getAlgorithmName()).append("/SSL3MAC").toString();
    }

    public int getMacSize()
    {
        return digest.getDigestSize();
    }

    public Digest getUnderlyingDigest()
    {
        return digest;
    }

    public void init(CipherParameters cipherparameters)
    {
        secret = Arrays.clone(((KeyParameter)cipherparameters).getKey());
        reset();
    }

    public void reset()
    {
        digest.reset();
        digest.update(secret, 0, secret.length);
        digest.update(ipad, 0, ipad.length);
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

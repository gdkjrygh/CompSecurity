// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.ISO9797Alg3Mac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            PBE, BCPBEKey

public class BaseMac extends MacSpi
    implements PBE
{
    public static class DES extends BaseMac
    {

        public DES()
        {
            super(new CBCBlockCipherMac(new DESEngine()));
        }
    }

    public static class DES64 extends BaseMac
    {

        public DES64()
        {
            super(new CBCBlockCipherMac(new DESEngine(), 64));
        }
    }

    public static class DES9797Alg3 extends BaseMac
    {

        public DES9797Alg3()
        {
            super(new ISO9797Alg3Mac(new DESEngine()));
        }
    }

    public static class DES9797Alg3with7816d4 extends BaseMac
    {

        public DES9797Alg3with7816d4()
        {
            super(new ISO9797Alg3Mac(new DESEngine(), new ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends BaseMac
    {

        public DESCFB8()
        {
            super(new CFBBlockCipherMac(new DESEngine()));
        }
    }

    public static class GOST28147 extends BaseMac
    {

        public GOST28147()
        {
            super(new GOST28147Mac());
        }
    }

    public static class MD2 extends BaseMac
    {

        public MD2()
        {
            super(new HMac(new MD2Digest()));
        }
    }

    public static class MD4 extends BaseMac
    {

        public MD4()
        {
            super(new HMac(new MD4Digest()));
        }
    }

    public static class MD5 extends BaseMac
    {

        public MD5()
        {
            super(new HMac(new MD5Digest()));
        }
    }

    public static class OldSHA384 extends BaseMac
    {

        public OldSHA384()
        {
            super(new OldHMac(new SHA384Digest()));
        }
    }

    public static class OldSHA512 extends BaseMac
    {

        public OldSHA512()
        {
            super(new OldHMac(new SHA512Digest()));
        }
    }

    public static class PBEWithRIPEMD160 extends BaseMac
    {

        public PBEWithRIPEMD160()
        {
            super(new HMac(new RIPEMD160Digest()), 2, 2, 160);
        }
    }

    public static class PBEWithSHA extends BaseMac
    {

        public PBEWithSHA()
        {
            super(new HMac(new SHA1Digest()), 2, 1, 160);
        }
    }

    public static class PBEWithTiger extends BaseMac
    {

        public PBEWithTiger()
        {
            super(new HMac(new TigerDigest()), 2, 3, 192);
        }
    }

    public static class RC2 extends BaseMac
    {

        public RC2()
        {
            super(new CBCBlockCipherMac(new RC2Engine()));
        }
    }

    public static class RC2CFB8 extends BaseMac
    {

        public RC2CFB8()
        {
            super(new CFBBlockCipherMac(new RC2Engine()));
        }
    }

    public static class RIPEMD128 extends BaseMac
    {

        public RIPEMD128()
        {
            super(new HMac(new RIPEMD128Digest()));
        }
    }

    public static class RIPEMD160 extends BaseMac
    {

        public RIPEMD160()
        {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class SHA1 extends BaseMac
    {

        public SHA1()
        {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class SHA224 extends BaseMac
    {

        public SHA224()
        {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class SHA256 extends BaseMac
    {

        public SHA256()
        {
            super(new HMac(new SHA256Digest()));
        }
    }

    public static class SHA384 extends BaseMac
    {

        public SHA384()
        {
            super(new HMac(new SHA384Digest()));
        }
    }

    public static class SHA512 extends BaseMac
    {

        public SHA512()
        {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class Tiger extends BaseMac
    {

        public Tiger()
        {
            super(new HMac(new TigerDigest()));
        }
    }


    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int pbeType;

    protected BaseMac(Mac mac)
    {
        pbeType = 2;
        pbeHash = 1;
        keySize = 160;
        macEngine = mac;
    }

    protected BaseMac(Mac mac, int i, int j, int k)
    {
        pbeType = 2;
        pbeHash = 1;
        keySize = 160;
        macEngine = mac;
        pbeType = i;
        pbeHash = j;
        keySize = k;
    }

    protected byte[] engineDoFinal()
    {
        byte abyte0[] = new byte[engineGetMacLength()];
        macEngine.doFinal(abyte0, 0);
        return abyte0;
    }

    protected int engineGetMacLength()
    {
        return macEngine.getMacSize();
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        if (key == null)
        {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof BCPBEKey)
        {
            key = (BCPBEKey)key;
            if (key.getParam() != null)
            {
                key = key.getParam();
            } else
            if (algorithmparameterspec instanceof PBEParameterSpec)
            {
                key = PBE.Util.makePBEMacParameters(key, algorithmparameterspec);
            } else
            {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
        } else
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            key = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec)algorithmparameterspec).getIV());
        } else
        if (algorithmparameterspec == null)
        {
            key = new KeyParameter(key.getEncoded());
        } else
        {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        macEngine.init(key);
    }

    protected void engineReset()
    {
        macEngine.reset();
    }

    protected void engineUpdate(byte byte0)
    {
        macEngine.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        macEngine.update(abyte0, i, j);
    }
}

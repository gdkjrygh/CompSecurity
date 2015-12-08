// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.digests.MD2Digest;
import org.spongycastle.crypto.digests.MD4Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD128Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.digests.TigerDigest;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.RC2Engine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.macs.CFBBlockCipherMac;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.macs.ISO9797Alg3Mac;
import org.spongycastle.crypto.macs.OldHMac;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;

public class JCEMac extends MacSpi
    implements PBE
{
    public static class DES extends JCEMac
    {

        public DES()
        {
            super(new CBCBlockCipherMac(new DESEngine()));
        }
    }

    public static class DES64 extends JCEMac
    {

        public DES64()
        {
            super(new CBCBlockCipherMac(new DESEngine(), 64));
        }
    }

    public static class DES9797Alg3 extends JCEMac
    {

        public DES9797Alg3()
        {
            super(new ISO9797Alg3Mac(new DESEngine()));
        }
    }

    public static class DES9797Alg3with7816d4 extends JCEMac
    {

        public DES9797Alg3with7816d4()
        {
            super(new ISO9797Alg3Mac(new DESEngine(), new ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends JCEMac
    {

        public DESCFB8()
        {
            super(new CFBBlockCipherMac(new DESEngine()));
        }
    }

    public static class MD2 extends JCEMac
    {

        public MD2()
        {
            super(new HMac(new MD2Digest()));
        }
    }

    public static class MD4 extends JCEMac
    {

        public MD4()
        {
            super(new HMac(new MD4Digest()));
        }
    }

    public static class MD5 extends JCEMac
    {

        public MD5()
        {
            super(new HMac(new MD5Digest()));
        }
    }

    public static class OldSHA384 extends JCEMac
    {

        public OldSHA384()
        {
            super(new OldHMac(new SHA384Digest()));
        }
    }

    public static class OldSHA512 extends JCEMac
    {

        public OldSHA512()
        {
            super(new OldHMac(new SHA512Digest()));
        }
    }

    public static class PBEWithRIPEMD160 extends JCEMac
    {

        public PBEWithRIPEMD160()
        {
            super(new HMac(new RIPEMD160Digest()), 2, 160);
        }
    }

    public static class PBEWithSHA extends JCEMac
    {

        public PBEWithSHA()
        {
            super(new HMac(new SHA1Digest()), 1, 160);
        }
    }

    public static class PBEWithTiger extends JCEMac
    {

        public PBEWithTiger()
        {
            super(new HMac(new TigerDigest()), 3, 192);
        }
    }

    public static class RC2 extends JCEMac
    {

        public RC2()
        {
            super(new CBCBlockCipherMac(new RC2Engine()));
        }
    }

    public static class RIPEMD128 extends JCEMac
    {

        public RIPEMD128()
        {
            super(new HMac(new RIPEMD128Digest()));
        }
    }

    public static class RIPEMD160 extends JCEMac
    {

        public RIPEMD160()
        {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class SHA1 extends JCEMac
    {

        public SHA1()
        {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class SHA224 extends JCEMac
    {

        public SHA224()
        {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class SHA256 extends JCEMac
    {

        public SHA256()
        {
            super(new HMac(new SHA256Digest()));
        }
    }

    public static class SHA384 extends JCEMac
    {

        public SHA384()
        {
            super(new HMac(new SHA384Digest()));
        }
    }

    public static class SHA512 extends JCEMac
    {

        public SHA512()
        {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class Tiger extends JCEMac
    {

        public Tiger()
        {
            super(new HMac(new TigerDigest()));
        }
    }


    private Mac a;
    private int b;
    private int c;
    private int d;

    protected JCEMac(Mac mac)
    {
        b = 2;
        c = 1;
        d = 160;
        a = mac;
    }

    protected JCEMac(Mac mac, int i, int j)
    {
        b = 2;
        c = 1;
        d = 160;
        a = mac;
        b = 2;
        c = i;
        d = j;
    }

    protected byte[] engineDoFinal()
    {
        byte abyte0[] = new byte[engineGetMacLength()];
        a.a(abyte0, 0);
        return abyte0;
    }

    protected int engineGetMacLength()
    {
        return a.a();
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec)
    {
        if (key == null)
        {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof BCPBEKey)
        {
            key = (BCPBEKey)key;
            if (key.b() != null)
            {
                key = key.b();
            } else
            if (algorithmparameterspec instanceof PBEParameterSpec)
            {
                key = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.a(key, algorithmparameterspec);
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
        a.a(key);
    }

    protected void engineReset()
    {
        a.b();
    }

    protected void engineUpdate(byte byte0)
    {
        a.a(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }
}

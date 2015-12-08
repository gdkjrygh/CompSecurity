// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.MessageDigest;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.MD4Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.digests.RIPEMD320Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;

public class JDKMessageDigest extends MessageDigest
{
    public static class GOST3411 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            GOST3411 gost3411 = (GOST3411)clone();
            gost3411.a = new GOST3411Digest((GOST3411Digest)a);
            return gost3411;
        }

        public GOST3411()
        {
            super(new GOST3411Digest());
        }
    }

    public static class MD2 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            MD2 md2 = (MD2)clone();
            md2.a = new MD2Digest((MD2Digest)a);
            return md2;
        }

        public MD2()
        {
            super(new MD2Digest());
        }
    }

    public static class MD4 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            MD4 md4 = (MD4)clone();
            md4.a = new MD4Digest((MD4Digest)a);
            return md4;
        }

        public MD4()
        {
            super(new MD4Digest());
        }
    }

    public static class MD5 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            MD5 md5 = (MD5)clone();
            md5.a = new MD5Digest((MD5Digest)a);
            return md5;
        }

        public MD5()
        {
            super(new MD5Digest());
        }
    }

    public static class RIPEMD128 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            RIPEMD128 ripemd128 = (RIPEMD128)clone();
            ripemd128.a = new RIPEMD128Digest((RIPEMD128Digest)a);
            return ripemd128;
        }

        public RIPEMD128()
        {
            super(new RIPEMD128Digest());
        }
    }

    public static class RIPEMD160 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            RIPEMD160 ripemd160 = (RIPEMD160)clone();
            ripemd160.a = new RIPEMD160Digest((RIPEMD160Digest)a);
            return ripemd160;
        }

        public RIPEMD160()
        {
            super(new RIPEMD160Digest());
        }
    }

    public static class RIPEMD256 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            RIPEMD256 ripemd256 = (RIPEMD256)clone();
            ripemd256.a = new RIPEMD256Digest((RIPEMD256Digest)a);
            return ripemd256;
        }

        public RIPEMD256()
        {
            super(new RIPEMD256Digest());
        }
    }

    public static class RIPEMD320 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            RIPEMD320 ripemd320 = (RIPEMD320)clone();
            ripemd320.a = new RIPEMD320Digest((RIPEMD320Digest)a);
            return ripemd320;
        }

        public RIPEMD320()
        {
            super(new RIPEMD320Digest());
        }
    }

    public static class SHA1 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            SHA1 sha1 = (SHA1)clone();
            sha1.a = new SHA1Digest((SHA1Digest)a);
            return sha1;
        }

        public SHA1()
        {
            super(new SHA1Digest());
        }
    }

    public static class SHA224 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            SHA224 sha224 = (SHA224)clone();
            sha224.a = new SHA224Digest((SHA224Digest)a);
            return sha224;
        }

        public SHA224()
        {
            super(new SHA224Digest());
        }
    }

    public static class SHA256 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            SHA256 sha256 = (SHA256)clone();
            sha256.a = new SHA256Digest((SHA256Digest)a);
            return sha256;
        }

        public SHA256()
        {
            super(new SHA256Digest());
        }
    }

    public static class SHA384 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            SHA384 sha384 = (SHA384)clone();
            sha384.a = new SHA384Digest((SHA384Digest)a);
            return sha384;
        }

        public SHA384()
        {
            super(new SHA384Digest());
        }
    }

    public static class SHA512 extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            SHA512 sha512 = (SHA512)clone();
            sha512.a = new SHA512Digest((SHA512Digest)a);
            return sha512;
        }

        public SHA512()
        {
            super(new SHA512Digest());
        }
    }

    public static class Tiger extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Tiger tiger = (Tiger)clone();
            tiger.a = new TigerDigest((TigerDigest)a);
            return tiger;
        }

        public Tiger()
        {
            super(new TigerDigest());
        }
    }

    public static class Whirlpool extends JDKMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Whirlpool whirlpool = (Whirlpool)clone();
            whirlpool.a = new WhirlpoolDigest((WhirlpoolDigest)a);
            return whirlpool;
        }

        public Whirlpool()
        {
            super(new WhirlpoolDigest());
        }
    }


    Digest a;

    protected JDKMessageDigest(Digest digest)
    {
        super(digest.getAlgorithmName());
        a = digest;
    }

    public byte[] engineDigest()
    {
        byte abyte0[] = new byte[a.getDigestSize()];
        a.doFinal(abyte0, 0);
        return abyte0;
    }

    public void engineReset()
    {
        a.reset();
    }

    public void engineUpdate(byte byte0)
    {
        a.update(byte0);
    }

    public void engineUpdate(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }
}

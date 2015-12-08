// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.GOST28147Engine;
import org.spongycastle.crypto.engines.RC2Engine;
import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CCMBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.CTSBlockCipher;
import org.spongycastle.crypto.modes.EAXBlockCipher;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.modes.GOFBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.spongycastle.crypto.modes.PGPCFBBlockCipher;
import org.spongycastle.crypto.modes.SICBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.ISO10126d2Padding;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.paddings.TBCPadding;
import org.spongycastle.crypto.paddings.X923Padding;
import org.spongycastle.crypto.paddings.ZeroBytePadding;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.params.RC5Parameters;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jce.spec.GOST28147ParameterSpec;
import org.spongycastle.jce.spec.RepeatedSecretKeySpec;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

public class JCEBlockCipher extends CipherSpi
    implements PBE
{
    public static class DES extends JCEBlockCipher
    {

        public DES()
        {
            super(new DESEngine());
        }
    }

    public static class DESCBC extends JCEBlockCipher
    {

        public DESCBC()
        {
            super(new CBCBlockCipher(new DESEngine()), (byte)0);
        }
    }

    public static class GOST28147 extends JCEBlockCipher
    {

        public GOST28147()
        {
            super(new GOST28147Engine());
        }
    }

    public static class GOST28147cbc extends JCEBlockCipher
    {

        public GOST28147cbc()
        {
            super(new CBCBlockCipher(new GOST28147Engine()), (byte)0);
        }
    }

    public static class PBEWithAESCBC extends JCEBlockCipher
    {

        public PBEWithAESCBC()
        {
            super(new CBCBlockCipher(new AESFastEngine()));
        }
    }

    public static class PBEWithMD5AndDES extends JCEBlockCipher
    {

        public PBEWithMD5AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()));
        }
    }

    public static class PBEWithMD5AndRC2 extends JCEBlockCipher
    {

        public PBEWithMD5AndRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHA1AndDES extends JCEBlockCipher
    {

        public PBEWithSHA1AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()));
        }
    }

    public static class PBEWithSHA1AndRC2 extends JCEBlockCipher
    {

        public PBEWithSHA1AndRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends JCEBlockCipher
    {

        public PBEWithSHAAnd128BitRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends JCEBlockCipher
    {

        public PBEWithSHAAnd40BitRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAndTwofish extends JCEBlockCipher
    {

        public PBEWithSHAAndTwofish()
        {
            super(new CBCBlockCipher(new TwofishEngine()));
        }
    }

    public static class RC2 extends JCEBlockCipher
    {

        public RC2()
        {
            super(new RC2Engine());
        }
    }

    public static class RC2CBC extends JCEBlockCipher
    {

        public RC2CBC()
        {
            super(new CBCBlockCipher(new RC2Engine()), (byte)0);
        }
    }

    private static final class a
        implements c
    {

        private AEADBlockCipher a;

        public final int a(int k)
        {
            return a.b(k);
        }

        public final int a(byte abyte0[], int k)
        {
            return a.a(abyte0, k);
        }

        public final int a(byte abyte0[], int k, int l, byte abyte1[], int i1)
        {
            return a.a(abyte0, k, l, abyte1, i1);
        }

        public final void a(boolean flag, CipherParameters cipherparameters)
        {
            a.a(flag, cipherparameters);
        }

        public final boolean a()
        {
            return false;
        }

        public final int b(int k)
        {
            return a.a(k);
        }

        public final BlockCipher b()
        {
            return a.a();
        }

        a(AEADBlockCipher aeadblockcipher)
        {
            a = aeadblockcipher;
        }
    }

    private static final class b
        implements c
    {

        private BufferedBlockCipher a;

        public final int a(int k)
        {
            return a.b(k);
        }

        public final int a(byte abyte0[], int k)
        {
            return a.a(abyte0, k);
        }

        public final int a(byte abyte0[], int k, int l, byte abyte1[], int i1)
        {
            return a.a(abyte0, k, l, abyte1, i1);
        }

        public final void a(boolean flag, CipherParameters cipherparameters)
        {
            a.a(flag, cipherparameters);
        }

        public final boolean a()
        {
            return !(a instanceof CTSBlockCipher);
        }

        public final int b(int k)
        {
            return a.a(k);
        }

        public final BlockCipher b()
        {
            return a.a();
        }

        b(BlockCipher blockcipher)
        {
            a = new PaddedBufferedBlockCipher(blockcipher);
        }

        b(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
        {
            a = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
        }

        b(BufferedBlockCipher bufferedblockcipher)
        {
            a = bufferedblockcipher;
        }
    }

    private static interface c
    {

        public abstract int a(int k);

        public abstract int a(byte abyte0[], int k);

        public abstract int a(byte abyte0[], int k, int l, byte abyte1[], int i1);

        public abstract void a(boolean flag, CipherParameters cipherparameters);

        public abstract boolean a();

        public abstract int b(int k);

        public abstract BlockCipher b();
    }


    private Class a[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, org/spongycastle/jce/spec/GOST28147ParameterSpec
    };
    private BlockCipher b;
    private c c;
    private ParametersWithIV d;
    private int e;
    private boolean f;
    private PBEParameterSpec g;
    private String h;
    private String i;
    private AlgorithmParameters j;

    protected JCEBlockCipher(BlockCipher blockcipher)
    {
        e = 0;
        g = null;
        h = null;
        i = null;
        b = blockcipher;
        c = new b(blockcipher);
    }

    protected JCEBlockCipher(BlockCipher blockcipher, byte byte0)
    {
        e = 0;
        g = null;
        h = null;
        i = null;
        b = blockcipher;
        c = new b(blockcipher);
        e = 8;
    }

    private static boolean a(String s)
    {
        return "CCM".equals(s) || "EAX".equals(s) || "GCM".equals(s);
    }

    protected int engineDoFinal(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        int j1 = 0;
        if (l != 0)
        {
            j1 = c.a(abyte0, k, l, abyte1, i1);
        }
        try
        {
            k = c.a(abyte1, i1 + j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return j1 + k;
    }

    protected byte[] engineDoFinal(byte abyte0[], int k, int l)
    {
        byte abyte1[] = new byte[engineGetOutputSize(l)];
        if (l != 0)
        {
            k = c.a(abyte0, k, l, abyte1, 0);
        } else
        {
            k = 0;
        }
        try
        {
            l = c.a(abyte1, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        k = l + k;
        if (k == abyte1.length)
        {
            return abyte1;
        } else
        {
            abyte0 = new byte[k];
            System.arraycopy(abyte1, 0, abyte0, 0, k);
            return abyte0;
        }
    }

    protected int engineGetBlockSize()
    {
        return b.b();
    }

    protected byte[] engineGetIV()
    {
        if (d != null)
        {
            return d.a();
        } else
        {
            return null;
        }
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected int engineGetOutputSize(int k)
    {
        return c.a(k);
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        if (g == null) goto _L4; else goto _L3
_L3:
        try
        {
            j = AlgorithmParameters.getInstance(h, BouncyCastleProvider.a);
            j.init(g);
        }
        catch (Exception exception)
        {
            return null;
        }
_L2:
        return j;
_L4:
        if (d != null)
        {
            String s1 = c.b().a();
            String s = s1;
            if (s1.indexOf('/') >= 0)
            {
                s = s1.substring(0, s1.indexOf('/'));
            }
            try
            {
                j = AlgorithmParameters.getInstance(s, BouncyCastleProvider.a);
                j.init(d.a());
            }
            catch (Exception exception1)
            {
                throw new RuntimeException(exception1.toString());
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void engineInit(int k, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        if (l == a.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(a[l]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        l++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineInit(k, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        j = algorithmparameters;
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int k, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(k, key, ((AlgorithmParameterSpec) (null)), securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
    }

    protected void engineInit(int k, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        g = null;
        h = null;
        j = null;
        if (!(key instanceof SecretKey))
        {
            throw new InvalidKeyException((new StringBuilder("Key for algorithm ")).append(key.getAlgorithm()).append(" not suitable for symmetric enryption.").toString());
        }
        if (algorithmparameterspec == null && b.a().startsWith("RC5-64"))
        {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        if (key instanceof BCPBEKey)
        {
            BCPBEKey bcpbekey = (BCPBEKey)key;
            if (bcpbekey.c() != null)
            {
                h = bcpbekey.c().c();
            } else
            {
                h = bcpbekey.getAlgorithm();
            }
            if (bcpbekey.b() != null)
            {
                key = bcpbekey.b();
                g = new PBEParameterSpec(bcpbekey.getSalt(), bcpbekey.getIterationCount());
            } else
            if (algorithmparameterspec instanceof PBEParameterSpec)
            {
                g = (PBEParameterSpec)algorithmparameterspec;
                key = org.spongycastle.jcajce.provider.symmetric.util.PBE.Util.a(bcpbekey, algorithmparameterspec, c.b().a());
            } else
            {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
            if (key instanceof ParametersWithIV)
            {
                d = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec == null)
        {
            key = new KeyParameter(key.getEncoded());
        } else
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            if (e != 0)
            {
                algorithmparameterspec = (IvParameterSpec)algorithmparameterspec;
                if (algorithmparameterspec.getIV().length != e && !a(i))
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("IV must be ")).append(e).append(" bytes long.").toString());
                }
                if (key instanceof RepeatedSecretKeySpec)
                {
                    key = new ParametersWithIV(null, algorithmparameterspec.getIV());
                    d = (ParametersWithIV)key;
                } else
                {
                    key = new ParametersWithIV(new KeyParameter(key.getEncoded()), algorithmparameterspec.getIV());
                    d = (ParametersWithIV)key;
                }
            } else
            {
                if (i != null && i.equals("ECB"))
                {
                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                }
                key = new KeyParameter(key.getEncoded());
            }
        } else
        if (algorithmparameterspec instanceof GOST28147ParameterSpec)
        {
            GOST28147ParameterSpec gost28147parameterspec = (GOST28147ParameterSpec)algorithmparameterspec;
            key = new ParametersWithSBox(new KeyParameter(key.getEncoded()), ((GOST28147ParameterSpec)algorithmparameterspec).a());
            if (gost28147parameterspec.b() != null && e != 0)
            {
                key = new ParametersWithIV(key, gost28147parameterspec.b());
                d = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec instanceof RC2ParameterSpec)
        {
            RC2ParameterSpec rc2parameterspec = (RC2ParameterSpec)algorithmparameterspec;
            key = new RC2Parameters(key.getEncoded(), ((RC2ParameterSpec)algorithmparameterspec).getEffectiveKeyBits());
            if (rc2parameterspec.getIV() != null && e != 0)
            {
                key = new ParametersWithIV(key, rc2parameterspec.getIV());
                d = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec instanceof RC5ParameterSpec)
        {
            RC5ParameterSpec rc5parameterspec = (RC5ParameterSpec)algorithmparameterspec;
            key = new RC5Parameters(key.getEncoded(), ((RC5ParameterSpec)algorithmparameterspec).getRounds());
            if (b.a().startsWith("RC5"))
            {
                if (b.a().equals("RC5-32"))
                {
                    if (rc5parameterspec.getWordSize() != 32)
                    {
                        throw new InvalidAlgorithmParameterException((new StringBuilder("RC5 already set up for a word size of 32 not ")).append(rc5parameterspec.getWordSize()).append(".").toString());
                    }
                } else
                if (b.a().equals("RC5-64") && rc5parameterspec.getWordSize() != 64)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("RC5 already set up for a word size of 64 not ")).append(rc5parameterspec.getWordSize()).append(".").toString());
                }
            } else
            {
                throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
            }
            if (rc5parameterspec.getIV() != null && e != 0)
            {
                key = new ParametersWithIV(key, rc5parameterspec.getIV());
                d = (ParametersWithIV)key;
            }
        } else
        {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
_L9:
        if (e == 0 || (key instanceof ParametersWithIV)) goto _L2; else goto _L1
_L1:
        if (securerandom == null)
        {
            algorithmparameterspec = new SecureRandom();
        } else
        {
            algorithmparameterspec = securerandom;
        }
        if (k != 1 && k != 3) goto _L4; else goto _L3
_L3:
        bcpbekey = new byte[e];
        algorithmparameterspec.nextBytes(bcpbekey);
        key = new ParametersWithIV(key, bcpbekey);
        d = (ParametersWithIV)key;
_L2:
        if (securerandom != null && f)
        {
            key = new ParametersWithRandom(key, securerandom);
        }
        k;
        JVM INSTR tableswitch 1 4: default 296
    //                   1 1042
    //                   2 1054
    //                   3 1042
    //                   4 1054;
           goto _L5 _L6 _L7 _L6 _L7
_L5:
        try
        {
            throw new InvalidParameterException((new StringBuilder("unknown opmode ")).append(k).append(" passed").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
_L4:
        if (c.b().a().indexOf("PGPCFB") >= 0) goto _L2; else goto _L8
_L8:
        throw new InvalidAlgorithmParameterException("no IV set when one expected");
_L6:
        c.a(true, key);
        return;
_L7:
        c.a(false, key);
        return;
          goto _L9
    }

    protected void engineSetMode(String s)
    {
        i = Strings.b(s);
        if (i.equals("ECB"))
        {
            e = 0;
            c = new b(b);
            return;
        }
        if (i.equals("CBC"))
        {
            e = b.b();
            c = new b(new CBCBlockCipher(b));
            return;
        }
        if (i.startsWith("OFB"))
        {
            e = b.b();
            if (i.length() != 3)
            {
                int k = Integer.parseInt(i.substring(3));
                c = new b(new OFBBlockCipher(b, k));
                return;
            } else
            {
                c = new b(new OFBBlockCipher(b, b.b() * 8));
                return;
            }
        }
        if (i.startsWith("CFB"))
        {
            e = b.b();
            if (i.length() != 3)
            {
                int l = Integer.parseInt(i.substring(3));
                c = new b(new CFBBlockCipher(b, l));
                return;
            } else
            {
                c = new b(new CFBBlockCipher(b, b.b() * 8));
                return;
            }
        }
        if (i.startsWith("PGP"))
        {
            boolean flag = i.equalsIgnoreCase("PGPCFBwithIV");
            e = b.b();
            c = new b(new PGPCFBBlockCipher(b, flag));
            return;
        }
        if (i.equalsIgnoreCase("OpenPGPCFB"))
        {
            e = 0;
            c = new b(new OpenPGPCFBBlockCipher(b));
            return;
        }
        if (i.startsWith("SIC"))
        {
            e = b.b();
            if (e < 16)
            {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            } else
            {
                c = new b(new BufferedBlockCipher(new SICBlockCipher(b)));
                return;
            }
        }
        if (i.startsWith("CTR"))
        {
            e = b.b();
            c = new b(new BufferedBlockCipher(new SICBlockCipher(b)));
            return;
        }
        if (i.startsWith("GOFB"))
        {
            e = b.b();
            c = new b(new BufferedBlockCipher(new GOFBBlockCipher(b)));
            return;
        }
        if (i.startsWith("CTS"))
        {
            e = b.b();
            c = new b(new CTSBlockCipher(new CBCBlockCipher(b)));
            return;
        }
        if (i.startsWith("CCM"))
        {
            e = b.b();
            c = new a(new CCMBlockCipher(b));
            return;
        }
        if (i.startsWith("EAX"))
        {
            e = b.b();
            c = new a(new EAXBlockCipher(b));
            return;
        }
        if (i.startsWith("GCM"))
        {
            e = b.b();
            c = new a(new GCMBlockCipher(b));
            return;
        } else
        {
            throw new NoSuchAlgorithmException((new StringBuilder("can't support mode ")).append(s).toString());
        }
    }

    protected void engineSetPadding(String s)
    {
        String s1 = Strings.b(s);
        if (s1.equals("NOPADDING"))
        {
            if (c.a())
            {
                c = new b(new BufferedBlockCipher(c.b()));
            }
            return;
        }
        if (s1.equals("WITHCTS"))
        {
            c = new b(new CTSBlockCipher(c.b()));
            return;
        }
        f = true;
        if (a(i))
        {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (s1.equals("PKCS5PADDING") || s1.equals("PKCS7PADDING"))
        {
            c = new b(c.b());
            return;
        }
        if (s1.equals("ZEROBYTEPADDING"))
        {
            c = new b(c.b(), new ZeroBytePadding());
            return;
        }
        if (s1.equals("ISO10126PADDING") || s1.equals("ISO10126-2PADDING"))
        {
            c = new b(c.b(), new ISO10126d2Padding());
            return;
        }
        if (s1.equals("X9.23PADDING") || s1.equals("X923PADDING"))
        {
            c = new b(c.b(), new X923Padding());
            return;
        }
        if (s1.equals("ISO7816-4PADDING") || s1.equals("ISO9797-1PADDING"))
        {
            c = new b(c.b(), new ISO7816d4Padding());
            return;
        }
        if (s1.equals("TBCPADDING"))
        {
            c = new b(c.b(), new TBCPadding());
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder("Padding ")).append(s).append(" unknown.").toString());
        }
    }

    protected int engineUpdate(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        try
        {
            k = c.a(abyte0, k, l, abyte1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ShortBufferException(abyte0.getMessage());
        }
        return k;
    }

    protected byte[] engineUpdate(byte abyte0[], int k, int l)
    {
        byte abyte1[];
        int i1 = c.b(l);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        abyte1 = new byte[i1];
        k = c.a(abyte0, k, l, abyte1, 0);
        if (k != 0) goto _L2; else goto _L1
_L1:
        abyte0 = null;
_L4:
        return abyte0;
_L2:
        abyte0 = abyte1;
        if (k == abyte1.length) goto _L4; else goto _L3
_L3:
        abyte0 = new byte[k];
        System.arraycopy(abyte1, 0, abyte0, 0, k);
        return abyte0;
        c.a(abyte0, k, l, null, 0);
        return null;
    }
}

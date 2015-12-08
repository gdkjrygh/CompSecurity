// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            WrapCipherSpi, d, BouncyCastleProvider, g

public class JCERSACipher extends WrapCipherSpi
{
    public static class ISO9796d1Padding extends JCERSACipher
    {

        public ISO9796d1Padding()
        {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends JCERSACipher
    {

        public NoPadding()
        {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends JCERSACipher
    {

        public OAEPPadding()
        {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends JCERSACipher
    {

        public PKCS1v1_5Padding()
        {
            super(new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends JCERSACipher
    {

        public PKCS1v1_5Padding_PrivateOnly()
        {
            super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends JCERSACipher
    {

        public PKCS1v1_5Padding_PublicOnly()
        {
            super(true, false, new PKCS1Encoding(new RSABlindedEngine()));
        }
    }


    private AsymmetricBlockCipher e;
    private AlgorithmParameterSpec f;
    private AlgorithmParameters g;
    private boolean h;
    private boolean i;
    private ByteArrayOutputStream j;

    public JCERSACipher(OAEPParameterSpec oaepparameterspec)
    {
        h = false;
        i = false;
        j = new ByteArrayOutputStream();
        try
        {
            a(oaepparameterspec);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OAEPParameterSpec oaepparameterspec)
        {
            throw new IllegalArgumentException(oaepparameterspec.getMessage());
        }
    }

    public JCERSACipher(AsymmetricBlockCipher asymmetricblockcipher)
    {
        h = false;
        i = false;
        j = new ByteArrayOutputStream();
        e = asymmetricblockcipher;
    }

    public JCERSACipher(boolean flag, boolean flag1, AsymmetricBlockCipher asymmetricblockcipher)
    {
        h = false;
        i = false;
        j = new ByteArrayOutputStream();
        h = flag;
        i = flag1;
        e = asymmetricblockcipher;
    }

    private void a(OAEPParameterSpec oaepparameterspec)
    {
        MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)oaepparameterspec.getMGFParameters();
        org.bouncycastle.crypto.Digest digest = d.a(mgf1parameterspec.getDigestAlgorithm());
        if (digest == null)
        {
            throw new NoSuchPaddingException((new StringBuilder("no match on OAEP constructor for digest algorithm: ")).append(mgf1parameterspec.getDigestAlgorithm()).toString());
        } else
        {
            e = new OAEPEncoding(new RSABlindedEngine(), digest, ((javax.crypto.spec.PSource.PSpecified)oaepparameterspec.getPSource()).getValue());
            f = oaepparameterspec;
            return;
        }
    }

    protected int engineDoFinal(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        boolean flag = false;
        if (abyte0 != null)
        {
            j.write(abyte0, k, l);
        }
        if (e instanceof RSABlindedEngine)
        {
            if (j.size() > e.getInputBlockSize() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (j.size() > e.getInputBlockSize())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        try
        {
            abyte0 = j.toByteArray();
            j.reset();
            abyte0 = e.processBlock(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        for (k = ((flag) ? 1 : 0); k != abyte0.length; k++)
        {
            abyte1[i1 + k] = abyte0[k];
        }

        return abyte0.length;
    }

    protected byte[] engineDoFinal(byte abyte0[], int k, int l)
    {
        if (abyte0 != null)
        {
            j.write(abyte0, k, l);
        }
        if (e instanceof RSABlindedEngine)
        {
            if (j.size() > e.getInputBlockSize() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (j.size() > e.getInputBlockSize())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        try
        {
            abyte0 = j.toByteArray();
            j.reset();
            abyte0 = e.processBlock(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return abyte0;
    }

    protected int engineGetBlockSize()
    {
        int k;
        try
        {
            k = e.getInputBlockSize();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
        return k;
    }

    protected byte[] engineGetIV()
    {
        return null;
    }

    protected int engineGetKeySize(Key key)
    {
        if (key instanceof RSAPrivateKey)
        {
            return ((RSAPrivateKey)key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey)
        {
            return ((RSAPublicKey)key).getModulus().bitLength();
        } else
        {
            throw new IllegalArgumentException("not an RSA key!");
        }
    }

    protected int engineGetOutputSize(int k)
    {
        try
        {
            k = e.getOutputBlockSize();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
        return k;
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (g == null && f != null)
        {
            try
            {
                g = AlgorithmParameters.getInstance("OAEP", BouncyCastleProvider.a);
                g.init(f);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return g;
    }

    protected void engineInit(int k, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        AlgorithmParameterSpec algorithmparameterspec = null;
        if (algorithmparameters != null)
        {
            try
            {
                algorithmparameterspec = algorithmparameters.getParameterSpec(javax/crypto/spec/OAEPParameterSpec);
            }
            // Misplaced declaration of an exception variable
            catch (Key key)
            {
                throw new InvalidAlgorithmParameterException((new StringBuilder("cannot recognise parameters: ")).append(key.toString()).toString(), key);
            }
        }
        g = algorithmparameters;
        engineInit(k, key, algorithmparameterspec, securerandom);
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
            throw new RuntimeException((new StringBuilder("Eeeek! ")).append(key.toString()).toString(), key);
        }
    }

    protected void engineInit(int k, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec == null || (algorithmparameterspec instanceof OAEPParameterSpec))
        {
            if (key instanceof RSAPublicKey)
            {
                if (i)
                {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
                key = org.bouncycastle.jce.provider.g.a((RSAPublicKey)key);
            } else
            if (key instanceof RSAPrivateKey)
            {
                if (h)
                {
                    throw new InvalidKeyException("mode 2 requires RSAPublicKey");
                }
                key = org.bouncycastle.jce.provider.g.a((RSAPrivateKey)key);
            } else
            {
                throw new InvalidKeyException("unknown key type passed to RSA");
            }
            if (algorithmparameterspec != null)
            {
                OAEPParameterSpec oaepparameterspec = (OAEPParameterSpec)algorithmparameterspec;
                f = algorithmparameterspec;
                if (!oaepparameterspec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oaepparameterspec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.l_.e()))
                {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                }
                if (!(oaepparameterspec.getMGFParameters() instanceof MGF1ParameterSpec))
                {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
                algorithmparameterspec = d.a(oaepparameterspec.getDigestAlgorithm());
                if (algorithmparameterspec == null)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("no match on digest algorithm: ")).append(oaepparameterspec.getDigestAlgorithm()).toString());
                }
                MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)oaepparameterspec.getMGFParameters();
                org.bouncycastle.crypto.Digest digest = d.a(mgf1parameterspec.getDigestAlgorithm());
                if (digest == null)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("no match on MGF digest algorithm: ")).append(mgf1parameterspec.getDigestAlgorithm()).toString());
                }
                e = new OAEPEncoding(new RSABlindedEngine(), algorithmparameterspec, digest, ((javax.crypto.spec.PSource.PSpecified)oaepparameterspec.getPSource()).getValue());
            }
            if (!(e instanceof RSABlindedEngine))
            {
                if (securerandom != null)
                {
                    key = new ParametersWithRandom(key, securerandom);
                } else
                {
                    key = new ParametersWithRandom(key, new SecureRandom());
                }
            }
            switch (k)
            {
            default:
                throw new InvalidParameterException((new StringBuilder("unknown opmode ")).append(k).append(" passed to RSA").toString());

            case 1: // '\001'
            case 3: // '\003'
                e.init(true, key);
                return;

            case 2: // '\002'
            case 4: // '\004'
                e.init(false, key);
                break;
            }
        } else
        {
            throw new IllegalArgumentException("unknown parameter type.");
        }
    }

    protected void engineSetMode(String s)
    {
        String s1 = Strings.b(s);
        if (s1.equals("NONE") || s1.equals("ECB"))
        {
            return;
        }
        if (s1.equals("1"))
        {
            i = true;
            h = false;
            return;
        }
        if (s1.equals("2"))
        {
            i = false;
            h = true;
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
            e = new RSABlindedEngine();
            return;
        }
        if (s1.equals("PKCS1PADDING"))
        {
            e = new PKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (s1.equals("ISO9796-1PADDING"))
        {
            e = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        if (s1.equals("OAEPWITHMD5ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPPADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHSHA1ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-1ANDMGF1PADDING"))
        {
            a(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (s1.equals("OAEPWITHSHA224ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-224ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA256ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-256ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA384ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-384ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        }
        if (s1.equals("OAEPWITHSHA512ANDMGF1PADDING") || s1.equals("OAEPWITHSHA-512ANDMGF1PADDING"))
        {
            a(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, javax.crypto.spec.PSource.PSpecified.DEFAULT));
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder()).append(s).append(" unavailable with RSA.").toString());
        }
    }

    protected int engineUpdate(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        j.write(abyte0, k, l);
        if (e instanceof RSABlindedEngine)
        {
            if (j.size() > e.getInputBlockSize() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (j.size() > e.getInputBlockSize())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return 0;
    }

    protected byte[] engineUpdate(byte abyte0[], int k, int l)
    {
        j.write(abyte0, k, l);
        if (e instanceof RSABlindedEngine)
        {
            if (j.size() > e.getInputBlockSize() + 1)
            {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else
        if (j.size() > e.getInputBlockSize())
        {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return null;
    }
}

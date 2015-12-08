// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.PSSSigner;

// Referenced classes of package org.bouncycastle.jce.provider:
//            d, BouncyCastleProvider, g

public class JDKPSSSigner extends SignatureSpi
{
    public static class PSSwithRSA extends JDKPSSSigner
    {

        public PSSwithRSA()
        {
            super(new RSABlindedEngine(), null);
        }
    }

    public static class SHA1withRSA extends JDKPSSSigner
    {

        public SHA1withRSA()
        {
            super(new RSABlindedEngine(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends JDKPSSSigner
    {

        public SHA224withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA256withRSA extends JDKPSSSigner
    {

        public SHA256withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends JDKPSSSigner
    {

        public SHA384withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA512withRSA extends JDKPSSSigner
    {

        public SHA512withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    private final class a
        implements Digest
    {

        final JDKPSSSigner a;
        private ByteArrayOutputStream b;
        private Digest c;
        private boolean d;

        public final int doFinal(byte abyte0[], int k)
        {
            boolean flag = false;
            byte abyte1[] = b.toByteArray();
            if (d)
            {
                System.arraycopy(abyte1, 0, abyte0, k, abyte1.length);
            } else
            {
                c.update(abyte1, 0, abyte1.length);
                c.doFinal(abyte0, k);
            }
            reset();
            if (!d)
            {
                flag = true;
            }
            d = flag;
            return abyte1.length;
        }

        public final String getAlgorithmName()
        {
            return "NULL";
        }

        public final int getDigestSize()
        {
            return c.getDigestSize();
        }

        public final void reset()
        {
            b.reset();
            c.reset();
        }

        public final void update(byte byte0)
        {
            b.write(byte0);
        }

        public final void update(byte abyte0[], int k, int l)
        {
            b.write(abyte0, k, l);
        }

        public a(Digest digest)
        {
            a = JDKPSSSigner.this;
            super();
            b = new ByteArrayOutputStream();
            d = true;
            c = digest;
        }
    }

    public static class nonePSS extends JDKPSSSigner
    {

        public nonePSS()
        {
            super(new RSABlindedEngine(), null, true);
        }
    }


    private AlgorithmParameters a;
    private PSSParameterSpec b;
    private PSSParameterSpec c;
    private AsymmetricBlockCipher d;
    private Digest e;
    private Digest f;
    private int g;
    private byte h;
    private boolean i;
    private PSSSigner j;

    protected JDKPSSSigner(AsymmetricBlockCipher asymmetricblockcipher, PSSParameterSpec pssparameterspec)
    {
        this(asymmetricblockcipher, pssparameterspec, false);
    }

    protected JDKPSSSigner(AsymmetricBlockCipher asymmetricblockcipher, PSSParameterSpec pssparameterspec, boolean flag)
    {
        d = asymmetricblockcipher;
        c = pssparameterspec;
        if (pssparameterspec == null)
        {
            b = PSSParameterSpec.DEFAULT;
        } else
        {
            b = pssparameterspec;
        }
        f = org.bouncycastle.jce.provider.d.a(b.getDigestAlgorithm());
        g = b.getSaltLength();
        h = a(b.getTrailerField());
        i = flag;
        a();
    }

    private static byte a(int k)
    {
        if (k == 1)
        {
            return -68;
        } else
        {
            throw new IllegalArgumentException("unknown trailer field");
        }
    }

    private void a()
    {
        if (i)
        {
            e = new a(f);
            return;
        } else
        {
            e = f;
            return;
        }
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (a == null && b != null)
        {
            try
            {
                a = AlgorithmParameters.getInstance("PSS", BouncyCastleProvider.a);
                a.init(b);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return a;
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        } else
        {
            j = new PSSSigner(d, e, f, g, h);
            j.init(true, org.bouncycastle.jce.provider.g.a((RSAPrivateKey)privatekey));
            return;
        }
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        } else
        {
            j = new PSSSigner(d, e, f, g, h);
            j.init(true, new ParametersWithRandom(org.bouncycastle.jce.provider.g.a((RSAPrivateKey)privatekey), securerandom));
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof RSAPublicKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        } else
        {
            j = new PSSSigner(d, e, f, g, h);
            j.init(false, org.bouncycastle.jce.provider.g.a((RSAPublicKey)publickey));
            return;
        }
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
    {
        if (algorithmparameterspec instanceof PSSParameterSpec)
        {
            algorithmparameterspec = (PSSParameterSpec)algorithmparameterspec;
            if (c != null && !org.bouncycastle.jce.provider.d.a(c.getDigestAlgorithm(), algorithmparameterspec.getDigestAlgorithm()))
            {
                throw new InvalidParameterException((new StringBuilder("parameter must be using ")).append(c.getDigestAlgorithm()).toString());
            }
            if (!algorithmparameterspec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !algorithmparameterspec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.l_.e()))
            {
                throw new InvalidParameterException("unknown mask generation function specified");
            }
            if (!(algorithmparameterspec.getMGFParameters() instanceof MGF1ParameterSpec))
            {
                throw new InvalidParameterException("unkown MGF parameters");
            }
            MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)algorithmparameterspec.getMGFParameters();
            if (!org.bouncycastle.jce.provider.d.a(mgf1parameterspec.getDigestAlgorithm(), algorithmparameterspec.getDigestAlgorithm()))
            {
                throw new InvalidParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            Digest digest = org.bouncycastle.jce.provider.d.a(mgf1parameterspec.getDigestAlgorithm());
            if (digest == null)
            {
                throw new InvalidParameterException((new StringBuilder("no match on MGF digest algorithm: ")).append(mgf1parameterspec.getDigestAlgorithm()).toString());
            } else
            {
                a = null;
                b = algorithmparameterspec;
                f = digest;
                g = b.getSaltLength();
                h = a(b.getTrailerField());
                a();
                return;
            }
        } else
        {
            throw new InvalidParameterException("Only PSSParameterSpec supported");
        }
    }

    protected byte[] engineSign()
    {
        byte abyte0[];
        try
        {
            abyte0 = j.generateSignature();
        }
        catch (CryptoException cryptoexception)
        {
            throw new SignatureException(cryptoexception.getMessage());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
    {
        j.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int k, int l)
    {
        j.update(abyte0, k, l);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        return j.verifySignature(abyte0);
    }
}

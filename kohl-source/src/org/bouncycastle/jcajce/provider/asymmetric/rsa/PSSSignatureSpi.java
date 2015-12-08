// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

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
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            RSAUtil

public class PSSSignatureSpi extends SignatureSpi
{
    private class NullPssDigest
        implements Digest
    {

        private ByteArrayOutputStream bOut;
        private Digest baseDigest;
        private boolean oddTime;
        final PSSSignatureSpi this$0;

        public int doFinal(byte abyte0[], int i)
        {
            boolean flag = false;
            byte abyte1[] = bOut.toByteArray();
            if (oddTime)
            {
                System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
            } else
            {
                baseDigest.update(abyte1, 0, abyte1.length);
                baseDigest.doFinal(abyte0, i);
            }
            reset();
            if (!oddTime)
            {
                flag = true;
            }
            oddTime = flag;
            return abyte1.length;
        }

        public String getAlgorithmName()
        {
            return "NULL";
        }

        public int getByteLength()
        {
            return 0;
        }

        public int getDigestSize()
        {
            return baseDigest.getDigestSize();
        }

        public void reset()
        {
            bOut.reset();
            baseDigest.reset();
        }

        public void update(byte byte0)
        {
            bOut.write(byte0);
        }

        public void update(byte abyte0[], int i, int j)
        {
            bOut.write(abyte0, i, j);
        }

        public NullPssDigest(Digest digest)
        {
            this$0 = PSSSignatureSpi.this;
            super();
            bOut = new ByteArrayOutputStream();
            oddTime = true;
            baseDigest = digest;
        }
    }

    public static class PSSwithRSA extends PSSSignatureSpi
    {

        public PSSwithRSA()
        {
            super(new RSABlindedEngine(), null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi
    {

        public SHA1withRSA()
        {
            super(new RSABlindedEngine(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi
    {

        public SHA224withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi
    {

        public SHA256withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi
    {

        public SHA384withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi
    {

        public SHA512withRSA()
        {
            super(new RSABlindedEngine(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi
    {

        public nonePSS()
        {
            super(new RSABlindedEngine(), null, true);
        }
    }


    private Digest contentDigest;
    private AlgorithmParameters engineParams;
    private boolean isRaw;
    private Digest mgfDigest;
    private PSSParameterSpec originalSpec;
    private PSSParameterSpec paramSpec;
    private PSSSigner pss;
    private int saltLength;
    private AsymmetricBlockCipher signer;
    private byte trailer;

    protected PSSSignatureSpi(AsymmetricBlockCipher asymmetricblockcipher, PSSParameterSpec pssparameterspec)
    {
        this(asymmetricblockcipher, pssparameterspec, false);
    }

    protected PSSSignatureSpi(AsymmetricBlockCipher asymmetricblockcipher, PSSParameterSpec pssparameterspec, boolean flag)
    {
        signer = asymmetricblockcipher;
        originalSpec = pssparameterspec;
        if (pssparameterspec == null)
        {
            paramSpec = PSSParameterSpec.DEFAULT;
        } else
        {
            paramSpec = pssparameterspec;
        }
        mgfDigest = DigestFactory.getDigest(paramSpec.getDigestAlgorithm());
        saltLength = paramSpec.getSaltLength();
        trailer = getTrailer(paramSpec.getTrailerField());
        isRaw = flag;
        setupContentDigest();
    }

    private byte getTrailer(int i)
    {
        if (i == 1)
        {
            return -68;
        } else
        {
            throw new IllegalArgumentException("unknown trailer field");
        }
    }

    private void setupContentDigest()
    {
        if (isRaw)
        {
            contentDigest = new NullPssDigest(mgfDigest);
            return;
        } else
        {
            contentDigest = mgfDigest;
            return;
        }
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (engineParams == null && paramSpec != null)
        {
            try
            {
                engineParams = AlgorithmParameters.getInstance("PSS", BouncyCastleProvider.PROVIDER_NAME);
                engineParams.init(paramSpec);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.toString());
            }
        }
        return engineParams;
    }

    protected void engineInitSign(PrivateKey privatekey)
        throws InvalidKeyException
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        } else
        {
            pss = new PSSSigner(signer, contentDigest, mgfDigest, saltLength, trailer);
            pss.init(true, RSAUtil.generatePrivateKeyParameter((RSAPrivateKey)privatekey));
            return;
        }
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
        throws InvalidKeyException
    {
        if (!(privatekey instanceof RSAPrivateKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
        } else
        {
            pss = new PSSSigner(signer, contentDigest, mgfDigest, saltLength, trailer);
            pss.init(true, new ParametersWithRandom(RSAUtil.generatePrivateKeyParameter((RSAPrivateKey)privatekey), securerandom));
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
        throws InvalidKeyException
    {
        if (!(publickey instanceof RSAPublicKey))
        {
            throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
        } else
        {
            pss = new PSSSigner(signer, contentDigest, mgfDigest, saltLength, trailer);
            pss.init(false, RSAUtil.generatePublicKeyParameter((RSAPublicKey)publickey));
            return;
        }
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
        throws InvalidParameterException
    {
        if (algorithmparameterspec instanceof PSSParameterSpec)
        {
            algorithmparameterspec = (PSSParameterSpec)algorithmparameterspec;
            if (originalSpec != null && !DigestFactory.isSameDigest(originalSpec.getDigestAlgorithm(), algorithmparameterspec.getDigestAlgorithm()))
            {
                throw new InvalidParameterException((new StringBuilder()).append("parameter must be using ").append(originalSpec.getDigestAlgorithm()).toString());
            }
            if (!algorithmparameterspec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !algorithmparameterspec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId()))
            {
                throw new InvalidParameterException("unknown mask generation function specified");
            }
            if (!(algorithmparameterspec.getMGFParameters() instanceof MGF1ParameterSpec))
            {
                throw new InvalidParameterException("unkown MGF parameters");
            }
            MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)algorithmparameterspec.getMGFParameters();
            if (!DigestFactory.isSameDigest(mgf1parameterspec.getDigestAlgorithm(), algorithmparameterspec.getDigestAlgorithm()))
            {
                throw new InvalidParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            }
            Digest digest = DigestFactory.getDigest(mgf1parameterspec.getDigestAlgorithm());
            if (digest == null)
            {
                throw new InvalidParameterException((new StringBuilder()).append("no match on MGF digest algorithm: ").append(mgf1parameterspec.getDigestAlgorithm()).toString());
            } else
            {
                engineParams = null;
                paramSpec = algorithmparameterspec;
                mgfDigest = digest;
                saltLength = paramSpec.getSaltLength();
                trailer = getTrailer(paramSpec.getTrailerField());
                setupContentDigest();
                return;
            }
        } else
        {
            throw new InvalidParameterException("Only PSSParameterSpec supported");
        }
    }

    protected byte[] engineSign()
        throws SignatureException
    {
        byte abyte0[];
        try
        {
            abyte0 = pss.generateSignature();
        }
        catch (CryptoException cryptoexception)
        {
            throw new SignatureException(cryptoexception.getMessage());
        }
        return abyte0;
    }

    protected void engineUpdate(byte byte0)
        throws SignatureException
    {
        pss.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
        throws SignatureException
    {
        pss.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
        throws SignatureException
    {
        return pss.verifySignature(abyte0);
    }
}

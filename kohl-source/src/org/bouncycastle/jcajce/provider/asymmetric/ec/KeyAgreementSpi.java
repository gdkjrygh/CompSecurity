// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;
import org.bouncycastle.crypto.agreement.ECMQVBasicAgreement;
import org.bouncycastle.crypto.agreement.kdf.DHKDFParameters;
import org.bouncycastle.crypto.agreement.kdf.ECDHKEKGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;
import org.bouncycastle.jce.interfaces.MQVPublicKey;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            ECUtil

public class KeyAgreementSpi extends javax.crypto.KeyAgreementSpi
{
    public static class DH extends KeyAgreementSpi
    {

        public DH()
        {
            super("ECDH", new ECDHBasicAgreement(), null);
        }
    }

    public static class DHC extends KeyAgreementSpi
    {

        public DHC()
        {
            super("ECDHC", new ECDHCBasicAgreement(), null);
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi
    {

        public DHwithSHA1KDF()
        {
            super("ECDHwithSHA1KDF", new ECDHBasicAgreement(), new ECDHKEKGenerator(new SHA1Digest()));
        }
    }

    public static class MQV extends KeyAgreementSpi
    {

        public MQV()
        {
            super("ECMQV", new ECMQVBasicAgreement(), null);
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi
    {

        public MQVwithSHA1KDF()
        {
            super("ECMQVwithSHA1KDF", new ECMQVBasicAgreement(), new ECDHKEKGenerator(new SHA1Digest()));
        }
    }


    private static final Hashtable algorithms;
    private static final X9IntegerConverter converter = new X9IntegerConverter();
    private BasicAgreement agreement;
    private String kaAlgorithm;
    private DerivationFunction kdf;
    private ECDomainParameters parameters;
    private BigInteger result;

    protected KeyAgreementSpi(String s, BasicAgreement basicagreement, DerivationFunction derivationfunction)
    {
        kaAlgorithm = s;
        agreement = basicagreement;
        kdf = derivationfunction;
    }

    private byte[] bigIntToBytes(BigInteger biginteger)
    {
        return converter.integerToBytes(biginteger, converter.getByteLength(parameters.getG().getX()));
    }

    private static String getSimpleName(Class class1)
    {
        class1 = class1.getName();
        return class1.substring(class1.lastIndexOf('.') + 1);
    }

    private void initFromKey(Key key)
        throws InvalidKeyException
    {
        if (agreement instanceof ECMQVBasicAgreement)
        {
            if (!(key instanceof MQVPrivateKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(kaAlgorithm).append(" key agreement requires ").append(getSimpleName(org/bouncycastle/jce/interfaces/MQVPrivateKey)).append(" for initialisation").toString());
            }
            MQVPrivateKey mqvprivatekey = (MQVPrivateKey)key;
            ECPrivateKeyParameters ecprivatekeyparameters = (ECPrivateKeyParameters)ECUtil.generatePrivateKeyParameter(mqvprivatekey.getStaticPrivateKey());
            ECPrivateKeyParameters ecprivatekeyparameters1 = (ECPrivateKeyParameters)ECUtil.generatePrivateKeyParameter(mqvprivatekey.getEphemeralPrivateKey());
            key = null;
            if (mqvprivatekey.getEphemeralPublicKey() != null)
            {
                key = (ECPublicKeyParameters)ECUtil.generatePublicKeyParameter(mqvprivatekey.getEphemeralPublicKey());
            }
            key = new MQVPrivateParameters(ecprivatekeyparameters, ecprivatekeyparameters1, key);
            parameters = ecprivatekeyparameters.getParameters();
            agreement.init(key);
            return;
        }
        if (!(key instanceof ECPrivateKey))
        {
            throw new InvalidKeyException((new StringBuilder()).append(kaAlgorithm).append(" key agreement requires ").append(getSimpleName(org/bouncycastle/jce/interfaces/ECPrivateKey)).append(" for initialisation").toString());
        } else
        {
            key = (ECPrivateKeyParameters)ECUtil.generatePrivateKeyParameter((PrivateKey)key);
            parameters = key.getParameters();
            agreement.init(key);
            return;
        }
    }

    protected Key engineDoPhase(Key key, boolean flag)
        throws InvalidKeyException, IllegalStateException
    {
        if (parameters == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(kaAlgorithm).append(" not initialised.").toString());
        }
        if (!flag)
        {
            throw new IllegalStateException((new StringBuilder()).append(kaAlgorithm).append(" can only be between two parties.").toString());
        }
        if (agreement instanceof ECMQVBasicAgreement)
        {
            if (!(key instanceof MQVPublicKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(kaAlgorithm).append(" key agreement requires ").append(getSimpleName(org/bouncycastle/jce/interfaces/MQVPublicKey)).append(" for doPhase").toString());
            }
            key = (MQVPublicKey)key;
            key = new MQVPublicParameters((ECPublicKeyParameters)ECUtil.generatePublicKeyParameter(key.getStaticKey()), (ECPublicKeyParameters)ECUtil.generatePublicKeyParameter(key.getEphemeralKey()));
        } else
        {
            if (!(key instanceof ECPublicKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(kaAlgorithm).append(" key agreement requires ").append(getSimpleName(org/bouncycastle/jce/interfaces/ECPublicKey)).append(" for doPhase").toString());
            }
            key = ECUtil.generatePublicKeyParameter((PublicKey)key);
        }
        result = agreement.calculateAgreement(key);
        return null;
    }

    protected int engineGenerateSecret(byte abyte0[], int i)
        throws IllegalStateException, ShortBufferException
    {
        byte abyte1[] = engineGenerateSecret();
        if (abyte0.length - i < abyte1.length)
        {
            throw new ShortBufferException((new StringBuilder()).append(kaAlgorithm).append(" key agreement: need ").append(abyte1.length).append(" bytes").toString());
        } else
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
            return abyte1.length;
        }
    }

    protected SecretKey engineGenerateSecret(String s)
        throws NoSuchAlgorithmException
    {
        byte abyte0[] = bigIntToBytes(result);
        if (kdf != null)
        {
            if (!algorithms.containsKey(s))
            {
                throw new NoSuchAlgorithmException((new StringBuilder()).append("unknown algorithm encountered: ").append(s).toString());
            }
            int i = ((Integer)algorithms.get(s)).intValue();
            DHKDFParameters dhkdfparameters = new DHKDFParameters(new DERObjectIdentifier(s), i, abyte0);
            abyte0 = new byte[i / 8];
            kdf.init(dhkdfparameters);
            kdf.generateBytes(abyte0, 0, abyte0.length);
        }
        return new SecretKeySpec(abyte0, s);
    }

    protected byte[] engineGenerateSecret()
        throws IllegalStateException
    {
        if (kdf != null)
        {
            throw new UnsupportedOperationException("KDF can only be used when algorithm is known");
        } else
        {
            return bigIntToBytes(result);
        }
    }

    protected void engineInit(Key key, SecureRandom securerandom)
        throws InvalidKeyException
    {
        initFromKey(key);
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        initFromKey(key);
    }

    static 
    {
        algorithms = new Hashtable();
        Integer integer = new Integer(128);
        Integer integer1 = new Integer(192);
        Integer integer2 = new Integer(256);
        algorithms.put(NISTObjectIdentifiers.id_aes128_CBC.getId(), integer);
        algorithms.put(NISTObjectIdentifiers.id_aes192_CBC.getId(), integer1);
        algorithms.put(NISTObjectIdentifiers.id_aes256_CBC.getId(), integer2);
        algorithms.put(NISTObjectIdentifiers.id_aes128_wrap.getId(), integer);
        algorithms.put(NISTObjectIdentifiers.id_aes192_wrap.getId(), integer1);
        algorithms.put(NISTObjectIdentifiers.id_aes256_wrap.getId(), integer2);
        algorithms.put(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId(), integer1);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
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
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x9.X9IntegerConverter;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.agreement.ECDHCBasicAgreement;
import org.spongycastle.crypto.agreement.ECMQVBasicAgreement;
import org.spongycastle.crypto.agreement.kdf.DHKDFParameters;
import org.spongycastle.crypto.agreement.kdf.ECDHKEKGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.MQVPrivateParameters;
import org.spongycastle.crypto.params.MQVPublicParameters;
import org.spongycastle.jce.interfaces.ECPrivateKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.interfaces.MQVPrivateKey;
import org.spongycastle.jce.interfaces.MQVPublicKey;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
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


    private static final X9IntegerConverter a = new X9IntegerConverter();
    private static final Hashtable b;
    private String c;
    private BigInteger d;
    private ECDomainParameters e;
    private BasicAgreement f;
    private DerivationFunction g;

    protected KeyAgreementSpi(String s, BasicAgreement basicagreement, DerivationFunction derivationfunction)
    {
        c = s;
        f = basicagreement;
        g = derivationfunction;
    }

    private static String a(Class class1)
    {
        class1 = class1.getName();
        return class1.substring(class1.lastIndexOf('.') + 1);
    }

    private void a(Key key)
    {
        if (f instanceof ECMQVBasicAgreement)
        {
            if (!(key instanceof MQVPrivateKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(c).append(" key agreement requires ").append(a(org/spongycastle/jce/interfaces/MQVPrivateKey)).append(" for initialisation").toString());
            }
            MQVPrivateKey mqvprivatekey = (MQVPrivateKey)key;
            ECPrivateKeyParameters ecprivatekeyparameters = (ECPrivateKeyParameters)ECUtil.a(mqvprivatekey.a());
            ECPrivateKeyParameters ecprivatekeyparameters1 = (ECPrivateKeyParameters)ECUtil.a(mqvprivatekey.b());
            key = null;
            if (mqvprivatekey.c() != null)
            {
                key = (ECPublicKeyParameters)ECUtil.a(mqvprivatekey.c());
            }
            key = new MQVPrivateParameters(ecprivatekeyparameters, ecprivatekeyparameters1, key);
            e = ecprivatekeyparameters.b();
            f.a(key);
            return;
        }
        if (!(key instanceof ECPrivateKey))
        {
            throw new InvalidKeyException((new StringBuilder()).append(c).append(" key agreement requires ").append(a(org/spongycastle/jce/interfaces/ECPrivateKey)).append(" for initialisation").toString());
        } else
        {
            key = (ECPrivateKeyParameters)ECUtil.a((PrivateKey)key);
            e = key.b();
            f.a(key);
            return;
        }
    }

    private byte[] a(BigInteger biginteger)
    {
        return X9IntegerConverter.a(biginteger, X9IntegerConverter.a(e.b().b()));
    }

    protected Key engineDoPhase(Key key, boolean flag)
    {
        if (e == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(c).append(" not initialised.").toString());
        }
        if (!flag)
        {
            throw new IllegalStateException((new StringBuilder()).append(c).append(" can only be between two parties.").toString());
        }
        if (f instanceof ECMQVBasicAgreement)
        {
            if (!(key instanceof MQVPublicKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(c).append(" key agreement requires ").append(a(org/spongycastle/jce/interfaces/MQVPublicKey)).append(" for doPhase").toString());
            }
            key = (MQVPublicKey)key;
            key = new MQVPublicParameters((ECPublicKeyParameters)ECUtil.a(key.a()), (ECPublicKeyParameters)ECUtil.a(key.b()));
        } else
        {
            if (!(key instanceof ECPublicKey))
            {
                throw new InvalidKeyException((new StringBuilder()).append(c).append(" key agreement requires ").append(a(org/spongycastle/jce/interfaces/ECPublicKey)).append(" for doPhase").toString());
            }
            key = ECUtil.a((PublicKey)key);
        }
        d = f.b(key);
        return null;
    }

    protected int engineGenerateSecret(byte abyte0[], int i)
    {
        byte abyte1[] = engineGenerateSecret();
        if (abyte0.length - i < abyte1.length)
        {
            throw new ShortBufferException((new StringBuilder()).append(c).append(" key agreement: need ").append(abyte1.length).append(" bytes").toString());
        } else
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
            return abyte1.length;
        }
    }

    protected SecretKey engineGenerateSecret(String s)
    {
        byte abyte0[] = a(d);
        if (g != null)
        {
            if (!b.containsKey(s))
            {
                throw new NoSuchAlgorithmException((new StringBuilder("unknown algorithm encountered: ")).append(s).toString());
            }
            int i = ((Integer)b.get(s)).intValue();
            DHKDFParameters dhkdfparameters = new DHKDFParameters(new DERObjectIdentifier(s), i, abyte0);
            abyte0 = new byte[i / 8];
            g.a(dhkdfparameters);
            g.a(abyte0, 0, abyte0.length);
        }
        return new SecretKeySpec(abyte0, s);
    }

    protected byte[] engineGenerateSecret()
    {
        if (g != null)
        {
            throw new UnsupportedOperationException("KDF can only be used when algorithm is known");
        } else
        {
            return a(d);
        }
    }

    protected void engineInit(Key key, SecureRandom securerandom)
    {
        a(key);
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        a(key);
    }

    static 
    {
        b = new Hashtable();
        Integer integer = new Integer(128);
        Integer integer1 = new Integer(192);
        Integer integer2 = new Integer(256);
        b.put(NISTObjectIdentifiers.h.c(), integer);
        b.put(NISTObjectIdentifiers.o.c(), integer1);
        b.put(NISTObjectIdentifiers.v.c(), integer2);
        b.put(NISTObjectIdentifiers.k.c(), integer);
        b.put(NISTObjectIdentifiers.r.c(), integer1);
        b.put(NISTObjectIdentifiers.y.c(), integer2);
        b.put(PKCSObjectIdentifiers.bx.c(), integer1);
    }
}

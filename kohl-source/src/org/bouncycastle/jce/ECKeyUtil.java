// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;

public class ECKeyUtil
{
    private static class UnexpectedException extends RuntimeException
    {

        private Throwable cause;

        public Throwable getCause()
        {
            return cause;
        }

        UnexpectedException(Throwable throwable)
        {
            super(throwable.toString());
            cause = throwable;
        }
    }


    public ECKeyUtil()
    {
    }

    public static PrivateKey privateToExplicitParameters(PrivateKey privatekey, String s)
        throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException
    {
        Provider provider = Security.getProvider(s);
        if (provider == null)
        {
            throw new NoSuchProviderException((new StringBuilder()).append("cannot find provider: ").append(s).toString());
        } else
        {
            return privateToExplicitParameters(privatekey, provider);
        }
    }

    public static PrivateKey privateToExplicitParameters(PrivateKey privatekey, Provider provider)
        throws IllegalArgumentException, NoSuchAlgorithmException
    {
        Object obj;
        PrivateKeyInfo privatekeyinfo;
        try
        {
            privatekeyinfo = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(privatekey.getEncoded()));
            if (privatekeyinfo.getAlgorithmId().getObjectId().equals(CryptoProObjectIdentifiers.gostR3410_2001))
            {
                throw new UnsupportedEncodingException("cannot convert GOST key to explicit parameters.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw privatekey;
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new UnexpectedException(privatekey);
        }
        obj = X962Parameters.getInstance(privatekeyinfo.getAlgorithmId().getParameters());
        if (!((X962Parameters) (obj)).isNamedCurve()) goto _L2; else goto _L1
_L1:
        obj = ECUtil.getNamedCurveByOid(ASN1ObjectIdentifier.getInstance(((X962Parameters) (obj)).getParameters()));
        obj = new X9ECParameters(((X9ECParameters) (obj)).getCurve(), ((X9ECParameters) (obj)).getG(), ((X9ECParameters) (obj)).getN(), ((X9ECParameters) (obj)).getH());
_L4:
        obj = new X962Parameters(((X9ECParameters) (obj)));
        obj = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), privatekeyinfo.parsePrivateKey());
        return KeyFactory.getInstance(privatekey.getAlgorithm(), provider).generatePrivate(new PKCS8EncodedKeySpec(((PrivateKeyInfo) (obj)).getEncoded()));
_L2:
        if (!((X962Parameters) (obj)).isImplicitlyCA())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new X9ECParameters(BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getG(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getN(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getH());
        if (true) goto _L4; else goto _L3
_L3:
        return privatekey;
    }

    public static PublicKey publicToExplicitParameters(PublicKey publickey, String s)
        throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException
    {
        Provider provider = Security.getProvider(s);
        if (provider == null)
        {
            throw new NoSuchProviderException((new StringBuilder()).append("cannot find provider: ").append(s).toString());
        } else
        {
            return publicToExplicitParameters(publickey, provider);
        }
    }

    public static PublicKey publicToExplicitParameters(PublicKey publickey, Provider provider)
        throws IllegalArgumentException, NoSuchAlgorithmException
    {
        Object obj;
        SubjectPublicKeyInfo subjectpublickeyinfo;
        try
        {
            subjectpublickeyinfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(publickey.getEncoded()));
            if (subjectpublickeyinfo.getAlgorithmId().getObjectId().equals(CryptoProObjectIdentifiers.gostR3410_2001))
            {
                throw new IllegalArgumentException("cannot convert GOST key to explicit parameters.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw publickey;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw publickey;
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new UnexpectedException(publickey);
        }
        obj = X962Parameters.getInstance(subjectpublickeyinfo.getAlgorithmId().getParameters());
        if (!((X962Parameters) (obj)).isNamedCurve()) goto _L2; else goto _L1
_L1:
        obj = ECUtil.getNamedCurveByOid(ASN1ObjectIdentifier.getInstance(((X962Parameters) (obj)).getParameters()));
        obj = new X9ECParameters(((X9ECParameters) (obj)).getCurve(), ((X9ECParameters) (obj)).getG(), ((X9ECParameters) (obj)).getN(), ((X9ECParameters) (obj)).getH());
_L4:
        obj = new X962Parameters(((X9ECParameters) (obj)));
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), subjectpublickeyinfo.getPublicKeyData().getBytes());
        return KeyFactory.getInstance(publickey.getAlgorithm(), provider).generatePublic(new X509EncodedKeySpec(((SubjectPublicKeyInfo) (obj)).getEncoded()));
_L2:
        if (!((X962Parameters) (obj)).isImplicitlyCA())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new X9ECParameters(BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getG(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getN(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getH());
        if (true) goto _L4; else goto _L3
_L3:
        return publickey;
    }
}

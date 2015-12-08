// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.openssl;

import java.io.IOException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.io.pem.PemGenerationException;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemObjectGenerator;

// Referenced classes of package org.bouncycastle.openssl:
//            a

public class PKCS8Generator
    implements PemObjectGenerator
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    private char k[];
    private String l;
    private int m;
    private PrivateKey n;
    private Cipher o;
    private SecureRandom p;
    private AlgorithmParameterGenerator q;
    private SecretKeyFactory r;

    public final PemObject a()
    {
        Object obj = n.getEncoded();
        if (l == null)
        {
            return new PemObject("PRIVATE KEY", ((byte []) (obj)));
        }
        Object obj1 = new DERObjectIdentifier(l);
        if (org.bouncycastle.openssl.a.a(((DERObjectIdentifier) (obj1))))
        {
            obj1 = new byte[20];
            if (p == null)
            {
                p = new SecureRandom();
            }
            p.nextBytes(((byte []) (obj1)));
            Object obj2 = org.bouncycastle.openssl.a.a(l, k, ((byte []) (obj1)), m);
            Object obj3 = q.generateParameters();
            try
            {
                o.init(1, ((java.security.Key) (obj2)), ((AlgorithmParameters) (obj3)));
                obj2 = new EncryptionScheme(new DERObjectIdentifier(l), ASN1Object.a(((AlgorithmParameters) (obj3)).getEncoded()));
                obj1 = new KeyDerivationFunc(PKCSObjectIdentifiers.z, new PBKDF2Params(((byte []) (obj1)), m));
                obj3 = new ASN1EncodableVector();
                ((ASN1EncodableVector) (obj3)).a(((org.bouncycastle.asn1.DEREncodable) (obj1)));
                ((ASN1EncodableVector) (obj3)).a(((org.bouncycastle.asn1.DEREncodable) (obj2)));
                obj = new PemObject("ENCRYPTED PRIVATE KEY", (new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.y, new PBES2Parameters(new DERSequence(((ASN1EncodableVector) (obj3))))), o.doFinal(((byte []) (obj))))).a());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new PemGenerationException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new PemGenerationException(((GeneralSecurityException) (obj)).getMessage(), ((Throwable) (obj)));
            }
            return ((PemObject) (obj));
        }
        if (org.bouncycastle.openssl.a.b(((DERObjectIdentifier) (obj1))))
        {
            byte abyte0[] = new byte[20];
            if (p == null)
            {
                p = new SecureRandom();
            }
            p.nextBytes(abyte0);
            try
            {
                Object obj4 = new PBEKeySpec(k);
                PBEParameterSpec pbeparameterspec = new PBEParameterSpec(abyte0, m);
                o.init(1, r.generateSecret(((java.security.spec.KeySpec) (obj4))), pbeparameterspec);
                obj4 = new ASN1EncodableVector();
                ((ASN1EncodableVector) (obj4)).a(new DEROctetString(abyte0));
                ((ASN1EncodableVector) (obj4)).a(new DERInteger(m));
                obj = new PemObject("ENCRYPTED PRIVATE KEY", (new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(((DERObjectIdentifier) (obj1)), new PKCS12PBEParams(new DERSequence(((ASN1EncodableVector) (obj4))))), o.doFinal(((byte []) (obj))))).a());
            }
            catch (IOException ioexception)
            {
                throw new PemGenerationException(ioexception.getMessage(), ioexception);
            }
            catch (GeneralSecurityException generalsecurityexception)
            {
                throw new PemGenerationException(generalsecurityexception.getMessage(), generalsecurityexception);
            }
            return ((PemObject) (obj));
        } else
        {
            throw new PemGenerationException((new StringBuilder("unknown algorithm: ")).append(l).toString());
        }
    }

    static 
    {
        a = NISTObjectIdentifiers.h.e();
        b = NISTObjectIdentifiers.o.e();
        c = NISTObjectIdentifiers.v.e();
        d = PKCSObjectIdentifiers.B.e();
        e = PKCSObjectIdentifiers.bq.e();
        f = PKCSObjectIdentifiers.br.e();
        g = PKCSObjectIdentifiers.bs.e();
        h = PKCSObjectIdentifiers.bt.e();
        i = PKCSObjectIdentifiers.bu.e();
        j = PKCSObjectIdentifiers.bv.e();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

public class JCEElGamalPublicKey
    implements DHPublicKey, ElGamalPublicKey
{

    private BigInteger a;
    private ElGamalParameterSpec b;

    JCEElGamalPublicKey(DHPublicKey dhpublickey)
    {
        a = dhpublickey.getY();
        b = new ElGamalParameterSpec(dhpublickey.getParams().getP(), dhpublickey.getParams().getG());
    }

    JCEElGamalPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        a = dhpublickeyspec.getY();
        b = new ElGamalParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    JCEElGamalPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)subjectpublickeyinfo.e().g());
        try
        {
            subjectpublickeyinfo = (DERInteger)subjectpublickeyinfo.f();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        a = subjectpublickeyinfo.e();
        b = new ElGamalParameterSpec(elgamalparameter.e(), elgamalparameter.f());
    }

    JCEElGamalPublicKey(ElGamalPublicKeyParameters elgamalpublickeyparameters)
    {
        a = elgamalpublickeyparameters.getY();
        b = new ElGamalParameterSpec(elgamalpublickeyparameters.getParameters().getP(), elgamalpublickeyparameters.getParameters().getG());
    }

    JCEElGamalPublicKey(ElGamalPublicKey elgamalpublickey)
    {
        a = elgamalpublickey.getY();
        b = elgamalpublickey.a();
    }

    JCEElGamalPublicKey(ElGamalPublicKeySpec elgamalpublickeyspec)
    {
        a = elgamalpublickeyspec.b();
        b = new ElGamalParameterSpec(elgamalpublickeyspec.a().a(), elgamalpublickeyspec.a().b());
    }

    public final ElGamalParameterSpec a()
    {
        return b;
    }

    public String getAlgorithm()
    {
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.l, (new ElGamalParameter(b.a(), b.b())).c()), new DERInteger(a))).b();
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DHParameterSpec getParams()
    {
        return new DHParameterSpec(b.a(), b.b());
    }

    public BigInteger getY()
    {
        return a;
    }
}

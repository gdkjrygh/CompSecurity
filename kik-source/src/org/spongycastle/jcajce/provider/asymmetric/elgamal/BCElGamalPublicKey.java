// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;
import org.spongycastle.jce.spec.ElGamalParameterSpec;
import org.spongycastle.jce.spec.ElGamalPublicKeySpec;

public class BCElGamalPublicKey
    implements DHPublicKey, ElGamalPublicKey
{

    private BigInteger a;
    private transient ElGamalParameterSpec b;

    BCElGamalPublicKey(DHPublicKey dhpublickey)
    {
        a = dhpublickey.getY();
        b = new ElGamalParameterSpec(dhpublickey.getParams().getP(), dhpublickey.getParams().getG());
    }

    BCElGamalPublicKey(DHPublicKeySpec dhpublickeyspec)
    {
        a = dhpublickeyspec.getY();
        b = new ElGamalParameterSpec(dhpublickeyspec.getP(), dhpublickeyspec.getG());
    }

    BCElGamalPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)subjectpublickeyinfo.d().e());
        try
        {
            subjectpublickeyinfo = (DERInteger)subjectpublickeyinfo.e();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        a = subjectpublickeyinfo.c();
        b = new ElGamalParameterSpec(elgamalparameter.c(), elgamalparameter.d());
    }

    BCElGamalPublicKey(ElGamalPublicKeyParameters elgamalpublickeyparameters)
    {
        a = elgamalpublickeyparameters.c();
        b = new ElGamalParameterSpec(elgamalpublickeyparameters.b().a(), elgamalpublickeyparameters.b().b());
    }

    BCElGamalPublicKey(ElGamalPublicKey elgamalpublickey)
    {
        a = elgamalpublickey.getY();
        b = elgamalpublickey.b();
    }

    BCElGamalPublicKey(ElGamalPublicKeySpec elgamalpublickeyspec)
    {
        a = elgamalpublickeyspec.b();
        b = new ElGamalParameterSpec(elgamalpublickeyspec.a().a(), elgamalpublickeyspec.a().b());
    }

    public final ElGamalParameterSpec b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHPublicKey)
        {
            if (getY().equals(((DHPublicKey) (obj = (DHPublicKey)obj)).getY()) && getParams().getG().equals(((DHPublicKey) (obj)).getParams().getG()) && getParams().getP().equals(((DHPublicKey) (obj)).getParams().getP()) && getParams().getL() == ((DHPublicKey) (obj)).getParams().getL())
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = (new SubjectPublicKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.l, new ElGamalParameter(b.a(), b.b())), new DERInteger(a))).a("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
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

    public int hashCode()
    {
        return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
    }
}

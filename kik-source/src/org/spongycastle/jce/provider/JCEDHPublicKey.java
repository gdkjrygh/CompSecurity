// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class JCEDHPublicKey
    implements DHPublicKey
{

    private BigInteger a;
    private DHParameterSpec b;
    private SubjectPublicKeyInfo c;

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        if (c != null)
        {
            return KeyUtil.a(c);
        } else
        {
            return KeyUtil.a(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, new DHParameter(b.getP(), b.getG(), b.getL())), new DERInteger(a));
        }
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DHParameterSpec getParams()
    {
        return b;
    }

    public BigInteger getY()
    {
        return a;
    }
}

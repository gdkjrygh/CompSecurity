// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PrivateKeyInfo extends ASN1Encodable
{

    private DERObject a;
    private AlgorithmIdentifier b;
    private ASN1Set c;

    public PrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        if (((DERInteger)asn1sequence.nextElement()).e().intValue() != 0)
        {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        b = new AlgorithmIdentifier((ASN1Sequence)asn1sequence.nextElement());
        try
        {
            a = (new ASN1InputStream(((ASN1OctetString)asn1sequence.nextElement()).f())).a();
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Sequence asn1sequence)
        {
            throw new IllegalArgumentException("Error recoverying private key from sequence");
        }
        if (asn1sequence.hasMoreElements())
        {
            c = ASN1Set.a((ASN1TaggedObject)asn1sequence.nextElement());
        }
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, DERObject derobject)
    {
        this(algorithmidentifier, derobject, (byte)0);
    }

    private PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, DERObject derobject, byte byte0)
    {
        a = derobject;
        b = algorithmidentifier;
        c = null;
    }

    public static PrivateKeyInfo a(Object obj)
    {
        if (obj instanceof PrivateKeyInfo)
        {
            return (PrivateKeyInfo)obj;
        }
        if (obj != null)
        {
            return new PrivateKeyInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(0));
        asn1encodablevector.a(b);
        asn1encodablevector.a(new DEROctetString(a));
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, c));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return b;
    }

    public final DERObject f()
    {
        return a;
    }
}

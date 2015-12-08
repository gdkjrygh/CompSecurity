// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class RSAESOAEPparams extends ASN1Encodable
{

    public static final AlgorithmIdentifier a;
    public static final AlgorithmIdentifier b;
    public static final AlgorithmIdentifier c;
    private AlgorithmIdentifier d;
    private AlgorithmIdentifier e;
    private AlgorithmIdentifier f;

    public RSAESOAEPparams()
    {
        d = a;
        e = b;
        f = c;
    }

    public RSAESOAEPparams(ASN1Sequence asn1sequence)
    {
        int i;
        d = a;
        e = b;
        f = c;
        i = 0;
_L2:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.f())
        {
            break MISSING_BLOCK_LABEL_123;
        }
        asn1taggedobject = (ASN1TaggedObject)asn1sequence.a(i);
        switch (asn1taggedobject.e())
        {
        default:
            throw new IllegalArgumentException("unknown tag");

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_112;

        case 0: // '\0'
            d = AlgorithmIdentifier.a(asn1taggedobject);
            break;
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        e = AlgorithmIdentifier.a(asn1taggedobject);
          goto _L3
        f = AlgorithmIdentifier.a(asn1taggedobject);
          goto _L3
    }

    public RSAESOAEPparams(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, AlgorithmIdentifier algorithmidentifier2)
    {
        d = algorithmidentifier;
        e = algorithmidentifier1;
        f = algorithmidentifier2;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!d.equals(a))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, d));
        }
        if (!e.equals(b))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, e));
        }
        if (!f.equals(c))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, f));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return d;
    }

    public final AlgorithmIdentifier f()
    {
        return e;
    }

    public final AlgorithmIdentifier g()
    {
        return f;
    }

    static 
    {
        a = new AlgorithmIdentifier(OIWObjectIdentifiers.i, new DERNull());
        b = new AlgorithmIdentifier(PKCSObjectIdentifiers.l_, a);
        c = new AlgorithmIdentifier(PKCSObjectIdentifiers.j, new DEROctetString(new byte[0]));
    }
}

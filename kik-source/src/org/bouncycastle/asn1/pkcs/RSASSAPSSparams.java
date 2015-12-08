// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class RSASSAPSSparams extends ASN1Encodable
{

    public static final AlgorithmIdentifier a;
    public static final AlgorithmIdentifier b;
    public static final DERInteger c = new DERInteger(20);
    public static final DERInteger d = new DERInteger(1);
    private AlgorithmIdentifier e;
    private AlgorithmIdentifier f;
    private DERInteger g;
    private DERInteger h;

    public RSASSAPSSparams()
    {
        e = a;
        f = b;
        g = c;
        h = d;
    }

    public RSASSAPSSparams(ASN1Sequence asn1sequence)
    {
        int i;
        e = a;
        f = b;
        g = c;
        h = d;
        i = 0;
_L7:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.f())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        asn1taggedobject = (ASN1TaggedObject)asn1sequence.a(i);
        asn1taggedobject.e();
        JVM INSTR tableswitch 0 3: default 84
    //                   0 94
    //                   1 109
    //                   2 120
    //                   3 132;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_132;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException("unknown tag");
_L2:
        e = AlgorithmIdentifier.a(asn1taggedobject);
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        f = AlgorithmIdentifier.a(asn1taggedobject);
          goto _L8
_L4:
        g = DERInteger.a(asn1taggedobject, true);
          goto _L8
        h = DERInteger.a(asn1taggedobject, true);
          goto _L8
    }

    public RSASSAPSSparams(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, DERInteger derinteger, DERInteger derinteger1)
    {
        e = algorithmidentifier;
        f = algorithmidentifier1;
        g = derinteger;
        h = derinteger1;
    }

    public static RSASSAPSSparams a(Object obj)
    {
        if (obj == null || (obj instanceof RSASSAPSSparams))
        {
            return (RSASSAPSSparams)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new RSASSAPSSparams((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!e.equals(a))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, e));
        }
        if (!f.equals(b))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, f));
        }
        if (!g.equals(c))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, g));
        }
        if (!h.equals(d))
        {
            asn1encodablevector.a(new DERTaggedObject(true, 3, h));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final AlgorithmIdentifier e()
    {
        return e;
    }

    public final AlgorithmIdentifier f()
    {
        return f;
    }

    public final DERInteger g()
    {
        return g;
    }

    public final DERInteger h()
    {
        return h;
    }

    static 
    {
        a = new AlgorithmIdentifier(OIWObjectIdentifiers.i, new DERNull());
        b = new AlgorithmIdentifier(PKCSObjectIdentifiers.l_, a);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class RSASSAPSSparams extends ASN1Object
{

    public static final AlgorithmIdentifier a;
    public static final AlgorithmIdentifier b;
    public static final ASN1Integer c = new ASN1Integer(20);
    public static final ASN1Integer d = new ASN1Integer(1);
    private AlgorithmIdentifier e;
    private AlgorithmIdentifier f;
    private ASN1Integer g;
    private ASN1Integer h;

    public RSASSAPSSparams()
    {
        e = a;
        f = b;
        g = c;
        h = d;
    }

    private RSASSAPSSparams(ASN1Sequence asn1sequence)
    {
        int i;
        e = a;
        f = b;
        g = c;
        h = d;
        i = 0;
_L7:
        ASN1TaggedObject asn1taggedobject;
        if (i == asn1sequence.e())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        asn1taggedobject = (ASN1TaggedObject)asn1sequence.a(i);
        asn1taggedobject.c();
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
        g = ASN1Integer.a(asn1taggedobject, true);
          goto _L8
        h = ASN1Integer.a(asn1taggedobject, true);
          goto _L8
    }

    public RSASSAPSSparams(AlgorithmIdentifier algorithmidentifier, AlgorithmIdentifier algorithmidentifier1, ASN1Integer asn1integer, ASN1Integer asn1integer1)
    {
        e = algorithmidentifier;
        f = algorithmidentifier1;
        g = asn1integer;
        h = asn1integer1;
    }

    public static RSASSAPSSparams a(Object obj)
    {
        if (obj instanceof RSASSAPSSparams)
        {
            return (RSASSAPSSparams)obj;
        }
        if (obj != null)
        {
            return new RSASSAPSSparams(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
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

    public final AlgorithmIdentifier c()
    {
        return e;
    }

    public final AlgorithmIdentifier d()
    {
        return f;
    }

    public final BigInteger e()
    {
        return g.c();
    }

    public final BigInteger f()
    {
        return h.c();
    }

    static 
    {
        a = new AlgorithmIdentifier(OIWObjectIdentifiers.i, new DERNull());
        b = new AlgorithmIdentifier(PKCSObjectIdentifiers.H_, a);
    }
}

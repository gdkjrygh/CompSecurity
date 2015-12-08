// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1ObjectIdentifier, ASN1Integer, DERTaggedObject, 
//            ASN1EncodableVector, ASN1TaggedObject, ASN1Encodable, ASN1OutputStream

public class DERExternal extends ASN1Primitive
{

    private ASN1ObjectIdentifier a;
    private ASN1Integer b;
    private ASN1Primitive c;
    private int d;
    private ASN1Primitive e;

    public DERExternal(ASN1EncodableVector asn1encodablevector)
    {
        int i1 = 1;
        super();
        ASN1Primitive asn1primitive1 = a(asn1encodablevector, 0);
        ASN1Primitive asn1primitive;
        int l;
        if (asn1primitive1 instanceof ASN1ObjectIdentifier)
        {
            a = (ASN1ObjectIdentifier)asn1primitive1;
            asn1primitive1 = a(asn1encodablevector, 1);
        } else
        {
            i1 = 0;
        }
        asn1primitive = asn1primitive1;
        l = i1;
        if (asn1primitive1 instanceof ASN1Integer)
        {
            b = (ASN1Integer)asn1primitive1;
            l = i1 + 1;
            asn1primitive = a(asn1encodablevector, l);
        }
        asn1primitive1 = asn1primitive;
        i1 = l;
        if (!(asn1primitive instanceof DERTaggedObject))
        {
            c = asn1primitive;
            i1 = l + 1;
            asn1primitive1 = a(asn1encodablevector, i1);
        }
        if (asn1encodablevector.a.size() != i1 + 1)
        {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(asn1primitive1 instanceof DERTaggedObject))
        {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        asn1encodablevector = (DERTaggedObject)asn1primitive1;
        l = ((ASN1TaggedObject) (asn1encodablevector)).a;
        if (l < 0 || l > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid encoding value: ")).append(l).toString());
        } else
        {
            d = l;
            e = asn1encodablevector.k();
            return;
        }
    }

    private static ASN1Primitive a(ASN1EncodableVector asn1encodablevector, int l)
    {
        if (asn1encodablevector.a.size() <= l)
        {
            throw new IllegalArgumentException("too few objects in input vector");
        } else
        {
            return asn1encodablevector.a(l).a();
        }
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (a != null)
        {
            bytearrayoutputstream.write(a.a("DER"));
        }
        if (b != null)
        {
            bytearrayoutputstream.write(b.a("DER"));
        }
        if (c != null)
        {
            bytearrayoutputstream.write(c.a("DER"));
        }
        bytearrayoutputstream.write((new DERTaggedObject(true, d, e)).a("DER"));
        asn1outputstream.a(32, 8, bytearrayoutputstream.toByteArray());
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof DERExternal)
        {
            if (this == asn1primitive)
            {
                return true;
            }
            asn1primitive = (DERExternal)asn1primitive;
            if ((a == null || ((DERExternal) (asn1primitive)).a != null && ((DERExternal) (asn1primitive)).a.equals(a)) && (b == null || ((DERExternal) (asn1primitive)).b != null && ((DERExternal) (asn1primitive)).b.equals(b)) && (c == null || ((DERExternal) (asn1primitive)).c != null && ((DERExternal) (asn1primitive)).c.equals(c)))
            {
                return e.equals(((DERExternal) (asn1primitive)).e);
            }
        }
        return false;
    }

    public final ASN1Primitive c()
    {
        return c;
    }

    public final ASN1ObjectIdentifier d()
    {
        return a;
    }

    public final int e()
    {
        return d;
    }

    final boolean h()
    {
        return true;
    }

    public int hashCode()
    {
        int i1 = 0;
        if (a != null)
        {
            i1 = a.hashCode();
        }
        int l = i1;
        if (b != null)
        {
            l = i1 ^ b.hashCode();
        }
        i1 = l;
        if (c != null)
        {
            i1 = l ^ c.hashCode();
        }
        return i1 ^ e.hashCode();
    }

    final int i()
    {
        return b().length;
    }

    public final ASN1Primitive j()
    {
        return e;
    }

    public final ASN1Integer k()
    {
        return b;
    }
}

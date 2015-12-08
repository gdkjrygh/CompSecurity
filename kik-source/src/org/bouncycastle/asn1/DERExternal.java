// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERObjectIdentifier, DERInteger, DERTaggedObject, 
//            ASN1EncodableVector, ASN1TaggedObject, DEREncodable, DEROutputStream, 
//            DERObject

public class DERExternal extends ASN1Object
{

    private DERObjectIdentifier a;
    private DERInteger b;
    private ASN1Object c;
    private int d;
    private DERObject e;

    public DERExternal(ASN1EncodableVector asn1encodablevector)
    {
        int k = 1;
        super();
        DERObject derobject1 = a(asn1encodablevector, 0);
        DERObject derobject;
        int j;
        if (derobject1 instanceof DERObjectIdentifier)
        {
            a = (DERObjectIdentifier)derobject1;
            derobject1 = a(asn1encodablevector, 1);
        } else
        {
            k = 0;
        }
        derobject = derobject1;
        j = k;
        if (derobject1 instanceof DERInteger)
        {
            b = (DERInteger)derobject1;
            j = k + 1;
            derobject = a(asn1encodablevector, j);
        }
        derobject1 = derobject;
        k = j;
        if (!(derobject instanceof DERTaggedObject))
        {
            c = (ASN1Object)derobject;
            k = j + 1;
            derobject1 = a(asn1encodablevector, k);
        }
        if (asn1encodablevector.a.size() != k + 1)
        {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(derobject1 instanceof DERTaggedObject))
        {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        asn1encodablevector = (DERTaggedObject)derobject1;
        j = ((ASN1TaggedObject) (asn1encodablevector)).a;
        if (j < 0 || j > 2)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid encoding value: ")).append(j).toString());
        } else
        {
            d = j;
            e = asn1encodablevector.i();
            return;
        }
    }

    private static DERObject a(ASN1EncodableVector asn1encodablevector, int j)
    {
        if (asn1encodablevector.a.size() <= j)
        {
            throw new IllegalArgumentException("too few objects in input vector");
        } else
        {
            return asn1encodablevector.a(j).c();
        }
    }

    final void a(DEROutputStream deroutputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (a != null)
        {
            bytearrayoutputstream.write(a.b());
        }
        if (b != null)
        {
            bytearrayoutputstream.write(b.b());
        }
        if (c != null)
        {
            bytearrayoutputstream.write(c.b());
        }
        bytearrayoutputstream.write((new DERTaggedObject(d, e)).b());
        deroutputstream.a(32, 8, bytearrayoutputstream.toByteArray());
    }

    final boolean a(DERObject derobject)
    {
        if (derobject instanceof DERExternal)
        {
            if (this == derobject)
            {
                return true;
            }
            derobject = (DERExternal)derobject;
            if ((a == null || ((DERExternal) (derobject)).a != null && ((DERExternal) (derobject)).a.equals(a)) && (b == null || ((DERExternal) (derobject)).b != null && ((DERExternal) (derobject)).b.equals(b)) && (c == null || ((DERExternal) (derobject)).c != null && ((DERExternal) (derobject)).c.equals(c)))
            {
                return e.equals(((DERExternal) (derobject)).e);
            }
        }
        return false;
    }

    public final ASN1Object e()
    {
        return c;
    }

    public final DERObjectIdentifier f()
    {
        return a;
    }

    public final int g()
    {
        return d;
    }

    public final DERObject h()
    {
        return e;
    }

    public int hashCode()
    {
        int k = 0;
        if (a != null)
        {
            k = a.hashCode();
        }
        int j = k;
        if (b != null)
        {
            j = k ^ b.hashCode();
        }
        k = j;
        if (c != null)
        {
            k = j ^ c.hashCode();
        }
        return k ^ e.hashCode();
    }

    public final DERInteger i()
    {
        return b;
    }
}

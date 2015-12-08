// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1TaggedObject, ASN1OutputStream, ASN1OctetString, BEROctetString, 
//            ASN1Encodable, ASN1Sequence, ASN1Set, ASN1Primitive, 
//            j

public class BERTaggedObject extends ASN1TaggedObject
{

    public BERTaggedObject(ASN1Encodable asn1encodable)
    {
        super(true, 0, asn1encodable);
    }

    public BERTaggedObject(boolean flag, int k, ASN1Encodable asn1encodable)
    {
        super(flag, k, asn1encodable);
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(160, a);
        asn1outputstream.b(128);
        if (!b)
        {
            if (!c)
            {
                Enumeration enumeration;
                if (d instanceof ASN1OctetString)
                {
                    if (d instanceof BEROctetString)
                    {
                        enumeration = ((BEROctetString)d).j();
                    } else
                    {
                        enumeration = (new BEROctetString(((ASN1OctetString)d).d())).j();
                    }
                } else
                if (d instanceof ASN1Sequence)
                {
                    enumeration = ((ASN1Sequence)d).d();
                } else
                if (d instanceof ASN1Set)
                {
                    enumeration = ((ASN1Set)d).c();
                } else
                {
                    throw new RuntimeException((new StringBuilder("not implemented: ")).append(d.getClass().getName()).toString());
                }
                for (; enumeration.hasMoreElements(); asn1outputstream.a((ASN1Encodable)enumeration.nextElement())) { }
            } else
            {
                asn1outputstream.a(d);
            }
        }
        asn1outputstream.b(0);
        asn1outputstream.b(0);
    }

    final boolean h()
    {
        if (b || c)
        {
            return true;
        } else
        {
            return d.a().f().h();
        }
    }

    final int i()
    {
        if (!b)
        {
            int k = d.a().i();
            if (c)
            {
                return k + (j.b(a) + j.a(k));
            } else
            {
                return (k - 1) + j.b(a);
            }
        } else
        {
            return j.b(a) + 1;
        }
    }
}

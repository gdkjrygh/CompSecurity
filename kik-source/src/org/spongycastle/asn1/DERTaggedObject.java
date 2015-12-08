// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


// Referenced classes of package org.spongycastle.asn1:
//            ASN1TaggedObject, ASN1Encodable, ASN1Primitive, ASN1OutputStream, 
//            j

public class DERTaggedObject extends ASN1TaggedObject
{

    private static final byte e[] = new byte[0];

    public DERTaggedObject(int k, ASN1Encodable asn1encodable)
    {
        super(true, k, asn1encodable);
    }

    public DERTaggedObject(boolean flag, int k, ASN1Encodable asn1encodable)
    {
        super(flag, k, asn1encodable);
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        char c = '\240';
        if (!b)
        {
            ASN1Primitive asn1primitive = d.a().f();
            if (this.c)
            {
                asn1outputstream.a(160, a);
                asn1outputstream.a(asn1primitive.i());
                asn1outputstream.a(asn1primitive);
                return;
            }
            if (!asn1primitive.h())
            {
                c = '\200';
            }
            asn1outputstream.a(c, a);
            asn1outputstream.a(asn1primitive);
            return;
        } else
        {
            asn1outputstream.a(160, a, e);
            return;
        }
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
            int k = d.a().f().i();
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

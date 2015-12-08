// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            DERTaggedObject, ASN1OutputStream, BEROutputStream, DEROutputStream, 
//            ASN1OctetString, BERConstructedOctetString, ASN1Sequence, ASN1Set, 
//            DEREncodable

public class BERTaggedObject extends DERTaggedObject
{

    public BERTaggedObject(DEREncodable derencodable)
    {
        super(0, derencodable);
    }

    public BERTaggedObject(boolean flag, int i, DEREncodable derencodable)
    {
        super(flag, i, derencodable);
    }

    final void a(DEROutputStream deroutputstream)
    {
        if ((deroutputstream instanceof ASN1OutputStream) || (deroutputstream instanceof BEROutputStream))
        {
            deroutputstream.a(160, a);
            deroutputstream.write(128);
            if (!b)
            {
                if (!c)
                {
                    Enumeration enumeration;
                    if (d instanceof ASN1OctetString)
                    {
                        if (d instanceof BERConstructedOctetString)
                        {
                            enumeration = ((BERConstructedOctetString)d).h();
                        } else
                        {
                            enumeration = (new BERConstructedOctetString(((ASN1OctetString)d).f())).h();
                        }
                    } else
                    if (d instanceof ASN1Sequence)
                    {
                        enumeration = ((ASN1Sequence)d).e();
                    } else
                    if (d instanceof ASN1Set)
                    {
                        enumeration = ((ASN1Set)d).e();
                    } else
                    {
                        throw new RuntimeException((new StringBuilder("not implemented: ")).append(d.getClass().getName()).toString());
                    }
                    for (; enumeration.hasMoreElements(); deroutputstream.a(enumeration.nextElement())) { }
                } else
                {
                    deroutputstream.a(d);
                }
            }
            deroutputstream.write(0);
            deroutputstream.write(0);
            return;
        } else
        {
            super.a(deroutputstream);
            return;
        }
    }
}

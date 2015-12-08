// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1TaggedObject, DEREncodable, DERObject, DEROutputStream

public class DERTaggedObject extends ASN1TaggedObject
{

    private static final byte e[] = new byte[0];

    public DERTaggedObject(int i, DEREncodable derencodable)
    {
        super(i, derencodable);
    }

    public DERTaggedObject(boolean flag, int i, DEREncodable derencodable)
    {
        super(flag, i, derencodable);
    }

    void a(DEROutputStream deroutputstream)
    {
        char c = '\240';
        if (!b)
        {
            byte abyte0[] = d.c().a("DER");
            if (this.c)
            {
                deroutputstream.a(160, a, abyte0);
                return;
            }
            if ((abyte0[0] & 0x20) == 0)
            {
                c = '\200';
            }
            deroutputstream.a(c, a);
            deroutputstream.write(abyte0, 1, abyte0.length - 1);
            return;
        } else
        {
            deroutputstream.a(160, a, e);
            return;
        }
    }

}

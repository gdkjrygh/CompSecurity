// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            InfoTypeAndValue

public class GenRepContent extends ASN1Object
{

    private ASN1Sequence content;

    private GenRepContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public GenRepContent(InfoTypeAndValue infotypeandvalue)
    {
        content = new DERSequence(infotypeandvalue);
    }

    public GenRepContent(InfoTypeAndValue ainfotypeandvalue[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < ainfotypeandvalue.length; i++)
        {
            asn1encodablevector.add(ainfotypeandvalue[i]);
        }

        content = new DERSequence(asn1encodablevector);
    }

    public static GenRepContent getInstance(Object obj)
    {
        if (obj instanceof GenRepContent)
        {
            return (GenRepContent)obj;
        }
        if (obj != null)
        {
            return new GenRepContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }

    public InfoTypeAndValue[] toInfoTypeAndValueArray()
    {
        InfoTypeAndValue ainfotypeandvalue[] = new InfoTypeAndValue[content.size()];
        for (int i = 0; i != ainfotypeandvalue.length; i++)
        {
            ainfotypeandvalue[i] = InfoTypeAndValue.getInstance(content.getObjectAt(i));
        }

        return ainfotypeandvalue;
    }
}

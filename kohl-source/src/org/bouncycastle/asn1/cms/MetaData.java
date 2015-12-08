// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            Attributes

public class MetaData extends ASN1Object
{

    private DERUTF8String fileName;
    private DERBoolean hashProtected;
    private DERIA5String mediaType;
    private Attributes otherMetaData;

    private MetaData(ASN1Sequence asn1sequence)
    {
        hashProtected = DERBoolean.getInstance(asn1sequence.getObjectAt(0));
        byte byte0;
        int i;
        if (1 < asn1sequence.size() && (asn1sequence.getObjectAt(1) instanceof DERUTF8String))
        {
            byte0 = 2;
            fileName = DERUTF8String.getInstance(asn1sequence.getObjectAt(1));
        } else
        {
            byte0 = 1;
        }
        i = byte0;
        if (byte0 < asn1sequence.size())
        {
            i = byte0;
            if (asn1sequence.getObjectAt(byte0) instanceof DERIA5String)
            {
                mediaType = DERIA5String.getInstance(asn1sequence.getObjectAt(byte0));
                i = byte0 + 1;
            }
        }
        if (i < asn1sequence.size())
        {
            otherMetaData = Attributes.getInstance(asn1sequence.getObjectAt(i));
        }
    }

    public MetaData(DERBoolean derboolean, DERUTF8String derutf8string, DERIA5String deria5string, Attributes attributes)
    {
        hashProtected = derboolean;
        fileName = derutf8string;
        mediaType = deria5string;
        otherMetaData = attributes;
    }

    public static MetaData getInstance(Object obj)
    {
        if (obj instanceof MetaData)
        {
            return (MetaData)obj;
        }
        if (obj != null)
        {
            return new MetaData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DERUTF8String getFileName()
    {
        return fileName;
    }

    public DERIA5String getMediaType()
    {
        return mediaType;
    }

    public Attributes getOtherMetaData()
    {
        return otherMetaData;
    }

    public boolean isHashProtected()
    {
        return hashProtected.isTrue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(hashProtected);
        if (fileName != null)
        {
            asn1encodablevector.add(fileName);
        }
        if (mediaType != null)
        {
            asn1encodablevector.add(mediaType);
        }
        if (otherMetaData != null)
        {
            asn1encodablevector.add(otherMetaData);
        }
        return new DERSequence(asn1encodablevector);
    }
}

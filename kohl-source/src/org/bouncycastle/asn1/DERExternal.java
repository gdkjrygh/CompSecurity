// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1ObjectIdentifier, ASN1Integer, DERTaggedObject, 
//            ASN1EncodableVector, ASN1Encodable, ASN1OutputStream

public class DERExternal extends ASN1Primitive
{

    private ASN1Primitive dataValueDescriptor;
    private ASN1ObjectIdentifier directReference;
    private int encoding;
    private ASN1Primitive externalContent;
    private ASN1Integer indirectReference;

    public DERExternal(ASN1EncodableVector asn1encodablevector)
    {
        int j = 0;
        ASN1Primitive asn1primitive1 = getObjFromVector(asn1encodablevector, 0);
        ASN1Primitive asn1primitive = asn1primitive1;
        if (asn1primitive1 instanceof ASN1ObjectIdentifier)
        {
            directReference = (ASN1ObjectIdentifier)asn1primitive1;
            j = 1;
            asn1primitive = getObjFromVector(asn1encodablevector, 1);
        }
        asn1primitive1 = asn1primitive;
        int i = j;
        if (asn1primitive instanceof ASN1Integer)
        {
            indirectReference = (ASN1Integer)asn1primitive;
            i = j + 1;
            asn1primitive1 = getObjFromVector(asn1encodablevector, i);
        }
        asn1primitive = asn1primitive1;
        j = i;
        if (!(asn1primitive1 instanceof DERTaggedObject))
        {
            dataValueDescriptor = asn1primitive1;
            j = i + 1;
            asn1primitive = getObjFromVector(asn1encodablevector, j);
        }
        if (asn1encodablevector.size() != j + 1)
        {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(asn1primitive instanceof DERTaggedObject))
        {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        } else
        {
            asn1encodablevector = (DERTaggedObject)asn1primitive;
            setEncoding(asn1encodablevector.getTagNo());
            externalContent = asn1encodablevector.getObject();
            return;
        }
    }

    public DERExternal(ASN1ObjectIdentifier asn1objectidentifier, ASN1Integer asn1integer, ASN1Primitive asn1primitive, int i, ASN1Primitive asn1primitive1)
    {
        setDirectReference(asn1objectidentifier);
        setIndirectReference(asn1integer);
        setDataValueDescriptor(asn1primitive);
        setEncoding(i);
        setExternalContent(asn1primitive1.toASN1Primitive());
    }

    public DERExternal(ASN1ObjectIdentifier asn1objectidentifier, ASN1Integer asn1integer, ASN1Primitive asn1primitive, DERTaggedObject dertaggedobject)
    {
        this(asn1objectidentifier, asn1integer, asn1primitive, dertaggedobject.getTagNo(), dertaggedobject.toASN1Primitive());
    }

    private ASN1Primitive getObjFromVector(ASN1EncodableVector asn1encodablevector, int i)
    {
        if (asn1encodablevector.size() <= i)
        {
            throw new IllegalArgumentException("too few objects in input vector");
        } else
        {
            return asn1encodablevector.get(i).toASN1Primitive();
        }
    }

    private void setDataValueDescriptor(ASN1Primitive asn1primitive)
    {
        dataValueDescriptor = asn1primitive;
    }

    private void setDirectReference(ASN1ObjectIdentifier asn1objectidentifier)
    {
        directReference = asn1objectidentifier;
    }

    private void setEncoding(int i)
    {
        if (i < 0 || i > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid encoding value: ").append(i).toString());
        } else
        {
            encoding = i;
            return;
        }
    }

    private void setExternalContent(ASN1Primitive asn1primitive)
    {
        externalContent = asn1primitive;
    }

    private void setIndirectReference(ASN1Integer asn1integer)
    {
        indirectReference = asn1integer;
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof DERExternal)
        {
            if (this == asn1primitive)
            {
                return true;
            }
            asn1primitive = (DERExternal)asn1primitive;
            if ((directReference == null || ((DERExternal) (asn1primitive)).directReference != null && ((DERExternal) (asn1primitive)).directReference.equals(directReference)) && (indirectReference == null || ((DERExternal) (asn1primitive)).indirectReference != null && ((DERExternal) (asn1primitive)).indirectReference.equals(indirectReference)) && (dataValueDescriptor == null || ((DERExternal) (asn1primitive)).dataValueDescriptor != null && ((DERExternal) (asn1primitive)).dataValueDescriptor.equals(dataValueDescriptor)))
            {
                return externalContent.equals(((DERExternal) (asn1primitive)).externalContent);
            }
        }
        return false;
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (directReference != null)
        {
            bytearrayoutputstream.write(directReference.getEncoded("DER"));
        }
        if (indirectReference != null)
        {
            bytearrayoutputstream.write(indirectReference.getEncoded("DER"));
        }
        if (dataValueDescriptor != null)
        {
            bytearrayoutputstream.write(dataValueDescriptor.getEncoded("DER"));
        }
        bytearrayoutputstream.write((new DERTaggedObject(true, encoding, externalContent)).getEncoded("DER"));
        asn1outputstream.writeEncoded(32, 8, bytearrayoutputstream.toByteArray());
    }

    int encodedLength()
        throws IOException
    {
        return getEncoded().length;
    }

    public ASN1Primitive getDataValueDescriptor()
    {
        return dataValueDescriptor;
    }

    public ASN1ObjectIdentifier getDirectReference()
    {
        return directReference;
    }

    public int getEncoding()
    {
        return encoding;
    }

    public ASN1Primitive getExternalContent()
    {
        return externalContent;
    }

    public ASN1Integer getIndirectReference()
    {
        return indirectReference;
    }

    public int hashCode()
    {
        int j = 0;
        if (directReference != null)
        {
            j = directReference.hashCode();
        }
        int i = j;
        if (indirectReference != null)
        {
            i = j ^ indirectReference.hashCode();
        }
        j = i;
        if (dataValueDescriptor != null)
        {
            j = i ^ dataValueDescriptor.hashCode();
        }
        return j ^ externalContent.hashCode();
    }

    boolean isConstructed()
    {
        return true;
    }
}

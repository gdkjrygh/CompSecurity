// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Sequence, LazyConstructionEnumeration, ASN1OutputStream, ASN1Primitive, 
//            StreamUtil, ASN1Encodable

class LazyEncodedSequence extends ASN1Sequence
{

    private byte encoded[];

    LazyEncodedSequence(byte abyte0[])
        throws IOException
    {
        encoded = abyte0;
    }

    private void parse()
    {
        for (LazyConstructionEnumeration lazyconstructionenumeration = new LazyConstructionEnumeration(encoded); lazyconstructionenumeration.hasMoreElements(); seq.addElement(lazyconstructionenumeration.nextElement())) { }
        encoded = null;
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        if (encoded != null)
        {
            asn1outputstream.writeEncoded(48, encoded);
            return;
        } else
        {
            super.toDLObject().encode(asn1outputstream);
            return;
        }
    }

    int encodedLength()
        throws IOException
    {
        if (encoded != null)
        {
            return StreamUtil.calculateBodyLength(encoded.length) + 1 + encoded.length;
        } else
        {
            return super.toDLObject().encodedLength();
        }
    }

    public ASN1Encodable getObjectAt(int i)
    {
        this;
        JVM INSTR monitorenter ;
        ASN1Encodable asn1encodable;
        if (encoded != null)
        {
            parse();
        }
        asn1encodable = super.getObjectAt(i);
        this;
        JVM INSTR monitorexit ;
        return asn1encodable;
        Exception exception;
        exception;
        throw exception;
    }

    public Enumeration getObjects()
    {
        this;
        JVM INSTR monitorenter ;
        if (encoded != null) goto _L2; else goto _L1
_L1:
        Object obj = super.getObjects();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Enumeration) (obj));
_L2:
        obj = new LazyConstructionEnumeration(encoded);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (encoded != null)
        {
            parse();
        }
        i = super.size();
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    ASN1Primitive toDERObject()
    {
        if (encoded != null)
        {
            parse();
        }
        return super.toDERObject();
    }

    ASN1Primitive toDLObject()
    {
        if (encoded != null)
        {
            parse();
        }
        return super.toDLObject();
    }
}

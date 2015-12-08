// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1OctetStringParser, ASN1Encodable, ASN1TaggedObject, 
//            ASN1Sequence, BEROctetString, DEROctetString, ASN1OutputStream

public abstract class ASN1OctetString extends ASN1Primitive
    implements ASN1OctetStringParser
{

    byte a[];

    public ASN1OctetString(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("string cannot be null");
        } else
        {
            a = abyte0;
            return;
        }
    }

    public static ASN1OctetString a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1OctetString))
        {
            return (ASN1OctetString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = a(ASN1Primitive.a((byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder("failed to construct OCTET STRING from byte[]: ")).append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1OctetString) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).a();
            if (asn1primitive instanceof ASN1OctetString)
            {
                return (ASN1OctetString)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
    }

    public static ASN1OctetString a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.k();
        if (asn1taggedobject instanceof ASN1OctetString)
        {
            return a(asn1taggedobject);
        } else
        {
            return BEROctetString.a(ASN1Sequence.a(asn1taggedobject));
        }
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof ASN1OctetString))
        {
            return false;
        } else
        {
            asn1primitive = (ASN1OctetString)asn1primitive;
            return Arrays.a(a, ((ASN1OctetString) (asn1primitive)).a);
        }
    }

    public final InputStream c()
    {
        return new ByteArrayInputStream(a);
    }

    public byte[] d()
    {
        return a;
    }

    public final ASN1Primitive e()
    {
        return a();
    }

    final ASN1Primitive f()
    {
        return new DEROctetString(a);
    }

    final ASN1Primitive g()
    {
        return new DEROctetString(a);
    }

    public int hashCode()
    {
        return Arrays.a(d());
    }

    public String toString()
    {
        return (new StringBuilder("#")).append(new String(Hex.a(a))).toString();
    }
}

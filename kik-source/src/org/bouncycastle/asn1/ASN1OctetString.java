// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1OctetStringParser, DEREncodable, DERObject, 
//            ASN1TaggedObject, ASN1Sequence, BERConstructedOctetString, DEROutputStream

public abstract class ASN1OctetString extends ASN1Object
    implements ASN1OctetStringParser
{

    byte a[];

    public ASN1OctetString(DEREncodable derencodable)
    {
        try
        {
            a = derencodable.c().a("DER");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DEREncodable derencodable)
        {
            throw new IllegalArgumentException((new StringBuilder("Error processing object : ")).append(derencodable.toString()).toString());
        }
    }

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
        do
        {
            if (obj == null || (obj instanceof ASN1OctetString))
            {
                return (ASN1OctetString)obj;
            }
            if (obj instanceof ASN1TaggedObject)
            {
                obj = ((ASN1TaggedObject)obj).i();
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
            }
        } while (true);
    }

    public static ASN1OctetString a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.i();
        if (asn1taggedobject instanceof ASN1OctetString)
        {
            return a(asn1taggedobject);
        } else
        {
            return BERConstructedOctetString.a(ASN1Sequence.a(asn1taggedobject));
        }
    }

    abstract void a(DEROutputStream deroutputstream);

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof ASN1OctetString))
        {
            return false;
        } else
        {
            derobject = (ASN1OctetString)derobject;
            return Arrays.a(a, ((ASN1OctetString) (derobject)).a);
        }
    }

    public final InputStream e()
    {
        return new ByteArrayInputStream(a);
    }

    public byte[] f()
    {
        return a;
    }

    public final DERObject g()
    {
        return c();
    }

    public int hashCode()
    {
        return Arrays.b(f());
    }

    public String toString()
    {
        return (new StringBuilder("#")).append(new String(Hex.a(a))).toString();
    }
}

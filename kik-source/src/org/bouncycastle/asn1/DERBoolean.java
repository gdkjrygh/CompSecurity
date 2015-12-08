// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1TaggedObject, ASN1OctetString, DEROutputStream, 
//            DERObject

public class DERBoolean extends ASN1Object
{

    public static final DERBoolean b = new DERBoolean(false);
    public static final DERBoolean c = new DERBoolean(true);
    byte a;

    public DERBoolean(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        a = byte0;
    }

    public DERBoolean(byte abyte0[])
    {
        if (abyte0.length != 1)
        {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        } else
        {
            a = abyte0[0];
            return;
        }
    }

    public static DERBoolean a(Object obj)
    {
        if (obj == null || (obj instanceof DERBoolean))
        {
            return (DERBoolean)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static DERBoolean a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.i();
        if (asn1taggedobject instanceof DERBoolean)
        {
            return a(asn1taggedobject);
        } else
        {
            return new DERBoolean(((ASN1OctetString)asn1taggedobject).f());
        }
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(1, new byte[] {
            a
        });
    }

    protected final boolean a(DERObject derobject)
    {
        while (derobject == null || !(derobject instanceof DERBoolean) || a != ((DERBoolean)derobject).a) 
        {
            return false;
        }
        return true;
    }

    public final boolean e()
    {
        return a != 0;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        if (a != 0)
        {
            return "TRUE";
        } else
        {
            return "FALSE";
        }
    }

}

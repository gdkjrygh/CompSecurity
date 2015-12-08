// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1TaggedObjectParser, ASN1Choice, ASN1Encodable, 
//            DERTaggedObject, DLTaggedObject, ASN1OutputStream

public abstract class ASN1TaggedObject extends ASN1Primitive
    implements ASN1TaggedObjectParser
{

    int a;
    boolean b;
    boolean c;
    ASN1Encodable d;

    public ASN1TaggedObject(boolean flag, int i, ASN1Encodable asn1encodable)
    {
        b = false;
        c = true;
        d = null;
        if (asn1encodable instanceof ASN1Choice)
        {
            c = true;
        } else
        {
            c = flag;
        }
        a = i;
        if (c)
        {
            d = asn1encodable;
            return;
        } else
        {
            asn1encodable.a();
            d = asn1encodable;
            return;
        }
    }

    public static ASN1TaggedObject a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1TaggedObject))
        {
            return (ASN1TaggedObject)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = a(a((byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder("failed to construct tagged object from byte[]: ")).append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1TaggedObject) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1TaggedObject a(ASN1TaggedObject asn1taggedobject)
    {
        return (ASN1TaggedObject)asn1taggedobject.k();
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof ASN1TaggedObject) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a != ((ASN1TaggedObject) (asn1primitive = (ASN1TaggedObject)asn1primitive)).a || b != ((ASN1TaggedObject) (asn1primitive)).b || c != ((ASN1TaggedObject) (asn1primitive)).c) goto _L1; else goto _L3
_L3:
        if (d != null) goto _L5; else goto _L4
_L4:
        if (((ASN1TaggedObject) (asn1primitive)).d != null) goto _L1; else goto _L6
_L6:
        return true;
_L5:
        if (!d.a().equals(((ASN1TaggedObject) (asn1primitive)).d.a()))
        {
            return false;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final int c()
    {
        return a;
    }

    public final boolean d()
    {
        return c;
    }

    public final ASN1Primitive e()
    {
        return a();
    }

    final ASN1Primitive f()
    {
        return new DERTaggedObject(c, a, d);
    }

    final ASN1Primitive g()
    {
        return new DLTaggedObject(c, a, d);
    }

    public int hashCode()
    {
        int l = a;
        int i = l;
        if (d != null)
        {
            i = l ^ d.hashCode();
        }
        return i;
    }

    public final boolean j()
    {
        return b;
    }

    public final ASN1Primitive k()
    {
        if (d != null)
        {
            return d.a();
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder("[")).append(a).append("]").append(d).toString();
    }
}

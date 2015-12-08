// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1TaggedObjectParser, ASN1Choice, DEREncodable, 
//            DERObject, DEROutputStream

public abstract class ASN1TaggedObject extends ASN1Object
    implements ASN1TaggedObjectParser
{

    int a;
    boolean b;
    boolean c;
    DEREncodable d;

    public ASN1TaggedObject(int j, DEREncodable derencodable)
    {
        b = false;
        c = true;
        d = null;
        c = true;
        a = j;
        d = derencodable;
    }

    public ASN1TaggedObject(boolean flag, int j, DEREncodable derencodable)
    {
        b = false;
        c = true;
        d = null;
        if (derencodable instanceof ASN1Choice)
        {
            c = true;
        } else
        {
            c = flag;
        }
        a = j;
        d = derencodable;
    }

    public static ASN1TaggedObject a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1TaggedObject))
        {
            return (ASN1TaggedObject)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1TaggedObject a(ASN1TaggedObject asn1taggedobject)
    {
        return (ASN1TaggedObject)asn1taggedobject.i();
    }

    abstract void a(DEROutputStream deroutputstream);

    final boolean a(DERObject derobject)
    {
        if (derobject instanceof ASN1TaggedObject) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a != ((ASN1TaggedObject) (derobject = (ASN1TaggedObject)derobject)).a || b != ((ASN1TaggedObject) (derobject)).b || c != ((ASN1TaggedObject) (derobject)).c) goto _L1; else goto _L3
_L3:
        if (d != null) goto _L5; else goto _L4
_L4:
        if (((ASN1TaggedObject) (derobject)).d != null) goto _L1; else goto _L6
_L6:
        return true;
_L5:
        if (!d.c().equals(((ASN1TaggedObject) (derobject)).d.c()))
        {
            return false;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final int e()
    {
        return a;
    }

    public final boolean f()
    {
        return c;
    }

    public final DERObject g()
    {
        return c();
    }

    public final boolean h()
    {
        return b;
    }

    public int hashCode()
    {
        int k = a;
        int j = k;
        if (d != null)
        {
            j = k ^ d.hashCode();
        }
        return j;
    }

    public final DERObject i()
    {
        if (d != null)
        {
            return d.c();
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

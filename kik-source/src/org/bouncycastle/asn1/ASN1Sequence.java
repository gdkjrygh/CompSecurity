// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1TaggedObject, BERTaggedObject, BERSequence, 
//            DERSequence, DEREncodable, DERNull, DERObject, 
//            DEROutputStream

public abstract class ASN1Sequence extends ASN1Object
{

    private Vector a;

    public ASN1Sequence()
    {
        a = new Vector();
    }

    public static ASN1Sequence a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Sequence))
        {
            return (ASN1Sequence)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = a(ASN1Object.a((byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder("failed to construct sequence from byte[]: ")).append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1Sequence) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1Sequence a(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (flag)
        {
            if (!asn1taggedobject.c)
            {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            } else
            {
                return (ASN1Sequence)asn1taggedobject.i();
            }
        }
        if (asn1taggedobject.c)
        {
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSequence(asn1taggedobject.i());
            } else
            {
                return new DERSequence(asn1taggedobject.i());
            }
        }
        if (asn1taggedobject.i() instanceof ASN1Sequence)
        {
            return (ASN1Sequence)asn1taggedobject.i();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    private static DEREncodable a(Enumeration enumeration)
    {
        DEREncodable derencodable = (DEREncodable)enumeration.nextElement();
        enumeration = derencodable;
        if (derencodable == null)
        {
            enumeration = DERNull.b;
        }
        return enumeration;
    }

    public DEREncodable a(int i)
    {
        return (DEREncodable)a.elementAt(i);
    }

    protected final void a(DEREncodable derencodable)
    {
        a.addElement(derencodable);
    }

    abstract void a(DEROutputStream deroutputstream);

    final boolean a(DERObject derobject)
    {
        Object obj;
        if (derobject instanceof ASN1Sequence)
        {
            if (f() == ((ASN1Sequence) (obj = (ASN1Sequence)derobject)).f())
            {
                derobject = e();
                obj = ((ASN1Sequence) (obj)).e();
                while (derobject.hasMoreElements()) 
                {
                    Object obj2 = a(((Enumeration) (derobject)));
                    Object obj1 = a(((Enumeration) (obj)));
                    obj2 = ((DEREncodable) (obj2)).c();
                    obj1 = ((DEREncodable) (obj1)).c();
                    if (obj2 != obj1 && !((DERObject) (obj2)).equals(obj1))
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Enumeration e()
    {
        return a.elements();
    }

    public int f()
    {
        return a.size();
    }

    public int hashCode()
    {
        Enumeration enumeration = e();
        int i;
        for (i = f(); enumeration.hasMoreElements(); i = i * 17 ^ a(enumeration).hashCode()) { }
        return i;
    }

    public String toString()
    {
        return a.toString();
    }
}

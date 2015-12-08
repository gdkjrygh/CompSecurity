// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1EncodableVector, ASN1Encodable, ASN1SequenceParser, 
//            ASN1TaggedObject, BERTaggedObject, BERSequence, DLSequence, 
//            DERSequence, ASN1OutputStream

public abstract class ASN1Sequence extends ASN1Primitive
{

    protected Vector a;

    protected ASN1Sequence()
    {
        a = new Vector();
    }

    protected ASN1Sequence(ASN1Encodable asn1encodable)
    {
        a = new Vector();
        a.addElement(asn1encodable);
    }

    protected ASN1Sequence(ASN1EncodableVector asn1encodablevector)
    {
        a = new Vector();
        for (int i = 0; i != asn1encodablevector.a.size(); i++)
        {
            a.addElement(asn1encodablevector.a(i));
        }

    }

    protected ASN1Sequence(ASN1Encodable aasn1encodable[])
    {
        a = new Vector();
        for (int i = 0; i != aasn1encodable.length; i++)
        {
            a.addElement(aasn1encodable[i]);
        }

    }

    private static ASN1Encodable a(Enumeration enumeration)
    {
        return (ASN1Encodable)enumeration.nextElement();
    }

    public static ASN1Sequence a(Object obj)
    {
        do
        {
            if (obj == null || (obj instanceof ASN1Sequence))
            {
                return (ASN1Sequence)obj;
            }
            if (!(obj instanceof ASN1SequenceParser))
            {
                break;
            }
            obj = ((ASN1SequenceParser)obj).a();
        } while (true);
        if (obj instanceof byte[])
        {
            try
            {
                obj = a(a((byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder("failed to construct sequence from byte[]: ")).append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1Sequence) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).a();
            if (asn1primitive instanceof ASN1Sequence)
            {
                return (ASN1Sequence)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
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
                return a(asn1taggedobject.k().a());
            }
        }
        if (asn1taggedobject.c)
        {
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSequence(asn1taggedobject.k());
            } else
            {
                return new DLSequence(asn1taggedobject.k());
            }
        }
        if (asn1taggedobject.k() instanceof ASN1Sequence)
        {
            return (ASN1Sequence)asn1taggedobject.k();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    public ASN1Encodable a(int i)
    {
        return (ASN1Encodable)a.elementAt(i);
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    final boolean a(ASN1Primitive asn1primitive)
    {
        Object obj;
        if (asn1primitive instanceof ASN1Sequence)
        {
            if (e() == ((ASN1Sequence) (obj = (ASN1Sequence)asn1primitive)).e())
            {
                asn1primitive = d();
                obj = ((ASN1Sequence) (obj)).d();
                while (asn1primitive.hasMoreElements()) 
                {
                    Object obj2 = a(((Enumeration) (asn1primitive)));
                    Object obj1 = a(((Enumeration) (obj)));
                    obj2 = ((ASN1Encodable) (obj2)).a();
                    obj1 = ((ASN1Encodable) (obj1)).a();
                    if (obj2 != obj1 && !((ASN1Primitive) (obj2)).equals(obj1))
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final ASN1Encodable[] c()
    {
        ASN1Encodable aasn1encodable[] = new ASN1Encodable[e()];
        for (int i = 0; i != e(); i++)
        {
            aasn1encodable[i] = a(i);
        }

        return aasn1encodable;
    }

    public Enumeration d()
    {
        return a.elements();
    }

    public int e()
    {
        return a.size();
    }

    ASN1Primitive f()
    {
        DERSequence dersequence = new DERSequence();
        dersequence.a = a;
        return dersequence;
    }

    ASN1Primitive g()
    {
        DLSequence dlsequence = new DLSequence();
        dlsequence.a = a;
        return dlsequence;
    }

    final boolean h()
    {
        return true;
    }

    public int hashCode()
    {
        Enumeration enumeration = d();
        int i;
        for (i = e(); enumeration.hasMoreElements(); i = i * 17 ^ a(enumeration).hashCode()) { }
        return i;
    }

    public String toString()
    {
        return a.toString();
    }
}

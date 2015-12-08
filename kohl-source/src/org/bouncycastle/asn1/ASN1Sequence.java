// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1EncodableVector, ASN1SequenceParser, ASN1Encodable, 
//            ASN1TaggedObject, BERTaggedObject, BERSequence, DLSequence, 
//            DERSequence, ASN1OutputStream, ASN1Set

public abstract class ASN1Sequence extends ASN1Primitive
{

    protected Vector seq;

    protected ASN1Sequence()
    {
        seq = new Vector();
    }

    protected ASN1Sequence(ASN1Encodable asn1encodable)
    {
        seq = new Vector();
        seq.addElement(asn1encodable);
    }

    protected ASN1Sequence(ASN1EncodableVector asn1encodablevector)
    {
        seq = new Vector();
        for (int i = 0; i != asn1encodablevector.size(); i++)
        {
            seq.addElement(asn1encodablevector.get(i));
        }

    }

    protected ASN1Sequence(ASN1Encodable aasn1encodable[])
    {
        seq = new Vector();
        for (int i = 0; i != aasn1encodable.length; i++)
        {
            seq.addElement(aasn1encodable[i]);
        }

    }

    public static ASN1Sequence getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Sequence))
        {
            return (ASN1Sequence)obj;
        }
        if (obj instanceof ASN1SequenceParser)
        {
            return getInstance(((ASN1SequenceParser)obj).toASN1Primitive());
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = getInstance(fromByteArray((byte[])(byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct sequence from byte[]: ").append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1Sequence) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
            if (asn1primitive instanceof ASN1Sequence)
            {
                return (ASN1Sequence)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    public static ASN1Sequence getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (flag)
        {
            if (!asn1taggedobject.isExplicit())
            {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            } else
            {
                return getInstance(asn1taggedobject.getObject().toASN1Primitive());
            }
        }
        if (asn1taggedobject.isExplicit())
        {
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSequence(asn1taggedobject.getObject());
            } else
            {
                return new DLSequence(asn1taggedobject.getObject());
            }
        }
        if (asn1taggedobject.getObject() instanceof ASN1Sequence)
        {
            return (ASN1Sequence)asn1taggedobject.getObject();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    private ASN1Encodable getNext(Enumeration enumeration)
    {
        return (ASN1Encodable)enumeration.nextElement();
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof ASN1Sequence) goto _L2; else goto _L1
_L1:
        Object obj;
        return false;
_L2:
        if (size() != ((ASN1Sequence) (obj = (ASN1Sequence)asn1primitive)).size()) goto _L1; else goto _L3
_L3:
        asn1primitive = getObjects();
        obj = ((ASN1Sequence) (obj)).getObjects();
_L6:
        if (!asn1primitive.hasMoreElements()) goto _L5; else goto _L4
_L4:
        Object obj1;
        Object obj2;
        obj2 = getNext(asn1primitive);
        obj1 = getNext(((Enumeration) (obj)));
        obj2 = ((ASN1Encodable) (obj2)).toASN1Primitive();
        obj1 = ((ASN1Encodable) (obj1)).toASN1Primitive();
        if (obj2 != obj1 && !((ASN1Primitive) (obj2)).equals(obj1)) goto _L1; else goto _L6
_L5:
        return true;
    }

    abstract void encode(ASN1OutputStream asn1outputstream)
        throws IOException;

    public ASN1Encodable getObjectAt(int i)
    {
        return (ASN1Encodable)seq.elementAt(i);
    }

    public Enumeration getObjects()
    {
        return seq.elements();
    }

    public int hashCode()
    {
        Enumeration enumeration = getObjects();
        int i;
        for (i = size(); enumeration.hasMoreElements(); i = i * 17 ^ getNext(enumeration).hashCode()) { }
        return i;
    }

    boolean isConstructed()
    {
        return true;
    }

    public ASN1SequenceParser parser()
    {
        return new ASN1SequenceParser() {

            private int index;
            private final int max;
            final ASN1Sequence this$0;
            final ASN1Sequence val$outer;

            public ASN1Primitive getLoadedObject()
            {
                return outer;
            }

            public ASN1Encodable readObject()
                throws IOException
            {
                Object obj;
                if (index == max)
                {
                    obj = null;
                } else
                {
                    obj = ASN1Sequence.this;
                    int i = index;
                    index = i + 1;
                    ASN1Encodable asn1encodable = ((ASN1Sequence) (obj)).getObjectAt(i);
                    if (asn1encodable instanceof ASN1Sequence)
                    {
                        return ((ASN1Sequence)asn1encodable).parser();
                    }
                    obj = asn1encodable;
                    if (asn1encodable instanceof ASN1Set)
                    {
                        return ((ASN1Set)asn1encodable).parser();
                    }
                }
                return ((ASN1Encodable) (obj));
            }

            public ASN1Primitive toASN1Primitive()
            {
                return outer;
            }

            
            {
                this$0 = ASN1Sequence.this;
                outer = asn1sequence1;
                super();
                max = size();
            }
        };
    }

    public int size()
    {
        return seq.size();
    }

    public ASN1Encodable[] toArray()
    {
        ASN1Encodable aasn1encodable[] = new ASN1Encodable[size()];
        for (int i = 0; i != size(); i++)
        {
            aasn1encodable[i] = getObjectAt(i);
        }

        return aasn1encodable;
    }

    ASN1Primitive toDERObject()
    {
        DERSequence dersequence = new DERSequence();
        dersequence.seq = seq;
        return dersequence;
    }

    ASN1Primitive toDLObject()
    {
        DLSequence dlsequence = new DLSequence();
        dlsequence.seq = seq;
        return dlsequence;
    }

    public String toString()
    {
        return seq.toString();
    }
}

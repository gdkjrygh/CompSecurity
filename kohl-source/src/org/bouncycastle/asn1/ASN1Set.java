// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1EncodableVector, ASN1OutputStream, ASN1SetParser, 
//            ASN1Encodable, ASN1TaggedObject, BERTaggedObject, BERSet, 
//            DLSet, ASN1Sequence, DERNull, DERSet

public abstract class ASN1Set extends ASN1Primitive
{

    private boolean isSorted;
    private Vector set;

    protected ASN1Set()
    {
        set = new Vector();
        isSorted = false;
    }

    protected ASN1Set(ASN1Encodable asn1encodable)
    {
        set = new Vector();
        isSorted = false;
        set.addElement(asn1encodable);
    }

    protected ASN1Set(ASN1EncodableVector asn1encodablevector, boolean flag)
    {
        int i = 0;
        super();
        set = new Vector();
        isSorted = false;
        for (; i != asn1encodablevector.size(); i++)
        {
            set.addElement(asn1encodablevector.get(i));
        }

        if (flag)
        {
            sort();
        }
    }

    protected ASN1Set(ASN1Encodable aasn1encodable[], boolean flag)
    {
        int i = 0;
        super();
        set = new Vector();
        isSorted = false;
        for (; i != aasn1encodable.length; i++)
        {
            set.addElement(aasn1encodable[i]);
        }

        if (flag)
        {
            sort();
        }
    }

    private byte[] getEncoded(ASN1Encodable asn1encodable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        try
        {
            asn1outputstream.writeObject(asn1encodable);
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Encodable asn1encodable)
        {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static ASN1Set getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Set))
        {
            return (ASN1Set)obj;
        }
        if (obj instanceof ASN1SetParser)
        {
            return getInstance(((ASN1SetParser)obj).toASN1Primitive());
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct set from byte[]: ").append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1Set) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
            if (asn1primitive instanceof ASN1Set)
            {
                return (ASN1Set)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    public static ASN1Set getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (flag)
        {
            if (!asn1taggedobject.isExplicit())
            {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            } else
            {
                return (ASN1Set)asn1taggedobject.getObject();
            }
        }
        if (asn1taggedobject.isExplicit())
        {
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSet(asn1taggedobject.getObject());
            } else
            {
                return new DLSet(asn1taggedobject.getObject());
            }
        }
        if (asn1taggedobject.getObject() instanceof ASN1Set)
        {
            return (ASN1Set)asn1taggedobject.getObject();
        }
        new ASN1EncodableVector();
        if (asn1taggedobject.getObject() instanceof ASN1Sequence)
        {
            ASN1Sequence asn1sequence = (ASN1Sequence)asn1taggedobject.getObject();
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSet(asn1sequence.toArray());
            } else
            {
                return new DLSet(asn1sequence.toArray());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknown object in getInstance: ").append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    private ASN1Encodable getNext(Enumeration enumeration)
    {
        ASN1Encodable asn1encodable = (ASN1Encodable)enumeration.nextElement();
        enumeration = asn1encodable;
        if (asn1encodable == null)
        {
            enumeration = DERNull.INSTANCE;
        }
        return enumeration;
    }

    private boolean lessThanOrEqual(byte abyte0[], byte abyte1[])
    {
        int i;
        int j;
        j = Math.min(abyte0.length, abyte1.length);
        i = 0;
_L9:
        if (i == j) goto _L2; else goto _L1
_L1:
        if (abyte0[i] == abyte1[i]) goto _L4; else goto _L3
_L3:
        if ((abyte0[i] & 0xff) >= (abyte1[i] & 0xff)) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j == abyte0.length) goto _L5; else goto _L7
_L7:
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (asn1primitive instanceof ASN1Set) goto _L2; else goto _L1
_L1:
        Object obj;
        return false;
_L2:
        if (size() != ((ASN1Set) (obj = (ASN1Set)asn1primitive)).size()) goto _L1; else goto _L3
_L3:
        asn1primitive = getObjects();
        obj = ((ASN1Set) (obj)).getObjects();
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
        return (ASN1Encodable)set.elementAt(i);
    }

    public Enumeration getObjects()
    {
        return set.elements();
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

    public ASN1SetParser parser()
    {
        return new ASN1SetParser() {

            private int index;
            private final int max;
            final ASN1Set this$0;
            final ASN1Set val$outer;

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
                    obj = ASN1Set.this;
                    int i = index;
                    index = i + 1;
                    ASN1Encodable asn1encodable = ((ASN1Set) (obj)).getObjectAt(i);
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
                this$0 = ASN1Set.this;
                outer = asn1set1;
                super();
                max = size();
            }
        };
    }

    public int size()
    {
        return set.size();
    }

    protected void sort()
    {
        if (!isSorted)
        {
            isSorted = true;
            if (set.size() > 1)
            {
                int k = set.size() - 1;
                for (int i = 1; i != 0;)
                {
                    byte abyte0[] = getEncoded((ASN1Encodable)set.elementAt(0));
                    boolean flag = false;
                    int j = 0;
                    i = 0;
                    while (j != k) 
                    {
                        byte abyte1[] = getEncoded((ASN1Encodable)set.elementAt(j + 1));
                        boolean flag2;
                        if (lessThanOrEqual(abyte0, abyte1))
                        {
                            boolean flag1 = flag;
                            flag = i;
                            i = ((flag1) ? 1 : 0);
                            abyte0 = abyte1;
                        } else
                        {
                            Object obj = set.elementAt(j);
                            set.setElementAt(set.elementAt(j + 1), j);
                            set.setElementAt(obj, j + 1);
                            flag = true;
                            i = j;
                        }
                        j++;
                        flag2 = flag;
                        flag = i;
                        i = ((flag2) ? 1 : 0);
                    }
                    k = ((flag) ? 1 : 0);
                }

            }
        }
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
        if (isSorted)
        {
            DERSet derset = new DERSet();
            derset.set = set;
            return derset;
        }
        Vector vector = new Vector();
        for (int i = 0; i != set.size(); i++)
        {
            vector.addElement(set.elementAt(i));
        }

        DERSet derset1 = new DERSet();
        derset1.set = vector;
        derset1.sort();
        return derset1;
    }

    ASN1Primitive toDLObject()
    {
        DLSet dlset = new DLSet();
        dlset.set = set;
        return dlset;
    }

    public String toString()
    {
        return set.toString();
    }
}

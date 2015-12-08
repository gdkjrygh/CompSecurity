// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1EncodableVector, ASN1Encodable, DERNull, 
//            ASN1SetParser, ASN1TaggedObject, BERTaggedObject, BERSet, 
//            DLSet, ASN1Sequence, ASN1OutputStream, DERSet

public abstract class ASN1Set extends ASN1Primitive
{

    private Vector a;
    private boolean b;

    protected ASN1Set()
    {
        a = new Vector();
        b = false;
    }

    protected ASN1Set(ASN1Encodable asn1encodable)
    {
        a = new Vector();
        b = false;
        a.addElement(asn1encodable);
    }

    protected ASN1Set(ASN1EncodableVector asn1encodablevector, boolean flag)
    {
        int i = 0;
        super();
        a = new Vector();
        b = false;
        for (; i != asn1encodablevector.a.size(); i++)
        {
            a.addElement(asn1encodablevector.a(i));
        }

        if (flag)
        {
            e();
        }
    }

    protected ASN1Set(ASN1Encodable aasn1encodable[])
    {
        int i = 0;
        super();
        a = new Vector();
        b = false;
        for (; i != aasn1encodable.length; i++)
        {
            a.addElement(aasn1encodable[i]);
        }

    }

    private static ASN1Encodable a(Enumeration enumeration)
    {
        ASN1Encodable asn1encodable = (ASN1Encodable)enumeration.nextElement();
        enumeration = asn1encodable;
        if (asn1encodable == null)
        {
            enumeration = DERNull.a;
        }
        return enumeration;
    }

    public static ASN1Set a(Object obj)
    {
        do
        {
            if (obj == null || (obj instanceof ASN1Set))
            {
                return (ASN1Set)obj;
            }
            if (!(obj instanceof ASN1SetParser))
            {
                break;
            }
            obj = ((ASN1SetParser)obj).a();
        } while (true);
        if (obj instanceof byte[])
        {
            try
            {
                obj = a(ASN1Primitive.a((byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder("failed to construct set from byte[]: ")).append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1Set) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).a();
            if (asn1primitive instanceof ASN1Set)
            {
                return (ASN1Set)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
    }

    public static ASN1Set a(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.c)
        {
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSet(asn1taggedobject.k());
            } else
            {
                return new DLSet(asn1taggedobject.k());
            }
        }
        if (asn1taggedobject.k() instanceof ASN1Set)
        {
            return (ASN1Set)asn1taggedobject.k();
        }
        new ASN1EncodableVector();
        if (asn1taggedobject.k() instanceof ASN1Sequence)
        {
            ASN1Sequence asn1sequence = (ASN1Sequence)asn1taggedobject.k();
            if (asn1taggedobject instanceof BERTaggedObject)
            {
                return new BERSet(asn1sequence.c());
            } else
            {
                return new DLSet(asn1sequence.c());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(asn1taggedobject.getClass().getName()).toString());
        }
    }

    private static byte[] a(ASN1Encodable asn1encodable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        try
        {
            asn1outputstream.a(asn1encodable);
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Encodable asn1encodable)
        {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
        return bytearrayoutputstream.toByteArray();
    }

    private void e()
    {
        if (b) goto _L2; else goto _L1
_L1:
        b = true;
        if (a.size() <= 1) goto _L2; else goto _L3
_L3:
        int i;
        int i1;
        i1 = a.size() - 1;
        i = 1;
_L9:
        byte abyte0[];
        int j;
        int l;
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = a((ASN1Encodable)a.elementAt(0));
        j = 0;
        l = 0;
        i = 0;
_L6:
        byte abyte1[];
        int k;
        int j1;
        if (l == i1)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        abyte1 = a((ASN1Encodable)a.elementAt(l + 1));
        j1 = Math.min(abyte0.length, abyte1.length);
        k = 0;
_L7:
        if (k == j1)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (abyte0[k] == abyte1[k]) goto _L5; else goto _L4
_L4:
        if ((abyte0[k] & 0xff) < (abyte1[k] & 0xff))
        {
            k = 1;
        } else
        {
            k = 0;
        }
_L8:
        if (k != 0)
        {
            k = j;
            j = i;
            i = k;
            abyte0 = abyte1;
        } else
        {
            Object obj = a.elementAt(l);
            a.setElementAt(a.elementAt(l + 1), l);
            a.setElementAt(obj, l + 1);
            j = 1;
            i = l;
        }
        l++;
        k = j;
        j = i;
        i = k;
          goto _L6
_L5:
        k++;
          goto _L7
        if (j1 == abyte0.length)
        {
            k = 1;
        } else
        {
            k = 0;
        }
          goto _L8
        i1 = j;
        if (true) goto _L9; else goto _L2
_L2:
    }

    public final ASN1Encodable a(int i)
    {
        return (ASN1Encodable)a.elementAt(i);
    }

    abstract void a(ASN1OutputStream asn1outputstream);

    final boolean a(ASN1Primitive asn1primitive)
    {
        Object obj;
        if (asn1primitive instanceof ASN1Set)
        {
            if (a.size() == ((ASN1Set) (obj = (ASN1Set)asn1primitive)).a.size())
            {
                asn1primitive = a.elements();
                obj = ((ASN1Set) (obj)).a.elements();
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

    public final Enumeration c()
    {
        return a.elements();
    }

    public final int d()
    {
        return a.size();
    }

    final ASN1Primitive f()
    {
        if (b)
        {
            DERSet derset = new DERSet();
            derset.a = a;
            return derset;
        }
        Vector vector = new Vector();
        for (int i = 0; i != a.size(); i++)
        {
            vector.addElement(a.elementAt(i));
        }

        DERSet derset1 = new DERSet();
        derset1.a = vector;
        derset1.e();
        return derset1;
    }

    final ASN1Primitive g()
    {
        DLSet dlset = new DLSet();
        dlset.a = a;
        return dlset;
    }

    final boolean h()
    {
        return true;
    }

    public int hashCode()
    {
        Enumeration enumeration = a.elements();
        int i;
        for (i = a.size(); enumeration.hasMoreElements(); i = i * 17 ^ a(enumeration).hashCode()) { }
        return i;
    }

    public String toString()
    {
        return a.toString();
    }
}

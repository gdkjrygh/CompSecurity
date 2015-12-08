// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1TaggedObject, DERSet, ASN1EncodableVector, 
//            ASN1Sequence, DEREncodable, DERNull, ASN1OutputStream, 
//            DERObject, DEROutputStream

public abstract class ASN1Set extends ASN1Object
{

    protected Vector a;

    public ASN1Set()
    {
        a = new Vector();
    }

    public static ASN1Set a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Set))
        {
            return (ASN1Set)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1Set a(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.c)
        {
            return new DERSet(asn1taggedobject.i());
        }
        if (asn1taggedobject.i() instanceof ASN1Set)
        {
            return (ASN1Set)asn1taggedobject.i();
        }
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (asn1taggedobject.i() instanceof ASN1Sequence)
        {
            for (asn1taggedobject = ((ASN1Sequence)asn1taggedobject.i()).e(); asn1taggedobject.hasMoreElements(); asn1encodablevector.a((DEREncodable)asn1taggedobject.nextElement())) { }
            return new DERSet(asn1encodablevector, false);
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

    private static byte[] b(DEREncodable derencodable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        try
        {
            asn1outputstream.a(derencodable);
        }
        // Misplaced declaration of an exception variable
        catch (DEREncodable derencodable)
        {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
        return bytearrayoutputstream.toByteArray();
    }

    public final DEREncodable a(int i)
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
        if (derobject instanceof ASN1Set)
        {
            if (a.size() == ((ASN1Set) (obj = (ASN1Set)derobject)).a.size())
            {
                derobject = a.elements();
                obj = ((ASN1Set) (obj)).a.elements();
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

    public final Enumeration e()
    {
        return a.elements();
    }

    public final int f()
    {
        return a.size();
    }

    protected final void g()
    {
        if (a.size() <= 1) goto _L2; else goto _L1
_L1:
        int i;
        int i1;
        i1 = a.size() - 1;
        i = 1;
_L8:
        byte abyte0[];
        int j;
        int l;
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = b((DEREncodable)a.elementAt(0));
        j = 0;
        l = 0;
        i = 0;
_L5:
        byte abyte1[];
        int k;
        int j1;
        if (l == i1)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        abyte1 = b((DEREncodable)a.elementAt(l + 1));
        j1 = Math.min(abyte0.length, abyte1.length);
        k = 0;
_L6:
        if (k == j1)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (abyte0[k] == abyte1[k]) goto _L4; else goto _L3
_L3:
        if ((abyte0[k] & 0xff) < (abyte1[k] & 0xff))
        {
            k = 1;
        } else
        {
            k = 0;
        }
_L7:
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
          goto _L5
_L4:
        k++;
          goto _L6
        if (j1 == abyte0.length)
        {
            k = 1;
        } else
        {
            k = 0;
        }
          goto _L7
        i1 = j;
        if (true) goto _L8; else goto _L2
_L2:
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

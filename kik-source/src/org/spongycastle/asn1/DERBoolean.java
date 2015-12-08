// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1Boolean, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream

public class DERBoolean extends ASN1Primitive
{

    public static final ASN1Boolean a = new ASN1Boolean(false);
    public static final ASN1Boolean b = new ASN1Boolean(true);
    private static final byte c[] = {
        -1
    };
    private static final byte d[] = {
        0
    };
    private byte e[];

    public DERBoolean(boolean flag)
    {
        byte abyte0[];
        if (flag)
        {
            abyte0 = c;
        } else
        {
            abyte0 = d;
        }
        e = abyte0;
    }

    DERBoolean(byte abyte0[])
    {
        if (abyte0.length != 1)
        {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (abyte0[0] == 0)
        {
            e = d;
            return;
        }
        if (abyte0[0] == 255)
        {
            e = c;
            return;
        } else
        {
            e = Arrays.b(abyte0);
            return;
        }
    }

    public static ASN1Boolean a(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Boolean))
        {
            return (ASN1Boolean)obj;
        }
        if (obj instanceof DERBoolean)
        {
            if (((DERBoolean)obj).d())
            {
                return b;
            } else
            {
                return a;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("illegal object in getInstance: ")).append(obj.getClass().getName()).toString());
        }
    }

    public static DERBoolean a(ASN1TaggedObject asn1taggedobject)
    {
        asn1taggedobject = asn1taggedobject.k();
        if (asn1taggedobject instanceof DERBoolean)
        {
            return a(asn1taggedobject);
        } else
        {
            return ASN1Boolean.b(((ASN1OctetString)asn1taggedobject).d());
        }
    }

    static ASN1Boolean b(byte abyte0[])
    {
        if (abyte0.length != 1)
        {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (abyte0[0] == 0)
        {
            return a;
        }
        if (abyte0[0] == 255)
        {
            return b;
        } else
        {
            return new ASN1Boolean(abyte0);
        }
    }

    public static ASN1Boolean c()
    {
        return b;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(1, e);
    }

    protected final boolean a(ASN1Primitive asn1primitive)
    {
        while (asn1primitive == null || !(asn1primitive instanceof DERBoolean) || e[0] != ((DERBoolean)asn1primitive).e[0]) 
        {
            return false;
        }
        return true;
    }

    public final boolean d()
    {
        boolean flag = false;
        if (e[0] != 0)
        {
            flag = true;
        }
        return flag;
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return e[0];
    }

    final int i()
    {
        return 3;
    }

    public String toString()
    {
        if (e[0] != 0)
        {
            return "TRUE";
        } else
        {
            return "FALSE";
        }
    }

}

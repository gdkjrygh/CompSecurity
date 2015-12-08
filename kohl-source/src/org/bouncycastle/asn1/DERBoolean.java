// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1Boolean, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream

public class DERBoolean extends ASN1Primitive
{

    public static final ASN1Boolean FALSE = new ASN1Boolean(false);
    private static final byte FALSE_VALUE[] = {
        0
    };
    public static final ASN1Boolean TRUE = new ASN1Boolean(true);
    private static final byte TRUE_VALUE[] = {
        -1
    };
    private byte value[];

    public DERBoolean(boolean flag)
    {
        byte abyte0[];
        if (flag)
        {
            abyte0 = TRUE_VALUE;
        } else
        {
            abyte0 = FALSE_VALUE;
        }
        value = abyte0;
    }

    DERBoolean(byte abyte0[])
    {
        if (abyte0.length != 1)
        {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (abyte0[0] == 0)
        {
            value = FALSE_VALUE;
            return;
        }
        if (abyte0[0] == 255)
        {
            value = TRUE_VALUE;
            return;
        } else
        {
            value = Arrays.clone(abyte0);
            return;
        }
    }

    static ASN1Boolean fromOctetString(byte abyte0[])
    {
        if (abyte0.length != 1)
        {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (abyte0[0] == 0)
        {
            return FALSE;
        }
        if (abyte0[0] == 255)
        {
            return TRUE;
        } else
        {
            return new ASN1Boolean(abyte0);
        }
    }

    public static ASN1Boolean getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Boolean))
        {
            return (ASN1Boolean)obj;
        }
        if (obj instanceof DERBoolean)
        {
            if (((DERBoolean)obj).isTrue())
            {
                return TRUE;
            } else
            {
                return FALSE;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1Boolean getInstance(boolean flag)
    {
        if (flag)
        {
            return TRUE;
        } else
        {
            return FALSE;
        }
    }

    public static DERBoolean getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERBoolean))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return ASN1Boolean.fromOctetString(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    protected boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        while (asn1primitive == null || !(asn1primitive instanceof DERBoolean) || value[0] != ((DERBoolean)asn1primitive).value[0]) 
        {
            return false;
        }
        return true;
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.writeEncoded(1, value);
    }

    int encodedLength()
    {
        return 3;
    }

    public int hashCode()
    {
        return value[0];
    }

    boolean isConstructed()
    {
        return false;
    }

    public boolean isTrue()
    {
        boolean flag = false;
        if (value[0] != 0)
        {
            flag = true;
        }
        return flag;
    }

    public String toString()
    {
        if (value[0] != 0)
        {
            return "TRUE";
        } else
        {
            return "FALSE";
        }
    }

}

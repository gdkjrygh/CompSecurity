// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEROutputStream, ASN1OutputStream, 
//            DERObject

public class DERUniversalString extends ASN1Object
    implements DERString
{

    private static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private byte b[];

    public DERUniversalString(byte abyte0[])
    {
        b = abyte0;
    }

    final void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(28, b);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERUniversalString))
        {
            return false;
        } else
        {
            return n_().equals(((DERUniversalString)derobject).n_());
        }
    }

    public int hashCode()
    {
        return n_().hashCode();
    }

    public final String n_()
    {
        Object obj = new StringBuffer("#");
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        byte abyte0[];
        try
        {
            asn1outputstream.a(this);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("internal error encoding BitString");
        }
        abyte0 = bytearrayoutputstream.toByteArray();
        for (int i = 0; i != abyte0.length; i++)
        {
            ((StringBuffer) (obj)).append(a[abyte0[i] >>> 4 & 0xf]);
            ((StringBuffer) (obj)).append(a[abyte0[i] & 0xf]);
        }

        return ((StringBuffer) (obj)).toString();
    }

    public String toString()
    {
        return n_();
    }

}

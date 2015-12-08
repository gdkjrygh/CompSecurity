// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1OutputStream, j

public class DERUniversalString extends ASN1Primitive
    implements ASN1String
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

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(28, b);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUniversalString))
        {
            return false;
        } else
        {
            return Arrays.a(b, ((DERUniversalString)asn1primitive).b);
        }
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return Arrays.a(b);
    }

    final int i()
    {
        return j.a(b.length) + 1 + b.length;
    }

    public final String o_()
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
        for (int k = 0; k != abyte0.length; k++)
        {
            ((StringBuffer) (obj)).append(a[abyte0[k] >>> 4 & 0xf]);
            ((StringBuffer) (obj)).append(a[abyte0[k] & 0xf]);
        }

        return ((StringBuffer) (obj)).toString();
    }

    public String toString()
    {
        return o_();
    }

}

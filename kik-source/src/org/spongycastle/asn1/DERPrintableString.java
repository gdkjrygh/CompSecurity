// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1OutputStream, j

public class DERPrintableString extends ASN1Primitive
    implements ASN1String
{

    private byte a[];

    public DERPrintableString(String s)
    {
        this(s, false);
    }

    public DERPrintableString(String s, boolean flag)
    {
        boolean flag1;
        flag1 = false;
        super();
        if (!flag) goto _L2; else goto _L1
_L1:
        int k = s.length() - 1;
_L9:
        if (k < 0) goto _L4; else goto _L3
_L3:
        char c = s.charAt(k);
        if (c <= '\177') goto _L6; else goto _L5
_L5:
        k = ((flag1) ? 1 : 0);
_L7:
        if (k == 0)
        {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (('a' > c || c > 'z') && ('A' > c || c > 'Z') && ('0' > c || c > '9'))
        {
            switch (c)
            {
            default:
                k = ((flag1) ? 1 : 0);
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 58: // ':'
            case 61: // '='
            case 63: // '?'
                break;
            }
        }
        k--;
        continue; /* Loop/switch isn't completed */
_L4:
        k = 1;
        if (true) goto _L7; else goto _L2
_L2:
        a = Strings.d(s);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    DERPrintableString(byte abyte0[])
    {
        a = abyte0;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(19, a);
    }

    final boolean a(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERPrintableString))
        {
            return false;
        } else
        {
            asn1primitive = (DERPrintableString)asn1primitive;
            return Arrays.a(a, ((DERPrintableString) (asn1primitive)).a);
        }
    }

    final boolean h()
    {
        return false;
    }

    public int hashCode()
    {
        return Arrays.a(a);
    }

    final int i()
    {
        return j.a(a.length) + 1 + a.length;
    }

    public final String o_()
    {
        return Strings.b(a);
    }

    public String toString()
    {
        return o_();
    }
}

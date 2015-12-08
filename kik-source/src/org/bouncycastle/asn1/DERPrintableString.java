// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, DERString, DEROutputStream, DERObject

public class DERPrintableString extends ASN1Object
    implements DERString
{

    String a;

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
        int i = s.length() - 1;
_L9:
        if (i < 0) goto _L4; else goto _L3
_L3:
        char c = s.charAt(i);
        if (c <= '\177') goto _L6; else goto _L5
_L5:
        i = ((flag1) ? 1 : 0);
_L7:
        if (i == 0)
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
                i = ((flag1) ? 1 : 0);
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
        i--;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 1;
        if (true) goto _L7; else goto _L2
_L2:
        a = s;
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public DERPrintableString(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        a = new String(ac);
    }

    final void a(DEROutputStream deroutputstream)
    {
        char ac[] = a.toCharArray();
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != ac.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        deroutputstream.a(19, abyte0);
    }

    final boolean a(DERObject derobject)
    {
        if (!(derobject instanceof DERPrintableString))
        {
            return false;
        } else
        {
            derobject = (DERPrintableString)derobject;
            return n_().equals(derobject.n_());
        }
    }

    public int hashCode()
    {
        return n_().hashCode();
    }

    public final String n_()
    {
        return a;
    }

    public String toString()
    {
        return a;
    }
}

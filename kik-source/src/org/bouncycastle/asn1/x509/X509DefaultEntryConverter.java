// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509NameEntryConverter, X509Name

public class X509DefaultEntryConverter extends X509NameEntryConverter
{

    public X509DefaultEntryConverter()
    {
    }

    public final DERObject a(DERObjectIdentifier derobjectidentifier, String s)
    {
        int i = 0;
        if (s.length() == 0 || s.charAt(0) != '#') goto _L2; else goto _L1
_L1:
        Object obj;
        s = Strings.c(s);
        obj = new byte[(s.length() - 1) / 2];
_L8:
        if (i == obj.length) goto _L4; else goto _L3
_L3:
        char c;
        char c1;
        c = s.charAt(i * 2 + 1);
        c1 = s.charAt(i * 2 + 1 + 1);
          goto _L5
_L7:
        obj[i] = (byte)(obj[i] | (byte)((c1 - 97) + 10));
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            s = (new ASN1InputStream(((byte []) (obj)))).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder("can't recode value for oid ")).append(derobjectidentifier.e()).toString());
        }
        return s;
_L2:
        obj = s;
        if (s.length() != 0)
        {
            obj = s;
            if (s.charAt(0) == '\\')
            {
                obj = s.substring(1);
            }
        }
        if (derobjectidentifier.equals(X509Name.D) || derobjectidentifier.equals(X509Name.H))
        {
            return new DERIA5String(((String) (obj)));
        }
        if (derobjectidentifier.equals(X509Name.t))
        {
            return new DERGeneralizedTime(((String) (obj)));
        }
        if (derobjectidentifier.equals(X509Name.a) || derobjectidentifier.equals(X509Name.f) || derobjectidentifier.equals(X509Name.r) || derobjectidentifier.equals(X509Name.B))
        {
            return new DERPrintableString(((String) (obj)));
        } else
        {
            return new DERUTF8String(((String) (obj)));
        }
_L5:
        if (c < 'a')
        {
            obj[i] = (byte)(c - 48 << 4);
        } else
        {
            obj[i] = (byte)((c - 97) + 10 << 4);
        }
        if (c1 >= 'a')
        {
            continue; /* Loop/switch isn't completed */
        }
        obj[i] = (byte)(obj[i] | (byte)(c1 - 48));
        break; /* Loop/switch isn't completed */
        if (true) goto _L7; else goto _L6
_L6:
        i++;
          goto _L8
    }
}

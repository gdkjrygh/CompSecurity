// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERUTF8String;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509NameEntryConverter, X509Name

public class X509DefaultEntryConverter extends X509NameEntryConverter
{

    public X509DefaultEntryConverter()
    {
    }

    public ASN1Primitive getConvertedValue(ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        if (s.length() != 0 && s.charAt(0) == '#')
        {
            try
            {
                s = convertHexEncoded(s, 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException((new StringBuilder()).append("can't recode value for oid ").append(asn1objectidentifier.getId()).toString());
            }
            return s;
        }
        String s1 = s;
        if (s.length() != 0)
        {
            s1 = s;
            if (s.charAt(0) == '\\')
            {
                s1 = s.substring(1);
            }
        }
        if (asn1objectidentifier.equals(X509Name.EmailAddress) || asn1objectidentifier.equals(X509Name.DC))
        {
            return new DERIA5String(s1);
        }
        if (asn1objectidentifier.equals(X509Name.DATE_OF_BIRTH))
        {
            return new DERGeneralizedTime(s1);
        }
        if (asn1objectidentifier.equals(X509Name.C) || asn1objectidentifier.equals(X509Name.SN) || asn1objectidentifier.equals(X509Name.DN_QUALIFIER) || asn1objectidentifier.equals(X509Name.TELEPHONE_NUMBER))
        {
            return new DERPrintableString(s1);
        } else
        {
            return new DERUTF8String(s1);
        }
    }
}

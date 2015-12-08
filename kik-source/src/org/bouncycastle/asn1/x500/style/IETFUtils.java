// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class IETFUtils
{

    public IETFUtils()
    {
    }

    public static String a(String s)
    {
        s = Strings.c(s.trim());
        if (s.length() > 0 && s.charAt(0) == '#')
        {
            ASN1Object asn1object = b(s);
            if (asn1object instanceof ASN1String)
            {
                s = Strings.c(((ASN1String)asn1object).n_().trim());
            }
        }
        StringBuffer stringbuffer = new StringBuffer();
        if (s.length() != 0)
        {
            char c = s.charAt(0);
            stringbuffer.append(c);
            int i = 1;
            for (char c1 = c; i < s.length(); c1 = c)
            {
                c = s.charAt(i);
                if (c1 != ' ' || c != ' ')
                {
                    stringbuffer.append(c);
                }
                i++;
            }

        }
        return stringbuffer.toString();
    }

    public static String a(ASN1Encodable asn1encodable)
    {
        int k = 2;
        StringBuffer stringbuffer = new StringBuffer();
        int i;
        int j;
        if ((asn1encodable instanceof ASN1String) && !(asn1encodable instanceof DERUniversalString))
        {
            asn1encodable = ((ASN1String)asn1encodable).n_();
            int l;
            if (asn1encodable.length() > 0 && asn1encodable.charAt(0) == '#')
            {
                stringbuffer.append((new StringBuilder("\\")).append(asn1encodable).toString());
            } else
            {
                stringbuffer.append(asn1encodable);
            }
        } else
        {
            stringbuffer.append((new StringBuilder("#")).append(a(Hex.a(asn1encodable.c().b()))).toString());
        }
        i = stringbuffer.length();
        if (stringbuffer.length() >= 2 && stringbuffer.charAt(0) == '\\' && stringbuffer.charAt(1) == '#')
        {
            j = i;
            i = k;
        } else
        {
            boolean flag = false;
            j = i;
            i = ((flag) ? 1 : 0);
        }
        for (; i != j; j = k)
        {
label0:
            {
                if (stringbuffer.charAt(i) != ',' && stringbuffer.charAt(i) != '"' && stringbuffer.charAt(i) != '\\' && stringbuffer.charAt(i) != '+' && stringbuffer.charAt(i) != '=' && stringbuffer.charAt(i) != '<' && stringbuffer.charAt(i) != '>')
                {
                    l = i;
                    k = j;
                    if (stringbuffer.charAt(i) != ';')
                    {
                        break label0;
                    }
                }
                stringbuffer.insert(i, "\\");
                l = i + 1;
                k = j + 1;
            }
            i = l + 1;
        }

        return stringbuffer.toString();
    }

    private static String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length];
        for (int i = 0; i != ac.length; i++)
        {
            ac[i] = (char)(abyte0[i] & 0xff);
        }

        return new String(ac);
    }

    public static void a(StringBuffer stringbuffer, AttributeTypeAndValue attributetypeandvalue, Hashtable hashtable)
    {
        hashtable = (String)hashtable.get(attributetypeandvalue.e());
        if (hashtable != null)
        {
            stringbuffer.append(hashtable);
        } else
        {
            stringbuffer.append(attributetypeandvalue.e().e());
        }
        stringbuffer.append('=');
        stringbuffer.append(a(attributetypeandvalue.f()));
    }

    private static ASN1Object b(String s)
    {
        try
        {
            s = ASN1Object.a(Hex.a(s.substring(1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder("unknown encoding in name: ")).append(s).toString());
        }
        return s;
    }
}

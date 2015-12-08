// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509.extension;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extension;

public class X509ExtensionUtil
{

    public X509ExtensionUtil()
    {
    }

    public static ASN1Primitive fromExtensionValue(byte abyte0[])
        throws IOException
    {
        return ASN1Primitive.fromByteArray(((ASN1OctetString)ASN1Primitive.fromByteArray(abyte0)).getOctets());
    }

    private static Collection getAlternativeNames(byte abyte0[])
        throws CertificateParsingException
    {
        if (abyte0 == null)
        {
            return Collections.EMPTY_LIST;
        }
        ArrayList arraylist;
        arraylist = new ArrayList();
        abyte0 = DERSequence.getInstance(fromExtensionValue(abyte0)).getObjects();
_L7:
        GeneralName generalname;
        ArrayList arraylist1;
        if (!abyte0.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_280;
        }
        generalname = GeneralName.getInstance(abyte0.nextElement());
        arraylist1 = new ArrayList();
        arraylist1.add(new Integer(generalname.getTagNo()));
        generalname.getTagNo();
        JVM INSTR tableswitch 0 8: default 287
    //                   0 171
    //                   1 218
    //                   2 218
    //                   3 171
    //                   4 198
    //                   5 171
    //                   6 218
    //                   7 260
    //                   8 240;
           goto _L1 _L2 _L3 _L3 _L2 _L4 _L2 _L3 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_260;
_L1:
        throw new IOException((new StringBuilder()).append("Bad tag number: ").append(generalname.getTagNo()).toString());
_L2:
        arraylist1.add(generalname.getName().toASN1Primitive());
_L8:
        arraylist.add(arraylist1);
          goto _L7
_L4:
        try
        {
            arraylist1.add(X500Name.getInstance(generalname.getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CertificateParsingException(abyte0.getMessage());
        }
          goto _L8
_L3:
        arraylist1.add(((ASN1String)generalname.getName()).getString());
          goto _L8
_L6:
        arraylist1.add(ASN1ObjectIdentifier.getInstance(generalname.getName()).getId());
          goto _L8
        arraylist1.add(DEROctetString.getInstance(generalname.getName()).getOctets());
          goto _L8
        abyte0 = Collections.unmodifiableCollection(arraylist);
        return abyte0;
    }

    public static Collection getIssuerAlternativeNames(X509Certificate x509certificate)
        throws CertificateParsingException
    {
        return getAlternativeNames(x509certificate.getExtensionValue(X509Extension.issuerAlternativeName.getId()));
    }

    public static Collection getSubjectAlternativeNames(X509Certificate x509certificate)
        throws CertificateParsingException
    {
        return getAlternativeNames(x509certificate.getExtensionValue(X509Extension.subjectAlternativeName.getId()));
    }
}

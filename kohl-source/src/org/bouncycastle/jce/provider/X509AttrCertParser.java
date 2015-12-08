// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509StreamParserSpi;
import org.bouncycastle.x509.X509V2AttributeCertificate;
import org.bouncycastle.x509.util.StreamParsingException;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PEMUtil

public class X509AttrCertParser extends X509StreamParserSpi
{

    private static final PEMUtil PEM_PARSER = new PEMUtil("ATTRIBUTE CERTIFICATE");
    private InputStream currentStream;
    private ASN1Set sData;
    private int sDataObjectCount;

    public X509AttrCertParser()
    {
        sData = null;
        sDataObjectCount = 0;
        currentStream = null;
    }

    private X509AttributeCertificate getCertificate()
        throws IOException
    {
        if (sData != null)
        {
            while (sDataObjectCount < sData.size()) 
            {
                Object obj = sData;
                int i = sDataObjectCount;
                sDataObjectCount = i + 1;
                obj = ((ASN1Set) (obj)).getObjectAt(i);
                if ((obj instanceof ASN1TaggedObject) && ((ASN1TaggedObject)obj).getTagNo() == 2)
                {
                    return new X509V2AttributeCertificate(ASN1Sequence.getInstance((ASN1TaggedObject)obj, false).getEncoded());
                }
            }
        }
        return null;
    }

    private X509AttributeCertificate readDERCertificate(InputStream inputstream)
        throws IOException
    {
        inputstream = (ASN1Sequence)(new ASN1InputStream(inputstream)).readObject();
        if (inputstream.size() > 1 && (inputstream.getObjectAt(0) instanceof DERObjectIdentifier) && inputstream.getObjectAt(0).equals(PKCSObjectIdentifiers.signedData))
        {
            sData = (new SignedData(ASN1Sequence.getInstance((ASN1TaggedObject)inputstream.getObjectAt(1), true))).getCertificates();
            return getCertificate();
        } else
        {
            return new X509V2AttributeCertificate(inputstream.getEncoded());
        }
    }

    private X509AttributeCertificate readPEMCertificate(InputStream inputstream)
        throws IOException
    {
        inputstream = PEM_PARSER.readPEMObject(inputstream);
        if (inputstream != null)
        {
            return new X509V2AttributeCertificate(inputstream.getEncoded());
        } else
        {
            return null;
        }
    }

    public void engineInit(InputStream inputstream)
    {
        currentStream = inputstream;
        sData = null;
        sDataObjectCount = 0;
        if (!currentStream.markSupported())
        {
            currentStream = new BufferedInputStream(currentStream);
        }
    }

    public Object engineRead()
        throws StreamParsingException
    {
        Object obj = null;
        if (sData == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (sDataObjectCount != sData.size())
        {
            return getCertificate();
        }
        sData = null;
        sDataObjectCount = 0;
        return null;
        int i;
        try
        {
            currentStream.mark(10);
            i = currentStream.read();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new StreamParsingException(((Exception) (obj)).toString(), ((Throwable) (obj)));
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (i == 48)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        currentStream.reset();
        return readPEMCertificate(currentStream);
        currentStream.reset();
        obj = readDERCertificate(currentStream);
        return obj;
    }

    public Collection engineReadAll()
        throws StreamParsingException
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            X509AttributeCertificate x509attributecertificate = (X509AttributeCertificate)engineRead();
            if (x509attributecertificate != null)
            {
                arraylist.add(x509attributecertificate);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

}

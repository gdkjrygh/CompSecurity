// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.math.BigInteger;
import java.security.cert.X509Extension;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            RespID, SingleResp

public class RespData
    implements X509Extension
{

    ResponseData data;

    public RespData(ResponseData responsedata)
    {
        data = responsedata;
    }

    private Set getExtensionOIDs(boolean flag)
    {
        HashSet hashset = new HashSet();
        X509Extensions x509extensions = getResponseExtensions();
        if (x509extensions != null)
        {
            Enumeration enumeration = x509extensions.oids();
            do
            {
                if (!enumeration.hasMoreElements())
                {
                    break;
                }
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)enumeration.nextElement();
                if (flag == x509extensions.getExtension(derobjectidentifier).isCritical())
                {
                    hashset.add(derobjectidentifier.getId());
                }
            } while (true);
        }
        return hashset;
    }

    public Set getCriticalExtensionOIDs()
    {
        return getExtensionOIDs(true);
    }

    public byte[] getExtensionValue(String s)
    {
        X509Extensions x509extensions = getResponseExtensions();
        if (x509extensions != null)
        {
            s = x509extensions.getExtension(new DERObjectIdentifier(s));
            if (s != null)
            {
                try
                {
                    s = s.getValue().getEncoded("DER");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new RuntimeException((new StringBuilder()).append("error encoding ").append(s.toString()).toString());
                }
                return s;
            }
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs()
    {
        return getExtensionOIDs(false);
    }

    public Date getProducedAt()
    {
        Date date;
        try
        {
            date = data.getProducedAt().getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("ParseException:").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public RespID getResponderId()
    {
        return new RespID(data.getResponderID());
    }

    public X509Extensions getResponseExtensions()
    {
        return X509Extensions.getInstance(data.getResponseExtensions());
    }

    public SingleResp[] getResponses()
    {
        ASN1Sequence asn1sequence = data.getResponses();
        SingleResp asingleresp[] = new SingleResp[asn1sequence.size()];
        for (int i = 0; i != asingleresp.length; i++)
        {
            asingleresp[i] = new SingleResp(SingleResponse.getInstance(asn1sequence.getObjectAt(i)));
        }

        return asingleresp;
    }

    public int getVersion()
    {
        return data.getVersion().getValue().intValue() + 1;
    }

    public boolean hasUnsupportedCriticalExtension()
    {
        Set set = getCriticalExtensionOIDs();
        return set != null && !set.isEmpty();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.ocsp.RevokedInfo;
import org.bouncycastle.asn1.x509.CRLReason;

// Referenced classes of package org.bouncycastle.ocsp:
//            CertificateStatus

public class RevokedStatus
    implements CertificateStatus
{

    RevokedInfo info;

    public RevokedStatus(Date date, int i)
    {
        info = new RevokedInfo(new DERGeneralizedTime(date), CRLReason.lookup(i));
    }

    public RevokedStatus(RevokedInfo revokedinfo)
    {
        info = revokedinfo;
    }

    public int getRevocationReason()
    {
        if (info.getRevocationReason() == null)
        {
            throw new IllegalStateException("attempt to get a reason where none is available");
        } else
        {
            return info.getRevocationReason().getValue().intValue();
        }
    }

    public Date getRevocationTime()
    {
        Date date;
        try
        {
            date = info.getRevocationTime().getDate();
        }
        catch (ParseException parseexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("ParseException:").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public boolean hasRevocationReason()
    {
        return info.getRevocationReason() != null;
    }
}

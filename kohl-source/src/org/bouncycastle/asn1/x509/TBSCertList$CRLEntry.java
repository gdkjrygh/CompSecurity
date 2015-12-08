// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertList, Extensions, Time

public static class seq extends ASN1Object
{

    Extensions crlEntryExtensions;
    ASN1Sequence seq;

    public static seq getInstance(Object obj)
    {
        if (obj instanceof seq)
        {
            return (seq)obj;
        }
        if (obj != null)
        {
            return new <init>(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public Extensions getExtensions()
    {
        if (crlEntryExtensions == null && seq.size() == 3)
        {
            crlEntryExtensions = Extensions.getInstance(seq.getObjectAt(2));
        }
        return crlEntryExtensions;
    }

    public Time getRevocationDate()
    {
        return Time.getInstance(seq.getObjectAt(1));
    }

    public ASN1Integer getUserCertificate()
    {
        return ASN1Integer.getInstance(seq.getObjectAt(0));
    }

    public boolean hasExtensions()
    {
        return seq.size() == 3;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }

    private (ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 2 || asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        } else
        {
            seq = asn1sequence;
            return;
        }
    }
}

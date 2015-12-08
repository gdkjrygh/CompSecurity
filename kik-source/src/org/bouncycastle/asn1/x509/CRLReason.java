// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.DEREnumerated;

public class CRLReason extends DEREnumerated
{

    private static final String b[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };

    public CRLReason(DEREnumerated derenumerated)
    {
        super(derenumerated.e().intValue());
    }

    public String toString()
    {
        int i = e().intValue();
        String s;
        if (i < 0 || i > 10)
        {
            s = "invalid";
        } else
        {
            s = b[i];
        }
        return (new StringBuilder("CRLReason: ")).append(s).toString();
    }

}

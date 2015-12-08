// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.jce.provider.CertPathValidatorUtilities;

public class PKIXCertPathReviewer extends CertPathValidatorUtilities
{

    private static final String q;
    private static final String r;
    private static final String s;

    public PKIXCertPathReviewer()
    {
    }

    static 
    {
        q = X509Extensions.B.e();
        r = X509Extensions.p.e();
        s = X509Extensions.x.e();
    }
}

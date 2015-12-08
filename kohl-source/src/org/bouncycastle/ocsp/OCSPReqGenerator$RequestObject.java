// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPReqGenerator, CertificateID

private class extensions
{

    CertificateID certId;
    X509Extensions extensions;
    final OCSPReqGenerator this$0;

    public Request toRequest()
        throws Exception
    {
        return new Request(certId.toASN1Object(), Extensions.getInstance(extensions));
    }

    public (CertificateID certificateid, X509Extensions x509extensions)
    {
        this$0 = OCSPReqGenerator.this;
        super();
        certId = certificateid;
        extensions = x509extensions;
    }
}

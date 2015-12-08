// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateException;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.x509:
//            CertificateFactory

private final class b extends CertificateException
{

    final CertificateFactory a;
    private Throwable b;

    public final Throwable getCause()
    {
        return b;
    }

    public (CertificateFactory certificatefactory, Throwable throwable)
    {
        a = certificatefactory;
        super();
        b = throwable;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateException;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.x509:
//            CertificateFactory

private class cause extends CertificateException
{

    private Throwable cause;
    final CertificateFactory this$0;

    public Throwable getCause()
    {
        return cause;
    }

    public (String s, Throwable throwable)
    {
        this$0 = CertificateFactory.this;
        super(s);
        cause = throwable;
    }

    public cause(Throwable throwable)
    {
        this$0 = CertificateFactory.this;
        super();
        cause = throwable;
    }
}

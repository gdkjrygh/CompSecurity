// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCredentials, Certificate, CertificateRequest

public interface TlsKeyExchange
{

    public abstract void generateClientKeyExchange(OutputStream outputstream)
        throws IOException;

    public abstract byte[] generatePremasterSecret()
        throws IOException;

    public abstract void processClientCredentials(TlsCredentials tlscredentials)
        throws IOException;

    public abstract void processServerCertificate(Certificate certificate)
        throws IOException;

    public abstract void processServerKeyExchange(InputStream inputstream)
        throws IOException;

    public abstract void skipClientCredentials()
        throws IOException;

    public abstract void skipServerCertificate()
        throws IOException;

    public abstract void skipServerKeyExchange()
        throws IOException;

    public abstract void validateCertificateRequest(CertificateRequest certificaterequest)
        throws IOException;
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsAuthentication, Certificate, CertificateVerifyer, TlsFatalAlert, 
//            CertificateRequest, TlsCredentials

public class LegacyTlsAuthentication
    implements TlsAuthentication
{

    protected CertificateVerifyer verifyer;

    public LegacyTlsAuthentication(CertificateVerifyer certificateverifyer)
    {
        verifyer = certificateverifyer;
    }

    public TlsCredentials getClientCredentials(CertificateRequest certificaterequest)
        throws IOException
    {
        return null;
    }

    public void notifyServerCertificate(Certificate certificate)
        throws IOException
    {
        if (!verifyer.isValid(certificate.getCerts()))
        {
            throw new TlsFatalAlert((short)90);
        } else
        {
            return;
        }
    }
}

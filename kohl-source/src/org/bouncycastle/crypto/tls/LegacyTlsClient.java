// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            DefaultTlsClient, LegacyTlsAuthentication, CertificateVerifyer, TlsAuthentication

public class LegacyTlsClient extends DefaultTlsClient
{

    protected CertificateVerifyer verifyer;

    public LegacyTlsClient(CertificateVerifyer certificateverifyer)
    {
        verifyer = certificateverifyer;
    }

    public TlsAuthentication getAuthentication()
        throws IOException
    {
        return new LegacyTlsAuthentication(verifyer);
    }
}

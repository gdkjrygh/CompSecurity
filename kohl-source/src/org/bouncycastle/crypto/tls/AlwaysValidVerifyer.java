// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.asn1.x509.X509CertificateStructure;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            CertificateVerifyer

public class AlwaysValidVerifyer
    implements CertificateVerifyer
{

    public AlwaysValidVerifyer()
    {
    }

    public boolean isValid(X509CertificateStructure ax509certificatestructure[])
    {
        return true;
    }
}

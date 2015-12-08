// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.tls;

import org.spongycastle.asn1.x509.X509CertificateStructure;

public class Certificate
{

    public static final Certificate a = new Certificate(new X509CertificateStructure[0]);
    protected X509CertificateStructure b[];

    private Certificate(X509CertificateStructure ax509certificatestructure[])
    {
        b = ax509certificatestructure;
    }

}

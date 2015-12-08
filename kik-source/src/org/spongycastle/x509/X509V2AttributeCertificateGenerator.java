// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import org.spongycastle.asn1.x509.V2AttributeCertificateInfoGenerator;
import org.spongycastle.asn1.x509.X509ExtensionsGenerator;

public class X509V2AttributeCertificateGenerator
{

    private V2AttributeCertificateInfoGenerator a;
    private X509ExtensionsGenerator b;

    public X509V2AttributeCertificateGenerator()
    {
        a = new V2AttributeCertificateInfoGenerator();
        b = new X509ExtensionsGenerator();
    }
}

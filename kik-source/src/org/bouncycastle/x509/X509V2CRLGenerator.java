// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

public class X509V2CRLGenerator
{

    private V2TBSCertListGenerator a;
    private X509ExtensionsGenerator b;

    public X509V2CRLGenerator()
    {
        a = new V2TBSCertListGenerator();
        b = new X509ExtensionsGenerator();
    }
}

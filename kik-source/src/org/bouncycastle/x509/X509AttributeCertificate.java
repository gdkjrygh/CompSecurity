// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.math.BigInteger;
import java.security.cert.X509Extension;
import java.util.Date;

// Referenced classes of package org.bouncycastle.x509:
//            X509Attribute, AttributeCertificateHolder, AttributeCertificateIssuer

public interface X509AttributeCertificate
    extends X509Extension
{

    public abstract BigInteger a();

    public abstract void a(Date date);

    public abstract X509Attribute[] a(String s);

    public abstract Date b();

    public abstract AttributeCertificateHolder c();

    public abstract AttributeCertificateIssuer d();

    public abstract byte[] e();
}

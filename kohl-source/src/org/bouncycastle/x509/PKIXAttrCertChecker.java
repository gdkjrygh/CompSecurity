// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package org.bouncycastle.x509:
//            X509AttributeCertificate

public abstract class PKIXAttrCertChecker
    implements Cloneable
{

    public PKIXAttrCertChecker()
    {
    }

    public abstract void check(X509AttributeCertificate x509attributecertificate, CertPath certpath, CertPath certpath1, Collection collection)
        throws CertPathValidatorException;

    public abstract Object clone();

    public abstract Set getSupportedExtensions();
}

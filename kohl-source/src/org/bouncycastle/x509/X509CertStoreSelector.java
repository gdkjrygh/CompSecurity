// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import org.bouncycastle.util.Selector;

public class X509CertStoreSelector extends X509CertSelector
    implements Selector
{

    public X509CertStoreSelector()
    {
    }

    public static X509CertStoreSelector getInstance(X509CertSelector x509certselector)
    {
        if (x509certselector == null)
        {
            throw new IllegalArgumentException("cannot create from null selector");
        }
        X509CertStoreSelector x509certstoreselector = new X509CertStoreSelector();
        x509certstoreselector.setAuthorityKeyIdentifier(x509certselector.getAuthorityKeyIdentifier());
        x509certstoreselector.setBasicConstraints(x509certselector.getBasicConstraints());
        x509certstoreselector.setCertificate(x509certselector.getCertificate());
        x509certstoreselector.setCertificateValid(x509certselector.getCertificateValid());
        x509certstoreselector.setMatchAllSubjectAltNames(x509certselector.getMatchAllSubjectAltNames());
        try
        {
            x509certstoreselector.setPathToNames(x509certselector.getPathToNames());
            x509certstoreselector.setExtendedKeyUsage(x509certselector.getExtendedKeyUsage());
            x509certstoreselector.setNameConstraints(x509certselector.getNameConstraints());
            x509certstoreselector.setPolicy(x509certselector.getPolicy());
            x509certstoreselector.setSubjectPublicKeyAlgID(x509certselector.getSubjectPublicKeyAlgID());
            x509certstoreselector.setSubjectAlternativeNames(x509certselector.getSubjectAlternativeNames());
        }
        // Misplaced declaration of an exception variable
        catch (X509CertSelector x509certselector)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error in passed in selector: ").append(x509certselector).toString());
        }
        x509certstoreselector.setIssuer(x509certselector.getIssuer());
        x509certstoreselector.setKeyUsage(x509certselector.getKeyUsage());
        x509certstoreselector.setPrivateKeyValid(x509certselector.getPrivateKeyValid());
        x509certstoreselector.setSerialNumber(x509certselector.getSerialNumber());
        x509certstoreselector.setSubject(x509certselector.getSubject());
        x509certstoreselector.setSubjectKeyIdentifier(x509certselector.getSubjectKeyIdentifier());
        x509certstoreselector.setSubjectPublicKey(x509certselector.getSubjectPublicKey());
        return x509certstoreselector;
    }

    public Object clone()
    {
        return (X509CertStoreSelector)super.clone();
    }

    public boolean match(Object obj)
    {
        if (!(obj instanceof X509Certificate))
        {
            return false;
        } else
        {
            return super.match((X509Certificate)obj);
        }
    }

    public boolean match(Certificate certificate)
    {
        return match(certificate);
    }
}

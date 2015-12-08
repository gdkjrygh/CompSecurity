// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPCerts extends X509StoreSpi
{

    private LDAPStoreHelper helper;

    public X509StoreLDAPCerts()
    {
    }

    private Collection getCertificatesFromCrossCertificatePairs(X509CertStoreSelector x509certstoreselector)
        throws StoreException
    {
        HashSet hashset = new HashSet();
        Object obj = new X509CertPairStoreSelector();
        ((X509CertPairStoreSelector) (obj)).setForwardSelector(x509certstoreselector);
        ((X509CertPairStoreSelector) (obj)).setReverseSelector(new X509CertStoreSelector());
        Object obj1 = new HashSet(helper.getCrossCertificatePairs(((X509CertPairStoreSelector) (obj))));
        x509certstoreselector = new HashSet();
        obj = new HashSet();
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            X509CertificatePair x509certificatepair = (X509CertificatePair)((Iterator) (obj1)).next();
            if (x509certificatepair.getForward() != null)
            {
                x509certstoreselector.add(x509certificatepair.getForward());
            }
            if (x509certificatepair.getReverse() != null)
            {
                ((Set) (obj)).add(x509certificatepair.getReverse());
            }
        } while (true);
        hashset.addAll(x509certstoreselector);
        hashset.addAll(((Collection) (obj)));
        return hashset;
    }

    public Collection engineGetMatches(Selector selector)
        throws StoreException
    {
        if (!(selector instanceof X509CertStoreSelector))
        {
            return Collections.EMPTY_SET;
        }
        selector = (X509CertStoreSelector)selector;
        HashSet hashset = new HashSet();
        if (selector.getBasicConstraints() > 0)
        {
            hashset.addAll(helper.getCACertificates(selector));
            hashset.addAll(getCertificatesFromCrossCertificatePairs(selector));
            return hashset;
        }
        if (selector.getBasicConstraints() == -2)
        {
            hashset.addAll(helper.getUserCertificates(selector));
            return hashset;
        } else
        {
            hashset.addAll(helper.getUserCertificates(selector));
            hashset.addAll(helper.getCACertificates(selector));
            hashset.addAll(getCertificatesFromCrossCertificatePairs(selector));
            return hashset;
        }
    }

    public void engineInit(X509StoreParameters x509storeparameters)
    {
        if (!(x509storeparameters instanceof X509LDAPCertStoreParameters))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Initialization parameters must be an instance of ").append(org/bouncycastle/jce/X509LDAPCertStoreParameters.getName()).append(".").toString());
        } else
        {
            helper = new LDAPStoreHelper((X509LDAPCertStoreParameters)x509storeparameters);
            return;
        }
    }
}

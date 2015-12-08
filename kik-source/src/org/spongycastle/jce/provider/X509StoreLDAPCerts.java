// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
import org.spongycastle.util.Selector;
import org.spongycastle.x509.X509CertPairStoreSelector;
import org.spongycastle.x509.X509CertStoreSelector;
import org.spongycastle.x509.X509CertificatePair;
import org.spongycastle.x509.X509StoreParameters;
import org.spongycastle.x509.X509StoreSpi;
import org.spongycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPCerts extends X509StoreSpi
{

    private LDAPStoreHelper a;

    public X509StoreLDAPCerts()
    {
    }

    private Collection a(X509CertStoreSelector x509certstoreselector)
    {
        HashSet hashset = new HashSet();
        Object obj = new X509CertPairStoreSelector();
        ((X509CertPairStoreSelector) (obj)).a(x509certstoreselector);
        ((X509CertPairStoreSelector) (obj)).b(new X509CertStoreSelector());
        Object obj1 = new HashSet(a.a(((X509CertPairStoreSelector) (obj))));
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
            if (x509certificatepair.a() != null)
            {
                x509certstoreselector.add(x509certificatepair.a());
            }
            if (x509certificatepair.b() != null)
            {
                ((Set) (obj)).add(x509certificatepair.b());
            }
        } while (true);
        hashset.addAll(x509certstoreselector);
        hashset.addAll(((Collection) (obj)));
        return hashset;
    }

    public final Collection a(Selector selector)
    {
        if (!(selector instanceof X509CertStoreSelector))
        {
            return Collections.EMPTY_SET;
        }
        selector = (X509CertStoreSelector)selector;
        HashSet hashset = new HashSet();
        if (selector.getBasicConstraints() > 0)
        {
            hashset.addAll(a.b(selector));
            hashset.addAll(a(((X509CertStoreSelector) (selector))));
            return hashset;
        }
        if (selector.getBasicConstraints() == -2)
        {
            hashset.addAll(a.a(selector));
            return hashset;
        } else
        {
            hashset.addAll(a.a(selector));
            hashset.addAll(a.b(selector));
            hashset.addAll(a(((X509CertStoreSelector) (selector))));
            return hashset;
        }
    }

    public final void a(X509StoreParameters x509storeparameters)
    {
        if (!(x509storeparameters instanceof X509LDAPCertStoreParameters))
        {
            throw new IllegalArgumentException((new StringBuilder("Initialization parameters must be an instance of ")).append(org/spongycastle/jce/X509LDAPCertStoreParameters.getName()).append(".").toString());
        } else
        {
            a = new LDAPStoreHelper((X509LDAPCertStoreParameters)x509storeparameters);
            return;
        }
    }
}

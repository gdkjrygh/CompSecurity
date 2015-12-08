// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPCRLs extends X509StoreSpi
{

    private LDAPStoreHelper helper;

    public X509StoreLDAPCRLs()
    {
    }

    public Collection engineGetMatches(Selector selector)
        throws StoreException
    {
        if (!(selector instanceof X509CRLStoreSelector))
        {
            return Collections.EMPTY_SET;
        }
        selector = (X509CRLStoreSelector)selector;
        HashSet hashset = new HashSet();
        if (selector.isDeltaCRLIndicatorEnabled())
        {
            hashset.addAll(helper.getDeltaCertificateRevocationLists(selector));
            return hashset;
        } else
        {
            hashset.addAll(helper.getDeltaCertificateRevocationLists(selector));
            hashset.addAll(helper.getAttributeAuthorityRevocationLists(selector));
            hashset.addAll(helper.getAttributeCertificateRevocationLists(selector));
            hashset.addAll(helper.getAuthorityRevocationLists(selector));
            hashset.addAll(helper.getCertificateRevocationLists(selector));
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

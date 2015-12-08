// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.jce.X509LDAPCertStoreParameters;
import org.spongycastle.util.Selector;
import org.spongycastle.x509.X509CertPairStoreSelector;
import org.spongycastle.x509.X509StoreParameters;
import org.spongycastle.x509.X509StoreSpi;
import org.spongycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPCertPairs extends X509StoreSpi
{

    private LDAPStoreHelper a;

    public X509StoreLDAPCertPairs()
    {
    }

    public final Collection a(Selector selector)
    {
        if (!(selector instanceof X509CertPairStoreSelector))
        {
            return Collections.EMPTY_SET;
        } else
        {
            selector = (X509CertPairStoreSelector)selector;
            HashSet hashset = new HashSet();
            hashset.addAll(a.a(selector));
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

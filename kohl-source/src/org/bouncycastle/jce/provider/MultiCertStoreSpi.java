// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jce.MultiCertStoreParameters;

public class MultiCertStoreSpi extends CertStoreSpi
{

    private MultiCertStoreParameters params;

    public MultiCertStoreSpi(CertStoreParameters certstoreparameters)
        throws InvalidAlgorithmParameterException
    {
        super(certstoreparameters);
        if (!(certstoreparameters instanceof MultiCertStoreParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n").append(certstoreparameters.toString()).toString());
        } else
        {
            params = (MultiCertStoreParameters)certstoreparameters;
            return;
        }
    }

    public Collection engineGetCRLs(CRLSelector crlselector)
        throws CertStoreException
    {
        boolean flag = params.getSearchAllStores();
        Iterator iterator = params.getCertStores().iterator();
        Object obj;
        Object obj1;
        if (flag)
        {
            obj = new ArrayList();
        } else
        {
            obj = Collections.EMPTY_LIST;
        }
label0:
        do
        {
            do
            {
                obj1 = obj;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj1 = ((CertStore)iterator.next()).getCRLs(crlselector);
                if (!flag)
                {
                    continue label0;
                }
                ((List) (obj)).addAll(((Collection) (obj1)));
            } while (true);
        } while (((Collection) (obj1)).isEmpty());
        return ((Collection) (obj1));
    }

    public Collection engineGetCertificates(CertSelector certselector)
        throws CertStoreException
    {
        boolean flag = params.getSearchAllStores();
        Iterator iterator = params.getCertStores().iterator();
        Object obj;
        Object obj1;
        if (flag)
        {
            obj = new ArrayList();
        } else
        {
            obj = Collections.EMPTY_LIST;
        }
label0:
        do
        {
            do
            {
                obj1 = obj;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj1 = ((CertStore)iterator.next()).getCertificates(certselector);
                if (!flag)
                {
                    continue label0;
                }
                ((List) (obj)).addAll(((Collection) (obj1)));
            } while (true);
        } while (((Collection) (obj1)).isEmpty());
        return ((Collection) (obj1));
    }
}

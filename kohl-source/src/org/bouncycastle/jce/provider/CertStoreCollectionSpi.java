// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertStoreCollectionSpi extends CertStoreSpi
{

    private CollectionCertStoreParameters params;

    public CertStoreCollectionSpi(CertStoreParameters certstoreparameters)
        throws InvalidAlgorithmParameterException
    {
        super(certstoreparameters);
        if (!(certstoreparameters instanceof CollectionCertStoreParameters))
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder()).append("org.bouncycastle.jce.provider.CertStoreCollectionSpi: parameter must be a CollectionCertStoreParameters object\n").append(certstoreparameters.toString()).toString());
        } else
        {
            params = (CollectionCertStoreParameters)certstoreparameters;
            return;
        }
    }

    public Collection engineGetCRLs(CRLSelector crlselector)
        throws CertStoreException
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = params.getCollection().iterator();
        if (crlselector == null)
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                crlselector = ((CRLSelector) (iterator.next()));
                if (crlselector instanceof CRL)
                {
                    arraylist.add(crlselector);
                }
            } while (true);
        } else
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if ((obj instanceof CRL) && crlselector.match((CRL)obj))
                {
                    arraylist.add(obj);
                }
            } while (true);
        }
        return arraylist;
    }

    public Collection engineGetCertificates(CertSelector certselector)
        throws CertStoreException
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = params.getCollection().iterator();
        if (certselector == null)
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                certselector = ((CertSelector) (iterator.next()));
                if (certselector instanceof Certificate)
                {
                    arraylist.add(certselector);
                }
            } while (true);
        } else
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = iterator.next();
                if ((obj instanceof Certificate) && certselector.match((Certificate)obj))
                {
                    arraylist.add(obj);
                }
            } while (true);
        }
        return arraylist;
    }
}

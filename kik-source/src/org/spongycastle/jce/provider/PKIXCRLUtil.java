// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.util.StoreException;
import org.spongycastle.x509.ExtendedPKIXParameters;
import org.spongycastle.x509.X509CRLStoreSelector;
import org.spongycastle.x509.X509Store;

// Referenced classes of package org.spongycastle.jce.provider:
//            AnnotatedException

public class PKIXCRLUtil
{

    public PKIXCRLUtil()
    {
    }

    private static Collection a(X509CRLStoreSelector x509crlstoreselector, List list)
    {
        HashSet hashset;
        Iterator iterator;
        boolean flag;
        hashset = new HashSet();
        iterator = list.iterator();
        list = null;
        flag = false;
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = iterator.next();
        if (obj instanceof X509Store)
        {
            obj = (X509Store)obj;
            try
            {
                hashset.addAll(((X509Store) (obj)).a(x509crlstoreselector));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list = new AnnotatedException("Exception searching in X.509 CRL store.", list);
                continue; /* Loop/switch isn't completed */
            }
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        obj = (CertStore)obj;
        hashset.addAll(((CertStore) (obj)).getCRLs(x509crlstoreselector));
        flag = true;
        continue; /* Loop/switch isn't completed */
        list;
        list = new AnnotatedException("Exception searching in X.509 CRL store.", list);
        if (true) goto _L2; else goto _L1
_L1:
        if (!flag && list != null)
        {
            throw list;
        } else
        {
            return hashset;
        }
    }

    public static Set a(X509CRLStoreSelector x509crlstoreselector, ExtendedPKIXParameters extendedpkixparameters, Date date)
    {
        HashSet hashset1 = new HashSet();
        HashSet hashset;
        try
        {
            hashset1.addAll(a(x509crlstoreselector, extendedpkixparameters.e()));
            hashset1.addAll(a(x509crlstoreselector, extendedpkixparameters.f()));
            hashset1.addAll(a(x509crlstoreselector, extendedpkixparameters.getCertStores()));
        }
        // Misplaced declaration of an exception variable
        catch (X509CRLStoreSelector x509crlstoreselector)
        {
            throw new AnnotatedException("Exception obtaining complete CRLs.", x509crlstoreselector);
        }
        hashset = new HashSet();
        if (extendedpkixparameters.getDate() != null)
        {
            date = extendedpkixparameters.getDate();
        }
        extendedpkixparameters = hashset1.iterator();
        do
        {
            if (!extendedpkixparameters.hasNext())
            {
                break;
            }
            X509CRL x509crl = (X509CRL)extendedpkixparameters.next();
            if (x509crl.getNextUpdate().after(date))
            {
                X509Certificate x509certificate = x509crlstoreselector.getCertificateChecking();
                if (x509certificate != null)
                {
                    if (x509crl.getThisUpdate().before(x509certificate.getNotAfter()))
                    {
                        hashset.add(x509crl);
                    }
                } else
                {
                    hashset.add(x509crl);
                }
            }
        } while (true);
        return hashset;
    }
}

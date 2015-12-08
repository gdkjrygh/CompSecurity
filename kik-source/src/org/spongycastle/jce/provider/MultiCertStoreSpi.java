// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreSpi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jce.MultiCertStoreParameters;

public class MultiCertStoreSpi extends CertStoreSpi
{

    private MultiCertStoreParameters a;

    public Collection engineGetCRLs(CRLSelector crlselector)
    {
        boolean flag = a.b();
        Iterator iterator = a.a().iterator();
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
    {
        boolean flag = a.b();
        Iterator iterator = a.a().iterator();
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Collection;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509CollectionStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;

public class X509StoreCertCollection extends X509StoreSpi
{

    private CollectionStore _store;

    public X509StoreCertCollection()
    {
    }

    public Collection engineGetMatches(Selector selector)
    {
        return _store.getMatches(selector);
    }

    public void engineInit(X509StoreParameters x509storeparameters)
    {
        if (!(x509storeparameters instanceof X509CollectionStoreParameters))
        {
            throw new IllegalArgumentException(x509storeparameters.toString());
        } else
        {
            _store = new CollectionStore(((X509CollectionStoreParameters)x509storeparameters).getCollection());
            return;
        }
    }
}

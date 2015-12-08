// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.util.Collection;
import org.spongycastle.util.CollectionStore;
import org.spongycastle.util.Selector;
import org.spongycastle.x509.X509CollectionStoreParameters;
import org.spongycastle.x509.X509StoreParameters;
import org.spongycastle.x509.X509StoreSpi;

public class X509StoreCertCollection extends X509StoreSpi
{

    private CollectionStore a;

    public X509StoreCertCollection()
    {
    }

    public final Collection a(Selector selector)
    {
        return a.a(selector);
    }

    public final void a(X509StoreParameters x509storeparameters)
    {
        if (!(x509storeparameters instanceof X509CollectionStoreParameters))
        {
            throw new IllegalArgumentException(x509storeparameters.toString());
        } else
        {
            a = new CollectionStore(((X509CollectionStoreParameters)x509storeparameters).a());
            return;
        }
    }
}

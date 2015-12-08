// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

// Referenced classes of package org.bouncycastle.x509:
//            X509StoreSpi, NoSuchStoreException, X509Util, X509StoreParameters

public class X509Store
    implements Store
{

    private Provider _provider;
    private X509StoreSpi _spi;

    private X509Store(Provider provider, X509StoreSpi x509storespi)
    {
        _provider = provider;
        _spi = x509storespi;
    }

    private static X509Store createStore(X509Util.Implementation implementation, X509StoreParameters x509storeparameters)
    {
        X509StoreSpi x509storespi = (X509StoreSpi)implementation.getEngine();
        x509storespi.engineInit(x509storeparameters);
        return new X509Store(implementation.getProvider(), x509storespi);
    }

    public static X509Store getInstance(String s, X509StoreParameters x509storeparameters)
        throws NoSuchStoreException
    {
        try
        {
            s = createStore(X509Util.getImplementation("X509Store", s), x509storeparameters);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoSuchStoreException(s.getMessage());
        }
        return s;
    }

    public static X509Store getInstance(String s, X509StoreParameters x509storeparameters, String s1)
        throws NoSuchStoreException, NoSuchProviderException
    {
        return getInstance(s, x509storeparameters, X509Util.getProvider(s1));
    }

    public static X509Store getInstance(String s, X509StoreParameters x509storeparameters, Provider provider)
        throws NoSuchStoreException
    {
        try
        {
            s = createStore(X509Util.getImplementation("X509Store", s, provider), x509storeparameters);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoSuchStoreException(s.getMessage());
        }
        return s;
    }

    public Collection getMatches(Selector selector)
    {
        return _spi.engineGetMatches(selector);
    }

    public Provider getProvider()
    {
        return _provider;
    }
}

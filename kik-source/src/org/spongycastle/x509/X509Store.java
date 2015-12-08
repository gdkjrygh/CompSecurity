// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collection;
import org.spongycastle.util.Selector;
import org.spongycastle.util.Store;

// Referenced classes of package org.spongycastle.x509:
//            a, X509StoreSpi, NoSuchStoreException, X509StoreParameters

public class X509Store
    implements Store
{

    private Provider a;
    private X509StoreSpi b;

    private X509Store(Provider provider, X509StoreSpi x509storespi)
    {
        a = provider;
        b = x509storespi;
    }

    public static X509Store a(String s, X509StoreParameters x509storeparameters, String s1)
    {
        return a(s, x509storeparameters, org.spongycastle.x509.a.a(s1));
    }

    private static X509Store a(String s, X509StoreParameters x509storeparameters, Provider provider)
    {
        try
        {
            s = org.spongycastle.x509.a.a("X509Store", s, provider);
            provider = (X509StoreSpi)((a.a) (s)).a;
            provider.a(x509storeparameters);
            s = new X509Store(((a.a) (s)).b, provider);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoSuchStoreException(s.getMessage());
        }
        return s;
    }

    public final Collection a(Selector selector)
    {
        return b.a(selector);
    }
}

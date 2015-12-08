// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import org.spongycastle.util.Selector;

// Referenced classes of package org.spongycastle.x509:
//            X509CertificatePair, X509CertStoreSelector

public class X509CertPairStoreSelector
    implements Selector
{

    private X509CertStoreSelector a;
    private X509CertStoreSelector b;
    private X509CertificatePair c;

    public X509CertPairStoreSelector()
    {
    }

    public final X509CertificatePair a()
    {
        return c;
    }

    public final void a(X509CertStoreSelector x509certstoreselector)
    {
        a = x509certstoreselector;
    }

    public final boolean a(Object obj)
    {
        if (!(obj instanceof X509CertificatePair))
        {
            return false;
        }
        X509CertificatePair x509certificatepair = (X509CertificatePair)obj;
        if (a != null && !a.a(x509certificatepair.a()))
        {
            return false;
        }
label0:
        {
            if (b != null && !b.a(x509certificatepair.b()))
            {
                return false;
            }
            boolean flag;
            try
            {
                if (c == null)
                {
                    break label0;
                }
                flag = c.equals(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag;
        }
        return true;
    }

    public final X509CertStoreSelector b()
    {
        return a;
    }

    public final void b(X509CertStoreSelector x509certstoreselector)
    {
        b = x509certstoreselector;
    }

    public Object clone()
    {
        X509CertPairStoreSelector x509certpairstoreselector = new X509CertPairStoreSelector();
        x509certpairstoreselector.c = c;
        if (a != null)
        {
            x509certpairstoreselector.a = (X509CertStoreSelector)a.clone();
        }
        if (b != null)
        {
            x509certpairstoreselector.b = (X509CertStoreSelector)b.clone();
        }
        return x509certpairstoreselector;
    }
}

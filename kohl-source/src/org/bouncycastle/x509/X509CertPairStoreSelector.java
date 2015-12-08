// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import org.bouncycastle.util.Selector;

// Referenced classes of package org.bouncycastle.x509:
//            X509CertStoreSelector, X509CertificatePair

public class X509CertPairStoreSelector
    implements Selector
{

    private X509CertificatePair certPair;
    private X509CertStoreSelector forwardSelector;
    private X509CertStoreSelector reverseSelector;

    public X509CertPairStoreSelector()
    {
    }

    public Object clone()
    {
        X509CertPairStoreSelector x509certpairstoreselector = new X509CertPairStoreSelector();
        x509certpairstoreselector.certPair = certPair;
        if (forwardSelector != null)
        {
            x509certpairstoreselector.setForwardSelector((X509CertStoreSelector)forwardSelector.clone());
        }
        if (reverseSelector != null)
        {
            x509certpairstoreselector.setReverseSelector((X509CertStoreSelector)reverseSelector.clone());
        }
        return x509certpairstoreselector;
    }

    public X509CertificatePair getCertPair()
    {
        return certPair;
    }

    public X509CertStoreSelector getForwardSelector()
    {
        return forwardSelector;
    }

    public X509CertStoreSelector getReverseSelector()
    {
        return reverseSelector;
    }

    public boolean match(Object obj)
    {
        if (!(obj instanceof X509CertificatePair))
        {
            return false;
        }
        X509CertificatePair x509certificatepair = (X509CertificatePair)obj;
        if (forwardSelector != null && !forwardSelector.match(x509certificatepair.getForward()))
        {
            return false;
        }
label0:
        {
            if (reverseSelector != null && !reverseSelector.match(x509certificatepair.getReverse()))
            {
                return false;
            }
            boolean flag;
            try
            {
                if (certPair == null)
                {
                    break label0;
                }
                flag = certPair.equals(obj);
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

    public void setCertPair(X509CertificatePair x509certificatepair)
    {
        certPair = x509certificatepair;
    }

    public void setForwardSelector(X509CertStoreSelector x509certstoreselector)
    {
        forwardSelector = x509certstoreselector;
    }

    public void setReverseSelector(X509CertStoreSelector x509certstoreselector)
    {
        reverseSelector = x509certstoreselector;
    }
}

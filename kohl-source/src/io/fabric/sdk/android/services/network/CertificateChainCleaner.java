// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            SystemKeyStore

final class CertificateChainCleaner
{

    private CertificateChainCleaner()
    {
    }

    public static X509Certificate[] getCleanChain(X509Certificate ax509certificate[], SystemKeyStore systemkeystore)
        throws CertificateException
    {
        LinkedList linkedlist = new LinkedList();
        boolean flag = false;
        if (systemkeystore.isTrustRoot(ax509certificate[0]))
        {
            flag = true;
        }
        linkedlist.add(ax509certificate[0]);
        int i = 1;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (i >= ax509certificate.length)
            {
                break;
            }
            if (systemkeystore.isTrustRoot(ax509certificate[i]))
            {
                flag = true;
            }
            flag1 = flag;
            if (!isValidLink(ax509certificate[i], ax509certificate[i - 1]))
            {
                break;
            }
            linkedlist.add(ax509certificate[i]);
            i++;
        } while (true);
        ax509certificate = systemkeystore.getTrustRootFor(ax509certificate[i - 1]);
        if (ax509certificate != null)
        {
            linkedlist.add(ax509certificate);
            flag1 = true;
        }
        if (flag1)
        {
            return (X509Certificate[])linkedlist.toArray(new X509Certificate[linkedlist.size()]);
        } else
        {
            throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
        }
    }

    private static boolean isValidLink(X509Certificate x509certificate, X509Certificate x509certificate1)
    {
        if (!x509certificate.getSubjectX500Principal().equals(x509certificate1.getIssuerX500Principal()))
        {
            return false;
        }
        try
        {
            x509certificate1.verify(x509certificate.getPublicKey());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return false;
        }
        return true;
    }
}

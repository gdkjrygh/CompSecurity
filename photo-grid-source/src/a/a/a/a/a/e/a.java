// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.e;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package a.a.a.a.a.e:
//            p

final class a
{

    private static boolean a(X509Certificate x509certificate, X509Certificate x509certificate1)
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

    public static X509Certificate[] a(X509Certificate ax509certificate[], p p1)
    {
        boolean flag2 = true;
        LinkedList linkedlist = new LinkedList();
        boolean flag;
        boolean flag1;
        int i;
        if (p1.a(ax509certificate[0]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linkedlist.add(ax509certificate[0]);
        i = 1;
        do
        {
            flag1 = flag;
            if (i >= ax509certificate.length)
            {
                break;
            }
            if (p1.a(ax509certificate[i]))
            {
                flag = true;
            }
            flag1 = flag;
            if (!a(ax509certificate[i], ax509certificate[i - 1]))
            {
                break;
            }
            linkedlist.add(ax509certificate[i]);
            i++;
        } while (true);
        ax509certificate = p1.b(ax509certificate[i - 1]);
        if (ax509certificate != null)
        {
            linkedlist.add(ax509certificate);
            flag = flag2;
        } else
        {
            flag = flag1;
        }
        if (flag)
        {
            return (X509Certificate[])linkedlist.toArray(new X509Certificate[linkedlist.size()]);
        } else
        {
            throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
        }
    }
}

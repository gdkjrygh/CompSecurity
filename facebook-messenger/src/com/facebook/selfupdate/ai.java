// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.pm.Signature;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ai
{

    public ai()
    {
    }

    public String a(Signature signature)
    {
        if (signature != null)
        {
            signature = new ByteArrayInputStream(signature.toByteArray());
            try
            {
                signature = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(signature)).getIssuerDN().getName();
            }
            // Misplaced declaration of an exception variable
            catch (Signature signature)
            {
                return "Unknown";
            }
            return signature;
        } else
        {
            return "Unknown";
        }
    }

    public Signature[] a(Certificate acertificate[])
    {
        int j;
        j = 0;
        if (acertificate == null || acertificate.length <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Signature asignature1[];
        int k;
        asignature1 = new Signature[acertificate.length];
        k = acertificate.length;
        int i = 0;
_L2:
        Signature asignature[];
        asignature = asignature1;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        asignature1[i] = new Signature(acertificate[j].getEncoded());
        j++;
        i++;
        if (true) goto _L2; else goto _L1
        acertificate;
        asignature = null;
_L1:
        return asignature;
        return null;
    }

    public Certificate[] a(JarFile jarfile, JarEntry jarentry)
    {
        Object obj = null;
        try
        {
            for (jarfile = new BufferedInputStream(jarfile.getInputStream(jarentry)); jarfile.read() != -1;) { }
            jarfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (JarFile jarfile)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JarFile jarfile)
        {
            return null;
        }
        jarfile = obj;
        if (jarentry == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        jarfile = jarentry.getCertificates();
        return jarfile;
    }
}

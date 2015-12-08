// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.util.Log;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.chromium.net.X509Util;

class SslUtil
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "SslUtil";

    SslUtil()
    {
    }

    public static SslCertificate getCertificateFromDerBytes(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new SslCertificate(X509Util.createCertificateFromBytes(abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.w("SslUtil", (new StringBuilder()).append("Could not read certificate: ").append(abyte0).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.w("SslUtil", (new StringBuilder()).append("Could not read certificate: ").append(abyte0).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.w("SslUtil", (new StringBuilder()).append("Could not read certificate: ").append(abyte0).toString());
            return null;
        }
        return abyte0;
    }

    public static SslError sslErrorFromNetErrorCode(int i, SslCertificate sslcertificate, String s)
    {
        if (!$assertionsDisabled && (i < -213 || i > -200))
        {
            throw new AssertionError();
        }
        switch (i)
        {
        default:
            return new SslError(5, sslcertificate, s);

        case -200: 
            return new SslError(2, sslcertificate, s);

        case -201: 
            return new SslError(4, sslcertificate, s);

        case -202: 
            return new SslError(3, sslcertificate, s);
        }
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/SslUtil.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}

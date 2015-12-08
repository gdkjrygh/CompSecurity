// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class M
{

    private static final String a = com/paypal/android/sdk/M.getSimpleName();

    public M()
    {
    }

    protected static boolean a(Context context, boolean flag, String s, String s1, String s2)
    {
        boolean flag3;
        flag3 = false;
        context = context.getPackageManager();
        context.getApplicationInfo(s, 4224);
label0:
        {
            boolean flag1;
            boolean flag2;
            if (context.checkPermission("android.permission.AUTHENTICATE_ACCOUNTS", s) == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag2 = flag3;
            if (!flag1)
            {
                break label0;
            }
            if (flag)
            {
                try
                {
                    flag = a(((PackageManager) (context)), s, s1, s2);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.e(a, (new StringBuilder()).append(s).append(" not found.").toString());
                    return false;
                }
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        return flag2;
    }

    private static boolean a(PackageManager packagemanager, String s, String s1, String s2)
    {
        int i;
        int j;
        packagemanager = packagemanager.getPackageInfo(s, 64).signatures;
        j = packagemanager.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = new ByteArrayInputStream(packagemanager[i].toByteArray());
        String s3;
        String s4;
        int k;
        s = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(s);
        s3 = s.getSubjectX500Principal().getName();
        s4 = s.getIssuerX500Principal().getName();
        k = s.getPublicKey().hashCode();
        boolean flag;
        if (s1.equals(s3) && s2.equals(s4) && 0x2096f5c == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        Log.e(a, "App cert is NOT valid.");
        return flag;
        s;
        Log.e(a, "exception parsing cert", s);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

}

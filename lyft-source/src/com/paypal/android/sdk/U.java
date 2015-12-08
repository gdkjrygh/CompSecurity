// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.security.auth.x500.X500Principal;

public class U
{

    private static final String a = com/paypal/android/sdk/U.getSimpleName();

    public U()
    {
    }

    protected static Intent a(String s, String s1)
    {
        s = new Intent(s);
        s.setComponent(ComponentName.unflattenFromString(s1));
        s.setPackage("com.paypal.android.p2pmobile");
        return s;
    }

    private static boolean a(PackageManager packagemanager)
    {
        int i;
        int j;
        packagemanager = packagemanager.getPackageInfo("com.paypal.android.p2pmobile", 64).signatures;
        j = packagemanager.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new ByteArrayInputStream(packagemanager[i].toByteArray());
        String s;
        String s1;
        int k;
        obj = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(((java.io.InputStream) (obj)));
        s = ((X509Certificate) (obj)).getSubjectX500Principal().getName();
        s1 = ((X509Certificate) (obj)).getIssuerX500Principal().getName();
        k = ((X509Certificate) (obj)).getPublicKey().hashCode();
        (new StringBuilder("Certificate subject: ")).append(s);
        (new StringBuilder("Certificate issuer: ")).append(s1);
        (new StringBuilder("Certificate public key hash code: ")).append(k);
        boolean flag;
        if ("O=Paypal".equals(s) && "O=Paypal".equals(s1) && 0x2096f5c == k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Log.e(a, "Authenticator cert is NOT valid.");
        return flag;
        CertificateException certificateexception;
        certificateexception;
        Log.e(a, "exception parsing cert", certificateexception);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    protected final boolean a(Context context, String s, String s1)
    {
        boolean flag = false;
        if (context.getPackageManager().queryIntentActivities(a(s, s1), 0).size() > 0)
        {
            flag = true;
        }
        if (!flag)
        {
            (new StringBuilder("PayPal wallet app will not accept intent to: [action:")).append(s).append(", class:").append(s1).append("]");
        }
        return flag;
    }

    public final boolean b(Context context, boolean flag)
    {
        boolean flag3;
        flag3 = false;
        context = context.getPackageManager();
        context.getApplicationInfo("com.paypal.android.p2pmobile", 4224);
        boolean flag2;
        boolean flag1;
        if (context.checkPermission("android.permission.AUTHENTICATE_ACCOUNTS", "com.paypal.android.p2pmobile") == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        flag = a(context);
        flag2 = flag3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        flag2 = true;
_L2:
        (new StringBuilder("returning isValid:")).append(flag2);
        return flag2;
        context;
        Log.e(a, "com.paypal.android.p2pmobile not found.");
        flag2 = flag3;
        if (true) goto _L2; else goto _L1
_L1:
    }

}

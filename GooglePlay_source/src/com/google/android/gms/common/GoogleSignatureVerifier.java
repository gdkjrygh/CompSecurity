// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            GoogleCertificates, GooglePlayServicesUtil

public final class GoogleSignatureVerifier
{

    private static final GoogleSignatureVerifier INSTANCE = new GoogleSignatureVerifier();

    private GoogleSignatureVerifier()
    {
    }

    public static GoogleSignatureVerifier getInstance()
    {
        return INSTANCE;
    }

    private static boolean verifyGoogleSignature(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else
        {
            GoogleCertificates.FullCertData fullcertdata = new GoogleCertificates.FullCertData(packageinfo.signatures[0].toByteArray());
            if (flag)
            {
                packageinfo = GoogleCertificates.getGoogleCertificates();
            } else
            {
                packageinfo = GoogleCertificates.getGoogleReleaseCertificates();
            }
            if (packageinfo.contains(fullcertdata))
            {
                return true;
            }
            if (Log.isLoggable("GoogleSignatureVerifier", 2))
            {
                Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(fullcertdata.getBytes(), 0)).toString());
                return false;
            }
        }
        return false;
    }

    static transient GoogleCertificates.CertData verifySignature(PackageInfo packageinfo, GoogleCertificates.CertData acertdata[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else
        {
            packageinfo = new GoogleCertificates.FullCertData(packageinfo.signatures[0].toByteArray());
            for (int i = 0; i < acertdata.length; i++)
            {
                if (acertdata[i].equals(packageinfo))
                {
                    return acertdata[i];
                }
            }

            if (Log.isLoggable("GoogleSignatureVerifier", 2))
            {
                Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.getBytes(), 0)).toString());
                return null;
            }
        }
        return null;
    }

    public final boolean isPackageGoogleSigned(PackageManager packagemanager, String s)
    {
        boolean flag = false;
        PackageInfo packageinfo = packagemanager.getPackageInfo(s, 64);
        if (packageinfo != null) goto _L2; else goto _L1
_L1:
        return flag;
        packagemanager;
        if (Log.isLoggable("GoogleSignatureVerifier", 3))
        {
            Log.d("GoogleSignatureVerifier", (new StringBuilder("Package manager can't find package ")).append(s).append(", defaulting to false").toString());
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (GooglePlayServicesUtil.honorsDebugCertificates(packagemanager))
        {
            return verifyGoogleSignature(packageinfo, true);
        }
        boolean flag1 = verifyGoogleSignature(packageinfo, false);
        flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (verifyGoogleSignature(packageinfo, true))
            {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                return flag1;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void verifyUidIsGoogleSigned(PackageManager packagemanager, int i)
        throws SecurityException
    {
        boolean flag1 = false;
        if (packagemanager == null)
        {
            throw new SecurityException("Unknown error: invalid Package Manager");
        }
        String as[] = packagemanager.getPackagesForUid(i);
        boolean flag = flag1;
        if (as != null)
        {
            if (as.length == 0)
            {
                flag = flag1;
            } else
            {
                flag = isPackageGoogleSigned(packagemanager, as[0]);
            }
        }
        if (!flag)
        {
            throw new SecurityException("Uid is not Google Signed");
        } else
        {
            return;
        }
    }

}

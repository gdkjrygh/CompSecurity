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
//            f, GooglePlayServicesUtil

public final class g
{

    private static final g a = new g();

    private g()
    {
    }

    static transient f.a a(PackageInfo packageinfo, f.a aa[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new f.ab(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < aa.length; i++)
        {
            if (aa[i].equals(packageinfo))
            {
                return aa[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.a(), 0)).toString());
        }
        return null;
    }

    public static g a()
    {
        return a;
    }

    private static boolean a(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        f.ab ab = new f.ab(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = f.a();
        } else
        {
            packageinfo = f.b();
        }
        if (packageinfo.contains(ab))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(ab.a(), 0)).toString());
        }
        return false;
    }

    public static boolean a(PackageManager packagemanager, String s)
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
        if (GooglePlayServicesUtil.zzc(packagemanager))
        {
            return a(packageinfo, true);
        }
        boolean flag1 = a(packageinfo, false);
        flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (a(packageinfo, true))
            {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                return flag1;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}

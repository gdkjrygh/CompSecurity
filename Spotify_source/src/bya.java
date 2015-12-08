// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Set;

public final class bya
{

    private static final bya a = new bya();

    private bya()
    {
    }

    public static transient bua a(PackageInfo packageinfo, bua abua[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new bvb(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < abua.length; i++)
        {
            if (abua[i].equals(packageinfo))
            {
                return abua[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.a(), 0)).toString());
        }
        return null;
    }

    public static bya a()
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
        bvb bvb1 = new bvb(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = btz.a();
        } else
        {
            packageinfo = btz.b();
        }
        if (packageinfo.contains(bvb1))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            Log.v("GoogleSignatureVerifier", (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(bvb1.a(), 0)).toString());
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

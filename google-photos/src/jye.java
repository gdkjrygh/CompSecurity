// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

public final class jye
{

    private static final jye a = new jye();

    private jye()
    {
    }

    public static jye a()
    {
        return a;
    }

    static transient kdq a(PackageInfo packageinfo, kdq akdq[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new kgr(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < akdq.length; i++)
        {
            if (akdq[i].equals(packageinfo))
            {
                return akdq[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.a(), 0));
        }
        return null;
    }

    private static boolean a(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        kgr kgr1 = new kgr(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = kdp.a();
        } else
        {
            packageinfo = kdp.b();
        }
        if (packageinfo.contains(kgr1))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(kgr1.a(), 0));
        }
        return false;
    }

    public final boolean a(PackageManager packagemanager, String s)
    {
        boolean flag = false;
        PackageInfo packageinfo = packagemanager.getPackageInfo(s, 64);
        if (packageinfo != null) goto _L2; else goto _L1
_L1:
        return flag;
        packagemanager;
        if (Log.isLoggable("GoogleSignatureVerifier", 3))
        {
            (new StringBuilder("Package manager can't find package ")).append(s).append(", defaulting to false");
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (jyc.a(packagemanager))
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

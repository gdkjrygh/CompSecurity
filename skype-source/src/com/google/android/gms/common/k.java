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
//            j, e

public final class k
{

    private static final k a = new k();

    private k()
    {
    }

    static transient j.a a(PackageInfo packageinfo, j.a aa[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new j.ab(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < aa.length; i++)
        {
            if (aa[i].equals(packageinfo))
            {
                return aa[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.a(), 0));
        }
        return null;
    }

    public static k a()
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
        j.ab ab = new j.ab(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = j.a();
        } else
        {
            packageinfo = j.b();
        }
        if (packageinfo.contains(ab))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(ab.a(), 0));
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
            (new StringBuilder("Package manager can't find package ")).append(s).append(", defaulting to false");
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (e.a(packagemanager))
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.g;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.g:
//            e, g

public final class h
{

    private static final h a = new h();

    private h()
    {
    }

    static transient e.a a(PackageInfo packageinfo, e.a aa[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new e.ab(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < aa.length; i++)
        {
            if (aa[i].equals(packageinfo))
            {
                return aa[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            packageinfo = String.valueOf(Base64.encodeToString(packageinfo.a(), 0));
            if (packageinfo.length() != 0)
            {
                packageinfo = "Signature not valid.  Found: \n".concat(packageinfo);
            } else
            {
                packageinfo = new String("Signature not valid.  Found: \n");
            }
            Log.v("GoogleSignatureVerifier", packageinfo);
        }
        return null;
    }

    public static h a()
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
        e.ab ab = new e.ab(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = e.a();
        } else
        {
            packageinfo = e.b();
        }
        if (packageinfo.contains(ab))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            packageinfo = String.valueOf(Base64.encodeToString(ab.a(), 0));
            if (packageinfo.length() != 0)
            {
                packageinfo = "Signature not valid.  Found: \n".concat(packageinfo);
            } else
            {
                packageinfo = new String("Signature not valid.  Found: \n");
            }
            Log.v("GoogleSignatureVerifier", packageinfo);
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
            Log.d("GoogleSignatureVerifier", (new StringBuilder(String.valueOf(s).length() + 56)).append("Package manager can't find package ").append(s).append(", defaulting to false").toString());
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (g.a(packagemanager))
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

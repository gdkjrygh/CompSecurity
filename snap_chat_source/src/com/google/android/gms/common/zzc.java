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
//            zzb, GooglePlayServicesUtil

public class zzc
{

    private static final zzc zzLH = new zzc();

    private zzc()
    {
    }

    private boolean zza(PackageInfo packageinfo, boolean flag)
    {
        if (packageinfo.signatures.length != 1)
        {
            return false;
        }
        zzb.zzb zzb1 = new zzb.zzb(packageinfo.signatures[0].toByteArray());
        if (flag)
        {
            packageinfo = com.google.android.gms.common.zzb.zzhL();
        } else
        {
            packageinfo = com.google.android.gms.common.zzb.zzhM();
        }
        if (packageinfo.contains(zzb1))
        {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(zzb1.getBytes(), 0));
        }
        return false;
    }

    public static zzc zzhP()
    {
        return zzLH;
    }

    transient zzb.zza zza(PackageInfo packageinfo, zzb.zza azza[])
    {
        if (packageinfo.signatures.length != 1)
        {
            return null;
        }
        packageinfo = new zzb.zzb(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < azza.length; i++)
        {
            if (azza[i].equals(packageinfo))
            {
                return azza[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            (new StringBuilder("Signature not valid.  Found: \n")).append(Base64.encodeToString(packageinfo.getBytes(), 0));
        }
        return null;
    }

    public boolean zza(PackageManager packagemanager, PackageInfo packageinfo)
    {
        boolean flag = false;
        if (packageinfo != null)
        {
            if (GooglePlayServicesUtil.zzc(packagemanager))
            {
                return zza(packageinfo, true);
            }
            boolean flag1 = zza(packageinfo, false);
            flag = flag1;
            if (!flag1)
            {
                zza(packageinfo, true);
                return flag1;
            }
        }
        return flag;
    }

    public boolean zzb(PackageManager packagemanager, String s)
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = packagemanager.getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            if (Log.isLoggable("GoogleSignatureVerifier", 3))
            {
                (new StringBuilder("Package manager can't find package ")).append(s).append(", defaulting to false");
            }
            return false;
        }
        return zza(packagemanager, packageinfo);
    }

}

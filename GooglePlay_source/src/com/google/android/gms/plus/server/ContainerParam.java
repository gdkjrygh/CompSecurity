// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.server;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ContainerParam
{

    private PackageManager mPackageManager;

    ContainerParam(PackageManager packagemanager)
    {
        mPackageManager = packagemanager;
    }

    private static String signatureDigest(Signature signature)
    {
        Object obj1;
        int i;
        obj1 = null;
        i = 0;
_L2:
        Object obj;
        obj = obj1;
        if (i > 2)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        obj = MessageDigest.getInstance("SHA1");
        if (obj == null)
        {
            return "0";
        }
        break; /* Loop/switch isn't completed */
        obj;
        if (i > 0 && Log.isLoggable("ContainerParam", 5))
        {
            Log.w("ContainerParam", String.format("Failed to get message digest for %s, returning zero", new Object[] {
                "SHA1"
            }), ((Throwable) (obj)));
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        signature = ((MessageDigest) (obj)).digest(signature.toByteArray());
        if (signature == null)
        {
            return "0";
        } else
        {
            return Base64.encodeToString(signature, 2);
        }
    }

    final String getCertificate(String s)
    {
        Object obj;
        obj = mPackageManager.getPackageInfo(s, 64);
        if (((PackageInfo) (obj)).signatures == null || ((PackageInfo) (obj)).signatures.length <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = signatureDigest(((PackageInfo) (obj)).signatures[0]);
        return ((String) (obj));
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if (Log.isLoggable("ContainerParam", 5))
        {
            Log.w("ContainerParam", String.format("Name not found while getting certificate for package: %s, returning zero", new Object[] {
                s
            }));
        }
        return "0";
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gq
{

    private static final List a = Arrays.asList(new String[] {
        "android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"
    });
    private final Context b;

    public gq(Context context)
    {
        b = context;
    }

    public final void a()
    {
        HashSet hashset;
        String as[];
        int i;
        try
        {
            hashset = new HashSet(a);
            as = b.getPackageManager().getPackageInfo(b.getPackageName(), 4096).requestedPermissions;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException((new StringBuilder("Exception loading manifest")).append(namenotfoundexception.getMessage()).toString());
        }
        if (as == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.remove(as[i]);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!hashset.isEmpty())
        {
            throw new RuntimeException((new StringBuilder("Missing required permissions in manifest:")).append(hashset).toString());
        }
    }

    static 
    {
        com/paypal/android/sdk/gq.getSimpleName();
    }
}

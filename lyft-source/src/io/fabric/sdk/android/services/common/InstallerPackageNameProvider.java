// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.cache.ValueLoader;

public class InstallerPackageNameProvider
{

    private final ValueLoader a = new ValueLoader() {

        final InstallerPackageNameProvider a;

        public String a(Context context)
        {
            String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            context = s;
            if (s == null)
            {
                context = "";
            }
            return context;
        }

        public Object c(Context context)
        {
            return a(context);
        }

            
            {
                a = InstallerPackageNameProvider.this;
                super();
            }
    };
    private final MemoryValueCache b = new MemoryValueCache();

    public InstallerPackageNameProvider()
    {
    }

    public String a(Context context)
    {
        boolean flag;
        try
        {
            context = (String)b.a(context, a);
            flag = "".equals(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.g().d("Fabric", "Failed to determine installer package name", context);
            return null;
        }
        if (flag)
        {
            context = null;
        }
        return context;
    }
}

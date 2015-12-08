// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.cache.ValueLoader;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            InstallerPackageNameProvider

class a
    implements ValueLoader
{

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

    (InstallerPackageNameProvider installerpackagenameprovider)
    {
        a = installerpackagenameprovider;
        super();
    }
}

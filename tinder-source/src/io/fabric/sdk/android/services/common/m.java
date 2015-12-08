// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.a.b;
import io.fabric.sdk.android.services.a.d;

public final class m
{

    private final d a = new d() {

        final m a;

        public final Object a(Context context)
            throws Exception
        {
            String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            context = s;
            if (s == null)
            {
                context = "";
            }
            return context;
        }

            
            {
                a = m.this;
                super();
            }
    };
    private final b b = new b();

    public m()
    {
    }

    public final String a(Context context)
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
            c.a().c("Fabric", "Failed to determine installer package name", context);
            return null;
        }
        if (flag)
        {
            context = null;
        }
        return context;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.a.d;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            m

final class a
    implements d
{

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

    (m m1)
    {
        a = m1;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

class a
    implements Callable
{

    final CrashlyticsCore a;

    private Boolean a()
        throws Exception
    {
        boolean flag;
        try
        {
            flag = CrashlyticsCore.a(a).delete();
            c.a().a("CrashlyticsCore", (new StringBuilder("Initialization marker file removed: ")).append(flag).toString());
        }
        catch (Exception exception)
        {
            c.a().c("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", exception);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (CrashlyticsCore crashlyticscore)
    {
        a = crashlyticscore;
        super();
    }
}

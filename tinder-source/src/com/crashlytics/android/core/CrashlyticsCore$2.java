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

    public Object call()
        throws Exception
    {
        CrashlyticsCore.a(a).createNewFile();
        c.a().a("CrashlyticsCore", "Initialization marker file created.");
        return null;
    }

    (CrashlyticsCore crashlyticscore)
    {
        a = crashlyticscore;
        super();
    }
}

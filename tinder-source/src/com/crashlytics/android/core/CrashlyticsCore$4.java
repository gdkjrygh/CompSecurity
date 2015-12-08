// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

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
        return Boolean.valueOf(CrashlyticsCore.a(a).exists());
    }

    (CrashlyticsCore crashlyticscore)
    {
        a = crashlyticscore;
        super();
    }
}

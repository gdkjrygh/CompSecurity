// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class a
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler a;

    public Object call()
        throws Exception
    {
        CrashlyticsUncaughtExceptionHandler.e(a);
        return null;
    }

    I(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        a = crashlyticsuncaughtexceptionhandler;
        super();
    }
}

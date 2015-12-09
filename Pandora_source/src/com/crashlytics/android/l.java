// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            bc

final class l
    implements Callable
{

    private Callable a;

    l(bc bc, Callable callable)
    {
        a = callable;
        super();
    }

    public final Object call()
        throws Exception
    {
        Object obj;
        try
        {
            obj = a.call();
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }
}

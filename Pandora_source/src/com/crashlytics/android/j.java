// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;

// Referenced classes of package com.crashlytics.android:
//            bc

final class j
    implements Runnable
{

    private Runnable a;

    j(bc bc, Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Failed to execute task.", exception);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import android.os.Build;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            EasyMetric

public class ErrorMetric extends EasyMetric
{

    public ErrorMetric(String s)
    {
        super(s);
        a("DEVICE", Build.DEVICE);
        a("SDK_INT", String.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    public final ErrorMetric a(Throwable throwable)
    {
        a("error_message", throwable.getMessage());
        return this;
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        Timber.e("ErrorMetric", (new StringBuilder("Reporting Error: ")).append(a).toString(), new Object[0]);
    }
}

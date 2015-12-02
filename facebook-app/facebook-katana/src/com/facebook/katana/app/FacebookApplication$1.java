// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import com.facebook.acra.CustomReportDataSupplier;
import com.facebook.base.lwperf.perfstats.BackgroundChecker;

// Referenced classes of package com.facebook.katana.app:
//            FacebookApplication

class a
    implements CustomReportDataSupplier
{

    final FacebookApplication a;

    public String getCustomData(Throwable throwable)
    {
        return String.valueOf(BackgroundChecker.a().e());
    }

    hecker(FacebookApplication facebookapplication)
    {
        a = facebookapplication;
        super();
    }
}

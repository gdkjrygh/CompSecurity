// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.TimerTask;

// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy

final class ad extends TimerTask
{

    final GAServiceProxy a;

    ad(GAServiceProxy gaserviceproxy)
    {
        a = gaserviceproxy;
        super();
    }

    public final void run()
    {
        a.g();
    }
}

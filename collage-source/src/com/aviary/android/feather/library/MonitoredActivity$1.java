// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library;

import com.aviary.android.feather.a.b;

// Referenced classes of package com.aviary.android.feather.library:
//            MonitoredActivity

class a
    implements Runnable
{

    final MonitoredActivity a;

    public void run()
    {
        MonitoredActivity.a(a);
        com.aviary.android.feather.library.MonitoredActivity.b(a);
        b b1 = b.a(a.getApplicationContext());
        b1.a();
        b1.c();
    }

    (MonitoredActivity monitoredactivity)
    {
        a = monitoredactivity;
        super();
    }
}

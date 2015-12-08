// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;

import aia;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.bmwgroup.connected.car.app:
//            ApplicationManager

final class a extends BroadcastReceiver
{

    private ApplicationManager a;

    public final void onReceive(Context context, Intent intent)
    {
        aia.a(ApplicationManager.a(a)).c();
        ApplicationManager.b(a).unregisterReceiver(this);
    }

    _cls9(ApplicationManager applicationmanager)
    {
        a = applicationmanager;
        super();
    }
}

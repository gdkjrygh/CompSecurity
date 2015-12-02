// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsActivity

class a
    implements ServiceConnection
{

    final SettingsActivity a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        SettingsActivity.a(a, com.qihoo.security.service.y._cls2.a(ibinder));
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        SettingsActivity.a(a, null);
    }

    (SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}

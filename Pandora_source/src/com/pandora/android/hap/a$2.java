// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.hap;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.pandora.android.Main;
import p.df.a;

// Referenced classes of package com.pandora.android.hap:
//            a

class a
    implements ServiceConnection
{

    final com.pandora.android.hap.a a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        p.df.a.a("HAPClient", "Connected to HAP Service.");
        com.pandora.android.hap.a.a(a, com.airbiquity.hap.a(ibinder));
        try
        {
            com.pandora.android.hap.a.a(a, com.pandora.android.hap.a.b(a).a("Pandora", "3.0", com/pandora/android/Main.getName(), com.pandora.android.hap.a.d(a)));
            p.df.a.a("HAPClient", (new StringBuilder()).append("HAP initialized. Connection Id: ").append(com.pandora.android.hap.a.c(a)).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            p.df.a.b("HAPClient", "Error during aqHapInit().", componentname);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.pandora.android.hap.a.a(a, null);
        p.df.a.a("HAPClient", "Disconnected from HAP Service");
    }

    e(com.pandora.android.hap.a a1)
    {
        a = a1;
        super();
    }
}

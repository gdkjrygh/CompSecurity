// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import java.io.File;
import java.io.IOException;
import p.dw.a;

// Referenced classes of package com.pandora.android.util:
//            UpgradeBroadcastReceiver

class c extends Thread
{

    final File a;
    final File b;
    final android.content.sult c;
    final UpgradeBroadcastReceiver d;

    public void run()
    {
        if (a.exists() && a.isDirectory())
        {
            p.dw.a.a(a);
            p.dw.a.b(b);
        }
        c.finish();
        return;
        Object obj;
        obj;
        p.df.a.b("UpgradeBroadcastReceiver", "Art cache cleaning failed", ((Throwable) (obj)));
        c.finish();
        return;
        obj;
        c.finish();
        throw obj;
    }

    _cls9(UpgradeBroadcastReceiver upgradebroadcastreceiver, File file, File file1, android.content.sult sult)
    {
        d = upgradebroadcastreceiver;
        a = file;
        b = file1;
        c = sult;
        super();
    }
}

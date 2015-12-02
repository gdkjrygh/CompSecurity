// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.g;
import com.qihoo.security.malware.db.a;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

public class MonitorDangerDialog extends AbsMonitorDialog
{

    private static boolean e;

    public MonitorDangerDialog()
    {
    }

    public static boolean i()
    {
        return e;
    }

    protected int c()
    {
        return 0x7f0c0119;
    }

    protected List d()
    {
        return a.f(this);
    }

    protected void e()
    {
        IntentFilter intentfilter = new IntentFilter("com.qihoo.action.MONITOR_UPDATE");
        intentfilter.addAction("com.qihoo.action.MONITOR_DIALOG_FORCE_FINISH");
        c.a(d, intentfilter);
    }

    protected void f()
    {
        try
        {
            c.a(d);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected int g()
    {
        return 0x7f020072;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        e = false;
    }
}

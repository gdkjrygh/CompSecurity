// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Handler;
import android.os.Message;
import com.qihoo.security.quc.AccountLog;

// Referenced classes of package com.qihoo.security.service:
//            PackageMonitorService

class a extends Handler
{

    final PackageMonitorService a;

    public void handleMessage(Message message)
    {
        AccountLog.a(com.qihoo.security.quc.C_MONITOR_MALWARE);
    }

    (PackageMonitorService packagemonitorservice)
    {
        a = packagemonitorservice;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;


// Referenced classes of package com.qihoo.security.service:
//            PackageMonitorService

class a
    implements Runnable
{

    final PackageMonitorService a;

    public void run()
    {
        a.stopSelf();
    }

    (PackageMonitorService packagemonitorservice)
    {
        a = packagemonitorservice;
        super();
    }
}

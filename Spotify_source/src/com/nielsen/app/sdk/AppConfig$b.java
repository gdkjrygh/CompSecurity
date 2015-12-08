// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            AppConfig, c, AppScheduler

class  extends .AppTask
{

    public static final String a = "AppTaskConfig";
    public static final int b = 0x927c0;
    public static final int c = 5000;
    public static final int d = 1;
    final AppConfig e;

    public boolean execute()
    {
        try
        {
            (new nfigRequest(e, AppConfig.a(e))).startRequest();
        }
        catch (Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 2, 'E', "There is no utilities object to execute the request", new Object[0]);
            return false;
        }
        return false;
    }

    public (AppConfig appconfig, AppScheduler appscheduler, long l)
    {
        e = appconfig;
        appscheduler.getClass();
        super(appscheduler, "AppTaskConfig", 1L, l);
    }
}

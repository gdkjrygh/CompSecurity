// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.util.TimerTask;

// Referenced classes of package com.comscore.utils:
//            ConnectivityChangeReceiver

class c extends TimerTask
{

    final ConnectivityChangeReceiver a;

    c(ConnectivityChangeReceiver connectivitychangereceiver)
    {
        a = connectivitychangereceiver;
        super();
    }

    public void run()
    {
        a.b(false);
    }
}

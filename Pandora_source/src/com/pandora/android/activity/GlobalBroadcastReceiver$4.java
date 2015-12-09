// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import java.util.HashSet;

// Referenced classes of package com.pandora.android.activity:
//            GlobalBroadcastReceiver, PandoraIntent

class add extends HashSet
{

    final GlobalBroadcastReceiver a;

    (GlobalBroadcastReceiver globalbroadcastreceiver)
    {
        a = globalbroadcastreceiver;
        super();
        add(PandoraIntent.a("station_share_success"));
        add(PandoraIntent.a("send_toast"));
        add(PandoraIntent.a("cmd_change_settings_result"));
    }
}

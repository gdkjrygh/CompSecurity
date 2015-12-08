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
        add(PandoraIntent.a("api_error"));
        add(PandoraIntent.a("show_waiting"));
        add(PandoraIntent.a("hide_waiting"));
        add(PandoraIntent.a("show_after_p1_trial_started_dialog"));
        add(PandoraIntent.a("show_diagnostic_dialog"));
        add(PandoraIntent.a("show_locale_dialog"));
        add(PandoraIntent.a("show_ab_tests"));
        add(PandoraIntent.a("show_ok_dialog"));
        add(PandoraIntent.a("show_yes_no_dialog"));
        add(PandoraIntent.a("cmd_show_iap_error_dialog"));
        add(PandoraIntent.a("show_environment_dialog"));
    }
}

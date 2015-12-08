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
        add(PandoraIntent.a("show_set_account"));
        add(PandoraIntent.a("show_privacy_notice"));
        add(PandoraIntent.a("show_page"));
        add(PandoraIntent.a("show_now_playing"));
        add(PandoraIntent.a("show_backstage"));
        add(PandoraIntent.a("show_search_results"));
        add(PandoraIntent.a("SHOW_VIDEOAD"));
        add(PandoraIntent.a("show_yume_video"));
        add(PandoraIntent.a("show_pandora_link_accessory"));
        add(PandoraIntent.a("dismiss_pandora_link_accessory"));
        add(PandoraIntent.a("show_genre_stations"));
        add(PandoraIntent.a("show_create_station"));
        add(PandoraIntent.a("show_listening_timeout"));
        add(PandoraIntent.a("show_upgrade"));
        add(PandoraIntent.a("show_why_ads"));
        add(PandoraIntent.a("launch_pandora_browser"));
        add(PandoraIntent.a("show_test_landing_page"));
        add(PandoraIntent.a("show_cap_warning"));
        add(PandoraIntent.a("show_web_dialog"));
        add(PandoraIntent.a("handle_one_playlist_ended"));
        add(PandoraIntent.a("show_interstitial_ad"));
        add(PandoraIntent.a("show_edit_station"));
        add(PandoraIntent.a("show_edit_profile"));
        add(PandoraIntent.a("execute_startup_task"));
        add(PandoraIntent.a("show_no_station_selected"));
        add(PandoraIntent.a("show_no_stations"));
        add(PandoraIntent.a("action_show_station_personalization"));
        add(PandoraIntent.a("show_home"));
        add(PandoraIntent.a("show_coachmark"));
        add(PandoraIntent.a("show_tablet_home"));
    }
}

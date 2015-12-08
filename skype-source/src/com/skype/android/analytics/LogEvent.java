// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.config.ecs.EcsKey;
import com.skype.android.config.ecs.EcsKeyLocation;

// Referenced classes of package com.skype.android.analytics:
//            EcsControllableEvent

public final class LogEvent extends Enum
    implements EcsControllableEvent
{

    public static final LogEvent A;
    public static final LogEvent B;
    public static final LogEvent C;
    public static final LogEvent D;
    public static final LogEvent E;
    public static final LogEvent F;
    public static final LogEvent G;
    public static final LogEvent H;
    public static final LogEvent I;
    public static final LogEvent J;
    public static final LogEvent K;
    public static final LogEvent L;
    public static final LogEvent M;
    public static final LogEvent N;
    public static final LogEvent O;
    public static final LogEvent P;
    public static final LogEvent Q;
    public static final LogEvent R;
    public static final LogEvent S;
    public static final LogEvent T;
    public static final LogEvent U;
    public static final LogEvent V;
    public static final LogEvent W;
    public static final LogEvent X;
    public static final LogEvent Y;
    public static final LogEvent Z;
    public static final LogEvent a;
    public static final LogEvent aa;
    public static final LogEvent ab;
    public static final LogEvent ac;
    public static final LogEvent ad;
    public static final LogEvent ae;
    public static final LogEvent af;
    public static final LogEvent ag;
    public static final LogEvent ah;
    public static final LogEvent ai;
    public static final LogEvent aj;
    public static final LogEvent ak;
    public static final LogEvent al;
    public static final LogEvent am;
    public static final LogEvent an;
    public static final LogEvent ao;
    public static final LogEvent ap;
    public static final LogEvent aq;
    public static final LogEvent ar;
    public static final LogEvent as;
    public static final LogEvent at;
    private static final LogEvent av[];
    public static final LogEvent b;
    public static final LogEvent c;
    public static final LogEvent d;
    public static final LogEvent e;
    public static final LogEvent f;
    public static final LogEvent g;
    public static final LogEvent h;
    public static final LogEvent i;
    public static final LogEvent j;
    public static final LogEvent k;
    public static final LogEvent l;
    public static final LogEvent m;
    public static final LogEvent n;
    public static final LogEvent o;
    public static final LogEvent p;
    public static final LogEvent q;
    public static final LogEvent r;
    public static final LogEvent s;
    public static final LogEvent t;
    public static final LogEvent u;
    public static final LogEvent v;
    public static final LogEvent w;
    public static final LogEvent x;
    public static final LogEvent y;
    public static final LogEvent z;
    private EcsKey au;

    private LogEvent(String s1, int i1)
    {
        this(s1, i1, EcsKeyLocation.SKYPE_ANDROID_TELEMETRY);
    }

    private LogEvent(String s1, int i1, EcsKeyLocation ecskeylocation)
    {
        super(s1, i1);
        au = new EcsKey(name(), name(), ecskeylocation, Integer.valueOf(0), false);
    }

    public static LogEvent valueOf(String s1)
    {
        return (LogEvent)Enum.valueOf(com/skype/android/analytics/LogEvent, s1);
    }

    public static LogEvent[] values()
    {
        return (LogEvent[])av.clone();
    }

    public final EcsKey getEcsKey()
    {
        return au;
    }

    static 
    {
        a = new LogEvent("log_app_launched", 0);
        b = new LogEvent("log_call_effect_applied", 1);
        c = new LogEvent("log_delete_hide_conversation", 2);
        d = new LogEvent("log_chat_service_connectivity", 3);
        e = new LogEvent("log_error_message_unrecognized", 4);
        f = new LogEvent("log_file_transfer_open_with_office", 5);
        g = new LogEvent("log_signin_account_signin_user_with_pwd_saved", 6);
        h = new LogEvent("log_signin_choose_account_type", 7);
        i = new LogEvent("log_signin_created_new_skype_account", 8);
        j = new LogEvent("log_signin_landing_screen_create_account_click", 9);
        k = new LogEvent("log_signin_landing_screen_load", 10);
        l = new LogEvent("log_signin_login_manually_with_msa", 11);
        m = new LogEvent("log_signin_login_manually_with_skype", 12);
        n = new LogEvent("log_signin_login_success", 13);
        o = new LogEvent("log_signin_logout_reason", 14);
        p = new LogEvent("log_signin_msa_sdk_error", 15);
        q = new LogEvent("log_signin_msa_sdk_signin_screen_load", 16);
        r = new LogEvent("log_signin_msa_signin_screen_load", 17);
        s = new LogEvent("log_signin_msa_to_skype_linking", 18);
        t = new LogEvent("log_signin_prompt_manual_sign_in", 19);
        u = new LogEvent("log_signin_prompt_manual_sign_in_from_splash", 20);
        v = new LogEvent("log_signin_prompt_manual_sign_in_from_agent", 21);
        w = new LogEvent("log_signin_sign_in_button_click", 22);
        x = new LogEvent("log_signin_simplified_landing_page_called", 23);
        y = new LogEvent("log_signin_skypeid_signin_screen_load", 24);
        z = new LogEvent("log_signin_terms_of_use_continue", 25);
        A = new LogEvent("log_signin_unified_landing_page_called", 26);
        B = new LogEvent("log_signin_unified_login_account_picker_screen_load", 27);
        C = new LogEvent("log_signin_unified_login_account_picker_select", 28);
        D = new LogEvent("log_signin_unified_login_account_search_error", 29);
        E = new LogEvent("log_signin_unified_login_account_search_timeout", 30);
        F = new LogEvent("log_signin_unified_login_button_click", 31);
        G = new LogEvent("log_signin_unified_login_id_type", 32);
        H = new LogEvent("log_spex_search_button_clicked", 33, EcsKeyLocation.SPEX_TELEMETRY);
        I = new LogEvent("log_spex_moji_forwarded", 34, EcsKeyLocation.SPEX_TELEMETRY);
        J = new LogEvent("log_spex_moji_sent_from_search", 35, EcsKeyLocation.SPEX_TELEMETRY);
        K = new LogEvent("log_spex_moji_previewed_in_search", 36, EcsKeyLocation.SPEX_TELEMETRY);
        L = new LogEvent("log_spex_emotion_selected_from_search", 37, EcsKeyLocation.SPEX_TELEMETRY);
        M = new LogEvent("log_spex_expression_search_completed", 38, EcsKeyLocation.SPEX_TELEMETRY);
        N = new LogEvent("log_spex_moji_call_to_action_clicked_from_context_menu", 39, EcsKeyLocation.SPEX_TELEMETRY);
        O = new LogEvent("log_spex_moji_call_to_action_clicked", 40, EcsKeyLocation.SPEX_TELEMETRY);
        P = new LogEvent("log_spex_moji_critical_network_error", 41, EcsKeyLocation.SPEX_TELEMETRY);
        Q = new LogEvent("log_spex_moji_download_success", 42, EcsKeyLocation.SPEX_TELEMETRY);
        R = new LogEvent("log_spex_moji_incoming_message_during_playback", 43, EcsKeyLocation.SPEX_TELEMETRY);
        S = new LogEvent("log_spex_moji_network_error", 44, EcsKeyLocation.SPEX_TELEMETRY);
        T = new LogEvent("log_spex_moji_play_clicked_for_replay", 45, EcsKeyLocation.SPEX_TELEMETRY);
        U = new LogEvent("log_spex_moji_play_clicked", 46, EcsKeyLocation.SPEX_TELEMETRY);
        V = new LogEvent("log_spex_moji_playback_error", 47, EcsKeyLocation.SPEX_TELEMETRY);
        W = new LogEvent("log_spex_moji_preload_skipped", 48, EcsKeyLocation.SPEX_TELEMETRY);
        X = new LogEvent("log_spex_moji_previewed", 49, EcsKeyLocation.SPEX_TELEMETRY);
        Y = new LogEvent("log_spex_moji_preview_failed", 50, EcsKeyLocation.SPEX_TELEMETRY);
        Z = new LogEvent("log_spex_moji_preview_playback_stopped", 51, EcsKeyLocation.SPEX_TELEMETRY);
        aa = new LogEvent("log_spex_moji_preview_replay_clicked_while_playing", 52, EcsKeyLocation.SPEX_TELEMETRY);
        ab = new LogEvent("log_spec_moji_preview_replay_clicked_when_stopped", 53, EcsKeyLocation.SPEX_TELEMETRY);
        ac = new LogEvent("log_spex_moji_rending_time", 54, EcsKeyLocation.SPEX_TELEMETRY);
        ad = new LogEvent("log_spex_moji_sent", 55, EcsKeyLocation.SPEX_TELEMETRY);
        ae = new LogEvent("log_spex_moji_send_clicked_from_preview", 56, EcsKeyLocation.SPEX_TELEMETRY);
        af = new LogEvent("log_spex_moji_unavailable_content", 57, EcsKeyLocation.SPEX_TELEMETRY);
        ag = new LogEvent("log_spex_emoticon_sent", 58, EcsKeyLocation.SPEX_TELEMETRY);
        ah = new LogEvent("log_translator_setting_open", 59);
        ai = new LogEvent("log_translator_setting_close", 60);
        aj = new LogEvent("log_translator_ring_translate", 61);
        ak = new LogEvent("log_translator_tap_context_menu", 62);
        al = new LogEvent("log_translator_tap_inline_menu", 63);
        am = new LogEvent("log_translator_text_translate", 64);
        an = new LogEvent("log_translator_error", 65);
        ao = new LogEvent("log_translator_view_translation", 66);
        ap = new LogEvent("log_video_message_save_to_gallery", 67);
        aq = new LogEvent("log_video_message_sent_with_filter", 68);
        ar = new LogEvent("log_video_message_sent_without_filter", 69);
        as = new LogEvent("log_notification_snoozed", 70);
        at = new LogEvent("log_notification_snooze_stopped", 71);
        av = (new LogEvent[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao, ap, aq, ar, 
            as, at
        });
    }
}

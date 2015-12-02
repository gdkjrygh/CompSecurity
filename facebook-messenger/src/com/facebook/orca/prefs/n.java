// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.net.Uri;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.user.UserKey;

public class n
{

    public static final ae A;
    public static final ae B;
    public static final ae C;
    public static final ae D;
    public static final ae E;
    public static final ae F;
    public static final ae G;
    public static final ae H;
    public static final ae I;
    public static final ae J;
    public static final ae K;
    public static final ae L;
    public static final ae M;
    public static final ae N;
    public static final ae O;
    public static final ae P;
    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;
    public static final ae f;
    public static final ae g;
    public static final ae h;
    public static final ae i;
    public static final ae j;
    public static final ae k;
    public static final ae l;
    public static final ae m;
    public static final ae n;
    public static final ae o;
    public static final ae p;
    public static final ae q;
    public static final ae r;
    public static final ae s;
    public static final ae t;
    public static final ae u;
    public static final ae v;
    public static final ae w;
    public static final ae x;
    public static final ae y;
    public static final ae z;

    public n()
    {
    }

    public static ae a(UserKey userkey)
    {
        userkey = Uri.encode(userkey.c());
        return (ae)((ae)z.c(userkey)).c("/share_location");
    }

    public static ae a(String s1)
    {
        s1 = Uri.encode(s1);
        return (ae)((ae)A.c(s1)).c("/muted_until2");
    }

    public static ae b(String s1)
    {
        s1 = Uri.encode(s1);
        return (ae)((ae)y.c(s1)).c("/share_location");
    }

    public static ae c(String s1)
    {
        s1 = Uri.encode(s1);
        return (ae)B.c(s1);
    }

    public static ae d(String s1)
    {
        s1 = Uri.encode(s1);
        return (ae)((ae)O.c(s1)).c("/shown_times");
    }

    static 
    {
        a = (ae)aj.a.c("messages/");
        b = (ae)aj.b.c("messages/");
        c = (ae)a.c("sms/");
        d = (ae)c.c("last_push_time");
        e = (ae)c.c("last_seen_time");
        f = (ae)c.c("sms_enabled");
        g = (ae)c.c("sms_beta_enabled");
        h = (ae)c.c("sms_nux_progress");
        i = (ae)c.c("use_as_main_app");
        j = (ae)c.c("last_logged_externally_sent_time");
        k = (ae)c.c("last_log_run_time");
        l = (ae)c.c("merged_thread_upsell_accept");
        m = (ae)b.c("notifications/");
        n = (ae)m.c("enabled");
        o = (ae)m.c("muted_until2");
        p = (ae)m.c("sound_enabled");
        q = (ae)m.c("vibrate_enabled");
        r = (ae)m.c("led_enabled");
        s = (ae)m.c("chat_heads_enabled");
        t = (ae)m.c("ringtone_uri");
        u = (ae)aj.b.c("headcase/");
        v = (ae)u.c("active");
        w = (ae)u.c("swipe_type");
        x = (ae)b.c("location_services");
        y = (ae)b.c("threads/");
        z = (ae)b.c("canonical_recipients/");
        A = (ae)m.c("threads/");
        B = (ae)a.c("notifications/recent_threads/");
        C = (ae)a.c("notifications/chat_heads");
        D = (ae)C.c("/dock_x_percentage");
        E = (ae)C.c("/dock_y_percentage");
        F = (ae)C.c("/inactive_translucent");
        G = (ae)C.c("/has_chat_head_settings_been_reported");
        H = (ae)a.c("notifications/headcase");
        I = (ae)H.c("/dock_y_precentage");
        J = (ae)a.c("block_dialog_radio_selection");
        K = (ae)a.c("show_contacts_suggestion_grid");
        L = (ae)a.c("ui_counters/");
        M = (ae)a.c("contacts/");
        N = (ae)M.c("upload_enabled");
        O = (ae)a.c("group_name_upsell/");
        P = (ae)a.c("groups_megaphone_show_count");
    }
}

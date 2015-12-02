// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import android.net.Uri;

public class d
{

    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    public static final Uri m;
    public static final Uri n;
    public static final Uri o;
    public static final Uri p;

    public d()
    {
    }

    public static final Uri a(String s)
    {
        return Uri.parse((new StringBuilder()).append("peer://msg_notification_dash/active_threads/").append(s).toString());
    }

    public static final Uri b(String s)
    {
        return Uri.parse((new StringBuilder()).append("peer://msg_notification_chathead/active_threads/").append(s).toString());
    }

    public static final Uri c(String s)
    {
        return Uri.parse((new StringBuilder()).append("peer://msg_notification_unread_count/thread/").append(s).toString());
    }

    public static final Uri d(String s)
    {
        return Uri.parse((new StringBuilder()).append("peer://msg_notification_unread_count/clear_thread/").append(s).toString());
    }

    static 
    {
        a = Uri.parse("peer://msg_notification_dash");
        b = Uri.withAppendedPath(a, "clear");
        c = Uri.withAppendedPath(a, "clear_active_threads");
        d = Uri.withAppendedPath(a, "is_user_active");
        e = Uri.parse("peer://msg_notification_chathead");
        f = Uri.withAppendedPath(e, "clear");
        g = Uri.withAppendedPath(e, "clear_active_threads");
        h = Uri.withAppendedPath(e, "open");
        i = Uri.withAppendedPath(e, "close_bauble_up");
        j = Uri.withAppendedPath(e, "hidden");
        k = Uri.withAppendedPath(e, "enabled");
        l = Uri.withAppendedPath(e, "disconnected");
        m = Uri.parse("peer://msg_notification_user_interaction");
        n = Uri.withAppendedPath(m, "is_user_in_app");
        o = Uri.parse("peer://msg_notification_unread_count");
        p = Uri.withAppendedPath(o, "clear_all");
    }
}

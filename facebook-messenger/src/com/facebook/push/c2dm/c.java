// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class c
{

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
    private static final ae m;

    public c()
    {
    }

    static 
    {
        m = (ae)aj.a.c("messenger/");
        a = (ae)m.c("c2dm/");
        b = (ae)a.c("token");
        c = (ae)a.c("token_owner");
        d = (ae)a.c("last_register_time");
        e = (ae)a.c("last_change_time");
        f = (ae)a.c("backoff_ms");
        g = (ae)a.c("last_push_time");
        h = (ae)a.c("last_service_attempt_type");
        i = (ae)a.c("service_type");
        j = (ae)a.c("fb_server_registered");
        k = (ae)a.c("fb_server_last_register_time");
        l = (ae)a.c("fb_server_build");
    }
}

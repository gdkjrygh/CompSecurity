// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.e;

import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class a
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
    public static final ae m;
    public static final ae n;
    public static final ae o;
    public static final ae p;
    public static final ae q;
    public static final ae r;
    public static final ae s;
    public static final ae t;
    public static final ae u = com.facebook.f.n.a("messenger_auth_expire_session_android");
    public static final ae v;
    public static final ae w;

    public a()
    {
    }

    static 
    {
        a = (ae)aj.a.c("auth/");
        b = (ae)a.c("user_data/");
        c = (ae)b.c("fb_uid");
        d = (ae)b.c("fb_token");
        e = (ae)b.c("fb_expires");
        f = (ae)b.c("fb_session_cookies_string");
        g = (ae)b.c("fb_is_partial_account");
        h = (ae)b.c("fb_logged_out");
        i = (ae)a.c("auth_machine_id");
        j = (ae)b.c("fb_session_secret");
        k = (ae)b.c("fb_session_key");
        l = (ae)b.c("fb_credentials_masked");
        m = (ae)b.c("fb_username");
        n = (ae)b.c("auto_sso_login");
        o = (ae)aj.a.c("reg/");
        p = (ae)o.c("reg_instance");
        q = (ae)o.c("conf_code");
        r = (ae)o.c("conf_code_phone");
        s = (ae)o.c("conf_code_country");
        t = (ae)o.c("conf_code_timestamp");
        v = (ae)b.c("fb_me_user");
        w = (ae)a.c("me_user_version");
    }
}

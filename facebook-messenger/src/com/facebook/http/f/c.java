// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.f;

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
    public static final ae m;
    public static final ae n;

    public c()
    {
    }

    static 
    {
        a = (ae)aj.b.c("http/");
        b = (ae)a.c("php_profiling");
        c = (ae)a.c("wirehog_profiling");
        d = (ae)a.c("teak_profiling");
        e = (ae)a.c("carrier_id");
        f = (ae)a.c("check_certs");
        g = (ae)a.c("http_proxy");
        h = (ae)aj.b.c("sandbox/");
        i = (ae)h.c("web/");
        j = (ae)i.c("server_tier");
        k = (ae)i.c("sandbox");
        l = (ae)h.c("mqtt/");
        m = (ae)l.c("server_tier");
        n = (ae)l.c("sandbox");
    }
}

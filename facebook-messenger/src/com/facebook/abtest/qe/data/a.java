// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.data;

import com.facebook.prefs.shared.ad;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.google.common.a.fi;

public class a
    implements ad
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;

    public a()
    {
    }

    public fi a()
    {
        return fi.a(b, c, e);
    }

    static 
    {
        a = (ae)aj.c.c("qe/");
        b = (ae)a.c("last_fetch_time_ms");
        c = (ae)a.c("last_fetch_locale");
        d = (ae)a.c("last_foreground_time_ms");
        e = (ae)a.c("expire_ttl_ms_override");
    }
}

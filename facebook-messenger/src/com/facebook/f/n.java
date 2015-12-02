// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import android.net.Uri;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class n
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;

    public n()
    {
    }

    public static ae a(String s)
    {
        return (ae)c.c(Uri.encode(s));
    }

    static 
    {
        a = (ae)aj.c.c("gk/");
        b = (ae)a.c("version");
        c = (ae)a.c("values/");
        d = (ae)a.c("last_fetch_time_ms");
        e = (ae)a.c("sessionless_gatekeeper_last_fetch_time_ms");
    }
}

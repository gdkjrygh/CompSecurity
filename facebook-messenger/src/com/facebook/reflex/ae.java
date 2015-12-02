// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.facebook.prefs.shared.aj;

public class ae
{

    public static final com.facebook.prefs.shared.ae a;
    public static final com.facebook.prefs.shared.ae b;
    public static final com.facebook.prefs.shared.ae c;
    public static final com.facebook.prefs.shared.ae d;
    public static final com.facebook.prefs.shared.ae e;

    public ae()
    {
    }

    static 
    {
        a = (com.facebook.prefs.shared.ae)aj.c.c("reflex");
        b = (com.facebook.prefs.shared.ae)a.c("experiments");
        c = (com.facebook.prefs.shared.ae)a.c("driverinfo");
        d = (com.facebook.prefs.shared.ae)c.c("log_timestamp");
        e = (com.facebook.prefs.shared.ae)a.c("checkerboard_log_timestamp");
    }
}

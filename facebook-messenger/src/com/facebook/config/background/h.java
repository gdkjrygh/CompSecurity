// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class h
{

    public static final ae a;
    public static final ae b;

    public h()
    {
    }

    static 
    {
        a = (ae)aj.c.c("configuration_last_fetch_time_attempt_ms");
        b = (ae)aj.c.c("configuration_last_fetch_time_success_ms");
    }
}

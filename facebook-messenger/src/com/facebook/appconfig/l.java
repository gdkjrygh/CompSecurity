// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class l
{

    public static final ae a;
    public static final ae b;
    public static final ae c;

    public l()
    {
    }

    static 
    {
        a = (ae)aj.c.c("app_info/");
        b = (ae)a.c("last_fetch_time_ms");
        c = (ae)a.c("app_info_data");
    }
}

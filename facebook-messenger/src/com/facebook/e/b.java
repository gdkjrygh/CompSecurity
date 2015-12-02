// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;

public class b
{

    static final ae a;
    public static final ae b;
    static final ae c;
    static final ae d;
    private final Class e = com/facebook/e/b;
    private final d f;

    public b(d d1)
    {
        f = d1;
    }

    static 
    {
        a = (ae)aj.d.c("data_usage/");
        b = (ae)a.c("limited");
        c = (ae)a.c("hourly_limit_kb");
        d = (ae)a.c("alarm_limit_kb");
    }
}

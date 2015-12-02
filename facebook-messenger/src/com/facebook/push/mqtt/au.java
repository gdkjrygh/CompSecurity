// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class au
{

    public static final ae a;
    public static final ae b;
    public static final ae c;

    public au()
    {
    }

    static 
    {
        a = (ae)aj.a.c("mqtt/");
        b = (ae)a.c("retry_interval");
        c = (ae)a.c("keepalive_delay_adjustment");
    }
}

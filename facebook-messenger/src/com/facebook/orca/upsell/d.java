// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.upsell;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public final class d
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;

    public d()
    {
    }

    static 
    {
        a = (ae)aj.a.c("messenger_upsell/");
        b = (ae)a.c("chat_head_install_promo_times_shown");
        c = (ae)a.c("chat_head_install_promo_daily_times_shown");
        d = (ae)a.c("chat_head_install_promo_daily_first_shown_time");
        e = (ae)a.c("chat_head_install_promo_last_conversion_time");
    }
}

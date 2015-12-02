// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.a;

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
    private static final ae n;

    public c()
    {
    }

    public static String a(ae ae1)
    {
        return ae1.b(n);
    }

    static 
    {
        a = (ae)aj.a.c("zero_rating2/");
        b = (ae)a.c("code_pairs");
        c = (ae)a.c("network_type");
        d = (ae)a.c("last_time_checked");
        e = (ae)a.c("current_zero_rating_status");
        f = (ae)a.c("token");
        n = (ae)a.c("dialogs/");
        g = (ae)n.c("view_timeline");
        h = (ae)n.c("view_contact_card_map");
        i = (ae)n.c("view_message_map");
        j = (ae)n.c("image_search");
        k = (ae)n.c("goto_external_url");
        l = (ae)n.c("voip_call_user");
        m = (ae)n.c("carrier_bottom_banner");
    }
}

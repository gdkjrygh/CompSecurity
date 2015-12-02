// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import com.facebook.common.w.q;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.zero.a.c;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.base.Strings;
import javax.inject.a;

public class o
{

    private final d a;
    private final com.facebook.zero.d.a b;
    private final a c;
    private final ev d;

    public o(d d1, com.facebook.zero.d.a a1, a a2)
    {
        d = ev.k().b(c.m, "promo_banner").b(c.k, "url_interstitial").b(c.j, "image_search_interstitial").b(c.g, "timeline_interstitial").b(c.i, "map_interstitial").b(c.h, "map_interstitial").b(c.l, "voip_interstitial").b();
        a = d1;
        b = a1;
        c = a2;
    }

    public boolean a(ae ae)
    {
        String s = (String)d.get(ae);
        if (Strings.isNullOrEmpty(s))
        {
            return false;
        }
        boolean flag;
        if (c.b() == q.YES && b.f().contains(s) && a.a(ae, true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }
}

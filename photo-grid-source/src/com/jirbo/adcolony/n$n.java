// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


class ata.g
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;

    boolean a(ata.g g1)
    {
        if (g1 == null)
        {
            return false;
        } else
        {
            a = g1.g("daily_play_cap");
            b = g1.g("custom_play_cap");
            c = g1.g("custom_play_cap_period");
            d = g1.g("total_play_cap");
            e = g1.g("monthly_play_cap");
            f = g1.g("weekly_play_cap");
            g = g1.g("volatile_expiration");
            h = g1.g("volatile_play_cap");
            return true;
        }
    }

    ata.g()
    {
    }
}

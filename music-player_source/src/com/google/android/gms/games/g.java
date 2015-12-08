// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.text.TextUtils;

final class g
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public g(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            a = "external_player_id";
            b = "profile_name";
            c = "profile_icon_image_uri";
            d = "profile_icon_image_url";
            e = "profile_hi_res_image_uri";
            f = "profile_hi_res_image_url";
            g = "last_updated";
            h = "is_in_circles";
            i = "played_with_timestamp";
            return;
        } else
        {
            a = (new StringBuilder()).append(s).append("external_player_id").toString();
            b = (new StringBuilder()).append(s).append("profile_name").toString();
            c = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            d = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            e = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            f = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            g = (new StringBuilder()).append(s).append("last_updated").toString();
            h = (new StringBuilder()).append(s).append("is_in_circles").toString();
            i = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            return;
        }
    }
}

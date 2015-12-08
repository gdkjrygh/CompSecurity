// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String RO;
    public final String RP;
    public final String RQ;
    public final String RR;
    public final String RS;
    public final String RT;
    public final String RU;
    public final String RV;
    public final String RW;
    public final String RX;
    public final String RY;
    public final String RZ;
    public final String Sa;
    public final String Sb;
    public final String Sc;
    public final String Sd;
    public final String Se;
    public final String Sf;
    public final String Sg;
    public final String Sh;
    public final String Si;
    public final String Sj;
    public final String Sk;
    public final String Sl;

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            RO = "external_player_id";
            RP = "profile_name";
            RQ = "profile_icon_image_uri";
            RR = "profile_icon_image_url";
            RS = "profile_hi_res_image_uri";
            RT = "profile_hi_res_image_url";
            RU = "last_updated";
            RV = "is_in_circles";
            RW = "played_with_timestamp";
            RX = "current_xp_total";
            RY = "current_level";
            RZ = "current_level_min_xp";
            Sa = "current_level_max_xp";
            Sb = "next_level";
            Sc = "next_level_max_xp";
            Sd = "last_level_up_timestamp";
            Se = "player_title";
            Sf = "has_all_public_acls";
            Sg = "most_recent_external_game_id";
            Sh = "most_recent_game_name";
            Si = "most_recent_activity_timestamp";
            Sj = "most_recent_game_icon_uri";
            Sk = "most_recent_game_hi_res_uri";
            Sl = "most_recent_game_featured_uri";
            return;
        } else
        {
            RO = (new StringBuilder()).append(s).append("external_player_id").toString();
            RP = (new StringBuilder()).append(s).append("profile_name").toString();
            RQ = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            RR = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            RS = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            RT = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            RU = (new StringBuilder()).append(s).append("last_updated").toString();
            RV = (new StringBuilder()).append(s).append("is_in_circles").toString();
            RW = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            RX = (new StringBuilder()).append(s).append("current_xp_total").toString();
            RY = (new StringBuilder()).append(s).append("current_level").toString();
            RZ = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            Sa = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            Sb = (new StringBuilder()).append(s).append("next_level").toString();
            Sc = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            Sd = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            Se = (new StringBuilder()).append(s).append("player_title").toString();
            Sf = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            Sg = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            Sh = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            Si = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            Sj = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            Sk = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            Sl = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            return;
        }
    }
}

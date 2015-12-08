// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String RL;
    public final String RM;
    public final String RN;
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

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            RL = "external_player_id";
            RM = "profile_name";
            RN = "profile_icon_image_uri";
            RO = "profile_icon_image_url";
            RP = "profile_hi_res_image_uri";
            RQ = "profile_hi_res_image_url";
            RR = "last_updated";
            RS = "is_in_circles";
            RT = "played_with_timestamp";
            RU = "current_xp_total";
            RV = "current_level";
            RW = "current_level_min_xp";
            RX = "current_level_max_xp";
            RY = "next_level";
            RZ = "next_level_max_xp";
            Sa = "last_level_up_timestamp";
            Sb = "player_title";
            Sc = "has_all_public_acls";
            Sd = "most_recent_external_game_id";
            Se = "most_recent_game_name";
            Sf = "most_recent_activity_timestamp";
            Sg = "most_recent_game_icon_uri";
            Sh = "most_recent_game_hi_res_uri";
            Si = "most_recent_game_featured_uri";
            return;
        } else
        {
            RL = (new StringBuilder()).append(s).append("external_player_id").toString();
            RM = (new StringBuilder()).append(s).append("profile_name").toString();
            RN = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            RO = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            RP = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            RQ = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            RR = (new StringBuilder()).append(s).append("last_updated").toString();
            RS = (new StringBuilder()).append(s).append("is_in_circles").toString();
            RT = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            RU = (new StringBuilder()).append(s).append("current_xp_total").toString();
            RV = (new StringBuilder()).append(s).append("current_level").toString();
            RW = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            RX = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            RY = (new StringBuilder()).append(s).append("next_level").toString();
            RZ = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            Sa = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            Sb = (new StringBuilder()).append(s).append("player_title").toString();
            Sc = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            Sd = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            Se = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            Sf = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            Sg = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            Sh = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            Si = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            return;
        }
    }
}

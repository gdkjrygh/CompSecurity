// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String aaS;
    public final String aaT;
    public final String aaU;
    public final String aaV;
    public final String aaW;
    public final String aaX;
    public final String aaY;
    public final String aaZ;
    public final String aba;
    public final String abb;
    public final String abc;
    public final String abd;
    public final String abe;
    public final String abf;
    public final String abg;
    public final String abh;
    public final String abi;
    public final String abj;
    public final String abk;
    public final String abl;
    public final String abm;
    public final String abn;
    public final String abo;
    public final String abp;
    public final String abq;

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            aaS = "external_player_id";
            aaT = "profile_name";
            aaU = "profile_icon_image_uri";
            aaV = "profile_icon_image_url";
            aaW = "profile_hi_res_image_uri";
            aaX = "profile_hi_res_image_url";
            aaY = "last_updated";
            aaZ = "is_in_circles";
            aba = "played_with_timestamp";
            abb = "current_xp_total";
            abc = "current_level";
            abd = "current_level_min_xp";
            abe = "current_level_max_xp";
            abf = "next_level";
            abg = "next_level_max_xp";
            abh = "last_level_up_timestamp";
            abi = "player_title";
            abj = "has_all_public_acls";
            abk = "is_profile_visible";
            abl = "most_recent_external_game_id";
            abm = "most_recent_game_name";
            abn = "most_recent_activity_timestamp";
            abo = "most_recent_game_icon_uri";
            abp = "most_recent_game_hi_res_uri";
            abq = "most_recent_game_featured_uri";
            return;
        } else
        {
            aaS = (new StringBuilder()).append(s).append("external_player_id").toString();
            aaT = (new StringBuilder()).append(s).append("profile_name").toString();
            aaU = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            aaV = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            aaW = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            aaX = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            aaY = (new StringBuilder()).append(s).append("last_updated").toString();
            aaZ = (new StringBuilder()).append(s).append("is_in_circles").toString();
            aba = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            abb = (new StringBuilder()).append(s).append("current_xp_total").toString();
            abc = (new StringBuilder()).append(s).append("current_level").toString();
            abd = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            abe = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            abf = (new StringBuilder()).append(s).append("next_level").toString();
            abg = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            abh = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            abi = (new StringBuilder()).append(s).append("player_title").toString();
            abj = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            abk = (new StringBuilder()).append(s).append("is_profile_visible").toString();
            abl = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            abm = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            abn = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            abo = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            abp = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            abq = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            return;
        }
    }
}

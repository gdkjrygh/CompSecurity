// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.text.TextUtils;

public final class PlayerColumnNames
{

    public final String acL;
    public final String acM;
    public final String acN;
    public final String acO;
    public final String acP;
    public final String acQ;
    public final String acR;
    public final String acS;
    public final String acT;
    public final String acU;
    public final String acV;
    public final String acW;
    public final String acX;
    public final String acY;
    public final String acZ;
    public final String ada;
    public final String adb;
    public final String adc;
    public final String add;
    public final String ade;
    public final String adf;
    public final String adg;
    public final String adh;
    public final String adi;
    public final String adj;

    public PlayerColumnNames(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            acL = "external_player_id";
            acM = "profile_name";
            acN = "profile_icon_image_uri";
            acO = "profile_icon_image_url";
            acP = "profile_hi_res_image_uri";
            acQ = "profile_hi_res_image_url";
            acR = "last_updated";
            acS = "is_in_circles";
            acT = "played_with_timestamp";
            acU = "current_xp_total";
            acV = "current_level";
            acW = "current_level_min_xp";
            acX = "current_level_max_xp";
            acY = "next_level";
            acZ = "next_level_max_xp";
            ada = "last_level_up_timestamp";
            adb = "player_title";
            adc = "has_all_public_acls";
            add = "is_profile_visible";
            ade = "most_recent_external_game_id";
            adf = "most_recent_game_name";
            adg = "most_recent_activity_timestamp";
            adh = "most_recent_game_icon_uri";
            adi = "most_recent_game_hi_res_uri";
            adj = "most_recent_game_featured_uri";
            return;
        } else
        {
            acL = (new StringBuilder()).append(s).append("external_player_id").toString();
            acM = (new StringBuilder()).append(s).append("profile_name").toString();
            acN = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
            acO = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
            acP = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
            acQ = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
            acR = (new StringBuilder()).append(s).append("last_updated").toString();
            acS = (new StringBuilder()).append(s).append("is_in_circles").toString();
            acT = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
            acU = (new StringBuilder()).append(s).append("current_xp_total").toString();
            acV = (new StringBuilder()).append(s).append("current_level").toString();
            acW = (new StringBuilder()).append(s).append("current_level_min_xp").toString();
            acX = (new StringBuilder()).append(s).append("current_level_max_xp").toString();
            acY = (new StringBuilder()).append(s).append("next_level").toString();
            acZ = (new StringBuilder()).append(s).append("next_level_max_xp").toString();
            ada = (new StringBuilder()).append(s).append("last_level_up_timestamp").toString();
            adb = (new StringBuilder()).append(s).append("player_title").toString();
            adc = (new StringBuilder()).append(s).append("has_all_public_acls").toString();
            add = (new StringBuilder()).append(s).append("is_profile_visible").toString();
            ade = (new StringBuilder()).append(s).append("most_recent_external_game_id").toString();
            adf = (new StringBuilder()).append(s).append("most_recent_game_name").toString();
            adg = (new StringBuilder()).append(s).append("most_recent_activity_timestamp").toString();
            adh = (new StringBuilder()).append(s).append("most_recent_game_icon_uri").toString();
            adi = (new StringBuilder()).append(s).append("most_recent_game_hi_res_uri").toString();
            adj = (new StringBuilder()).append(s).append("most_recent_game_featured_uri").toString();
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;


// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider

static final class iType
{

    static final int $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[];
    static final int $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[];

    static 
    {
        $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType = new int[iType.values().length];
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror147) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_ID.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror146) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_ID_ICON_IMAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror145) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_EXT_GAME_ID_ICON_IMAGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror144) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_ID_HI_RES_IMAGE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror143) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_ID_FEATURED_IMAGE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror142) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_EXT_GAME_ID_FEATURED_IMAGE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror141) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAMES_EXT_GAME_ID.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror140) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_BADGES.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror139) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_BADGES_ID.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror138) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_BADGES_GAME_ID.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror137) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_BADGES_EXT_GAME_ID.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror136) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_INSTANCES.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror135) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_INSTANCES_ID.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror134) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_INSTANCES_GAME_ID.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror133) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_INSTANCES_EXT_GAME_ID.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror132) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYERS.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror131) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYERS_ID.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror130) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYERS_EXT_PLAYER_ID.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror129) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_LEVELS.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror128) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_LEVELS_ID.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror127) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_LEVELS_LVL_NUM.ordinal()] = 22;
        }
        catch (NoSuchFieldError nosuchfielderror126) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_STATS_ID.ordinal()] = 23;
        }
        catch (NoSuchFieldError nosuchfielderror125) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_STATS_PLAYER_AND_GAME_ID.ordinal()] = 24;
        }
        catch (NoSuchFieldError nosuchfielderror124) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACCOUNT_METADATA.ordinal()] = 25;
        }
        catch (NoSuchFieldError nosuchfielderror123) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS.ordinal()] = 26;
        }
        catch (NoSuchFieldError nosuchfielderror122) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_ID.ordinal()] = 27;
        }
        catch (NoSuchFieldError nosuchfielderror121) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_EXT_ACHIEVEMENT_ID.ordinal()] = 28;
        }
        catch (NoSuchFieldError nosuchfielderror120) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_GAME_ID.ordinal()] = 29;
        }
        catch (NoSuchFieldError nosuchfielderror119) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_EXT_GAME_ID.ordinal()] = 30;
        }
        catch (NoSuchFieldError nosuchfielderror118) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_PENDING_OPS.ordinal()] = 31;
        }
        catch (NoSuchFieldError nosuchfielderror117) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_PENDING_OPS_ID.ordinal()] = 32;
        }
        catch (NoSuchFieldError nosuchfielderror116) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_INSTANCES.ordinal()] = 33;
        }
        catch (NoSuchFieldError nosuchfielderror115) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_INSTANCES_ID.ordinal()] = 34;
        }
        catch (NoSuchFieldError nosuchfielderror114) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_INSTANCES_PLAYER_ID.ordinal()] = 35;
        }
        catch (NoSuchFieldError nosuchfielderror113) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_INSTANCES_EXT_PLAYER_ID.ordinal()] = 36;
        }
        catch (NoSuchFieldError nosuchfielderror112) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS.ordinal()] = 37;
        }
        catch (NoSuchFieldError nosuchfielderror111) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS_ID.ordinal()] = 38;
        }
        catch (NoSuchFieldError nosuchfielderror110) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS_GAME_ID.ordinal()] = 39;
        }
        catch (NoSuchFieldError nosuchfielderror109) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS_EXT_EVENT_ID.ordinal()] = 40;
        }
        catch (NoSuchFieldError nosuchfielderror108) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS_EXT_GAME_ID.ordinal()] = 41;
        }
        catch (NoSuchFieldError nosuchfielderror107) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_INSTANCES.ordinal()] = 42;
        }
        catch (NoSuchFieldError nosuchfielderror106) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_INSTANCES_ID.ordinal()] = 43;
        }
        catch (NoSuchFieldError nosuchfielderror105) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_INSTANCES_PLAYER_ID.ordinal()] = 44;
        }
        catch (NoSuchFieldError nosuchfielderror104) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_INSTANCES_EXT_PLAYER_ID.ordinal()] = 45;
        }
        catch (NoSuchFieldError nosuchfielderror103) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_INSTANCES_EXT_EVENT_ID.ordinal()] = 46;
        }
        catch (NoSuchFieldError nosuchfielderror102) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_PENDING_OPS.ordinal()] = 47;
        }
        catch (NoSuchFieldError nosuchfielderror101) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_PENDING_OPS_ID.ordinal()] = 48;
        }
        catch (NoSuchFieldError nosuchfielderror100) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_PENDING_OPS_EXT_EVENT_ID.ordinal()] = 49;
        }
        catch (NoSuchFieldError nosuchfielderror99) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_PENDING_OPS_EXT_PLAYER_ID.ordinal()] = 50;
        }
        catch (NoSuchFieldError nosuchfielderror98) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.APPLICATION_SESSIONS.ordinal()] = 51;
        }
        catch (NoSuchFieldError nosuchfielderror97) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.APPLICATION_SESSIONS_ID.ordinal()] = 52;
        }
        catch (NoSuchFieldError nosuchfielderror96) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.APP_CONTENT.ordinal()] = 53;
        }
        catch (NoSuchFieldError nosuchfielderror95) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.CLIENT_CONTEXT.ordinal()] = 54;
        }
        catch (NoSuchFieldError nosuchfielderror94) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.CLIENT_CONTEXT_ID.ordinal()] = 55;
        }
        catch (NoSuchFieldError nosuchfielderror93) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EXPERIENCE_EVENTS.ordinal()] = 56;
        }
        catch (NoSuchFieldError nosuchfielderror92) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EXPERIENCE_EVENTS_ID.ordinal()] = 57;
        }
        catch (NoSuchFieldError nosuchfielderror91) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EXPERIENCE_EVENTS_EXT_ID.ordinal()] = 58;
        }
        catch (NoSuchFieldError nosuchfielderror90) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARDS.ordinal()] = 59;
        }
        catch (NoSuchFieldError nosuchfielderror89) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARDS_ID.ordinal()] = 60;
        }
        catch (NoSuchFieldError nosuchfielderror88) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARDS_EXT_LEADERBOARD_ID.ordinal()] = 61;
        }
        catch (NoSuchFieldError nosuchfielderror87) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARDS_GAME_ID.ordinal()] = 62;
        }
        catch (NoSuchFieldError nosuchfielderror86) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARDS_EXT_GAME_ID.ordinal()] = 63;
        }
        catch (NoSuchFieldError nosuchfielderror85) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_INSTANCES.ordinal()] = 64;
        }
        catch (NoSuchFieldError nosuchfielderror84) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_INSTANCES_ID.ordinal()] = 65;
        }
        catch (NoSuchFieldError nosuchfielderror83) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_INSTANCES_EXT_GAME_ID.ordinal()] = 66;
        }
        catch (NoSuchFieldError nosuchfielderror82) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_INSTANCES_EXT_LEADERBOARD_ID.ordinal()] = 67;
        }
        catch (NoSuchFieldError nosuchfielderror81) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_SCORES.ordinal()] = 68;
        }
        catch (NoSuchFieldError nosuchfielderror80) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_SCORES_ID.ordinal()] = 69;
        }
        catch (NoSuchFieldError nosuchfielderror79) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_SCORES_INSTANCE_ID.ordinal()] = 70;
        }
        catch (NoSuchFieldError nosuchfielderror78) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_PENDING_SCORES.ordinal()] = 71;
        }
        catch (NoSuchFieldError nosuchfielderror77) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.IMAGES.ordinal()] = 72;
        }
        catch (NoSuchFieldError nosuchfielderror76) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.IMAGES_ID.ordinal()] = 73;
        }
        catch (NoSuchFieldError nosuchfielderror75) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.INVITATIONS.ordinal()] = 74;
        }
        catch (NoSuchFieldError nosuchfielderror74) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.INVITATIONS_ID.ordinal()] = 75;
        }
        catch (NoSuchFieldError nosuchfielderror73) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.INVITATIONS_RAW_ID.ordinal()] = 76;
        }
        catch (NoSuchFieldError nosuchfielderror72) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.INVITATIONS_EXT_INVITATION_ID.ordinal()] = 77;
        }
        catch (NoSuchFieldError nosuchfielderror71) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_PENDING_OPS.ordinal()] = 78;
        }
        catch (NoSuchFieldError nosuchfielderror70) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_PENDING_OPS_ID.ordinal()] = 79;
        }
        catch (NoSuchFieldError nosuchfielderror69) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_PENDING_OPS_EXT_REQ_ID.ordinal()] = 80;
        }
        catch (NoSuchFieldError nosuchfielderror68) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS.ordinal()] = 81;
        }
        catch (NoSuchFieldError nosuchfielderror67) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_ID.ordinal()] = 82;
        }
        catch (NoSuchFieldError nosuchfielderror66) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_EXT_REQ_ID.ordinal()] = 83;
        }
        catch (NoSuchFieldError nosuchfielderror65) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_RECIPIENTS.ordinal()] = 84;
        }
        catch (NoSuchFieldError nosuchfielderror64) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_RECIPIENTS_ID.ordinal()] = 85;
        }
        catch (NoSuchFieldError nosuchfielderror63) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUEST_RECIPIENTS_REQ_ID.ordinal()] = 86;
        }
        catch (NoSuchFieldError nosuchfielderror62) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_RAW_ID.ordinal()] = 87;
        }
        catch (NoSuchFieldError nosuchfielderror61) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES.ordinal()] = 88;
        }
        catch (NoSuchFieldError nosuchfielderror60) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_ID.ordinal()] = 89;
        }
        catch (NoSuchFieldError nosuchfielderror59) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_RAW_ID.ordinal()] = 90;
        }
        catch (NoSuchFieldError nosuchfielderror58) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_EXT_MATCH_ID.ordinal()] = 91;
        }
        catch (NoSuchFieldError nosuchfielderror57) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_GAME_ID.ordinal()] = 92;
        }
        catch (NoSuchFieldError nosuchfielderror56) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_EXT_GAME_ID.ordinal()] = 93;
        }
        catch (NoSuchFieldError nosuchfielderror55) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_PENDING_OPS.ordinal()] = 94;
        }
        catch (NoSuchFieldError nosuchfielderror54) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_PENDING_OPS_ID.ordinal()] = 95;
        }
        catch (NoSuchFieldError nosuchfielderror53) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCHES_PENDING_OPS_EXT_MATCH_ID.ordinal()] = 96;
        }
        catch (NoSuchFieldError nosuchfielderror52) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PARTICIPANTS.ordinal()] = 97;
        }
        catch (NoSuchFieldError nosuchfielderror51) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PARTICIPANTS_ID.ordinal()] = 98;
        }
        catch (NoSuchFieldError nosuchfielderror50) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PARTICIPANTS_EXT_PARTICIPANT_ID.ordinal()] = 99;
        }
        catch (NoSuchFieldError nosuchfielderror49) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PARTICIPANTS_MATCH_ID.ordinal()] = 100;
        }
        catch (NoSuchFieldError nosuchfielderror48) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PARTICIPANTS_INVITATION_ID.ordinal()] = 101;
        }
        catch (NoSuchFieldError nosuchfielderror47) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS.ordinal()] = 102;
        }
        catch (NoSuchFieldError nosuchfielderror46) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ID.ordinal()] = 103;
        }
        catch (NoSuchFieldError nosuchfielderror45) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_GAME_ID.ordinal()] = 104;
        }
        catch (NoSuchFieldError nosuchfielderror44) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_EXT_GAME_ID.ordinal()] = 105;
        }
        catch (NoSuchFieldError nosuchfielderror43) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_EXT_QUEST_ID.ordinal()] = 106;
        }
        catch (NoSuchFieldError nosuchfielderror42) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES.ordinal()] = 107;
        }
        catch (NoSuchFieldError nosuchfielderror41) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES_QUEST_ID.ordinal()] = 108;
        }
        catch (NoSuchFieldError nosuchfielderror40) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES_EXT_QUEST_ID.ordinal()] = 109;
        }
        catch (NoSuchFieldError nosuchfielderror39) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES_GAME_ID.ordinal()] = 110;
        }
        catch (NoSuchFieldError nosuchfielderror38) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES_EXT_GAME_ID.ordinal()] = 111;
        }
        catch (NoSuchFieldError nosuchfielderror37) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ENTITIES_EXT_MILESTONE_ID.ordinal()] = 112;
        }
        catch (NoSuchFieldError nosuchfielderror36) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUEST_MILESTONES.ordinal()] = 113;
        }
        catch (NoSuchFieldError nosuchfielderror35) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUEST_MILESTONES_ID.ordinal()] = 114;
        }
        catch (NoSuchFieldError nosuchfielderror34) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUEST_MILESTONES_EXT_MILESTONE_ID.ordinal()] = 115;
        }
        catch (NoSuchFieldError nosuchfielderror33) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUEST_MILESTONES_QUEST_ID.ordinal()] = 116;
        }
        catch (NoSuchFieldError nosuchfielderror32) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUEST_MILESTONES_EXT_QUEST_ID.ordinal()] = 117;
        }
        catch (NoSuchFieldError nosuchfielderror31) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_ENTITIES.ordinal()] = 118;
        }
        catch (NoSuchFieldError nosuchfielderror30) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_ENTITIES_REQUEST_ID.ordinal()] = 119;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.REQUESTS_ENTITIES_EXT_REQUEST_ID.ordinal()] = 120;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCH_ENTITIES.ordinal()] = 121;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCH_ENTITIES_MATCH_ID.ordinal()] = 122;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.MATCH_ENTITIES_EXT_MATCH_ID.ordinal()] = 123;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.NOTIFICATIONS.ordinal()] = 124;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.NOTIFICATIONS_ID.ordinal()] = 125;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.NOTIFICATIONS_GAME_ID.ordinal()] = 126;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.NOTIFICATIONS_EXT_GAME_ID.ordinal()] = 127;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.SNAPSHOTS.ordinal()] = 128;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.SNAPSHOTS_ID.ordinal()] = 129;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.SNAPSHOTS_EXT_SNAPSHOT_ID.ordinal()] = 130;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.SNAPSHOTS_GAME_ID.ordinal()] = 131;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.SNAPSHOTS_EXT_GAME_ID.ordinal()] = 132;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYER_STATS.ordinal()] = 133;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACCOUNT_METADATA_COVER_IMAGE.ordinal()] = 134;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.LEADERBOARD_PENDING_SCORES_ID.ordinal()] = 135;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_EXT_PLAYER_ID.ordinal()] = 136;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_PLAYER_ID.ordinal()] = 137;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.CLEAR_DATA_FOR_LOCALE_CHANGE.ordinal()] = 138;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.GAME_BADGES_ICON_IMAGE.ordinal()] = 139;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYERS_ID_PROFILE_ICON_IMAGE.ordinal()] = 140;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.PLAYERS_ID_PROFILE_HI_RES_IMAGE.ordinal()] = 141;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ID_ICON_IMAGE.ordinal()] = 142;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.QUESTS_ID_PROMOTIONAL_IMAGE.ordinal()] = 143;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_ID_UNLOCKED_IMAGE.ordinal()] = 144;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.ACHIEVEMENT_DEFINITIONS_ID_REVEALED_IMAGE.ordinal()] = 145;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$PlayGamesContentProvider$UriType[iType.EVENT_DEFINITIONS_ID_ICON_IMAGE.ordinal()] = 146;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType = new int[ype().length];
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[ype.()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$gms$games$provider$ColumnSpec$DataType[ype.()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

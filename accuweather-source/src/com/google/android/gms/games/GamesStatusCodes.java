// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;


public final class GamesStatusCodes
{

    public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
    public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
    public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
    public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
    public static final int STATUS_APP_MISCONFIGURED = 8;
    public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
    public static final int STATUS_GAME_NOT_FOUND = 9;
    public static final int STATUS_INTERNAL_ERROR = 1;
    public static final int STATUS_INTERRUPTED = 14;
    public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
    public static final int STATUS_LICENSE_CHECK_FAILED = 7;
    public static final int STATUS_MATCH_ERROR_ALREADY_REMATCHED = 6505;
    public static final int STATUS_MATCH_ERROR_INACTIVE_MATCH = 6501;
    public static final int STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS = 6504;
    public static final int STATUS_MATCH_ERROR_INVALID_MATCH_STATE = 6502;
    public static final int STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE = 6500;
    public static final int STATUS_MATCH_ERROR_LOCALLY_MODIFIED = 6507;
    public static final int STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION = 6503;
    public static final int STATUS_MATCH_NOT_FOUND = 6506;
    public static final int STATUS_MILESTONE_CLAIMED_PREVIOUSLY = 8000;
    public static final int STATUS_MILESTONE_CLAIM_FAILED = 8001;
    public static final int STATUS_MULTIPLAYER_DISABLED = 6003;
    public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
    public static final int STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE = 6002;
    public static final int STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION = 6004;
    public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
    public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
    public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
    public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
    public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
    public static final int STATUS_OK = 0;
    public static final int STATUS_OPERATION_IN_FLIGHT = 7007;
    public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
    public static final int STATUS_QUEST_NOT_STARTED = 8003;
    public static final int STATUS_QUEST_NO_LONGER_AVAILABLE = 8002;
    public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
    public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
    public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
    public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;
    public static final int STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS = 2000;
    public static final int STATUS_REQUEST_UPDATE_TOTAL_FAILURE = 2001;
    public static final int STATUS_SNAPSHOT_COMMIT_FAILED = 4003;
    public static final int STATUS_SNAPSHOT_CONFLICT = 4004;
    public static final int STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE = 4002;
    public static final int STATUS_SNAPSHOT_CREATION_FAILED = 4001;
    public static final int STATUS_SNAPSHOT_FOLDER_UNAVAILABLE = 4005;
    public static final int STATUS_SNAPSHOT_NOT_FOUND = 4000;
    public static final int STATUS_TIMEOUT = 15;

    private GamesStatusCodes()
    {
    }

    public static String getStatusString(int i)
    {
        switch (i)
        {
        default:
            return String.format("Status code (%d) not found!", new Object[] {
                Integer.valueOf(i)
            });

        case 0: // '\0'
            return "STATUS_OK";

        case 1: // '\001'
            return "STATUS_INTERNAL_ERROR";

        case 2: // '\002'
            return "STATUS_CLIENT_RECONNECT_REQUIRED";

        case 3: // '\003'
            return "STATUS_NETWORK_ERROR_STALE_DATA";

        case 4: // '\004'
            return "STATUS_NETWORK_ERROR_NO_DATA";

        case 5: // '\005'
            return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";

        case 6: // '\006'
            return "STATUS_NETWORK_ERROR_OPERATION_FAILED";

        case 7: // '\007'
            return "STATUS_LICENSE_CHECK_FAILED";

        case 8: // '\b'
            return "STATUS_APP_MISCONFIGURED";

        case 9: // '\t'
            return "STATUS_GAME_NOT_FOUND";

        case 14: // '\016'
            return "STATUS_INTERRUPTED";

        case 15: // '\017'
            return "STATUS_TIMEOUT";

        case 500: 
            return "STATUS_RESOLVE_STALE_OR_NO_DATA";

        case 1000: 
            return "STATUS_AUTH_ERROR_HARD";

        case 1001: 
            return "STATUS_AUTH_ERROR_USER_RECOVERABLE";

        case 1002: 
            return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";

        case 1003: 
            return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";

        case 1500: 
            return "STATUS_PLAYER_OOB_REQUIRED";

        case 2000: 
            return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";

        case 2001: 
            return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";

        case 3000: 
            return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";

        case 3001: 
            return "STATUS_ACHIEVEMENT_UNKNOWN";

        case 3002: 
            return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";

        case 3003: 
            return "STATUS_ACHIEVEMENT_UNLOCKED";

        case 4000: 
            return "STATUS_SNAPSHOT_NOT_FOUND";

        case 4001: 
            return "STATUS_SNAPSHOT_CREATION_FAILED";

        case 4002: 
            return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";

        case 4003: 
            return "STATUS_SNAPSHOT_COMMIT_FAILED";

        case 4004: 
            return "STATUS_SNAPSHOT_CONFLICT";

        case 6000: 
            return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";

        case 6001: 
            return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";

        case 6002: 
            return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";

        case 6003: 
            return "STATUS_MULTIPLAYER_DISABLED";

        case 6500: 
            return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";

        case 6501: 
            return "STATUS_MATCH_ERROR_INACTIVE_MATCH";

        case 6503: 
            return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";

        case 6504: 
            return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";

        case 6505: 
            return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";

        case 6506: 
            return "STATUS_MATCH_NOT_FOUND";

        case 6507: 
            return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";

        case 7000: 
            return "STATUS_REAL_TIME_CONNECTION_FAILED";

        case 7001: 
            return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";

        case 7002: 
            return "STATUS_INVALID_REAL_TIME_ROOM_ID";

        case 7003: 
            return "STATUS_PARTICIPANT_NOT_CONNECTED";

        case 7004: 
            return "STATUS_REAL_TIME_ROOM_NOT_JOINED";

        case 7005: 
            return "STATUS_REAL_TIME_INACTIVE_ROOM";

        case 7006: 
            return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";

        case 7007: 
            return "STATUS_OPERATION_IN_FLIGHT";

        case 8000: 
            return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";

        case 8001: 
            return "STATUS_MILESTONE_CLAIM_FAILED";

        case 8002: 
            return "STATUS_QUEST_NO_LONGER_AVAILABLE";

        case 8003: 
            return "STATUS_QUEST_NOT_STARTED";
        }
    }
}

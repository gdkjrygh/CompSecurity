// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.app.NotificationId;

public interface CallConstants
{

    public static final String ACTION_END_CALL = "endCall";
    public static final String ACTION_MUTE_CALL = "muteCall";
    public static final String ACTION_SEAMLESS_UPGRADE_CS_CALL = "seamlessUpgradeCall";
    public static final String ACTION_SEAMLESS_UPGRADE_NETWORK_INCAPABLE = "seamlessNetworkIncapable";
    public static final String ACTION_SEAMLESS_UPGRADE_SET_IDENTITY = "seamlessSetIdentity";
    public static final String ACTION_SKYPE_CONVERSATION_STATE = "com.skype.android.CONVERSATION_LIVE_STATE";
    public static final int CALL_ERROR_FREEZE_TIME = 3000;
    public static final int CONTROLS_TIMEOUT = 3000;
    public static final int DEFAULT_DTMF_DURATION = 200;
    public static final int END_CALL_FREEZE_TIME = 1500;
    public static final int END_CALL_SOUND_DELAY = 100;
    public static final String EXTRA_CALL_ENDED_INVALID_NUMBER = "extraCallEndedInvalidNumber";
    public static final String EXTRA_CALL_ENDED_NO_SKYPE_CREDIT = "extraCallEndedNoSkypeCredit";
    public static final String EXTRA_CALL_OUTGOING = "outgoing";
    public static final String EXTRA_JOIN_LIVE_SESSION = "joinLiveSession";
    public static final String EXTRA_LIVE_ACCOUNT = "com.skype.account";
    public static final String EXTRA_LIVE_IDENTITY = "com.skype.live_identity";
    public static final String EXTRA_LIVE_STATUS = "com.skype.live_status";
    public static final String EXTRA_MY_CAMERA = "extraMyCamera";
    public static final String EXTRA_MY_VIDEO = "extraVideo";
    public static final String EXTRA_REMOTE_VIDEO = "extraRemoteVideo";
    public static final String EXTRA_RING_SEAMLESS = "extraRingSeamless";
    public static final String EXTRA_RING_TRANSLATED = "ringTranslated";
    public static final String EXTRA_USER_MUTED = "userMuted";
    public static final int INCOMING_WAKEUP_TIME = 3000;
    public static final int MISSED_CALL_NOTIFICATION_ID = NotificationId.newId();
    public static final int ONGOING_CALL_NOTIFICATION_ID = NotificationId.newId();
    public static final int VIDEO_MONITOR_ID = 0;
    public static final int WHAT_FINISH_ACTIVTY = 4;
    public static final int WHAT_HIDE_CONTROLS = 2;
    public static final int WHAT_PLAY_CALL_ENDED = 5;
    public static final int WHAT_STOP_RINGING = 6;
    public static final int WHAT_UPDATE_CALL_DURATION = 3;

}

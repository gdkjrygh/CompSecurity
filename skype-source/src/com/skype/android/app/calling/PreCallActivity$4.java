// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.calling:
//            PreCallActivity

static final class 
{

    static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$Participant$VOICE_STATUS[];
    static final int $SwitchMap$com$skype$SkyLib$LEAVE_REASON[];

    static 
    {
        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype._LIVESTATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.IM_LIVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror33) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.OTHERS_ARE_LIVE_FULL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror32) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.RECORDING_VOICE_MESSAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror31) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.PLAYING_VOICE_MESSAGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror30) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.RECENTLY_LIVE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype._LIVESTATUS.NONE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        $SwitchMap$com$skype$Participant$VOICE_STATUS = new int[com.skype.STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.STATUS.VOICE_CONNECTING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.STATUS.RINGING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype.STATUS.EARLY_MEDIA.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_META_TOPIC.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LIVE_IS_MUTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        $SwitchMap$com$skype$SkyLib$LEAVE_REASON = new int[com.skype.N.values().length];
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_INSUFFICIENT_FUNDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_TRANSFER_INSUFFICIENT_FUNDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_PSTN_INVALID_NUMBER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_EMERGENCY_CALL_DENIED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_BLOCKED_BY_US.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_NO_SKYPEOUT_SUBSCRIPTION.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_PSTN_NETWORK_ERROR.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_CONNECTION_DROPPED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_INTERNET_CONNECTION_LOST.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_LEGACY_ERROR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_MANUAL.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_NO_ANSWER.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_PSTN_CALL_REJECTED.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_PSTN_CALL_TERMINATED.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_BUSY.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_PSTN_BUSY.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_TOO_MANY_IDENTITIES.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_BLOCKED_BY_PRIVACY_SETTINGS.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_SKYPEOUT_ACCOUNT_BLOCKED.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LIVE_RECORDING_FAILED.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$SkyLib$LEAVE_REASON[com.skype.N.LEAVE_REASON_NONE.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

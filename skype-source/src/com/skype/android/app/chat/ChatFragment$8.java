// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

static final class er.WiredHeadsetStatus
{

    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
    static final int $SwitchMap$com$skype$Message$TYPE[];
    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$Sms$FAILUREREASON[];
    static final int $SwitchMap$com$skype$Sms$STATUS[];
    static final int $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[];

    static 
    {
        $SwitchMap$com$skype$Sms$STATUS = new int[com.skype.es().length];
        try
        {
            $SwitchMap$com$skype$Sms$STATUS[com.skype.ED.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            $SwitchMap$com$skype$Sms$STATUS[com.skype._TARGETS_FAILED.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$skype$Sms$STATUS[com.skype.ING_TO_SERVER.nal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$com$skype$Sms$STATUS[com.skype._TO_SERVER.nal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        $SwitchMap$com$skype$Sms$FAILUREREASON = new int[com.skype.ON.values().length];
        try
        {
            $SwitchMap$com$skype$Sms$FAILUREREASON[com.skype.ON.INSUFFICIENT_FUNDS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.EDIA_STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_STATUS.MEDIA_LOADING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.EDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_TARGET_STATUSES.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_STATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_PRICE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_PRICE_PRECISION.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_MY_STATUS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_IS_P2P_MIGRATED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.lues().length];
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_MEDIA_MESSAGE.dinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_FLIK_MESSAGE.dinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VIDEO.dinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VIDEO_MESSAGE.dinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_AUDIO_MESSAGE.dinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_VOICE_MESSAGE.dinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.STED_LOCATION.dinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus = new int[com.skype.android.audio.eiver.WiredHeadsetStatus.values().length];
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.eiver.WiredHeadsetStatus.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.eiver.WiredHeadsetStatus.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.eiver.WiredHeadsetStatus.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

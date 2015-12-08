// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            CallAgent

static final class SGID
{

    static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
    static final int $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[];
    static final int $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[];

    static 
    {
        $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus = new int[com.skype.android.audio.Receiver.WiredHeadsetStatus.values().length];
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.Receiver.WiredHeadsetStatus.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.Receiver.WiredHeadsetStatus.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.Receiver.WiredHeadsetStatus.a.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype..LOCAL_LIVESTATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.RINGING_FOR_ME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.STARTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.ON_HOLD_LOCALLY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.ON_HOLD_REMOTELY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.NONE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.IM_LIVE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype..LOCAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID = new int[com.skype.RANSLATOR_RESERVED_MSGID.values().length];
        try
        {
            $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.RANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_ORIG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.RANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_TRANSLATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.RANSLATOR_RESERVED_MSGID.MSGID_FORCALLEE_TRANSLATED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Translator$TRANSLATOR_RESERVED_MSGID[com.skype.RANSLATOR_RESERVED_MSGID.MSGID_FORCALLER_ORIG.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

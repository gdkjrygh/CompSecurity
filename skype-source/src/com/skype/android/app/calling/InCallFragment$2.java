// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

static final class 
{

    static final int $SwitchMap$com$skype$Message$TYPE[];
    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$Participant$VOICE_STATUS[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_OPTIMAL_REMOTE_VIDEOS_IN_CONFERENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        $SwitchMap$com$skype$Participant$VOICE_STATUS = new int[com.skype._STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype._STATUS.EARLY_MEDIA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype._STATUS.VOICE_STOPPED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype._STATUS.VOICE_UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Participant$VOICE_STATUS[com.skype._STATUS.VOICE_CONNECTING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$Message$TYPE = new int[com.skype.es().length];
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.ED_FLIK_MESSAGE.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.ED_TEXT.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.ED_SMS.nal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Message$TYPE[com.skype.ED_FILES.nal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

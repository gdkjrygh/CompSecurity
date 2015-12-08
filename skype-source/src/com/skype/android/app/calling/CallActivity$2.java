// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.calling:
//            CallActivity

static final class 
{

    static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];
    static final int $SwitchMap$com$skype$Conversation$TYPE[];
    static final int $SwitchMap$com$skype$PROPKEY[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LIVE_CALL_TECHNOLOGY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_LOCAL_LIVESTATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.CAL_LIVESTATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$com$skype$Conversation$TYPE = new int[com.skype.PE.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$TYPE[com.skype.PE.DIALOG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Conversation$TYPE[com.skype.PE.CONFERENCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Conversation$TYPE[com.skype.PE.LEGACY_VOICE_CONFERENCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

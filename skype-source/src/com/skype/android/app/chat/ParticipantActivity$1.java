// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            ParticipantActivity

static final class 
{

    static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

    static 
    {
        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.ESTATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.ESTATUS.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.ESTATUS.RECENTLY_LIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

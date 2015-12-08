// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            VideoMonitor

static final class 
{

    static final int $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[];

    static 
    {
        $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS = new int[com.skype.CAL_LIVESTATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.OTHERS_ARE_LIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Conversation$LOCAL_LIVESTATUS[com.skype.CAL_LIVESTATUS.RECENTLY_LIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

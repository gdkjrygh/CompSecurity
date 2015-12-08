// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            m

static final class 
{

    static final int $SwitchMap$com$skype$Voicemail$STATUS[];

    static 
    {
        $SwitchMap$com$skype$Voicemail$STATUS = new int[com.skype.email.STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Voicemail$STATUS[com.skype.email.STATUS.BUFFERING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Voicemail$STATUS[com.skype.email.STATUS.PLAYING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Voicemail$STATUS[com.skype.email.STATUS.FAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

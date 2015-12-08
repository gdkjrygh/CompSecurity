// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            MessageAdapter

static final class 
{

    static final int $SwitchMap$com$skype$Message$SENDING_STATUS[];

    static 
    {
        $SwitchMap$com$skype$Message$SENDING_STATUS = new int[com.skype.TATUS.values().length];
        try
        {
            $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.TATUS.SENDING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Message$SENDING_STATUS[com.skype.TATUS.SENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

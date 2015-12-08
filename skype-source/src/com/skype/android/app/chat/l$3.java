// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;


// Referenced classes of package com.skype.android.app.chat:
//            l

static final class 
{

    static final int $SwitchMap$com$skype$VideoMessage$STATUS[];

    static 
    {
        $SwitchMap$com$skype$VideoMessage$STATUS = new int[com.skype.oMessage.STATUS.values().length];
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.BLANK.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.CANCELED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.FAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.INVALID.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.RECORDED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.UPLOADING.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.EXPIRED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$VideoMessage$STATUS[com.skype.oMessage.STATUS.UPLOADED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

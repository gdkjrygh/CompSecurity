// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            AccountAgent

static final class 
{

    static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];
    static final int $SwitchMap$com$skype$Account$STATUS[];

    static 
    {
        $SwitchMap$com$skype$Account$STATUS = new int[com.skype.values().length];
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGED_OUT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.EASON.values().length];
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.EASON.ACCESS_TOKEN_RENEWAL_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.EASON.PASSWORD_HAS_CHANGED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.EASON.PERIODIC_UIC_UPDATE_FAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.EASON.REMOTE_LOGOUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

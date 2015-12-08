// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


// Referenced classes of package com.skype.android.inject:
//            LoginManager

static final class 
{

    static final int $SwitchMap$com$skype$Account$STATUS[];

    static 
    {
        $SwitchMap$com$skype$Account$STATUS = new int[com.skype.values().length];
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGED_IN_PARTIALLY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGED_IN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGING_OUT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.LOGGED_OUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

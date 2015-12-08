// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            LandingPageActivity

static final class 
{

    static final int $SwitchMap$com$skype$Account$STATUS[];

    static 
    {
        $SwitchMap$com$skype$Account$STATUS = new int[com.skype.TUS().length];
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.IN.()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.IN_PARTIALLY.()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.OUT.()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Account$STATUS[com.skype.OUT_AND_PWD_SAVED.()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

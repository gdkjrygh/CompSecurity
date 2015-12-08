// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;


// Referenced classes of package com.skype.android.app:
//            Navigation

static final class 
{

    static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];

    static 
    {
        $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.TREASON.values().length];
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.TREASON.INCORRECT_PASSWORD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.TREASON.UNACCEPTABLE_PASSWORD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.TREASON.PASSWORD_HAS_CHANGED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


// Referenced classes of package com.skype.android.inject:
//            ActivityAccountStateObserver

static final class t
{

    static final int $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[];

    static 
    {
        $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult = new int[t.values().length];
        try
        {
            $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[t.LOGGEDIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[t.LOGINSUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[t.LOGINFAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[t.LOGINFAILEDTIMEOUT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

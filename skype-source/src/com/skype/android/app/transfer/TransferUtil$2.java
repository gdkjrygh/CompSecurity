// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;


// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil

static final class 
{

    static final int $SwitchMap$com$skype$Transfer$STATUS[];

    static 
    {
        $SwitchMap$com$skype$Transfer$STATUS = new int[com.skype..values().length];
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..TRANSFERRING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..TRANSFERRING_OVER_RELAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..CANCELLED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..CANCELLED_BY_REMOTE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..FAILED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype..COMPLETED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

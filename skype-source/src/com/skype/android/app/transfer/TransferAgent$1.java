// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferAgent

static final class 
{

    static final int $SwitchMap$com$skype$PROPKEY[];
    static final int $SwitchMap$com$skype$Transfer$STATUS[];

    static 
    {
        $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_BYTESPERSECOND.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_BYTESTRANSFERRED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_FINISHTIME.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$PROPKEY[PROPKEY.TRANSFER_STATUS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        $SwitchMap$com$skype$Transfer$STATUS = new int[com.skype.values().length];
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.CONNECTING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.WAITING_FOR_ACCEPT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.PAUSED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.CANCELLED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.CANCELLED_BY_REMOTE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.COMPLETED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.FAILED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.TRANSFERRING.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.TRANSFERRING_OVER_RELAY.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.REMOTELY_PAUSED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$Transfer$STATUS[com.skype.NEW.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

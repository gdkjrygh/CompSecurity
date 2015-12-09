// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            EnforcePinFilter, CloudPinState

static final class 
{

    static final int $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState = new int[CloudPinState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.UNSET.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.EXPIRED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$CloudPinState[CloudPinState.ACTIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity

static final class playState
{

    static final int $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState = new int[playState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[playState.CONFIRM_NEW_PIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[playState.ENTER_INITIAL_PIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[playState.VERIFY_CURRENT_PIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[playState.ENTER_NEW_PIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[playState.WAITING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

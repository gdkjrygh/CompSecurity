// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddNumberFragment

static final class 
{

    static final int $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[];
    static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];
    static final int $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[];
    static final int $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[];
    static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

    static 
    {
        $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE = new int[.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[.SERVER_ENTERED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[.DEVICE_ENTERED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_TYPE[.USER_ENTERED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE = new int[CE.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[CE.MSA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[CE.SKYPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvStateData$PHONE_SOURCE[CE.DEVICE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR = new int[alues().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[NVALID_PHONE_NUMBER.rdinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[.PHONE_ALREADY_EXISTS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[.INVALID_PHONE_NUMBER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[.UNSUPPORTED_VERIFY_METHOD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[s().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[HONE_VERIFY_BY_VOICE.al()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[PHONE_VERIFY_BY_VOICE.al()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[VERIFY_PIN.al()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[S_PHONE.al()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[S_UNSUPPORTED.al()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[WN_STATE.al()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

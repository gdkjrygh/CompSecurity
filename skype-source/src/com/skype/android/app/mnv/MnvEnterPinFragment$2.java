// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvEnterPinFragment

static final class b
{

    static final int $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[];
    static final int $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[];
    static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];
    static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

    static 
    {
        $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[b.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[b.CODE_WAS_INCORRECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[b.CODE_HAS_EXPIRED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[es().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[_RESEND_PIN_BY_SMS.nal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[_RESEND_PIN_BY_VOICE.nal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[FIED.nal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[RESEND_CODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvEnterPinFragment$Message[CALL_ME.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[CODE_WAS_INCORRECT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvBaseFragment$ERROR[CODE_HAS_EXPIRED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager

static final class ates
{

    static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];

    static 
    {
        $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[ates.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.CHECKING_ACCOUNT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.ADD_VERIFIED_SOURCE_MSA.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.ADD_PHONE_VERIFY_BY_SMS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.EDIT_PHONE_VERIFY_BY_SMS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.ADD_PHONE_VERIFY_BY_VOICE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.EDIT_PHONE_VERIFY_BY_VOICE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.EDIT_VERIFY_PIN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.EDIT_RESEND_PIN_BY_SMS.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManager$States[ates.EDIT_RESEND_PIN_BY_VOICE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

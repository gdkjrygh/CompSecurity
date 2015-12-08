// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvErrorFragment

static final class rs.a
{

    static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[];
    static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[];

    static 
    {
        $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message = new int[rs.b.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.NO_MESSAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.ALREADY_VERIFIED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.CODE_HAS_EXPIRED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.UNABLE_TO_VERIFY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.CODE_WAS_INCORRECT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.INVALID_PHONE_NUMBER.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.ENCOUNTERED_A_PROBLEM.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.ACTIVITY_LIMIT_REACHED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.UNSUPPORTED_VERIFY_METHOD.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.CONNECTION_FAILED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.JSON_EXCEPTION.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Message[rs.b.TIMEOUT_EXCEPTION.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code = new int[rs.a.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.RETRY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.UNABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

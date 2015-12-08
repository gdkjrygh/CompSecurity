// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            MnvManagerEvents

static final class rs.a
{

    static final int $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[];
    static final int $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[];

    static 
    {
        $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code = new int[rs.a.values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.RETRY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.UNABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.PHONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.PIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.INVALID.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$ProfileServicesErrors$Code[rs.a.UNSUPPORTED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[IS_VERIFICATION_QOS_ALERT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[IS_FIRST_TIME.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[IS_MNV_COMPLETED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[IS_MSA_SOURCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$app$mnv$MnvManagerEvents$PreCheckEvents[IS_SKYPE_SOURCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

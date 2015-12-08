// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;


// Referenced classes of package com.fsr.tracker.app:
//            OnExitSurveyInviteActivity

static class alidationResult
{

    static final int $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[];

    static 
    {
        $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult = new int[com.fsr.tracker.service.ationResult.values().length];
        try
        {
            $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ationResult.VALID.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ationResult.INVALID_FORMAT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ationResult.REQUIRED_FIELD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ationResult.SERVER_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

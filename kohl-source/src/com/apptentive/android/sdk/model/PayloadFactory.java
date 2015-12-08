// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import org.json.JSONException;

// Referenced classes of package com.apptentive.android.sdk.model:
//            MessageFactory, EventFactory, DeviceFactory, SdkFactory, 
//            AppReleaseFactory, PersonFactory, SurveyResponse, Payload

public class PayloadFactory
{

    public PayloadFactory()
    {
    }

    public static Payload fromJson(String s, Payload.BaseType basetype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType = new int[Payload.BaseType.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.message.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.event.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.device.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.sdk.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.app_release.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.person.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.survey.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$model$Payload$BaseType[Payload.BaseType.unknown.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.model.Payload.BaseType[basetype.ordinal()];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 58
    //                   2 63
    //                   3 68
    //                   4 73
    //                   5 78
    //                   6 83
    //                   7 88
    //                   8 100;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return null;
_L2:
        return MessageFactory.fromJson(s);
_L3:
        return EventFactory.fromJson(s);
_L4:
        return DeviceFactory.fromJson(s);
_L5:
        return SdkFactory.fromJson(s);
_L6:
        return AppReleaseFactory.fromJson(s);
_L7:
        return PersonFactory.fromJson(s);
_L8:
        s = new SurveyResponse(s);
        return s;
        s;
_L9:
        Log.v("Ignoring unknown RecordType.", new Object[0]);
        if (true) goto _L1; else goto _L10
_L10:
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package com.skype.android.push:
//            PushConfiguration, PushMessageFactory, PushServiceType, PushMessageParser

final class c
    implements PushConfiguration
{

    private static final int DEFAULT_REGISTRATION_TTL = 0x76a700;
    private static final String GCM_SENDER_ID = "463199198573";
    private static final String NNA_SENDER_ID = "skype";
    private PushMessageParser messageParser;

    public c()
    {
        messageParser = new PushMessageFactory();
    }

    public final Set getEnabledPushServiceTypes()
    {
        return EnumSet.of(PushServiceType.GOOGLE_GCM, PushServiceType.NOKIA_NNA, PushServiceType.AMAZON_ADM);
    }

    public final PushMessageParser getMessageParser(PushServiceType pushservicetype)
    {
        return messageParser;
    }

    public final int getRegistrationTTLSeconds(PushServiceType pushservicetype)
    {
        return 0x76a700;
    }

    public final String getSenderToken(PushServiceType pushservicetype)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$push$PushServiceType[];

            static 
            {
                $SwitchMap$com$skype$android$push$PushServiceType = new int[PushServiceType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.GOOGLE_GCM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.NOKIA_NNA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append(pushservicetype).append(" not supported").toString());

        case 1: // '\001'
            return "463199198573";

        case 2: // '\002'
            return "skype";
        }
    }
}

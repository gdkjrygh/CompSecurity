// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            SkypePushListener, PushServiceType

static final class 
{

    static final int $SwitchMap$com$skype$android$push$PushServiceType[];
    static final int $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[];

    static 
    {
        $SwitchMap$com$skype$android$push$PushServiceType = new int[PushServiceType.values().length];
        try
        {
            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.AMAZON_ADM.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.GOOGLE_GCM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.NOKIA_NNA.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$skype$android$push$SkypePushListener$ContextType = new int[values().length];
        try
        {
            $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[NGC_AND_P2P.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[P2P.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

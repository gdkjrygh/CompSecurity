// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            c, PushServiceType

static final class ServiceType
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

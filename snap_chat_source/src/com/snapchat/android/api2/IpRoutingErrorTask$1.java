// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;


// Referenced classes of package com.snapchat.android.api2:
//            IpRoutingErrorTask

static final class rorType
{

    static final int $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[];

    static 
    {
        $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType = new int[rorType.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[rorType.NETWORK_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$android$api2$IpRoutingErrorTask$ErrorType[rorType.JSON_ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

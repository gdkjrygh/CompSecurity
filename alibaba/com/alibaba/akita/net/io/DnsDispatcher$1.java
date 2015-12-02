// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.io;


// Referenced classes of package com.alibaba.akita.net.io:
//            DnsDispatcher

static class State
{

    static final int $SwitchMap$com$alibaba$akita$net$io$DnsDispatcher$IpState[];

    static 
    {
        $SwitchMap$com$alibaba$akita$net$io$DnsDispatcher$IpState = new int[State.values().length];
        try
        {
            $SwitchMap$com$alibaba$akita$net$io$DnsDispatcher$IpState[State.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$io$DnsDispatcher$IpState[State.FIRSTRETRY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$io$DnsDispatcher$IpState[State.SECONDRETRY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

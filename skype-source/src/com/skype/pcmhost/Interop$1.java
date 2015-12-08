// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


// Referenced classes of package com.skype.pcmhost:
//            Interop

static class dioRoute
{

    static final int $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[];

    static 
    {
        $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute = new int[dioRoute.values().length];
        try
        {
            $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[dioRoute.EARPIECE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[dioRoute.HEADSET_WITH_MIC.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[dioRoute.HEADSET_WITHOUT_MIC.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[dioRoute.SPEAKER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[dioRoute.BLUETOOTH.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

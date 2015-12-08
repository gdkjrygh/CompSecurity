// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


public class Interop
{

    public Interop()
    {
    }

    public static com.microsoft.media.RtcPalEnvironment.AudioEndpoint SkypeToLyncEndpoint(PcmHost.AudioRoute audioroute)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[];

            static 
            {
                $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute = new int[PcmHost.AudioRoute.values().length];
                try
                {
                    $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[PcmHost.AudioRoute.EARPIECE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[PcmHost.AudioRoute.HEADSET_WITH_MIC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[PcmHost.AudioRoute.HEADSET_WITHOUT_MIC.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[PcmHost.AudioRoute.SPEAKER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$pcmhost$PcmHost$AudioRoute[PcmHost.AudioRoute.BLUETOOTH.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.pcmhost.PcmHost.AudioRoute[audioroute.ordinal()])
        {
        default:
            return com.microsoft.media.RtcPalEnvironment.AudioEndpoint.NON_SPEAKER;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return com.microsoft.media.RtcPalEnvironment.AudioEndpoint.NON_SPEAKER;

        case 4: // '\004'
            return com.microsoft.media.RtcPalEnvironment.AudioEndpoint.SPEAKER;

        case 5: // '\005'
            return com.microsoft.media.RtcPalEnvironment.AudioEndpoint.BLUETOOTH;
        }
    }
}

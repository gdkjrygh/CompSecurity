// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.PlayState;
import com.adobe.ave.UpdateType;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineAdapter

static class ABRPolicy
{

    static final int $SwitchMap$com$adobe$ave$PlayState[];
    static final int $SwitchMap$com$adobe$ave$UpdateType[];
    static final int $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[];
    static final int $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[];

    static 
    {
        $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy = new int[ABRPolicy.values().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRPolicy.ABR_AGGRESSIVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRPolicy.ABR_MODERATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRPolicy.ABR_CONSERVATIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type = new int[com.adobe.mediacore.qos.ype().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[com.adobe.mediacore.qos.T.()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[com.adobe.mediacore.qos.T.()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        $SwitchMap$com$adobe$ave$UpdateType = new int[UpdateType.values().length];
        try
        {
            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.INITIAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.LIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.CAPTION_ACTIVITY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.BACKGROUND.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$adobe$ave$PlayState = new int[PlayState.values().length];
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.READY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.EOF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.BUFFERING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.BUFFERFULL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.PLAYING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.PAUSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$ave$PlayState[PlayState.SUSPENDED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

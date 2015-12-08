// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.AdPolicy;

// Referenced classes of package com.adobe.mediacore:
//            AdPolicyProxy

static class sing.AdPolicy
{

    static final int $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[];

    static 
    {
        $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy = new int[AdPolicy.values().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY_FROM_AD_BEGIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.SKIP_AD_BREAK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.SKIP_TO_NEXT_AD_IN_BREAK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY_FROM_AD_BREAK_BEGIN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

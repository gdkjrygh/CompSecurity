// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.AdBreakPolicy;

// Referenced classes of package com.adobe.mediacore:
//            TimelineMonitor

static class ng.AdBreakPolicy
{

    static final int $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[];

    static 
    {
        $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy = new int[AdBreakPolicy.values().length];
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.PLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.SKIP.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.REMOVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.REMOVE_AFTER_PLAY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

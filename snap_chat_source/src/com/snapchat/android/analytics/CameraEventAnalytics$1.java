// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import hn;

// Referenced classes of package com.snapchat.android.analytics:
//            CameraEventAnalytics

static final class 
{

    static final int $SwitchMap$com$snapchat$analytics$types$ExitEvent[];

    static 
    {
        $SwitchMap$com$snapchat$analytics$types$ExitEvent = new int[hn.values().length];
        try
        {
            $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.ENTER_BACKGROUND.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.TAPPED_THUMBNAIL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$analytics$types$ExitEvent[hn.SWIPE_DOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackServiceModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.playback.PlaybackService"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final PlaybackServiceModule newModule()
    {
        return new PlaybackServiceModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/playback/PlaybackServiceModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.stream.SoundStreamFragment"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final SoundStreamModule newModule()
    {
        return new SoundStreamModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/stream/SoundStreamModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}

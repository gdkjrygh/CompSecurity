// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.likes:
//            LikesModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.likes.TrackLikesActivity", "members/com.soundcloud.android.likes.TrackLikesFragment"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final LikesModule newModule()
    {
        return new LikesModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/likes/LikesModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}

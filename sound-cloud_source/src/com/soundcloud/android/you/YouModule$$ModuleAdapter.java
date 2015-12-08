// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.you:
//            YouModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.you.YouFragment"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final YouModule newModule()
    {
        return new YouModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public _cls9()
    {
        super(com/soundcloud/android/you/YouModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}

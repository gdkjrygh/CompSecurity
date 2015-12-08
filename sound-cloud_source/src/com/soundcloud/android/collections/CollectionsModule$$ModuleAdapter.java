// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import dagger.a.r;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.collections.CollectionsFragment", "members/com.soundcloud.android.collections.CollectionPreviewView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final CollectionsModule newModule()
    {
        return new CollectionsModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public I()
    {
        super(com/soundcloud/android/collections/CollectionsModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}

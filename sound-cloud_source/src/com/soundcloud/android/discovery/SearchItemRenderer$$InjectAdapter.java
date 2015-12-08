// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.discovery:
//            SearchItemRenderer

public final class  extends b
    implements Provider
{

    public final SearchItemRenderer get()
    {
        return new SearchItemRenderer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.discovery.SearchItemRenderer", "members/com.soundcloud.android.discovery.SearchItemRenderer", false, com/soundcloud/android/discovery/SearchItemRenderer);
    }
}

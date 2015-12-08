// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            RecyclerViewParallaxer

public final class  extends b
    implements Provider
{

    public final RecyclerViewParallaxer get()
    {
        return new RecyclerViewParallaxer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.RecyclerViewParallaxer", "members/com.soundcloud.android.view.adapters.RecyclerViewParallaxer", false, com/soundcloud/android/view/adapters/RecyclerViewParallaxer);
    }
}

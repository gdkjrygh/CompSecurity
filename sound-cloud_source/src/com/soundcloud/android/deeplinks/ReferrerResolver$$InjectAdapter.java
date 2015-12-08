// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            ReferrerResolver

public final class  extends b
    implements Provider
{

    public final ReferrerResolver get()
    {
        return new ReferrerResolver();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.deeplinks.ReferrerResolver", "members/com.soundcloud.android.deeplinks.ReferrerResolver", false, com/soundcloud/android/deeplinks/ReferrerResolver);
    }
}

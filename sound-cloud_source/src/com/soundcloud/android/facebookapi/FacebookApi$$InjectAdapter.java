// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookapi:
//            FacebookApi, FacebookApiHelper

public final class  extends b
    implements Provider
{

    private b facebookApiHelper;

    public final void attach(l l1)
    {
        facebookApiHelper = l1.a("com.soundcloud.android.facebookapi.FacebookApiHelper", com/soundcloud/android/facebookapi/FacebookApi, getClass().getClassLoader());
    }

    public final FacebookApi get()
    {
        return new FacebookApi((FacebookApiHelper)facebookApiHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(facebookApiHelper);
    }

    public ()
    {
        super("com.soundcloud.android.facebookapi.FacebookApi", "members/com.soundcloud.android.facebookapi.FacebookApi", false, com/soundcloud/android/facebookapi/FacebookApi);
    }
}

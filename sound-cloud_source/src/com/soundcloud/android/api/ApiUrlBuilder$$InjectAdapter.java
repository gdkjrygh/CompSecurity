// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.content.res.Resources;
import com.soundcloud.android.api.oauth.OAuth;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.api:
//            ApiUrlBuilder

public final class  extends b
    implements Provider
{

    private b oAuth;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/api/ApiUrlBuilder, getClass().getClassLoader());
        oAuth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/api/ApiUrlBuilder, getClass().getClassLoader());
    }

    public final ApiUrlBuilder get()
    {
        return new ApiUrlBuilder((Resources)resources.get(), (OAuth)oAuth.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(oAuth);
    }

    public ()
    {
        super("com.soundcloud.android.api.ApiUrlBuilder", "members/com.soundcloud.android.api.ApiUrlBuilder", false, com/soundcloud/android/api/ApiUrlBuilder);
    }
}

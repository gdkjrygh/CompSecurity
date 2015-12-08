// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.c.a.t;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.utils.DeviceHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            StrictSSLHttpClient

public final class  extends b
    implements Provider
{

    private b client;
    private b helper;
    private b oAuth;

    public final void attach(l l1)
    {
        client = l1.a("@javax.inject.Named(value=StrictSSLHttpClient)/com.squareup.okhttp.OkHttpClient", com/soundcloud/android/offline/StrictSSLHttpClient, getClass().getClassLoader());
        helper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/offline/StrictSSLHttpClient, getClass().getClassLoader());
        oAuth = l1.a("com.soundcloud.android.api.oauth.OAuth", com/soundcloud/android/offline/StrictSSLHttpClient, getClass().getClassLoader());
    }

    public final StrictSSLHttpClient get()
    {
        return new StrictSSLHttpClient((t)client.get(), (DeviceHelper)helper.get(), (OAuth)oAuth.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(client);
        set.add(helper);
        set.add(oAuth);
    }

    public ()
    {
        super("com.soundcloud.android.offline.StrictSSLHttpClient", "members/com.soundcloud.android.offline.StrictSSLHttpClient", false, com/soundcloud/android/offline/StrictSSLHttpClient);
    }
}

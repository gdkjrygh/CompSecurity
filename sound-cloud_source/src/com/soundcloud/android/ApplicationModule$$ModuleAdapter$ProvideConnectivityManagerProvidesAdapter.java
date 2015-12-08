// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.net.ConnectivityManager;
import dagger.a.t;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android:
//            ApplicationModule

public static final class setLibrary extends t
    implements Provider
{

    private final ApplicationModule module;

    public final ConnectivityManager get()
    {
        return module.provideConnectivityManager();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (ApplicationModule applicationmodule)
    {
        super("android.net.ConnectivityManager", false, "com.soundcloud.android.ApplicationModule", "provideConnectivityManager");
        module = applicationmodule;
        setLibrary(true);
    }
}

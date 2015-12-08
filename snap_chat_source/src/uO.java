// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.util.network.DiscoverEndpointManager;
import javax.inject.Provider;

public final class uO
    implements Provider
{

    private final DiscoverEndpointManager a;

    public uO()
    {
        this(DiscoverEndpointManager.a());
    }

    private uO(DiscoverEndpointManager discoverendpointmanager)
    {
        a = discoverendpointmanager;
    }

    public final Bundle a()
    {
        String s = a.c();
        String s1 = a.d();
        if (s == null || s1 == null)
        {
            Timber.d("ContextAwareParamsProvider", "Cannot retrieve params, resource params are null", new Object[0]);
            return null;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString(s, s1);
            return bundle;
        }
    }

    public final Object get()
    {
        return a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.app.Service;

// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitFactory, OrbitService, OrbitServiceInterface

public class NativeOrbitFactory
    implements OrbitFactory
{

    public NativeOrbitFactory()
    {
    }

    public OrbitService createService(Service service, int i, String s)
    {
        return OrbitService.create(service, i, s);
    }

    public volatile OrbitServiceInterface createService(Service service, int i, String s)
    {
        return createService(service, i, s);
    }
}

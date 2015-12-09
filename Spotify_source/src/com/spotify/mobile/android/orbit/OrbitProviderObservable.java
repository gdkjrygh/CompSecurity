// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitProviderObserver

public class OrbitProviderObservable
    implements OrbitProviderObserver
{

    private OrbitProviderObserver mOrbitProviderObserver;

    public OrbitProviderObservable()
    {
    }

    public void onPathUpdated(String s)
    {
        if (mOrbitProviderObserver != null)
        {
            mOrbitProviderObserver.onPathUpdated(s);
        }
    }

    public void setObserver(OrbitProviderObserver orbitproviderobserver)
    {
        mOrbitProviderObserver = orbitproviderobserver;
    }
}

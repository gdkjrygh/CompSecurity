// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailsController

public static class injectionProvider
{

    private final Provider injectionProvider;

    public PlaylistDetailsController create()
    {
        return (PlaylistDetailsController)injectionProvider.get();
    }

    I(Provider provider)
    {
        injectionProvider = provider;
    }
}

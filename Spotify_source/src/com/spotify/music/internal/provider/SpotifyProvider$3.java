// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.provider;

import android.net.Uri;
import dwo;

// Referenced classes of package com.spotify.music.internal.provider:
//            SpotifyProvider

final class a
    implements Runnable
{

    private Uri a;
    private SpotifyProvider b;

    public final void run()
    {
        SpotifyProvider.a(b).a();
        SpotifyProvider.a(b, a);
        SpotifyProvider.a(b).b();
        return;
        Exception exception;
        exception;
        SpotifyProvider.a(b).b();
        throw exception;
    }

    (SpotifyProvider spotifyprovider, Uri uri)
    {
        b = spotifyprovider;
        a = uri;
        super();
    }
}

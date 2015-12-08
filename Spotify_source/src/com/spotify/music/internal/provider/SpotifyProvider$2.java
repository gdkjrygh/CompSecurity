// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.provider;

import android.content.ContentValues;
import android.net.Uri;
import dwo;

// Referenced classes of package com.spotify.music.internal.provider:
//            SpotifyProvider

final class b
    implements Runnable
{

    private Uri a;
    private ContentValues b;
    private SpotifyProvider c;

    public final void run()
    {
        SpotifyProvider.a(c).a();
        SpotifyProvider.a(c, a, b);
        SpotifyProvider.a(c).b();
        return;
        Exception exception;
        exception;
        SpotifyProvider.a(c).b();
        throw exception;
    }

    (SpotifyProvider spotifyprovider, Uri uri, ContentValues contentvalues)
    {
        c = spotifyprovider;
        a = uri;
        b = contentvalues;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import com.spotify.mobile.android.orbit.OrbitProviderObserver;
import com.spotify.music.internal.provider.SpotifyProvider;

final class ang.Object
    implements OrbitProviderObserver
{

    private eab a;

    public final void onPathUpdated(String s)
    {
        if (a.b)
        {
            return;
        } else
        {
            a.a.notifyChange(Uri.withAppendedPath(SpotifyProvider.b, s), null);
            return;
        }
    }

    (eab eab1)
    {
        a = eab1;
        super();
    }
}

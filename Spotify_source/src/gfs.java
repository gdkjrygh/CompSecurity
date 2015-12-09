// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;

public final class gfs
{

    public static Uri a(SpotifyLink spotifylink)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.x.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.v.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[spotifylink.c.ordinal()])
        {
        default:
            Assertion.a((new StringBuilder("Missing support to get content uri for this type. Type: ")).append(spotifylink.c).toString());
            return null;

        case 1: // '\001'
            return dth.b(spotifylink.d());

        case 2: // '\002'
            return dti.b(spotifylink.d());

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return dtt.b(spotifylink.d());

        case 6: // '\006'
            return dtg.b(spotifylink.d());

        case 7: // '\007'
            return dti.d(spotifylink.d());

        case 8: // '\b'
            return com.spotify.mobile.android.provider.Metadata.Track.a(spotifylink.d());
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;

public final class Metadata
{

    public static Uri a(Uri uri, String s)
    {
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(s)).c;
        if (linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT && linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.c)
        {
            Assertion.a((new StringBuilder("Not a valid lookup uri: ")).append(s).toString());
            return uri;
        } else
        {
            return uri.buildUpon().appendQueryParameter("lookup_uri", s).build();
        }
    }

    // Unreferenced inner class com/spotify/mobile/android/provider/Metadata$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[PlaylistFilter.values().length];
            try
            {
                a[PlaylistFilter.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[PlaylistFilter.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[PlaylistFilter.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[PlaylistFilter.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[PlaylistFilter.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }

        private class PlaylistFilter extends Enum
        {

            public static final PlaylistFilter a;
            public static final PlaylistFilter b;
            public static final PlaylistFilter c;
            public static final PlaylistFilter d;
            public static final PlaylistFilter e;
            private static final PlaylistFilter f[];

            public static PlaylistFilter valueOf(String s)
            {
                return (PlaylistFilter)Enum.valueOf(com/spotify/mobile/android/provider/Metadata$PlaylistFilter, s);
            }

            public static PlaylistFilter[] values()
            {
                return (PlaylistFilter[])f.clone();
            }

            static 
            {
                a = new PlaylistFilter("ALL", 0);
                b = new PlaylistFilter("OFFLINE_ONLY", 1);
                c = new PlaylistFilter("WRITABLE_ONLY", 2);
                d = new PlaylistFilter("NOT_OFFLINE_ONLY", 3);
                e = new PlaylistFilter("RECENTLY_CHANGED_AND_WRITABLE_ONLY", 4);
                f = (new PlaylistFilter[] {
                    a, b, c, d, e
                });
            }

            private PlaylistFilter(String s, int i)
            {
                super(s, i);
            }
        }

    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.client;

import android.content.Context;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.cosmos.RequestBuilder;

public final class ShareViewClient
{

    private Context a;
    private Resolver b;

    public ShareViewClient(Context context)
    {
        a = context;
    }

    public static Request a(com.spotify.mobile.android.spotlets.share.model.Broadcast.Request request)
    {
        try
        {
            request = RequestBuilder.post(a(Path.b, new String[0]), request).build();
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.spotlets.share.model.Broadcast.Request request)
        {
            throw new RuntimeException();
        }
        return request;
    }

    public static Request a(com.spotify.mobile.android.spotlets.share.model.Network.Type type, com.spotify.mobile.android.spotlets.share.model.Connect.Request request)
    {
        try
        {
            type = RequestBuilder.post(a(Path.c, new String[] {
                type.a()
            }), request).build();
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.spotlets.share.model.Network.Type type)
        {
            throw new RuntimeException();
        }
        return type;
    }

    public static Request a(com.spotify.mobile.android.spotlets.share.model.Network.Type type, com.spotify.mobile.android.spotlets.share.model.Connect.RequestV2 requestv2)
    {
        try
        {
            type = RequestBuilder.post(a(Path.c, Version.b, new String[] {
                type.a()
            }), requestv2).build();
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.spotlets.share.model.Network.Type type)
        {
            throw new RuntimeException();
        }
        return type;
    }

    public static transient String a(Path path, Version version, String as[])
    {
        return String.format((new StringBuilder()).append(String.format("hm://share-view/v%s/", new Object[] {
            Integer.toString(version.mNumber)
        })).append(path.mValue).toString(), (Object[])as);
    }

    public static transient String a(Path path, String as[])
    {
        return a(path, Version.a, as);
    }

    public final void a()
    {
        if (b != null)
        {
            b.destroy();
        }
    }

    public final Resolver b()
    {
        if (b == null)
        {
            b = Cosmos.getResolver(a);
            b.connect();
        }
        return b;
    }

    private class Path extends Enum
    {

        public static final Path a;
        public static final Path b;
        public static final Path c;
        public static final Path d;
        private static Path e;
        private static final Path f[];
        String mValue;

        public static Path valueOf(String s)
        {
            return (Path)Enum.valueOf(com/spotify/mobile/android/spotlets/share/client/ShareViewClient$Path, s);
        }

        public static Path[] values()
        {
            return (Path[])f.clone();
        }

        static 
        {
            a = new Path("AUTHORIZE", 0, "network/%s/authorize?callback=%s");
            b = new Path("BROADCAST", 1, "broadcast");
            c = new Path("CONNECT", 2, "network/%s");
            d = new Path("INFO", 3, "info?decorate=false&uri=%s");
            e = new Path("MESSAGE", 4, "message");
            f = (new Path[] {
                a, b, c, d, e
            });
        }

        private Path(String s, int i, String s1)
        {
            super(s, i);
            mValue = s1;
        }
    }


    private class Version extends Enum
    {

        public static final Version a;
        public static final Version b;
        private static final Version c[];
        int mNumber;

        public static Version valueOf(String s)
        {
            return (Version)Enum.valueOf(com/spotify/mobile/android/spotlets/share/client/ShareViewClient$Version, s);
        }

        public static Version[] values()
        {
            return (Version[])c.clone();
        }

        static 
        {
            a = new Version("ONE", 0, 1);
            b = new Version("TWO", 1, 2);
            c = (new Version[] {
                a, b
            });
        }

        private Version(String s, int i, int j)
        {
            super(s, i);
            mNumber = j;
        }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.util.SpotifyLink;

public final class ece
{

    public static final PlayOptions a = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).seekTo(0L).skipToIndex(0, 0).build();
    public final ObjectMapper b;

    public ece(ObjectMapper objectmapper)
    {
        b = objectmapper;
    }

    public static SpotifyLink a(Uri uri)
    {
        return new SpotifyLink(uri.getLastPathSegment());
    }

    public static boolean a(Uri uri, Context context)
    {
        while (uri == null || uri.getEncodedPath() == null || !uri.getEncodedPath().startsWith((new eay(context)).c().getEncodedPath()) || !com.spotify.mobile.android.util.SpotifyLink.LinkType.c.equals(a(uri).c)) 
        {
            return false;
        }
        return true;
    }

}

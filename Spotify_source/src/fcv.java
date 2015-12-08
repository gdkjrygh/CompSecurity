// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.playlist.activity.AnnotatePlaylistActivity;

public final class fcv
{

    public final Intent a;

    public fcv(Context context)
    {
        a = new Intent(context, com/spotify/mobile/android/spotlets/playlist/activity/AnnotatePlaylistActivity);
    }

    public final fcv a(String s)
    {
        a.putExtra("playlist_uri", s);
        return this;
    }

    public final fcv b(String s)
    {
        a.putExtra("title", s);
        return this;
    }

    public final fcv c(String s)
    {
        a.putExtra("folder_uri", s);
        return this;
    }

    public final fcv d(String s)
    {
        a.putExtra("item_uri", s);
        return this;
    }
}

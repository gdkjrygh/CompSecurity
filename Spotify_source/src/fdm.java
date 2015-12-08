// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit.PlaylistFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class fdm
{

    public final Bundle a = new Bundle();

    public fdm()
    {
    }

    public final fdm a()
    {
        a.putBoolean("is_sub_fragment", true);
        return this;
    }

    public final fdm a(String s)
    {
        a.putString("playlist_uri", s);
        return this;
    }

    public final fxy a(Flags flags)
    {
        geh.a(a.getString("playlist_uri"), "playlistUri must be set");
        flags = PlaylistFragment.a(flags);
        if (flags.F().g() == null)
        {
            flags.F().f(new Bundle());
        }
        flags.F().g().putAll(a);
        return flags;
    }

    public final fdm b(String s)
    {
        a.putString("sort_order", s);
        return this;
    }

    public final fdm c(String s)
    {
        a.putString("title", s);
        return this;
    }
}

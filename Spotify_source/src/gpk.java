// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class gpk
{

    final Map a = new HashMap();
    public RadioStationTracksModel b;
    int c;
    boolean d;
    public final Verified e;
    public final com.spotify.mobile.android.util.viewuri.ViewUri.SubView f;
    public Set g;

    public gpk(RadioStationTracksModel radiostationtracksmodel, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        g = new LinkedHashSet();
        ctz.a(radiostationtracksmodel);
        c = 0;
        e = verified;
        f = subview;
        b = radiostationtracksmodel;
        a(radiostationtracksmodel);
    }

    public final ThumbState a(String s)
    {
        ThumbState thumbstate = (ThumbState)a.get(s);
        s = thumbstate;
        if (thumbstate == null)
        {
            s = ThumbState.a;
        }
        return s;
    }

    public final void a(RadioStationTracksModel radiostationtracksmodel)
    {
        ctz.a(radiostationtracksmodel);
        ctz.a(radiostationtracksmodel.tracks);
        b = radiostationtracksmodel;
        radiostationtracksmodel = radiostationtracksmodel.tracks;
        int j = radiostationtracksmodel.length;
        for (int i = 0; i < j; i++)
        {
            PlayerTrack playertrack = radiostationtracksmodel[i];
            a.put(playertrack.uri(), ThumbState.a((String)playertrack.metadata().get("radio.thumb")));
        }

        d = false;
    }
}

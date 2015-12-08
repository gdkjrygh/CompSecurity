// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.running.model.RunningPlayerContextPage;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class fes
{

    private static final Set a;
    private static final Set b;
    private static final PlayerRestrictions c;

    public fes()
    {
    }

    public static void a(Player player, RunningPlayerContextPage runningplayercontextpage, String s, int i, int j, long l, boolean flag, 
            com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions playersuppressions = runningplayercontextpage.suppressions();
        a(player, runningplayercontextpage, s, (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(i, j).suppressions(playersuppressions).seekTo(l).playerOptionsOverride(flag, true, false).build(), playcallback);
    }

    private static void a(Player player, RunningPlayerContextPage runningplayercontextpage, String s, PlayOptions playoptions, com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        ctz.a(player);
        ctz.a(runningplayercontextpage);
        ctz.a(s);
        Object obj = runningplayercontextpage.tracks();
        PlayerTrack aplayertrack[];
        if (obj == null)
        {
            obj = new PlayerTrack[0];
        }
        aplayertrack = (PlayerTrack[])obj;
        runningplayercontextpage = runningplayercontextpage.metadata();
        obj = new HashMap();
        if (runningplayercontextpage == null)
        {
            runningplayercontextpage = ((RunningPlayerContextPage) (obj));
        }
        runningplayercontextpage = (Map)runningplayercontextpage;
        player.playWithViewUri(PlayerContext.create(s, aplayertrack, c, runningplayercontextpage), playoptions, ViewUri.l.toString(), playcallback);
    }

    public static void a(Player player, RunningPlayerContextPage runningplayercontextpage, String s, boolean flag, com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions playersuppressions = runningplayercontextpage.suppressions();
        a(player, runningplayercontextpage, s, (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).suppressions(playersuppressions).playerOptionsOverride(flag, true, false).build(), playcallback);
    }

    static 
    {
        a = new HashSet(Collections.singletonList("running.disallow-transferring-playback"));
        b = new HashSet(Collections.singletonList("running.disallow-remote-control"));
        c = new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), a, b);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class fah
    implements ezz
{

    private ArrayList a;

    public fah()
    {
        a = new ArrayList(0);
    }

    public fah(PlayerTrack playertrack, PlayerTrack aplayertrack[])
    {
        ctz.a(playertrack);
        ctz.a(aplayertrack);
        a = new ArrayList(aplayertrack.length + 1);
        a.add(playertrack);
        Collections.addAll(a, aplayertrack);
    }

    public final int a()
    {
        return a.size();
    }

    public final PlayerTrack a(int i)
    {
        return (PlayerTrack)a.get(i);
    }

    public final boolean b(int i)
    {
        return "video".equals(a(i).metadata().get("media.type"));
    }
}

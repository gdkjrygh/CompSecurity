// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;

final class 
    implements ged
{

    public final boolean a(Object obj, Object obj1)
    {
        obj = (PlayerTrack)obj;
        obj1 = (PlayerTrack)obj1;
        return PlayerTrackUtil.areUidsEqual(((PlayerTrack) (obj)), ((PlayerTrack) (obj1))) && PlayerTrackUtil.areTitlesEqual(((PlayerTrack) (obj)), ((PlayerTrack) (obj1)));
    }

    ()
    {
    }
}

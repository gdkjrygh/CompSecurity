// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.cosmos.android.Resolver;
import com.spotify.music.spotlets.FeatureIdentifier;
import dmx;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer, Player

public class PlayerFactory
    implements dmx
{

    public PlayerFactory()
    {
    }

    public Player create(Resolver resolver, String s, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        return new ResolverPlayer(resolver, s, featureidentifier.a(), "4.2.0.739", featureidentifier1.a());
    }

    public Player create(Resolver resolver, String s, FeatureIdentifier featureidentifier, String s1, FeatureIdentifier featureidentifier1)
    {
        return new ResolverPlayer(resolver, s, featureidentifier.a(), s1, featureidentifier1.a());
    }
}

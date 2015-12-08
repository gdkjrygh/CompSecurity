// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.music.spotlets.FeatureIdentifier;

public abstract class gcv extends gcu
{

    public final Resolver b;

    public gcv(Resolver resolver)
    {
        super(((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(resolver, "", FeatureIdentifier.H, FeatureIdentifier.H));
        b = resolver;
    }

    public final void a()
    {
        super.a();
        b.connect();
    }

    public final void b()
    {
        super.b();
        b.disconnect();
    }
}

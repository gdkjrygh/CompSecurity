// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;


// Referenced classes of package com.google.android.gms.games.client:
//            PlayGames

public static final class Builder
    implements com.google.android.gms.common.api.s
{
    public static final class Builder
    {

        com.google.android.gms.games.Games.GamesOptions baseOptions;
        public boolean unauthenticated;

        public final PlayGames.PlayGamesOptions build()
        {
            return new PlayGames.PlayGamesOptions(this, (byte)0);
        }

        private Builder(com.google.android.gms.games.Games.GamesOptions gamesoptions)
        {
            baseOptions = gamesoptions;
            unauthenticated = false;
        }

        Builder(com.google.android.gms.games.Games.GamesOptions gamesoptions, byte byte0)
        {
            this(gamesoptions);
        }
    }


    public final com.google.android.gms.games.ptions.Builder gamesOptions;
    public final boolean unauthenticated;

    public static Builder builder()
    {
        return new Builder(com.google.android.gms.games.ptions.Builder().build(), (byte)0);
    }

    public static Builder builder(com.google.android.gms.games.build build)
    {
        return new Builder(build, (byte)0);
    }

    private Builder(Builder builder1)
    {
        gamesOptions = builder1.baseOptions;
        unauthenticated = builder1.unauthenticated;
    }

    Builder(Builder builder1, byte byte0)
    {
        this(builder1);
    }
}

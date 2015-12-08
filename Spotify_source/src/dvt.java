// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.mobile.android.service.SpotifyService;

public final class dvt extends Binder
{

    public final SpotifyService a;

    public dvt(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}

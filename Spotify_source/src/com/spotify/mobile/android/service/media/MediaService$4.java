// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import eas;
import eat;
import ezu;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

final class c
    implements com.spotify.mobile.android.cosmos.player.v2.ateObserver
{

    private ezu a;
    private Optional b;
    private eat c;
    private MediaService d;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        ezs ezs = a.a(playerstate, (String)b.c());
        MediaService.f(d).a(ezs, playerstate);
        c.a(ezs, playerstate);
    }

    rStateObserver(MediaService mediaservice, ezu ezu1, Optional optional, eat eat1)
    {
        d = mediaservice;
        a = ezu1;
        b = optional;
        c = eat1;
        super();
    }
}

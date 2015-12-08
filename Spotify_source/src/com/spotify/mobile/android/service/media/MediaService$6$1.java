// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.collection.util.CollectionContains;
import eas;
import eaz;
import eol;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

final class a
    implements eol
{

    private a a;

    public final void a(String s)
    {
        MediaService.a(a.a, Optional.b(new eaz(false, false)));
        MediaService.f(a.a).a((eaz)MediaService.h(a.a).c());
    }

    public final void a(String s, boolean flag)
    {
        if (s != null)
        {
            MediaService.a(a.a, Optional.b(new eaz(flag, true)));
            MediaService.f(a.a).a((eaz)MediaService.h(a.a).c());
        }
    }

    tionContains(tionContains tioncontains)
    {
        a = tioncontains;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/service/media/MediaService$6

/* anonymous class */
    final class MediaService._cls6
        implements Runnable
    {

        final MediaService a;
        private PlayerState b;

        public final void run()
        {
            if (b.track() != null)
            {
                (new CollectionContains(MediaService.g(a))).a(b.track().uri(), new MediaService._cls6._cls1(this));
            }
        }

            
            {
                a = mediaservice;
                b = playerstate;
                super();
            }
    }

}

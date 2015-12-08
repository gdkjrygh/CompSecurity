// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.util.logging.Logger;
import ean;
import ecc;
import gex;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.ck
{

    private tring a;

    public final void onPlayForbidden(List list)
    {
        Logger.c("searchAndPlay() -> onPlayForbidden() reasons: %s", new Object[] {
            TextUtils.join(", ", list)
        });
        if (MediaService.d(a.a) != null)
        {
            MediaService.d(a.a).a(a.a.getString(0x7f08033f));
        }
    }

    public final void onPlaySuccess()
    {
    }

    ch.Response(ch.Response response)
    {
        a = response;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/service/media/MediaService$3

/* anonymous class */
    public final class MediaService._cls3
        implements ecc
    {

        final MediaService a;
        private String b;

        public final void a()
        {
            Logger.c("onError()", new Object[0]);
            if (MediaService.d(a) != null)
            {
                MediaService.d(a).a(a.getString(0x7f08033f));
            }
        }

        public final void a(com.spotify.mobile.android.service.media.search.WebApiSearch.Response response)
        {
            response.getTracks().getItems().size();
            response = response.getTracks().convertToPlayerTracks();
            if (response.length == 0)
            {
                if (MediaService.d(a) != null)
                {
                    MediaService.d(a).a(a.getString(0x7f080340));
                }
                return;
            }
            response = PlayerContext.create((new StringBuilder("spotify:media-service:search:")).append(Uri.encode(b)).toString(), response);
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions;
            boolean flag;
            if (!gex.a(MediaService.e(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(flag, true, false).build();
            MediaService.c(a).play(response, playoptions, new MediaService._cls3._cls1(this));
        }

            public 
            {
                a = mediaservice;
                b = s;
                super();
            }
    }

}

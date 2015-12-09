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

public final class b
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

    public final void a(com.spotify.mobile.android.service.media.search.sponse sponse)
    {
        sponse.getTracks().getItems().size();
        sponse = sponse.getTracks().convertToPlayerTracks();
        if (sponse.length == 0)
        {
            if (MediaService.d(a) != null)
            {
                MediaService.d(a).a(a.getString(0x7f080340));
            }
            return;
        }
        sponse = PlayerContext.create((new StringBuilder("spotify:media-service:search:")).append(Uri.encode(b)).toString(), sponse);
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions;
        boolean flag;
        if (!gex.a(MediaService.e(a)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playoptions = (new com.spotify.mobile.android.cosmos.player.v2.lder()).playerOptionsOverride(flag, true, false).build();
        MediaService.c(a).play(sponse, playoptions, new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback() {

            private MediaService._cls3 a;

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

            
            {
                a = MediaService._cls3.this;
                super();
            }
        });
    }

    public _cls1.a(MediaService mediaservice, String s)
    {
        a = mediaservice;
        b = s;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import java.util.Arrays;
import java.util.List;

final class ang.Object
    implements com.spotify.mobile.android.cosmos.player.v2..PlayCallback
{

    private gpa a;

    public final void onPlayForbidden(List list)
    {
        String s = Arrays.toString(a.a.seeds);
        gox.a(a.e, com.spotify.mobile.android.util.Event.Event.b, a.a.uri, s, a.c, a.d);
        Logger.b("Play Forbidden when updating station %s with seed %s (after thumb operation). Reasons: %s", new Object[] {
            a.a.uri, s, TextUtils.join(",", list)
        });
    }

    public final void onPlaySuccess()
    {
        if (ThumbState.c.equals(a.b))
        {
            gox.c(a.e).skipToNextTrack();
        }
    }

    (gpa gpa1)
    {
        a = gpa1;
        super();
    }
}

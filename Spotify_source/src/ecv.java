// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import com.spotify.music.spotlets.radio.model.ThumbState;

public final class ecv extends ecq
    implements eah
{

    VideoPlayerMetadata a;
    private final eag b;
    private Runnable g;

    public ecv(Context context, eco eco, Handler handler, eag eag1)
    {
        super(context, eco, handler);
        g = new Runnable() {

            private ecv a;

            public final void run()
            {
                Object obj = a;
                if (((ecv) (obj)).a != null)
                {
                    obj = fnu.a(new ecp(((ecv) (obj)).a.e, ((ecv) (obj)).a.a, null, ((ecv) (obj)).a.b, Uri.parse(((ecv) (obj)).a.d), ((ecv) (obj)).a.h, false, false, ((ecv) (obj)).a.g, ((ecv) (obj)).a.f, ThumbState.a, false, false, true));
                } else
                {
                    obj = fnv.a;
                }
                a.e.obtainMessage(10, obj).sendToTarget();
            }

            
            {
                a = ecv.this;
                super();
            }
        };
        b = eag1;
        eag1.a(this);
        a = b.d;
    }

    public final void a()
    {
        super.a();
        b.b(this);
    }

    public final void a(ForceInCollection forceincollection, Player player)
    {
        d.post(g);
        b.a(this);
    }

    public final void a(VideoPlayerMetadata videoplayermetadata)
    {
        a = videoplayermetadata;
        a(ForceInCollection.b, null);
    }
}
